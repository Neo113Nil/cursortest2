package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e0 extends y0.l implements w1.v {

    /* renamed from: r, reason: collision with root package name */
    public float f8208r;

    /* renamed from: s, reason: collision with root package name */
    public float f8209s;

    /* renamed from: t, reason: collision with root package name */
    public float f8210t;

    /* renamed from: u, reason: collision with root package name */
    public float f8211u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8212v;

    @Override // w1.v
    public final u1.f0 e(w1.n0 n0Var, u1.d0 d0Var, long j7) {
        int H = n0Var.H(this.f8210t) + n0Var.H(this.f8208r);
        int H2 = n0Var.H(this.f8211u) + n0Var.H(this.f8209s);
        u1.l0 e8 = d0Var.e(r2.b.h(-H, -H2, j7));
        return n0Var.e0(r2.b.f(e8.f7230d + H, j7), r2.b.e(e8.f7231e + H2, j7), d6.v.f2327d, new a0.v0(21, this, e8));
    }
}
