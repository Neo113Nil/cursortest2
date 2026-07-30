package p1;

import r1.a1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 implements p {

    /* renamed from: f, reason: collision with root package name */
    public final r1.p0 f7038f;

    public d0(r1.p0 p0Var) {
        this.f7038f = p0Var;
    }

    @Override // p1.p
    public final long M(long j8) {
        return y0.c.h(this.f7038f.f7870q.M(j8), a());
    }

    @Override // p1.p
    public final boolean O() {
        return this.f7038f.f7870q.M0().f8116r;
    }

    @Override // p1.p
    public final void R(float[] fArr) {
        this.f7038f.f7870q.R(fArr);
    }

    @Override // p1.p
    public final long V() {
        r1.p0 p0Var = this.f7038f;
        return j1.c.G(p0Var.f7063f, p0Var.f7064g);
    }

    @Override // p1.p
    public final long W(long j8) {
        return this.f7038f.f7870q.W(y0.c.h(j8, a()));
    }

    public final long a() {
        r1.p0 p0Var = this.f7038f;
        r1.p0 g9 = s0.g(p0Var);
        return y0.c.g(b(g9.f7873t, 0L), p0Var.f7870q.U0(g9.f7870q, 0L));
    }

    public final long b(p pVar, long j8) {
        boolean z8 = pVar instanceof d0;
        r1.p0 p0Var = this.f7038f;
        if (!z8) {
            r1.p0 g9 = s0.g(p0Var);
            long b9 = b(g9.f7873t, j8);
            a1 a1Var = g9.f7870q;
            a1Var.getClass();
            return y0.c.h(b9, a1Var.U0(pVar, 0L));
        }
        r1.p0 p0Var2 = ((d0) pVar).f7038f;
        a1 a1Var2 = p0Var2.f7870q;
        a1Var2.V0();
        r1.p0 K0 = p0Var.f7870q.I0(a1Var2).K0();
        if (K0 != null) {
            long b10 = m2.h.b(m2.h.c(p0Var2.D0(K0, false), a8.m.I(j8)), p0Var.D0(K0, false));
            return u3.r.a((int) (b10 >> 32), (int) (b10 & 4294967295L));
        }
        r1.p0 g10 = s0.g(p0Var2);
        long c4 = m2.h.c(m2.h.c(p0Var2.D0(g10, false), g10.f7871r), a8.m.I(j8));
        r1.p0 g11 = s0.g(p0Var);
        long b11 = m2.h.b(c4, m2.h.c(p0Var.D0(g11, false), g11.f7871r));
        long a3 = u3.r.a((int) (b11 >> 32), (int) (b11 & 4294967295L));
        a1 a1Var3 = g11.f7870q.f7702s;
        r6.k.c(a1Var3);
        a1 a1Var4 = g10.f7870q.f7702s;
        r6.k.c(a1Var4);
        return a1Var3.U0(a1Var4, a3);
    }

    @Override // p1.p
    public final long e(long j8) {
        return y0.c.h(this.f7038f.f7870q.e(j8), a());
    }

    @Override // p1.p
    public final long f(long j8) {
        return this.f7038f.f7870q.f(y0.c.h(j8, a()));
    }

    @Override // p1.p
    public final y0.d h(p pVar, boolean z8) {
        return this.f7038f.f7870q.h(pVar, z8);
    }

    @Override // p1.p
    public final p i() {
        r1.p0 K0;
        if (!O()) {
            a.a.M("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        a1 a1Var = ((a1) this.f7038f.f7870q.f7700q.A.f3893d).f7702s;
        if (a1Var == null || (K0 = a1Var.K0()) == null) {
            return null;
        }
        return K0.f7873t;
    }

    @Override // p1.p
    public final void k(p pVar, float[] fArr) {
        this.f7038f.f7870q.k(pVar, fArr);
    }

    @Override // p1.p
    public final long u(p pVar, long j8) {
        return b(pVar, j8);
    }
}
