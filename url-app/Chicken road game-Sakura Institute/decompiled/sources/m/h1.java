package m;

import g0.o1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h1 extends s0.n implements r1.w {

    /* renamed from: s, reason: collision with root package name */
    public g1 f6171s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6172t;

    @Override // r1.w
    public final int b(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return this.f6172t ? e0Var.d0(Integer.MAX_VALUE) : e0Var.d0(i7);
    }

    @Override // r1.w
    public final int e(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return this.f6172t ? e0Var.c(i7) : e0Var.c(Integer.MAX_VALUE);
    }

    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        r4.a.p(j8, this.f6172t ? o.j0.f6657f : o.j0.f6658g);
        p1.n0 b9 = e0Var.b(m2.a.a(j8, 0, this.f6172t ? m2.a.h(j8) : Integer.MAX_VALUE, 0, this.f6172t ? Integer.MAX_VALUE : m2.a.g(j8), 5));
        int i7 = b9.f7063f;
        int h3 = m2.a.h(j8);
        if (i7 > h3) {
            i7 = h3;
        }
        int i8 = b9.f7064g;
        int g9 = m2.a.g(j8);
        if (i8 > g9) {
            i8 = g9;
        }
        int i9 = b9.f7064g - i8;
        int i10 = b9.f7063f - i7;
        if (!this.f6172t) {
            i9 = i10;
        }
        g1 g1Var = this.f6171s;
        g0.d1 d1Var = g1Var.f6162d;
        g0.d1 d1Var2 = g1Var.f6159a;
        d1Var.f(i9);
        q0.g c4 = q0.r.c();
        q6.c f9 = c4 != null ? c4.f() : null;
        q0.g d8 = q0.r.d(c4);
        try {
            if (d1Var2.e() > i9) {
                d1Var2.f(i9);
            }
            q0.r.f(c4, d8, f9);
            this.f6171s.f6160b.f(this.f6172t ? i8 : i7);
            return h0Var.C(i7, i8, e6.v.f2827f, new o1(i9, 1, this, b9));
        } catch (Throwable th) {
            q0.r.f(c4, d8, f9);
            throw th;
        }
    }

    @Override // r1.w
    public final int h(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return this.f6172t ? e0Var.a0(Integer.MAX_VALUE) : e0Var.a0(i7);
    }

    @Override // r1.w
    public final int i(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return this.f6172t ? e0Var.e0(i7) : e0Var.e0(Integer.MAX_VALUE);
    }
}
