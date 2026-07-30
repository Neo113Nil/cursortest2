package com.baidu.ar;

import android.hardware.SensorManager;
import com.baidu.ar.arplay.representation.Matrix;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes.dex */
public class o7 implements Observer {

    /* renamed from: m, reason: collision with root package name */
    public static final String f2883m = "o7";

    /* renamed from: n, reason: collision with root package name */
    public static final float[] f2884n = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: o, reason: collision with root package name */
    public static final float[] f2885o = {0.0f, 0.0f, -1.0f, 0.0f};

    /* renamed from: a, reason: collision with root package name */
    public u9 f2886a;

    /* renamed from: b, reason: collision with root package name */
    public q7 f2887b;

    /* renamed from: c, reason: collision with root package name */
    public n7 f2888c;

    /* renamed from: d, reason: collision with root package name */
    public float f2889d;

    /* renamed from: h, reason: collision with root package name */
    public float[] f2893h;

    /* renamed from: e, reason: collision with root package name */
    public float[] f2890e = new float[16];

    /* renamed from: f, reason: collision with root package name */
    public float f2891f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f2892g = 10000.0f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2894i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2895j = false;

    /* renamed from: k, reason: collision with root package name */
    public float[] f2896k = new float[4];

    /* renamed from: l, reason: collision with root package name */
    public float[] f2897l = new float[16];

    public o7() {
        float[] fArr = new float[16];
        this.f2893h = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public final float a(float[] fArr) {
        Matrix.multiplyMV(this.f2896k, 0, fArr, 0, f2885o, 0);
        float[] fArr2 = this.f2896k;
        if (fArr2[2] > 0.0f) {
            return -1.0f;
        }
        float f8 = fArr2[0];
        float f9 = fArr2[1];
        return 90.0f - ((float) ((Math.atan(Math.abs(this.f2896k[2]) / ((float) Math.sqrt((f8 * f8) + (f9 * f9)))) / 3.141592653589793d) * 180.0d));
    }

    public final float b(float[] fArr) {
        float f8 = -fArr[0];
        float f9 = -fArr[1];
        if (f9 == 0.0f && f8 < 0.0f) {
            return 0.0f;
        }
        if (f9 == 0.0f && f8 > 0.0f) {
            return 180.0f;
        }
        if (f8 == 0.0f && f9 < 0.0f) {
            return 90.0f;
        }
        if (f8 == 0.0f && f9 > 0.0f) {
            return 270.0f;
        }
        float atan = (float) ((Math.atan(Math.abs(f9) / Math.abs(f8)) / 3.141592653589793d) * 180.0d);
        if (f8 > 0.0f && f9 < 0.0f) {
            atan = 180.0f - atan;
        }
        if (f8 > 0.0f && f9 > 0.0f) {
            atan += 180.0f;
        }
        return (f8 >= 0.0f || f9 <= 0.0f) ? atan : 360.0f - atan;
    }

    public final void c(float[] fArr) {
        Matrix.invertM(this.f2890e, 0, fArr, 0);
        Matrix.multiplyMM(this.f2897l, 0, f2884n, 0, this.f2890e, 0);
        float a8 = a(this.f2897l);
        this.f2891f = a8;
        if (a8 > 0.0f) {
            float pow = (float) (Math.pow(1.13d, a8) + 600.0d);
            this.f2892g = pow;
            if (pow > 15000.0f) {
                this.f2892g = 15000.0f;
            }
        }
        Matrix.multiplyMV(this.f2896k, 0, this.f2897l, 0, new float[]{0.0f, 0.0f, -this.f2892g, 1.0f}, 0);
        float[] fArr2 = this.f2897l;
        float[] fArr3 = this.f2896k;
        fArr2[12] = -fArr3[0];
        fArr2[13] = -fArr3[1];
        fArr2[14] = -fArr3[2];
        Matrix.invertM(this.f2890e, 0, fArr2, 0);
        float b8 = b(this.f2896k);
        this.f2889d = b8;
        Matrix.rotateM(this.f2890e, 0, b8, 0.0f, 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:2:0x0000, B:4:0x0004, B:9:0x0009, B:11:0x0019, B:14:0x0027, B:16:0x003a, B:17:0x0043, B:20:0x0040, B:21:0x0024), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:2:0x0000, B:4:0x0004, B:9:0x0009, B:11:0x0019, B:14:0x0027, B:16:0x003a, B:17:0x0043, B:20:0x0040, B:21:0x0024), top: B:1:0x0000 }] */
    @Override // java.util.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void update(Observable observable, Object obj) {
        try {
            if (this.f2887b != null && this.f2888c != null) {
                float[] fArr = this.f2886a.a().matrix;
                if (!this.f2887b.d()) {
                    if (this.f2887b.e()) {
                    }
                    float[] b8 = this.f2886a.b();
                    m7 m7Var = new m7();
                    if (this.f2887b.e()) {
                        m7Var.b(fArr);
                    } else {
                        m7Var.b(this.f2890e);
                    }
                    m7Var.a(this.f2889d);
                    m7Var.a(this.f2887b.b());
                    m7Var.a(b8);
                    this.f2888c.onImuUpdate(m7Var);
                }
                c(fArr);
                float[] b82 = this.f2886a.b();
                m7 m7Var2 = new m7();
                if (this.f2887b.e()) {
                }
                m7Var2.a(this.f2889d);
                m7Var2.a(this.f2887b.b());
                m7Var2.a(b82);
                this.f2888c.onImuUpdate(m7Var2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final u9 a(com.baidu.ar.imu.a aVar, SensorManager sensorManager) {
        u9 bVar;
        if (aVar != com.baidu.ar.imu.a.RELATIVE) {
            bVar = this.f2887b.c() ? new com.baidu.ar.imu.b(sensorManager) : new k7(sensorManager);
        } else if (this.f2887b.f()) {
            bVar = new l7(sensorManager);
            if (!this.f2894i) {
                bVar.f3402h = true;
                bVar.f3403i.matrix = this.f2893h;
            }
            this.f2894i = false;
        } else {
            bVar = new o1(sensorManager);
        }
        bVar.addObserver(this);
        return bVar;
    }

    public void b() {
        q7 q7Var;
        if (this.f2886a != null && (q7Var = this.f2887b) != null && q7Var.a() == com.baidu.ar.imu.a.RELATIVE && !this.f2895j && this.f2887b.f()) {
            this.f2893h = this.f2886a.f3403i.matrix;
            this.f2895j = true;
        }
        try {
            a();
            this.f2888c = null;
            this.f2887b = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a() {
        u9 u9Var = this.f2886a;
        if (u9Var != null) {
            u9Var.d();
            this.f2886a = null;
        }
    }

    public boolean a(SensorManager sensorManager, q7 q7Var, n7 n7Var) {
        if (q7Var == null) {
            return false;
        }
        this.f2887b = q7Var;
        this.f2888c = n7Var;
        if (q7Var.a() == com.baidu.ar.imu.a.RELATIVE && !this.f2887b.f()) {
            this.f2894i = true;
        }
        try {
            if (this.f2886a == null) {
                this.f2886a = a(this.f2887b.a(), sensorManager);
            }
            if (!this.f2886a.c()) {
                return false;
            }
            this.f2886a.e();
            return true;
        } catch (Throwable th) {
            h.b(f2883m, "IMUController start: " + th.getMessage());
            return false;
        }
    }
}
