package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y extends a1 {
    public static final f7.i0 Q;
    public w O;
    public x P;

    static {
        f7.i0 g9 = z0.l0.g();
        int i7 = z0.u.f10058h;
        g9.e(z0.u.f10055e);
        g9.k(1.0f);
        g9.l(1);
        Q = g9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(d0 d0Var, w wVar) {
        super(d0Var);
        this.O = wVar;
        this.P = d0Var.f7721h != null ? new x(this) : null;
        if ((((s0.n) wVar).f8104f.f8106h & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // r1.a1
    public final void H0() {
        if (this.P == null) {
            this.P = new x(this);
        }
    }

    @Override // r1.a1
    public final p0 K0() {
        return this.P;
    }

    @Override // r1.a1
    public final s0.n M0() {
        return ((s0.n) this.O).f8104f;
    }

    @Override // r1.a1
    public final void Y0(z0.r rVar, c1.c cVar) {
        a1 a1Var = this.f7701r;
        r6.k.c(a1Var);
        a1Var.E0(rVar, cVar);
        if (((s1.r) g0.a(this.f7700q)).getShowLayoutBounds()) {
            F0(rVar, Q);
        }
    }

    @Override // p1.e0
    public final int a0(int i7) {
        w wVar = this.O;
        a1 a1Var = this.f7701r;
        r6.k.c(a1Var);
        return wVar.h(this, a1Var, i7);
    }

    @Override // p1.e0
    public final p1.n0 b(long j8) {
        o0(j8);
        w wVar = this.O;
        a1 a1Var = this.f7701r;
        r6.k.c(a1Var);
        b1(wVar.f(this, a1Var, j8));
        W0();
        return this;
    }

    @Override // p1.e0
    public final int c(int i7) {
        w wVar = this.O;
        a1 a1Var = this.f7701r;
        r6.k.c(a1Var);
        return wVar.e(this, a1Var, i7);
    }

    @Override // p1.e0
    public final int d0(int i7) {
        w wVar = this.O;
        a1 a1Var = this.f7701r;
        r6.k.c(a1Var);
        return wVar.b(this, a1Var, i7);
    }

    @Override // p1.e0
    public final int e0(int i7) {
        w wVar = this.O;
        a1 a1Var = this.f7701r;
        r6.k.c(a1Var);
        return wVar.i(this, a1Var, i7);
    }

    @Override // p1.n0
    public final void j0(long j8, float f9, q6.c cVar) {
        Z0(j8, f9, cVar);
        if (this.f7864l) {
            return;
        }
        X0();
        v0().p();
        r6.k.c(this.f7701r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k1(w wVar) {
        if (!wVar.equals(this.O) && (((s0.n) wVar).f8104f.f8106h & 512) != 0) {
            throw new ClassCastException();
        }
        this.O = wVar;
    }

    @Override // r1.o0
    public final int p0(p1.l lVar) {
        x xVar = this.P;
        if (xVar == null) {
            return f.c(this, lVar);
        }
        Integer num = (Integer) xVar.f7875v.get(lVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
