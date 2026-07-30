package defpackage;

import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fw0 implements qx1 {
    public bx1 B;
    public boolean C;
    public boolean D;
    public boolean F;
    public dw0 m;
    public final cw0 n;
    public final t7 o;
    public Function2 p;
    public Function0 q;
    public boolean s;
    public float[] u;
    public boolean v;
    public int z;
    public long r = 9223372034707292159L;
    public final float[] t = ti1.a();
    public ca0 w = bd3.c();
    public u81 x = u81.m;
    public final ns y = new ns();
    public long A = wy2.b;
    public boolean E = true;
    public final j6 G = new j6(18, this);

    public fw0(dw0 dw0Var, cw0 cw0Var, t7 t7Var, Function2 function2, Function0 function0) {
        this.m = dw0Var;
        this.n = cw0Var;
        this.o = t7Var;
        this.p = function2;
        this.q = function0;
    }

    public final float[] a() {
        float[] fArr = this.u;
        if (fArr == null) {
            fArr = ti1.a();
            this.u = fArr;
        }
        if (this.D) {
            this.D = false;
            float[] b = b();
            if (this.E) {
                return b;
            }
            if (!ap.C(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.C;
        float[] fArr = this.t;
        if (z) {
            dw0 dw0Var = this.m;
            long j = dw0Var.v;
            ew0 ew0Var = dw0Var.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = ph2.e(zm3.Q(this.r));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float q = ew0Var.q();
            float f = ew0Var.f();
            float v = ew0Var.v();
            float E = ew0Var.E();
            float J = ew0Var.J();
            float d = ew0Var.d();
            float I = ew0Var.I();
            double d2 = v * 0.017453292519943295d;
            float sin = (float) Math.sin(d2);
            float cos = (float) Math.cos(d2);
            float f2 = -sin;
            float f3 = (f * cos) - (1.0f * sin);
            float f4 = (1.0f * cos) + (f * sin);
            double d3 = E * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d3);
            float cos2 = (float) Math.cos(d3);
            float f5 = -sin2;
            float f6 = sin * sin2;
            float f7 = sin * cos2;
            float f8 = cos * sin2;
            float f9 = cos * cos2;
            float f10 = (f4 * sin2) + (q * cos2);
            float f11 = (f4 * cos2) + ((-q) * sin2);
            double d4 = J * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d4);
            float cos3 = (float) Math.cos(d4);
            float f12 = -sin3;
            float f13 = (cos3 * f6) + (f12 * cos2);
            float f14 = ((f6 * sin3) + (cos2 * cos3)) * d;
            float f15 = sin3 * cos * d;
            float f16 = ((sin3 * f7) + (cos3 * f5)) * d;
            float f17 = f13 * I;
            float f18 = cos * cos3 * I;
            float f19 = ((cos3 * f7) + (f12 * f5)) * I;
            float f20 = f8 * 1.0f;
            float f21 = f2 * 1.0f;
            float f22 = f9 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f14;
                fArr[1] = f15;
                fArr[2] = f16;
                fArr[3] = 0.0f;
                fArr[4] = f17;
                fArr[5] = f18;
                fArr[6] = f19;
                fArr[7] = 0.0f;
                fArr[8] = f20;
                fArr[9] = f21;
                fArr[10] = f22;
                fArr[11] = 0.0f;
                float f23 = -intBitsToFloat;
                fArr[12] = ((f14 * f23) - (intBitsToFloat2 * f17)) + f10 + intBitsToFloat;
                fArr[13] = ((f15 * f23) - (intBitsToFloat2 * f18)) + f3 + intBitsToFloat2;
                fArr[14] = ((f23 * f16) - (intBitsToFloat2 * f19)) + f11;
                fArr[15] = 1.0f;
            }
            this.C = false;
            this.E = ll3.M(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.v || this.s) {
            return;
        }
        this.o.invalidate();
        f(true);
    }

    public final void d(long j) {
        t7 t7Var = this.o;
        if (t7Var.r) {
            t7Var.L(-4.0f);
        }
        dw0 dw0Var = this.m;
        if (!s31.a(dw0Var.t, j)) {
            dw0Var.t = j;
            dw0Var.a.D((int) (j >> 32), (int) (j & 4294967295L), dw0Var.u);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            k31.r(t7Var);
        } else {
            t7Var.invalidate();
        }
    }

    public final void e(long j) {
        if (x31.a(j, this.r)) {
            return;
        }
        t7 t7Var = this.o;
        if (t7Var.r) {
            t7Var.L(-4.0f);
        }
        this.r = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.v) {
            this.v = z;
            t7 t7Var = this.o;
            ArrayList arrayList = t7Var.J;
            boolean z2 = t7Var.L;
            if (!z) {
                if (z2) {
                    return;
                }
                arrayList.remove(this);
                ArrayList arrayList2 = t7Var.K;
                if (arrayList2 != null) {
                    arrayList2.remove(this);
                    return;
                }
                return;
            }
            if (!z2) {
                arrayList.add(this);
                return;
            }
            ArrayList arrayList3 = t7Var.K;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                t7Var.K = arrayList3;
            }
            arrayList3.add(this);
        }
    }

    public final void g() {
        if (this.v) {
            if (!wy2.a(this.A, wy2.b) && !x31.a(this.m.u, this.r)) {
                dw0 dw0Var = this.m;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.A >> 32)) * ((int) (this.r >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.A & 4294967295L)) * ((int) (this.r & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!au1.b(dw0Var.v, floatToRawIntBits)) {
                    dw0Var.v = floatToRawIntBits;
                    dw0Var.a.L(floatToRawIntBits);
                }
            }
            dw0 dw0Var2 = this.m;
            ca0 ca0Var = this.w;
            u81 u81Var = this.x;
            long j = this.r;
            long j2 = dw0Var2.u;
            ew0 ew0Var = dw0Var2.a;
            if (!x31.a(j2, j)) {
                dw0Var2.u = j;
                long j3 = dw0Var2.t;
                ew0Var.D((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (dw0Var2.i == 9205357640488583168L) {
                    dw0Var2.g = true;
                    dw0Var2.a();
                }
            }
            dw0Var2.b = ca0Var;
            dw0Var2.c = u81Var;
            dw0Var2.d = this.G;
            ew0Var.w(ca0Var, u81Var, dw0Var2, dw0Var2.e);
            f(false);
        }
    }
}
