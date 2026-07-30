package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tg1 implements t81 {
    public final sg1 m;

    public tg1(sg1 sg1Var) {
        this.m = sg1Var;
    }

    @Override // defpackage.t81
    public final void J(float[] fArr) {
        this.m.A.J(fArr);
    }

    @Override // defpackage.t81
    public final void L(t81 t81Var, float[] fArr) {
        this.m.A.L(t81Var, fArr);
    }

    @Override // defpackage.t81
    public final w72 M(t81 t81Var, boolean z) {
        return this.m.A.M(t81Var, z);
    }

    @Override // defpackage.t81
    public final long N() {
        sg1 sg1Var = this.m;
        return (sg1Var.m << 32) | (sg1Var.n & 4294967295L);
    }

    @Override // defpackage.t81
    public final long T(long j) {
        return this.m.A.T(au1.g(j, a()));
    }

    public final long a() {
        sg1 sg1Var = this.m;
        sg1 y = bd3.y(sg1Var);
        return au1.f(c(y.D, 0L), sg1Var.A.Z0(y.A, 0L));
    }

    @Override // defpackage.t81
    public final long b(long j) {
        return this.m.A.b(au1.g(0L, a()));
    }

    public final long c(t81 t81Var, long j) {
        boolean z = t81Var instanceof tg1;
        sg1 sg1Var = this.m;
        if (!z) {
            sg1 y = bd3.y(sg1Var);
            ks1 ks1Var = y.A;
            long c = c(y.D, j);
            float f = (int) (y.B & 4294967295L);
            long f2 = au1.f(c, (4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!ks1Var.Q0().z) {
                h21.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            ks1Var.a1();
            ks1 ks1Var2 = ks1Var.C;
            if (ks1Var2 != null) {
                ks1Var = ks1Var2;
            }
            return au1.g(f2, ks1Var.Z0(t81Var, 0L));
        }
        sg1 sg1Var2 = ((tg1) t81Var).m;
        ks1 ks1Var3 = sg1Var2.A;
        ks1Var3.a1();
        sg1 O0 = sg1Var.A.M0(ks1Var3).O0();
        if (O0 != null) {
            long b = s31.b(s31.c(sg1Var2.I0(O0, false), yk3.R(j)), sg1Var.I0(O0, false));
            return (Float.floatToRawIntBits((int) (b >> 32)) << 32) | (Float.floatToRawIntBits((int) (b & 4294967295L)) & 4294967295L);
        }
        sg1 y2 = bd3.y(sg1Var2);
        long c2 = s31.c(s31.c(sg1Var2.I0(y2, false), y2.B), yk3.R(j));
        sg1 y3 = bd3.y(sg1Var);
        long b2 = s31.b(c2, s31.c(sg1Var.I0(y3, false), y3.B));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (b2 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (b2 & 4294967295L)) & 4294967295L;
        ks1 ks1Var4 = y3.A.C;
        ks1Var4.getClass();
        ks1 ks1Var5 = y2.A.C;
        ks1Var5.getClass();
        return ks1Var4.Z0(ks1Var5, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // defpackage.t81
    public final long g(long j) {
        return au1.g(this.m.A.g(j), a());
    }

    @Override // defpackage.t81
    public final long h(long j) {
        return this.m.A.h(au1.g(j, a()));
    }

    @Override // defpackage.t81
    public final t81 j() {
        sg1 O0;
        if (!y()) {
            h21.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ks1 ks1Var = this.m.A.A.P.d.C;
        if (ks1Var == null || (O0 = ks1Var.O0()) == null) {
            return null;
        }
        return O0.D;
    }

    @Override // defpackage.t81
    public final long u(t81 t81Var, long j) {
        return c(t81Var, j);
    }

    @Override // defpackage.t81
    public final long v(long j) {
        return au1.g(this.m.A.v(j), a());
    }

    @Override // defpackage.t81
    public final boolean y() {
        return this.m.A.Q0().z;
    }
}
