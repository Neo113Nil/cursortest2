package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hj0 implements uc0 {
    public final gj0 d;

    public hj0(gj0 gj0Var) {
        this.d = gj0Var;
    }

    @Override // defpackage.uc0
    public final long C(uc0 uc0Var, long j) {
        return F(uc0Var, j);
    }

    @Override // defpackage.uc0
    public final boolean E() {
        return this.d.s.J0().r;
    }

    @Override // defpackage.uc0
    public final long F(uc0 uc0Var, long j) {
        boolean z = uc0Var instanceof hj0;
        gj0 gj0Var = this.d;
        if (!z) {
            gj0 v = t80.v(gj0Var);
            qp0 qp0Var = v.s;
            long F = F(v.v, j);
            float f = (int) (v.t & 4294967295L);
            long d = wq0.d(F, (4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!qp0Var.J0().r) {
                o80.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            qp0Var.S0();
            qp0 qp0Var2 = qp0Var.u;
            if (qp0Var2 != null) {
                qp0Var = qp0Var2;
            }
            return wq0.e(d, qp0Var.F(uc0Var, 0L));
        }
        gj0 gj0Var2 = ((hj0) uc0Var).d;
        qp0 qp0Var3 = gj0Var2.s;
        qp0Var3.S0();
        gj0 H0 = gj0Var.s.F0(qp0Var3).H0();
        if (H0 != null) {
            long b = s90.b(s90.c(gj0Var2.B0(H0, false), t90.C(j)), gj0Var.B0(H0, false));
            return (Float.floatToRawIntBits((int) (b >> 32)) << 32) | (Float.floatToRawIntBits((int) (b & 4294967295L)) & 4294967295L);
        }
        gj0 v2 = t80.v(gj0Var2);
        long c = s90.c(s90.c(gj0Var2.B0(v2, false), v2.t), t90.C(j));
        gj0 v3 = t80.v(gj0Var);
        long b2 = s90.b(c, s90.c(gj0Var.B0(v3, false), v3.t));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (b2 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (b2 & 4294967295L)) & 4294967295L;
        qp0 qp0Var4 = v3.s.u;
        qp0Var4.getClass();
        qp0 qp0Var5 = v2.s.u;
        qp0Var5.getClass();
        return qp0Var4.F(qp0Var5, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // defpackage.uc0
    public final s11 J(uc0 uc0Var, boolean z) {
        return this.d.s.J(uc0Var, z);
    }

    @Override // defpackage.uc0
    public final long K() {
        gj0 gj0Var = this.d;
        return (gj0Var.d << 32) | (gj0Var.e & 4294967295L);
    }

    @Override // defpackage.uc0
    public final long M(long j) {
        return this.d.s.M(wq0.e(0L, a()));
    }

    public final long a() {
        gj0 gj0Var = this.d;
        gj0 v = t80.v(gj0Var);
        return wq0.d(F(v.v, 0L), gj0Var.s.F(v.s, 0L));
    }

    @Override // defpackage.uc0
    public final long b(long j) {
        return this.d.s.b(wq0.e(0L, a()));
    }

    @Override // defpackage.uc0
    public final long g(long j) {
        return this.d.s.g(wq0.e(j, a()));
    }

    @Override // defpackage.uc0
    public final uc0 l() {
        gj0 H0;
        if (!E()) {
            o80.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        qp0 qp0Var = ((qp0) this.d.s.s.J.e).u;
        if (qp0Var == null || (H0 = qp0Var.H0()) == null) {
            return null;
        }
        return H0.v;
    }
}
