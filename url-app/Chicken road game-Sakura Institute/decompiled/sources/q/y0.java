package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y0 extends s0.n implements r1.w {

    /* renamed from: s, reason: collision with root package name */
    public int f7380s;

    /* renamed from: t, reason: collision with root package name */
    public r6.l f7381t;

    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        p1.n0 b9 = e0Var.b(r4.a.b(this.f7380s != 1 ? 0 : m2.a.j(j8), m2.a.h(j8), this.f7380s == 2 ? m2.a.i(j8) : 0, m2.a.g(j8)));
        int e9 = v1.g.e(b9.f7063f, m2.a.j(j8), m2.a.h(j8));
        int e10 = v1.g.e(b9.f7064g, m2.a.i(j8), m2.a.g(j8));
        return h0Var.C(e9, e10, e6.v.f2827f, new x0(this, e9, b9, e10, h0Var));
    }
}
