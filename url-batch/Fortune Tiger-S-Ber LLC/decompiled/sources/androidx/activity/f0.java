package androidx.activity;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f0 implements c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.c0 f98a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f99b;

    public f0(h0 h0Var, androidx.fragment.app.c0 c0Var) {
        u2.c.e(c0Var, "onBackPressedCallback");
        this.f99b = h0Var;
        this.f98a = c0Var;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        h0 h0Var = this.f99b;
        n2.e eVar = h0Var.f108b;
        androidx.fragment.app.c0 c0Var = this.f98a;
        eVar.remove(c0Var);
        if (u2.c.a(h0Var.c, c0Var)) {
            c0Var.getClass();
            h0Var.c = null;
        }
        c0Var.f411b.remove(this);
        g0 g0Var = c0Var.c;
        if (g0Var != null) {
            g0Var.a();
        }
        c0Var.c = null;
    }
}
