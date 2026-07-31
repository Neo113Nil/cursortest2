package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w extends y0.l implements w1.v {

    /* renamed from: r, reason: collision with root package name */
    public u f8309r;

    /* renamed from: s, reason: collision with root package name */
    public float f8310s;

    @Override // w1.v
    public final u1.f0 e(w1.n0 n0Var, u1.d0 d0Var, long j7) {
        int j8;
        int h8;
        int g3;
        int i;
        if (!r2.a.d(j7) || this.f8309r == u.f8295d) {
            j8 = r2.a.j(j7);
            h8 = r2.a.h(j7);
        } else {
            int round = Math.round(r2.a.h(j7) * this.f8310s);
            int j9 = r2.a.j(j7);
            j8 = r2.a.h(j7);
            if (round < j9) {
                round = j9;
            }
            if (round <= j8) {
                j8 = round;
            }
            h8 = j8;
        }
        if (!r2.a.c(j7) || this.f8309r == u.f8296e) {
            int i8 = r2.a.i(j7);
            g3 = r2.a.g(j7);
            i = i8;
        } else {
            int round2 = Math.round(r2.a.g(j7) * this.f8310s);
            int i9 = r2.a.i(j7);
            i = r2.a.g(j7);
            if (round2 < i9) {
                round2 = i9;
            }
            if (round2 <= i) {
                i = round2;
            }
            g3 = i;
        }
        u1.l0 e8 = d0Var.e(r2.b.a(j8, h8, i, g3));
        return n0Var.e0(e8.f7230d, e8.f7231e, d6.v.f2327d, new a0.m(e8, 3));
    }
}
