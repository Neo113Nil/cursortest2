package t2;

/* loaded from: classes.dex */
public final class b0 extends Z {

    /* renamed from: e, reason: collision with root package name */
    public final e0 f10399e;
    public final c0 f;

    /* renamed from: g, reason: collision with root package name */
    public final C1200j f10400g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f10401h;

    public b0(e0 e0Var, c0 c0Var, C1200j c1200j, Object obj) {
        this.f10399e = e0Var;
        this.f = c0Var;
        this.f10400g = c1200j;
        this.f10401h = obj;
    }

    @Override // t2.Q
    public final void c(Throwable th) {
        C1200j c1200j = this.f10400g;
        e0 e0Var = this.f10399e;
        e0Var.getClass();
        C1200j L = e0.L(c1200j);
        c0 c0Var = this.f;
        Object obj = this.f10401h;
        if (L != null) {
            while (AbstractC1212w.f(L.f10422e, false, new b0(e0Var, c0Var, L, obj), 1) == g0.f10420a) {
                L = e0.L(L);
                if (L == null) {
                }
            }
            return;
        }
        e0Var.o(e0Var.y(c0Var, obj));
    }
}
