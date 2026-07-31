package com.yandex.mobile.ads.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes3.dex */
final class ff1 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f25769a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f25770b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final float[] f25771c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    private final float[] f25772d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    private final Display f25773e;

    /* renamed from: f, reason: collision with root package name */
    private final a[] f25774f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25775g;

    public interface a {
        void a(float[] fArr, float f4);
    }

    public ff1(Display display, a... aVarArr) {
        this.f25773e = display;
        this.f25774f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i4;
        SensorManager.getRotationMatrixFromVector(this.f25769a, sensorEvent.values);
        float[] fArr = this.f25769a;
        int rotation = this.f25773e.getRotation();
        if (rotation != 0) {
            int i5 = 129;
            if (rotation != 1) {
                i4 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i5 = 130;
                    i4 = 1;
                }
            } else {
                i4 = 129;
                i5 = 2;
            }
            float[] fArr2 = this.f25770b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f25770b, i5, i4, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f25769a, 1, 131, this.f25770b);
        SensorManager.getOrientation(this.f25770b, this.f25772d);
        float f4 = this.f25772d[2];
        Matrix.rotateM(this.f25769a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f25769a;
        if (!this.f25775g) {
            fc0.a(this.f25771c, fArr3);
            this.f25775g = true;
        }
        float[] fArr4 = this.f25770b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f25770b, 0, this.f25771c, 0);
        float[] fArr5 = this.f25769a;
        for (a aVar : this.f25774f) {
            aVar.a(fArr5, f4);
        }
    }
}
