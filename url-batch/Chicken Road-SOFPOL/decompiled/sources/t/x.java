package t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x extends y0.l implements w1.m {

    /* renamed from: r, reason: collision with root package name */
    public final v.i f6885r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6886s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6887t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6888u;

    public x(v.i iVar) {
        this.f6885r = iVar;
    }

    @Override // w1.m
    public final void A(w1.h0 h0Var) {
        h0Var.a();
        h1.b bVar = h0Var.f7680d;
        if (this.f6886s) {
            h1.d.r(h0Var, f1.s.b(f1.s.f2698b, 0.3f), 0L, bVar.c(), 122);
        } else if (this.f6887t || this.f6888u) {
            h1.d.r(h0Var, f1.s.b(f1.s.f2698b, 0.1f), 0L, bVar.c(), 122);
        }
    }

    @Override // y0.l
    public final void j0() {
        a7.x.n(f0(), null, new a0.p0(this, (g6.c) null, 5), 3);
    }
}
