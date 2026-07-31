package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 implements a2 {

    /* renamed from: d, reason: collision with root package name */
    public final p6.c f4925d;

    /* renamed from: e, reason: collision with root package name */
    public g0 f4926e;

    public f0(p6.c cVar) {
        this.f4925d = cVar;
    }

    @Override // m0.a2
    public final void e() {
        this.f4926e = (g0) this.f4925d.i(b.f4877b);
    }

    @Override // m0.a2
    public final void i() {
        g0 g0Var = this.f4926e;
        if (g0Var != null) {
            g0Var.a();
        }
        this.f4926e = null;
    }

    @Override // m0.a2
    public final void f() {
    }
}
