package e0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f135a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f136b;

    public d0(e0 e0Var) {
        this.f136b = e0Var;
    }

    public final void a(boolean z2) {
        if (this.f135a) {
            f0.l.b("The onKeyEventHandledCallback should be called exactly once.");
            return;
        }
        this.f135a = true;
        e0 e0Var = this.f136b;
        int i2 = e0Var.f139b - 1;
        e0Var.f139b = i2;
        boolean z3 = z2 | e0Var.f140c;
        e0Var.f140c = z3;
        if (i2 != 0 || z3) {
            return;
        }
        e0Var.f141d.e(e0Var.f138a);
    }
}
