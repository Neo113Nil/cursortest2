package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 extends y0.l implements w1.v {

    /* renamed from: r, reason: collision with root package name */
    public float f8264r;

    /* renamed from: s, reason: collision with root package name */
    public float f8265s;

    @Override // w1.v
    public final u1.f0 e(w1.n0 n0Var, u1.d0 d0Var, long j7) {
        int j8;
        int i;
        if (Float.isNaN(this.f8264r) || r2.a.j(j7) != 0) {
            j8 = r2.a.j(j7);
        } else {
            int H = n0Var.H(this.f8264r);
            j8 = r2.a.h(j7);
            if (H < 0) {
                H = 0;
            }
            if (H <= j8) {
                j8 = H;
            }
        }
        int h8 = r2.a.h(j7);
        if (Float.isNaN(this.f8265s) || r2.a.i(j7) != 0) {
            i = r2.a.i(j7);
        } else {
            int H2 = n0Var.H(this.f8265s);
            i = r2.a.g(j7);
            int i8 = H2 >= 0 ? H2 : 0;
            if (i8 <= i) {
                i = i8;
            }
        }
        u1.l0 e8 = d0Var.e(r2.b.a(j8, h8, i, r2.a.g(j7)));
        return n0Var.e0(e8.f7230d, e8.f7231e, d6.v.f2327d, new a0.m(e8, 5));
    }
}
