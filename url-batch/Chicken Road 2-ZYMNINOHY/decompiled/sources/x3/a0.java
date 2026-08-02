package x3;

/* loaded from: classes.dex */
public final class a0 extends Y {

    /* renamed from: e, reason: collision with root package name */
    public final d0 f16013e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f16014f;

    /* renamed from: g, reason: collision with root package name */
    public final C1550j f16015g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f16016h;

    public a0(d0 d0Var, b0 b0Var, C1550j c1550j, Object obj) {
        this.f16013e = d0Var;
        this.f16014f = b0Var;
        this.f16015g = c1550j;
        this.f16016h = obj;
    }

    @Override // x3.P
    public final void d(Throwable th) {
        C1550j I4 = d0.I(this.f16015g);
        d0 d0Var = this.f16013e;
        b0 b0Var = this.f16014f;
        Object obj = this.f16016h;
        if (I4 != null) {
            while (AbstractC1562w.f(I4.f16039e, false, new a0(d0Var, b0Var, I4, obj), 1) == f0.f16036a) {
                I4 = d0.I(I4);
                if (I4 == null) {
                }
            }
            return;
        }
        d0Var.l(d0Var.v(b0Var, obj));
    }
}
