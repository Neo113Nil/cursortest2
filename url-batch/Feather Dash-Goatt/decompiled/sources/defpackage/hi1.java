package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hi1 {
    public final int a;
    public final ic b;
    public final c c;
    public hi1 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ ii1 h;

    public hi1(ii1 ii1Var, int i, ic icVar, c cVar) {
        this.h = ii1Var;
        this.a = i;
        this.b = icVar;
        this.c = cVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        f21 f21Var;
        f21 f21Var2;
        long j5 = this.h.f;
        ic icVar = this.b;
        qp0 G = op.G(icVar, 2);
        jd0 I = op.I(icVar);
        boolean G2 = I.G();
        l7 l7Var = I.J;
        if (G2) {
            if (((qp0) l7Var.e) != G) {
                long floatToRawIntBits = (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = G.g;
                qp0 qp0Var = (qp0) l7Var.e;
                qp0Var.getClass();
                f21Var = new f21(t90.C(qp0Var.F(G, floatToRawIntBits)), (4294967295L & (((int) (r3 & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (r3 >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, icVar);
            } else {
                f21Var = new f21(j, j2, j3, j4, j5, fArr, icVar);
            }
            f21Var2 = f21Var;
        } else {
            f21Var2 = null;
        }
        if (f21Var2 == null) {
            return;
        }
        this.c.invoke(f21Var2);
    }

    public final void b() {
        ii1 ii1Var = this.h;
        en0 en0Var = ii1Var.a;
        int i = this.a;
        hi1 hi1Var = (hi1) en0Var.g(i);
        if (hi1Var != null) {
            if (hi1Var == this) {
                hi1 hi1Var2 = this.d;
                this.d = null;
                if (hi1Var2 == null) {
                    jd0 I = op.I(this.b.d);
                    if (I.l) {
                        ((d4) md0.a(I)).getRectManager().a.e(I.e, false);
                        return;
                    }
                    return;
                }
                int d = en0Var.d(i);
                Object[] objArr = en0Var.c;
                Object obj = objArr[d];
                en0Var.b[d] = i;
                objArr[d] = hi1Var2;
                return;
            }
            int d2 = en0Var.d(i);
            Object[] objArr2 = en0Var.c;
            Object obj2 = objArr2[d2];
            en0Var.b[d2] = i;
            objArr2[d2] = hi1Var;
            while (true) {
                hi1 hi1Var3 = hi1Var.d;
                if (hi1Var3 == null) {
                    break;
                }
                if (hi1Var3 == this) {
                    hi1Var.d = this.d;
                    this.d = null;
                    return;
                }
                hi1Var = hi1Var3;
            }
        }
        hi1 hi1Var4 = ii1Var.b;
        if (hi1Var4 == this) {
            ii1Var.b = hi1Var4.d;
            this.d = null;
            return;
        }
        hi1 hi1Var5 = hi1Var4 != null ? hi1Var4.d : null;
        while (true) {
            hi1 hi1Var6 = hi1Var4;
            hi1Var4 = hi1Var5;
            if (hi1Var4 == null) {
                return;
            }
            if (hi1Var4 == this) {
                if (hi1Var6 != null) {
                    hi1Var6.d = hi1Var4.d;
                }
                this.d = null;
                return;
            }
            hi1Var5 = hi1Var4.d;
        }
    }
}
