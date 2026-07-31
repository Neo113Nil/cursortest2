package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public final class ez1 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4915a;

    /* renamed from: b, reason: collision with root package name */
    private SensorManager f4916b;

    /* renamed from: c, reason: collision with root package name */
    private Sensor f4917c;

    /* renamed from: d, reason: collision with root package name */
    private long f4918d;

    /* renamed from: e, reason: collision with root package name */
    private int f4919e;

    /* renamed from: f, reason: collision with root package name */
    private dz1 f4920f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4921g;

    ez1(Context context) {
        this.f4915a = context;
    }

    public final void a() {
        synchronized (this) {
            if (this.f4921g) {
                SensorManager sensorManager = this.f4916b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.f4917c);
                    a3.r1.k("Stopped listening for shake gestures.");
                }
                this.f4921g = false;
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) sw.c().b(m10.E6)).booleanValue()) {
                if (this.f4916b == null) {
                    SensorManager sensorManager2 = (SensorManager) this.f4915a.getSystemService("sensor");
                    this.f4916b = sensorManager2;
                    if (sensorManager2 == null) {
                        io0.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.f4917c = sensorManager2.getDefaultSensor(1);
                }
                if (!this.f4921g && (sensorManager = this.f4916b) != null && (sensor = this.f4917c) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f4918d = y2.t.a().b() - ((Integer) sw.c().b(m10.G6)).intValue();
                    this.f4921g = true;
                    a3.r1.k("Listening for shake gestures.");
                }
            }
        }
    }

    public final void c(dz1 dz1Var) {
        this.f4920f = dz1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) sw.c().b(m10.E6)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f7 = fArr[0] / 9.80665f;
            float f8 = fArr[1] / 9.80665f;
            float f9 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f7 * f7) + (f8 * f8) + (f9 * f9))) < ((Float) sw.c().b(m10.F6)).floatValue()) {
                return;
            }
            long b7 = y2.t.a().b();
            if (this.f4918d + ((Integer) sw.c().b(m10.G6)).intValue() > b7) {
                return;
            }
            if (this.f4918d + ((Integer) sw.c().b(m10.H6)).intValue() < b7) {
                this.f4919e = 0;
            }
            a3.r1.k("Shake detected.");
            this.f4918d = b7;
            int i7 = this.f4919e + 1;
            this.f4919e = i7;
            dz1 dz1Var = this.f4920f;
            if (dz1Var != null) {
                if (i7 == ((Integer) sw.c().b(m10.I6)).intValue()) {
                    uy1 uy1Var = (uy1) dz1Var;
                    uy1Var.g(new ry1(uy1Var), ty1.GESTURE);
                }
            }
        }
    }
}
