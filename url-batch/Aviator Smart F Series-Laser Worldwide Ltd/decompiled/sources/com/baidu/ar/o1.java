package com.baidu.ar;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import com.baidu.ar.arplay.representation.Quaternion;

/* loaded from: classes.dex */
public class o1 extends u9 {

    /* renamed from: r, reason: collision with root package name */
    public static final String f2867r = "o1";

    /* renamed from: n, reason: collision with root package name */
    public final Quaternion f2868n;

    /* renamed from: o, reason: collision with root package name */
    public long f2869o;

    /* renamed from: p, reason: collision with root package name */
    public int f2870p;

    /* renamed from: q, reason: collision with root package name */
    public double f2871q;

    public o1(SensorManager sensorManager) {
        super(sensorManager);
        this.f2868n = new Quaternion();
        this.f2870p = 0;
        this.f2871q = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        h.a(f2867r, "sensorList size " + String.valueOf(this.f3398d.size()));
        if (this.f3398d.size() > 120) {
            this.f3398d.clear();
        }
        this.f3398d.add(sensorManager.getDefaultSensor(4));
    }

    public final void f() {
        if (this.f3402h) {
            u9.a(this.f3405k.matrix, this.f3399e.matrix, this.f3403i.matrix);
            return;
        }
        float[] fArr = this.f3399e.matrix;
        float[] fArr2 = this.f3403i.matrix;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.setIdentityM(this.f3405k.matrix, 0);
        this.f3402h = true;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 4) {
            if (this.f2869o != 0) {
                float f8 = (sensorEvent.timestamp - r0) * 1.0E-9f;
                float[] fArr = sensorEvent.values;
                float f9 = fArr[0];
                float f10 = fArr[1];
                float f11 = fArr[2];
                double sqrt = Math.sqrt((f9 * f9) + (f10 * f10) + (f11 * f11));
                this.f2871q = sqrt;
                if (sqrt > 0.10000000149011612d) {
                    f9 = (float) (f9 / sqrt);
                    f10 = (float) (f10 / sqrt);
                    f11 = (float) (f11 / sqrt);
                }
                double d8 = (sqrt * f8) / 2.0d;
                double sin = Math.sin(d8);
                double cos = Math.cos(d8);
                this.f2868n.setX((float) (f9 * sin));
                this.f2868n.setY((float) (f10 * sin));
                this.f2868n.setZ((float) (sin * f11));
                this.f2868n.setW(-((float) cos));
                synchronized (this.f3397c) {
                    Quaternion quaternion = this.f2868n;
                    Quaternion quaternion2 = this.f3400f;
                    quaternion.multiplyByQuat(quaternion2, quaternion2);
                }
                Quaternion m91clone = this.f3400f.m91clone();
                m91clone.w(-m91clone.w());
                synchronized (this.f3397c) {
                    SensorManager.getRotationMatrixFromVector(this.f3399e.matrix, m91clone.toArray());
                }
            }
            this.f2869o = sensorEvent.timestamp;
            int i8 = this.f2870p + 1;
            this.f2870p = i8;
            if (i8 > 20) {
                f();
                setChanged();
                notifyObservers();
            }
        }
    }
}
