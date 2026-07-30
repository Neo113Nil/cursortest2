package n6;

/* loaded from: classes.dex */
public final class d0 extends b0 {

    /* renamed from: m, reason: collision with root package name */
    public final f0 f7044m;

    /* renamed from: n, reason: collision with root package name */
    public final e0 f7045n;

    /* renamed from: o, reason: collision with root package name */
    public final C0779l f7046o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f7047p;

    public d0(f0 f0Var, e0 e0Var, C0779l c0779l, Object obj) {
        this.f7044m = f0Var;
        this.f7045n = e0Var;
        this.f7046o = c0779l;
        this.f7047p = obj;
    }

    @Override // n6.b0
    public final boolean j() {
        return false;
    }

    @Override // n6.b0
    public final void k(Throwable th) {
        C0779l c0779l = this.f7046o;
        C0779l M7 = f0.M(c0779l);
        f0 f0Var = this.f7044m;
        e0 e0Var = this.f7045n;
        Object obj = this.f7047p;
        if (M7 == null || !f0Var.V(e0Var, M7, obj)) {
            e0Var.f7053d.d(new s6.h(2), 2);
            C0779l M8 = f0.M(c0779l);
            if (M8 == null || !f0Var.V(e0Var, M8, obj)) {
                f0Var.l(f0Var.v(e0Var, obj));
            }
        }
    }
}
