package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class xy1 {
    public vs3 m;
    public boolean n;
    public mo o;
    public float p = 1.0f;
    public u81 q = u81.m;

    public abstract boolean b(float f);

    public abstract boolean e(mo moVar);

    public final void g(yd0 yd0Var, long j, float f, mo moVar) {
        if (this.p != f) {
            if (!b(f)) {
                vs3 vs3Var = this.m;
                if (f == 1.0f) {
                    if (vs3Var != null) {
                        vs3Var.c(f);
                    }
                    this.n = false;
                } else {
                    if (vs3Var == null) {
                        vs3Var = yj1.e();
                        this.m = vs3Var;
                    }
                    vs3Var.c(f);
                    this.n = true;
                }
            }
            this.p = f;
        }
        if (!Intrinsics.b(this.o, moVar)) {
            if (!e(moVar)) {
                vs3 vs3Var2 = this.m;
                if (moVar == null) {
                    if (vs3Var2 != null) {
                        vs3Var2.f(null);
                    }
                    this.n = false;
                } else {
                    if (vs3Var2 == null) {
                        vs3Var2 = yj1.e();
                        this.m = vs3Var2;
                    }
                    vs3Var2.f(moVar);
                    this.n = true;
                }
            }
            this.o = moVar;
        }
        u81 layoutDirection = yd0Var.getLayoutDirection();
        if (this.q != layoutDirection) {
            f(layoutDirection);
            this.q = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (yd0Var.f() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (yd0Var.f() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((ar0) yd0Var.F().n).v(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.n) {
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        float intBitsToFloat4 = Float.intBitsToFloat(i2);
                        w72 p = tk3.p(0L, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                        ls o = yd0Var.F().o();
                        vs3 vs3Var3 = this.m;
                        if (vs3Var3 == null) {
                            vs3Var3 = yj1.e();
                            this.m = vs3Var3;
                        }
                        try {
                            o.k(p, vs3Var3);
                            i(yd0Var);
                            o.j();
                        } catch (Throwable th) {
                            o.j();
                            throw th;
                        }
                    } else {
                        i(yd0Var);
                    }
                }
            } catch (Throwable th2) {
                ((ar0) yd0Var.F().n).v(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th2;
            }
        }
        ((ar0) yd0Var.F().n).v(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(yd0 yd0Var);

    public void f(u81 u81Var) {
    }
}
