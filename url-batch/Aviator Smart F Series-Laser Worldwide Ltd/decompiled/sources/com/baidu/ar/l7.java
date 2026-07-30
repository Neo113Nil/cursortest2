package com.baidu.ar;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import com.baidu.ar.arplay.representation.Quaternion;

/* loaded from: classes.dex */
public class l7 extends u9 {

    /* renamed from: v, reason: collision with root package name */
    public static final String f2698v = "l7";

    /* renamed from: n, reason: collision with root package name */
    public final Quaternion f2699n;

    /* renamed from: o, reason: collision with root package name */
    public Quaternion f2700o;

    /* renamed from: p, reason: collision with root package name */
    public Quaternion f2701p;

    /* renamed from: q, reason: collision with root package name */
    public long f2702q;

    /* renamed from: r, reason: collision with root package name */
    public double f2703r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2704s;

    /* renamed from: t, reason: collision with root package name */
    public int f2705t;

    /* renamed from: u, reason: collision with root package name */
    public int f2706u;

    public l7(SensorManager sensorManager) {
        super(sensorManager);
        this.f2699n = new Quaternion();
        this.f2700o = new Quaternion();
        this.f2701p = new Quaternion();
        this.f2703r = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        this.f2704s = false;
        this.f2706u = 0;
        this.f3398d.add(sensorManager.getDefaultSensor(4));
        this.f3398d.add(sensorManager.getDefaultSensor(11));
    }

    public static void c(float[] fArr, float[] fArr2) {
        if (fArr2.length >= 4) {
            fArr[0] = fArr2[3];
        } else {
            float f8 = fArr2[0];
            float f9 = 1.0f - (f8 * f8);
            float f10 = fArr2[1];
            float f11 = f9 - (f10 * f10);
            float f12 = fArr2[2];
            float f13 = f11 - (f12 * f12);
            fArr[0] = f13;
            fArr[0] = f13 > 0.0f ? (float) Math.sqrt(f13) : 0.0f;
        }
        fArr[1] = fArr2[0];
        fArr[2] = fArr2[1];
        fArr[3] = fArr2[2];
    }

    public final void a(Quaternion quaternion) {
        Quaternion m91clone = quaternion.m91clone();
        m91clone.w(-m91clone.w());
        synchronized (this.f3397c) {
            try {
                this.f3400f.copyVec4(quaternion);
                SensorManager.getRotationMatrixFromVector(this.f3399e.matrix, m91clone.toArray());
                int i8 = this.f2706u + 1;
                this.f2706u = i8;
                if (i8 > 20) {
                    f();
                    setChanged();
                    notifyObservers();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        if (this.f3402h) {
            u9.a(this.f3405k.matrix, this.f3399e.matrix, this.f3403i.matrix);
            return;
        }
        this.f3402h = true;
        float[] fArr = this.f3399e.matrix;
        System.arraycopy(fArr, 0, this.f3403i.matrix, 0, fArr.length);
        Matrix.setIdentityM(this.f3405k.matrix, 0);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 11) {
            if (sensorEvent.sensor.getType() == 4) {
                synchronized (this.f3395a) {
                    try {
                        if (this.f3396b.booleanValue()) {
                            if (this.f2702q != 0) {
                                float f8 = (sensorEvent.timestamp - r0) * 1.0E-9f;
                                float[] fArr = sensorEvent.values;
                                float f9 = fArr[0];
                                float f10 = fArr[1];
                                float f11 = fArr[2];
                                double sqrt = Math.sqrt((f9 * f9) + (f10 * f10) + (f11 * f11));
                                this.f2703r = sqrt;
                                if (sqrt > 0.10000000149011612d) {
                                    f9 = (float) (f9 / sqrt);
                                    f10 = (float) (f10 / sqrt);
                                    f11 = (float) (f11 / sqrt);
                                } else {
                                    this.f2703r = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
                                }
                                double d8 = (this.f2703r * f8) / 2.0d;
                                double sin = Math.sin(d8);
                                double cos = Math.cos(d8);
                                this.f2699n.setX((float) (f9 * sin));
                                this.f2699n.setY((float) (f10 * sin));
                                this.f2699n.setZ((float) (sin * f11));
                                this.f2699n.setW(-((float) cos));
                                Quaternion quaternion = this.f2699n;
                                Quaternion quaternion2 = this.f2700o;
                                quaternion.multiplyByQuat(quaternion2, quaternion2);
                                float dotProduct = this.f2700o.dotProduct(this.f2701p);
                                if (Math.abs(dotProduct) < 0.0f) {
                                    if (Math.abs(dotProduct) < 0.0f) {
                                        this.f2705t++;
                                    }
                                    a(this.f2700o);
                                } else {
                                    Quaternion quaternion3 = new Quaternion();
                                    this.f2700o.slerp(this.f2701p, quaternion3, (float) (this.f2703r * 0.009999999776482582d));
                                    a(quaternion3);
                                    this.f2700o.copyVec4(quaternion3);
                                    this.f2705t = 0;
                                }
                                if (this.f2705t > 60) {
                                    String str = f2698v;
                                    h.a(str, "Rotation VectorPanic counter is bigger than threshold; this indicates a Gyroscope failure. Panic reset is imminent.");
                                    double d9 = this.f2703r;
                                    if (d9 < 3.0d) {
                                        h.a(str, "Rotation VectorPerforming Panic-reset. Resetting orientation to rotation-vector value.");
                                        a(this.f2701p);
                                        this.f2700o.copyVec4(this.f2701p);
                                        this.f2705t = 0;
                                    } else {
                                        h.a(str, "Rotation Vector" + String.format("Panic reset delayed due to ongoing motion (user is still shaking the device). Gyroscope Velocity: %.2f > 3", Double.valueOf(d9)));
                                    }
                                }
                            }
                            this.f2702q = sensorEvent.timestamp;
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            }
            return;
        }
        synchronized (this.f3395a) {
            int i8 = 0;
            while (true) {
                try {
                    float[] fArr2 = sensorEvent.values;
                    if (i8 >= fArr2.length) {
                        float[] fArr3 = new float[4];
                        try {
                            SensorManager.getQuaternionFromVector(fArr3, fArr2);
                        } catch (Exception unused) {
                            c(fArr3, sensorEvent.values);
                        }
                        this.f2701p.setXYZW(fArr3[1], fArr3[2], fArr3[3], -fArr3[0]);
                        if (this.f2704s) {
                            return;
                        }
                        this.f2700o.set(this.f2701p);
                        this.f2704s = true;
                        return;
                    }
                    if (Float.isNaN(fArr2[i8])) {
                        this.f3396b = Boolean.FALSE;
                        return;
                    }
                    i8++;
                } finally {
                }
            }
        }
    }
}
