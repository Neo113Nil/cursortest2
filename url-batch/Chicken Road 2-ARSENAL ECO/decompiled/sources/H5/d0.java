package H5;

/* loaded from: classes.dex */
public final class d0 extends b0 {

    /* renamed from: j, reason: collision with root package name */
    public final g0 f1061j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f1062k;

    /* renamed from: l, reason: collision with root package name */
    public final C0151k f1063l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f1064m;

    public d0(g0 g0Var, e0 e0Var, C0151k c0151k, Object obj) {
        this.f1061j = g0Var;
        this.f1062k = e0Var;
        this.f1063l = c0151k;
        this.f1064m = obj;
    }

    @Override // x5.InterfaceC0743l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return k5.v.f5219a;
    }

    @Override // H5.b0
    public final void k(Throwable th) {
        C0151k L6 = g0.L(this.f1063l);
        g0 g0Var = this.f1061j;
        e0 e0Var = this.f1062k;
        Object obj = this.f1064m;
        if (L6 != null) {
            while (AbstractC0165z.j(L6.f1086j, new d0(g0Var, e0Var, L6, obj), 1) == j0.f1085f) {
                L6 = g0.L(L6);
                if (L6 == null) {
                }
            }
            return;
        }
        g0Var.k(g0Var.u(e0Var, obj));
    }
}
