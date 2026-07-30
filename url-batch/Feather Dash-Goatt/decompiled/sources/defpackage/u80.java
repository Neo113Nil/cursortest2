package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class u80 extends gj0 {
    @Override // defpackage.qk0
    public final zw0 c(long j) {
        c0(j);
        qp0 qp0Var = this.s;
        eo0 x = qp0Var.s.x();
        Object[] objArr = x.d;
        int i = x.g;
        for (int i2 = 0; i2 < i; i2++) {
            kj0 kj0Var = ((jd0) objArr[i2]).K.q;
            kj0Var.getClass();
            kj0Var.n = hd0.g;
        }
        jd0 jd0Var = qp0Var.s;
        gj0.y0(this, jd0Var.B.f(this, jd0Var.l(), j));
        return this;
    }

    @Override // defpackage.ej0
    public final int e0(m60 m60Var) {
        kj0 kj0Var = this.s.s.K.q;
        kj0Var.getClass();
        nd0 nd0Var = kj0Var.j;
        fd0 fd0Var = nd0Var.d;
        fd0 fd0Var2 = fd0.e;
        kd0 kd0Var = kj0Var.u;
        if (fd0Var == fd0Var2) {
            kd0Var.d = true;
            if (kd0Var.b) {
                nd0Var.f = true;
                nd0Var.g = true;
            }
        } else {
            kd0Var.e = true;
        }
        u80 u80Var = kj0Var.y().V;
        if (u80Var != null) {
            u80Var.o = true;
        }
        kj0Var.B();
        u80 u80Var2 = kj0Var.y().V;
        if (u80Var2 != null) {
            u80Var2.o = false;
        }
        Integer num = (Integer) kd0Var.g.get(m60Var);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.x.g(intValue, m60Var);
        return intValue;
    }

    @Override // defpackage.gj0
    public final void z0() {
        kj0 kj0Var = this.s.s.K.q;
        kj0Var.getClass();
        kj0Var.j0();
    }
}
