package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x extends s0.n implements r1.w {

    /* renamed from: s, reason: collision with root package name */
    public int f7373s;

    /* renamed from: t, reason: collision with root package name */
    public float f7374t;

    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        int j9;
        int h3;
        int g9;
        int i7;
        if (!m2.a.d(j8) || this.f7373s == 1) {
            j9 = m2.a.j(j8);
            h3 = m2.a.h(j8);
        } else {
            j9 = v1.g.e(Math.round(m2.a.h(j8) * this.f7374t), m2.a.j(j8), m2.a.h(j8));
            h3 = j9;
        }
        if (!m2.a.c(j8) || this.f7373s == 2) {
            int i8 = m2.a.i(j8);
            g9 = m2.a.g(j8);
            i7 = i8;
        } else {
            i7 = v1.g.e(Math.round(m2.a.g(j8) * this.f7374t), m2.a.i(j8), m2.a.g(j8));
            g9 = i7;
        }
        p1.n0 b9 = e0Var.b(r4.a.b(j9, h3, i7, g9));
        return h0Var.C(b9.f7063f, b9.f7064g, e6.v.f2827f, new k.c0(b9, 4));
    }
}
