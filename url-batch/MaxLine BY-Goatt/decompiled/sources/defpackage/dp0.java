package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dp0 extends ul1 implements l00, xt1 {
    public tb1 A;
    public boolean B;

    @Override // defpackage.ul1
    public final void A0() {
        tb1 tb1Var = this.A;
        if (tb1Var != null) {
            tb1Var.b();
        }
        this.A = null;
    }

    @Override // defpackage.xt1
    public final void L() {
        c82 c82Var = new c82();
        j8.P(this, new k7(10, c82Var, this));
        tb1 tb1Var = (tb1) c82Var.m;
        if (this.B) {
            tb1 tb1Var2 = this.A;
            if (tb1Var2 != null) {
                tb1Var2.b();
            }
            if (tb1Var != null) {
                tb1Var.a();
            } else {
                tb1Var = null;
            }
            this.A = tb1Var;
        }
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }
}
