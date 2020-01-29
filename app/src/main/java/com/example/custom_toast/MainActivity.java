package com.example.custom_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void showToast(View v)
    {
        View conV;
        LayoutInflater objLayout = getLayoutInflater();
        conV = objLayout.inflate(R.layout.custom_toast,null);
        Toast obj = new Toast(this);

        obj.setGravity(Gravity.START,0,100);
        obj.setDuration(Toast.LENGTH_LONG);
        obj.setView(conV);
        obj.show();
    }
}
