package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class m10 extends zq implements uq0, ul {
    public final o10 u;
    public we0 v;

    public m10() {
        o10 o10Var = new o10(0, new l10(2, this, m10.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0), 9);
        z0(o10Var);
        this.u = o10Var;
    }

    @Override // defpackage.uq0
    public final void B() {
        z11 z11Var = new z11();
        gb0.G(this, new w3(z11Var, 4, this));
        we0 we0Var = (we0) z11Var.d;
        if (this.u.E0().a()) {
            we0 we0Var2 = this.v;
            if (we0Var2 != null) {
                we0Var2.b();
            }
            if (we0Var != null) {
                we0Var.a();
            } else {
                we0Var = null;
            }
            this.v = we0Var;
        }
    }
}
