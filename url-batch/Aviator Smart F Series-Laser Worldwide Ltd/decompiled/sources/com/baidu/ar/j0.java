package com.baidu.ar;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

/* loaded from: classes.dex */
public class j0 implements SensorEventListener {

    /* renamed from: f, reason: collision with root package name */
    public static j0 f2518f;

    /* renamed from: a, reason: collision with root package name */
    public SensorManager f2519a;

    /* renamed from: b, reason: collision with root package name */
    public float f2520b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f2521c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f2522d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public k0 f2523e;

    public static synchronized j0 a() {
        j0 j0Var;
        synchronized (j0.class) {
            try {
                if (f2518f == null) {
                    f2518f = new j0();
                }
                j0Var = f2518f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j0Var;
    }

    public void b() {
        Log.e("Accelerometer", "onStop");
        SensorManager sensorManager = this.f2519a;
        if (sensorManager == null) {
            return;
        }
        sensorManager.unregisterListener(this);
        this.f2523e = null;
        this.f2519a = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i8) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            float f8 = fArr[0];
            this.f2520b = f8;
            float f9 = fArr[1];
            this.f2521c = f9;
            float f10 = fArr[2];
            this.f2522d = f10;
            this.f2523e.a(f8, f9, f10);
        }
    }

    public void a(Context context, k0 k0Var) {
        Log.e("Accelerometer", "onStart");
        if (this.f2523e != null) {
            return;
        }
        if (this.f2519a == null) {
            this.f2519a = (SensorManager) context.getSystemService("sensor");
        }
        SensorManager sensorManager = this.f2519a;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
        this.f2523e = k0Var;
    }
}
