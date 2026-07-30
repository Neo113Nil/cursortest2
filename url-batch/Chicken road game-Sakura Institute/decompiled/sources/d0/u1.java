package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u1 extends s0.n implements r1.k, r1.w {
    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        float f9 = ((m2.e) r1.f.i(this, r1.f2357a)).f6312f;
        float f10 = 0;
        if (f9 < f10) {
            f9 = f10;
        }
        p1.n0 b9 = e0Var.b(j8);
        boolean z8 = this.f8116r && !Float.isNaN(f9) && Float.compare(f9, f10) > 0;
        int K = Float.isNaN(f9) ? 0 : h0Var.K(f9);
        int max = z8 ? Math.max(b9.f7063f, K) : b9.f7063f;
        int max2 = z8 ? Math.max(b9.f7064g, K) : b9.f7064g;
        return h0Var.C(max, max2, e6.v.f2827f, new t1(max, b9, max2));
    }
}
