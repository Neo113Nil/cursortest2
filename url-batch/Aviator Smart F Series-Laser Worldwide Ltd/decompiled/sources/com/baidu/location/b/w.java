package com.baidu.location.b;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes2.dex */
public class w implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private float[] f4914a;

    /* renamed from: b, reason: collision with root package name */
    private SensorManager f4915b;

    /* renamed from: c, reason: collision with root package name */
    private float f4916c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4917d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4918e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4919f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4920g;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final w f4921a = new w();
    }

    private w() {
        this.f4917d = false;
        this.f4918e = false;
        this.f4919f = false;
        this.f4920g = false;
    }

    public static w a() {
        return b.f4921a;
    }

    public synchronized void b() {
        Sensor defaultSensor;
        try {
            if (this.f4920g) {
                return;
            }
            if (!this.f4917d) {
                if (f()) {
                }
            }
            if (this.f4915b == null) {
                this.f4915b = (SensorManager) com.baidu.location.f.getServiceContext().getSystemService("sensor");
            }
            SensorManager sensorManager = this.f4915b;
            if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(11)) != null && (this.f4917d || f())) {
                this.f4915b.registerListener(this, defaultSensor, 3);
            }
            this.f4920g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c() {
        try {
            if (this.f4920g) {
                if (f()) {
                    return;
                }
                SensorManager sensorManager = this.f4915b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this);
                    this.f4915b = null;
                }
                this.f4920g = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean d() {
        return this.f4917d;
    }

    public float e() {
        return this.f4916c;
    }

    public boolean f() {
        return this.f4919f;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i8) {
    }

    @Override // android.hardware.SensorEventListener
    @SuppressLint({"NewApi"})
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 11) {
            return;
        }
        float[] fArr = (float[]) sensorEvent.values.clone();
        this.f4914a = fArr;
        float[] fArr2 = new float[9];
        try {
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            SensorManager.getOrientation(fArr2, new float[3]);
            float degrees = (float) Math.toDegrees(r5[0]);
            this.f4916c = degrees;
            if (degrees < 0.0f) {
                degrees += 360.0f;
            }
            this.f4916c = (float) Math.floor(degrees);
        } catch (Exception unused) {
            this.f4916c = 0.0f;
        }
    }

    public void a(boolean z7) {
        this.f4917d = z7;
    }
}
