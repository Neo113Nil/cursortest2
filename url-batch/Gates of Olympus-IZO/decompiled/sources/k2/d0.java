package k2;

/* loaded from: classes.dex */
public final class d0 extends b0 {

    /* renamed from: h, reason: collision with root package name */
    public final f0 f5346h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f5347i;

    /* renamed from: j, reason: collision with root package name */
    public final C0540l f5348j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f5349k;

    public d0(f0 f0Var, e0 e0Var, C0540l c0540l, Object obj) {
        this.f5346h = f0Var;
        this.f5347i = e0Var;
        this.f5348j = c0540l;
        this.f5349k = obj;
    }

    @Override // k2.b0
    public final boolean k() {
        return false;
    }

    @Override // k2.b0
    public final void l(Throwable th) {
        C0540l c0540l = this.f5348j;
        f0 f0Var = this.f5346h;
        f0Var.getClass();
        C0540l U2 = f0.U(c0540l);
        e0 e0Var = this.f5347i;
        Object obj = this.f5349k;
        if (U2 == null || !f0Var.d0(e0Var, U2, obj)) {
            e0Var.f5355d.e(new p2.h(2), 2);
            C0540l U3 = f0.U(c0540l);
            if (U3 == null || !f0Var.d0(e0Var, U3, obj)) {
                f0Var.l(f0Var.F(e0Var, obj));
            }
        }
    }
}
