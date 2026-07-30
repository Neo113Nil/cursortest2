package com.baidu.ar;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.baidu.ar.arplay.representation.Quaternion;

/* loaded from: classes.dex */
public class k7 extends u9 {

    /* renamed from: v, reason: collision with root package name */
    public static final String f2646v = "k7";

    /* renamed from: n, reason: collision with root package name */
    public final Quaternion f2647n;

    /* renamed from: o, reason: collision with root package name */
    public Quaternion f2648o;

    /* renamed from: p, reason: collision with root package name */
    public Quaternion f2649p;

    /* renamed from: q, reason: collision with root package name */
    public long f2650q;

    /* renamed from: r, reason: collision with root package name */
    public double f2651r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2652s;

    /* renamed from: t, reason: collision with root package name */
    public int f2653t;

    /* renamed from: u, reason: collision with root package name */
    public int f2654u;

    public k7(SensorManager sensorManager) {
        super(sensorManager);
        this.f2647n = new Quaternion();
        this.f2648o = new Quaternion();
        this.f2649p = new Quaternion();
        this.f2651r = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        this.f2652s = false;
        this.f2654u = 0;
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (f() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Quaternion quaternion) {
        Quaternion m91clone = quaternion.m91clone();
        m91clone.w(-m91clone.w());
        synchronized (this.f3397c) {
            try {
                this.f3400f.copyVec4(quaternion);
                SensorManager.getRotationMatrixFromVector(this.f3399e.matrix, m91clone.toArray());
                g();
                int i8 = this.f2654u + 1;
                this.f2654u = i8;
                if (i8 <= 100) {
                }
                setChanged();
                notifyObservers();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        return ((double) Math.abs(1.0f - this.f3405k.matrix[0])) < 0.001d && ((double) Math.abs(1.0f - this.f3405k.matrix[5])) < 0.001d && ((double) Math.abs(1.0f - this.f3405k.matrix[10])) < 0.001d && ((double) Math.abs(1.0f - this.f3405k.matrix[15])) < 0.001d;
    }

    public void g() {
        if (this.f3402h) {
            u9.a(this.f3404j.matrix, this.f3399e.matrix, this.f3403i.matrix);
            u9.b(this.f3405k.matrix, this.f3404j.matrix);
        } else if (u9.a(this.f3403i.matrix, this.f3399e.matrix)) {
            this.f3402h = true;
            u9.a(this.f3404j.matrix, this.f3399e.matrix, this.f3403i.matrix);
            u9.b(this.f3405k.matrix, this.f3404j.matrix);
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 11) {
            if (sensorEvent.sensor.getType() == 4) {
                synchronized (this.f3395a) {
                    try {
                        if (this.f3396b.booleanValue()) {
                            if (this.f2650q != 0) {
                                float f8 = (sensorEvent.timestamp - r0) * 1.0E-9f;
                                float[] fArr = sensorEvent.values;
                                float f9 = fArr[0];
                                float f10 = fArr[1];
                                float f11 = fArr[2];
                                double sqrt = Math.sqrt((f9 * f9) + (f10 * f10) + (f11 * f11));
                                this.f2651r = sqrt;
                                if (sqrt > 0.10000000149011612d) {
                                    f9 = (float) (f9 / sqrt);
                                    f10 = (float) (f10 / sqrt);
                                    f11 = (float) (f11 / sqrt);
                                } else {
                                    this.f2651r = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
                                }
                                double d8 = (this.f2651r * f8) / 2.0d;
                                double sin = Math.sin(d8);
                                double cos = Math.cos(d8);
                                this.f2647n.setX((float) (f9 * sin));
                                this.f2647n.setY((float) (f10 * sin));
                                this.f2647n.setZ((float) (sin * f11));
                                this.f2647n.setW(-((float) cos));
                                Quaternion quaternion = this.f2647n;
                                Quaternion quaternion2 = this.f2648o;
                                quaternion.multiplyByQuat(quaternion2, quaternion2);
                                float dotProduct = this.f2648o.dotProduct(this.f2649p);
                                if (Math.abs(dotProduct) < 0.0f) {
                                    if (Math.abs(dotProduct) < 0.0f) {
                                        this.f2653t++;
                                    }
                                    a(this.f2648o);
                                } else {
                                    Quaternion quaternion3 = new Quaternion();
                                    this.f2648o.slerp(this.f2649p, quaternion3, (float) (this.f2651r * 0.009999999776482582d));
                                    a(quaternion3);
                                    this.f2648o.copyVec4(quaternion3);
                                    this.f2653t = 0;
                                }
                                if (this.f2653t > 60) {
                                    String str = f2646v;
                                    h.a(str, "Rotation VectorPanic counter is bigger than threshold; this indicates a Gyroscope failure. Panic reset is imminent.");
                                    double d9 = this.f2651r;
                                    if (d9 < 3.0d) {
                                        h.a(str, "Rotation VectorPerforming Panic-reset. Resetting orientation to rotation-vector value.");
                                        a(this.f2649p);
                                        this.f2648o.copyVec4(this.f2649p);
                                        this.f2653t = 0;
                                    } else {
                                        h.a(str, "Rotation Vector" + String.format("Panic reset delayed due to ongoing motion (user is still shaking the device). Gyroscope Velocity: %.2f > 3", Double.valueOf(d9)));
                                    }
                                }
                            }
                            this.f2650q = sensorEvent.timestamp;
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
                        this.f2649p.setXYZW(fArr3[1], fArr3[2], fArr3[3], -fArr3[0]);
                        if (this.f2652s) {
                            return;
                        }
                        this.f2648o.set(this.f2649p);
                        this.f2652s = true;
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
