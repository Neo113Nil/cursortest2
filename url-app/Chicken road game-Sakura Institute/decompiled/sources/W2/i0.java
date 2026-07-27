package W2;

/* loaded from: classes.dex */
public final class i0 extends g0 {

    /* renamed from: k, reason: collision with root package name */
    public final k0 f4269k;

    /* renamed from: l, reason: collision with root package name */
    public final j0 f4270l;

    /* renamed from: m, reason: collision with root package name */
    public final C0290l f4271m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f4272n;

    public i0(k0 k0Var, j0 j0Var, C0290l c0290l, Object obj) {
        this.f4269k = k0Var;
        this.f4270l = j0Var;
        this.f4271m = c0290l;
        this.f4272n = obj;
    }

    @Override // W2.g0
    public final boolean k() {
        return false;
    }

    @Override // W2.g0
    public final void l(Throwable th) {
        C0290l c0290l = this.f4271m;
        k0 k0Var = this.f4269k;
        k0Var.getClass();
        C0290l X3 = k0.X(c0290l);
        j0 j0Var = this.f4270l;
        Object obj = this.f4272n;
        if (X3 == null || !k0Var.g0(j0Var, X3, obj)) {
            j0Var.f4278d.e(new b3.h(2), 2);
            C0290l X4 = k0.X(c0290l);
            if (X4 == null || !k0Var.g0(j0Var, X4, obj)) {
                k0Var.A(k0Var.K(j0Var, obj));
            }
        }
    }
}
