package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public final class gy1 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f5935a;

    /* renamed from: b, reason: collision with root package name */
    private final Sensor f5936b;

    /* renamed from: c, reason: collision with root package name */
    private float f5937c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private Float f5938d = Float.valueOf(0.0f);

    /* renamed from: e, reason: collision with root package name */
    private long f5939e = y2.t.a().b();

    /* renamed from: f, reason: collision with root package name */
    private int f5940f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5941g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5942h = false;

    /* renamed from: i, reason: collision with root package name */
    private fy1 f5943i = null;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5944j = false;

    gy1(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f5935a = sensorManager;
        if (sensorManager != null) {
            this.f5936b = sensorManager.getDefaultSensor(4);
        } else {
            this.f5936b = null;
        }
    }

    public final void a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.f5944j && (sensorManager = this.f5935a) != null && (sensor = this.f5936b) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.f5944j = false;
                a3.r1.k("Stopped listening for flick gestures.");
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) sw.c().b(m10.J6)).booleanValue()) {
                if (!this.f5944j && (sensorManager = this.f5935a) != null && (sensor = this.f5936b) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f5944j = true;
                    a3.r1.k("Listening for flick gestures.");
                }
                if (this.f5935a == null || this.f5936b == null) {
                    io0.g("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void c(fy1 fy1Var) {
        this.f5943i = fy1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) sw.c().b(m10.J6)).booleanValue()) {
            long b7 = y2.t.a().b();
            if (this.f5939e + ((Integer) sw.c().b(m10.L6)).intValue() < b7) {
                this.f5940f = 0;
                this.f5939e = b7;
                this.f5941g = false;
                this.f5942h = false;
                this.f5937c = this.f5938d.floatValue();
            }
            Float valueOf = Float.valueOf(this.f5938d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f5938d = valueOf;
            float floatValue = valueOf.floatValue();
            float f7 = this.f5937c;
            e10<Float> e10Var = m10.K6;
            if (floatValue > f7 + ((Float) sw.c().b(e10Var)).floatValue()) {
                this.f5937c = this.f5938d.floatValue();
                this.f5942h = true;
            } else if (this.f5938d.floatValue() < this.f5937c - ((Float) sw.c().b(e10Var)).floatValue()) {
                this.f5937c = this.f5938d.floatValue();
                this.f5941g = true;
            }
            if (this.f5938d.isInfinite()) {
                this.f5938d = Float.valueOf(0.0f);
                this.f5937c = 0.0f;
            }
            if (this.f5941g && this.f5942h) {
                a3.r1.k("Flick detected.");
                this.f5939e = b7;
                int i7 = this.f5940f + 1;
                this.f5940f = i7;
                this.f5941g = false;
                this.f5942h = false;
                fy1 fy1Var = this.f5943i;
                if (fy1Var != null) {
                    if (i7 == ((Integer) sw.c().b(m10.M6)).intValue()) {
                        uy1 uy1Var = (uy1) fy1Var;
                        uy1Var.g(new sy1(uy1Var), ty1.GESTURE);
                    }
                }
            }
        }
    }
}
