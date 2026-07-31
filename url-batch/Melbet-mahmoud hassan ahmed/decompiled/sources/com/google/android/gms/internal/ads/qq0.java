package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes.dex */
final class qq0 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f10784a;

    /* renamed from: c, reason: collision with root package name */
    private final Display f10786c;

    /* renamed from: f, reason: collision with root package name */
    private float[] f10789f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f10790g;

    /* renamed from: h, reason: collision with root package name */
    private pq0 f10791h;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f10787d = new float[9];

    /* renamed from: e, reason: collision with root package name */
    private final float[] f10788e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final Object f10785b = new Object();

    qq0(Context context) {
        this.f10784a = (SensorManager) context.getSystemService("sensor");
        this.f10786c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    final void a(pq0 pq0Var) {
        this.f10791h = pq0Var;
    }

    final void b() {
        if (this.f10790g != null) {
            return;
        }
        Sensor defaultSensor = this.f10784a.getDefaultSensor(11);
        if (defaultSensor == null) {
            io0.d("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        s33 s33Var = new s33(handlerThread.getLooper());
        this.f10790g = s33Var;
        if (this.f10784a.registerListener(this, defaultSensor, 0, s33Var)) {
            return;
        }
        io0.d("SensorManager.registerListener failed.");
        c();
    }

    final void c() {
        if (this.f10790g == null) {
            return;
        }
        this.f10784a.unregisterListener(this);
        this.f10790g.post(new oq0(this));
        this.f10790g = null;
    }

    final boolean d(float[] fArr) {
        synchronized (this.f10785b) {
            float[] fArr2 = this.f10789f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f10785b) {
            if (this.f10789f == null) {
                this.f10789f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f10787d, fArr);
        int rotation = this.f10786c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f10787d, 2, 129, this.f10788e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f10787d, 129, 130, this.f10788e);
        } else if (rotation != 3) {
            System.arraycopy(this.f10787d, 0, this.f10788e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f10787d, 130, 1, this.f10788e);
        }
        float[] fArr2 = this.f10788e;
        float f7 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f7;
        float f8 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f8;
        float f9 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f9;
        synchronized (this.f10785b) {
            System.arraycopy(this.f10788e, 0, this.f10789f, 0, 9);
        }
        pq0 pq0Var = this.f10791h;
        if (pq0Var != null) {
            pq0Var.zza();
        }
    }
}
