package androidx.activity;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.p, c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f79a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.c0 f80b;
    public f0 c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f81d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(h0 h0Var, androidx.lifecycle.t tVar, androidx.fragment.app.c0 c0Var) {
        u2.c.e(c0Var, "onBackPressedCallback");
        this.f81d = h0Var;
        this.f79a = tVar;
        this.f80b = c0Var;
        tVar.a(this);
    }

    @Override // androidx.lifecycle.p
    public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        if (lVar != androidx.lifecycle.l.ON_START) {
            if (lVar != androidx.lifecycle.l.ON_STOP) {
                if (lVar == androidx.lifecycle.l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                f0 f0Var = this.c;
                if (f0Var != null) {
                    f0Var.cancel();
                    return;
                }
                return;
            }
        }
        h0 h0Var = this.f81d;
        h0Var.getClass();
        androidx.fragment.app.c0 c0Var = this.f80b;
        u2.c.e(c0Var, "onBackPressedCallback");
        h0Var.f108b.addLast(c0Var);
        f0 f0Var2 = new f0(h0Var, c0Var);
        c0Var.f411b.add(f0Var2);
        h0Var.e();
        c0Var.c = new g0(1, h0Var);
        this.c = f0Var2;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f79a.f(this);
        this.f80b.f411b.remove(this);
        f0 f0Var = this.c;
        if (f0Var != null) {
            f0Var.cancel();
        }
        this.c = null;
    }
}
