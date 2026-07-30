package defpackage;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface yd0 extends ca0 {
    static /* synthetic */ void H(yd0 yd0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = s0(yd0Var.f(), 0L);
        }
        yd0Var.P(j, 0L, j2, (i & 64) != 0 ? 3 : 0);
    }

    static void I(k91 k91Var, cq cqVar, long j, long j2, long j3, ae0 ae0Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        k91Var.e(cqVar, j4, (i & 4) != 0 ? s0(k91Var.m.f(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? vl0.a : ae0Var);
    }

    static void S(yd0 yd0Var, y9 y9Var, long j, long j2, float f, mo moVar, int i, int i2) {
        yd0Var.Q(y9Var, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, moVar, (i2 & 512) != 0 ? 1 : i);
    }

    static void U(k91 k91Var, nn2 nn2Var, long j, long j2, float f, float f2, int i) {
        if ((i & 64) != 0) {
            f2 = 1.0f;
        }
        ns nsVar = k91Var.m;
        ls lsVar = nsVar.m.c;
        vs3 vs3Var = nsVar.p;
        if (vs3Var == null) {
            vs3Var = yj1.e();
            vs3Var.i(1);
            nsVar.p = vs3Var;
        }
        Paint paint = (Paint) vs3Var.b;
        nn2Var.a(f2, nsVar.f(), vs3Var);
        if (!Intrinsics.b((mo) vs3Var.d, null)) {
            vs3Var.f(null);
        }
        if (vs3Var.a != 3) {
            vs3Var.d(3);
        }
        if (paint.getStrokeWidth() != f) {
            paint.setStrokeWidth(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (vs3Var.a() != 0) {
            vs3Var.g(0);
        }
        if (vs3Var.b() != 0) {
            vs3Var.h(0);
        }
        if (!paint.isFilterBitmap()) {
            paint.setFilterBitmap(true);
        }
        lsVar.e(j, j2, vs3Var);
    }

    static void W(k91 k91Var, cq cqVar, long j, long j2, float f, ae0 ae0Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = s0(k91Var.m.f(), j3);
        }
        k91Var.c(cqVar, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? vl0.a : ae0Var);
    }

    static /* synthetic */ void f0(yd0 yd0Var, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = yd0Var.Z();
        }
        yd0Var.t(f, j, j2);
    }

    static long s0(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static /* synthetic */ void x(yd0 yd0Var, oa oaVar, cq cqVar, float f, xp2 xp2Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        ae0 ae0Var = xp2Var;
        if ((i & 8) != 0) {
            ae0Var = vl0.a;
        }
        yd0Var.k(oaVar, cqVar, f2, ae0Var, (i & 32) != 0 ? 3 : 0);
    }

    mh F();

    void P(long j, long j2, long j3, int i);

    void Q(y9 y9Var, long j, long j2, long j3, float f, mo moVar, int i);

    default long Z() {
        return ph2.e(F().v());
    }

    void b0(oa oaVar, long j);

    default long f() {
        return F().v();
    }

    u81 getLayoutDirection();

    void k(oa oaVar, cq cqVar, float f, ae0 ae0Var, int i);

    void t(float f, long j, long j2);

    void z(long j, long j2, long j3, long j4);
}
