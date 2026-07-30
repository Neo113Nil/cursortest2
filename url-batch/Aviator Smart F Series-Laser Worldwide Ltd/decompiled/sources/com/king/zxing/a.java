package com.king.zxing;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.preference.PreferenceManager;
import com.king.zxing.camera.FrontLightMode;

/* loaded from: classes4.dex */
final class a implements SensorEventListener {
    protected static final float BRIGHT_ENOUGH_LUX = 100.0f;
    protected static final float TOO_DARK_LUX = 45.0f;
    private com.king.zxing.camera.d cameraManager;
    private final Context context;
    private Sensor lightSensor;
    private float tooDarkLux = TOO_DARK_LUX;
    private float brightEnoughLux = 100.0f;

    a(Context context) {
        this.context = context;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i8) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f8 = sensorEvent.values[0];
        com.king.zxing.camera.d dVar = this.cameraManager;
        if (dVar != null) {
            if (f8 <= this.tooDarkLux) {
                dVar.sensorChanged(true, f8);
            } else if (f8 >= this.brightEnoughLux) {
                dVar.sensorChanged(false, f8);
            }
        }
    }

    public void setBrightEnoughLux(float f8) {
        this.brightEnoughLux = f8;
    }

    public void setTooDarkLux(float f8) {
        this.tooDarkLux = f8;
    }

    void start(com.king.zxing.camera.d dVar) {
        this.cameraManager = dVar;
        if (FrontLightMode.readPref(PreferenceManager.getDefaultSharedPreferences(this.context)) == FrontLightMode.AUTO) {
            SensorManager sensorManager = (SensorManager) this.context.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.lightSensor = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    void stop() {
        if (this.lightSensor != null) {
            ((SensorManager) this.context.getSystemService("sensor")).unregisterListener(this);
            this.cameraManager = null;
            this.lightSensor = null;
        }
    }
}
