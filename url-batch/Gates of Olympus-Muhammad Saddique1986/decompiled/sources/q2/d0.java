package q2;

/* loaded from: classes.dex */
public final class d0 extends b0 {

    /* renamed from: h, reason: collision with root package name */
    public final f0 f7885h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f7886i;

    /* renamed from: j, reason: collision with root package name */
    public final C0825l f7887j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f7888k;

    public d0(f0 f0Var, e0 e0Var, C0825l c0825l, Object obj) {
        this.f7885h = f0Var;
        this.f7886i = e0Var;
        this.f7887j = c0825l;
        this.f7888k = obj;
    }

    @Override // q2.b0
    public final boolean k() {
        return false;
    }

    @Override // q2.b0
    public final void l(Throwable th) {
        C0825l c0825l = this.f7887j;
        f0 f0Var = this.f7885h;
        f0Var.getClass();
        C0825l Y2 = f0.Y(c0825l);
        e0 e0Var = this.f7886i;
        Object obj = this.f7888k;
        if (Y2 == null || !f0Var.h0(e0Var, Y2, obj)) {
            e0Var.f7894d.e(new v2.h(2), 2);
            C0825l Y3 = f0.Y(c0825l);
            if (Y3 == null || !f0Var.h0(e0Var, Y3, obj)) {
                f0Var.A(f0Var.L(e0Var, obj));
            }
        }
    }
}
