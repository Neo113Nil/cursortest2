package x;

import j0.a1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 extends y0.l implements w1.v {

    /* renamed from: r, reason: collision with root package name */
    public f0 f8220r;

    @Override // w1.v
    public final u1.f0 e(w1.n0 n0Var, u1.d0 d0Var, long j7) {
        float d8 = this.f8220r.d(n0Var.getLayoutDirection());
        float c8 = this.f8220r.c();
        float b8 = this.f8220r.b(n0Var.getLayoutDirection());
        float a8 = this.f8220r.a();
        float f6 = 0;
        if (!((Float.compare(a8, f6) >= 0) & (Float.compare(d8, f6) >= 0) & (Float.compare(c8, f6) >= 0) & (Float.compare(b8, f6) >= 0))) {
            y.a.a("Padding must be non-negative");
        }
        int H = n0Var.H(d8);
        int H2 = n0Var.H(b8) + H;
        int H3 = n0Var.H(c8);
        int H4 = n0Var.H(a8) + H3;
        u1.l0 e8 = d0Var.e(r2.b.h(-H2, -H4, j7));
        return n0Var.e0(r2.b.f(e8.f7230d + H2, j7), r2.b.e(e8.f7231e + H4, j7), d6.v.f2327d, new a1(e8, H, H3, 2));
    }
}
