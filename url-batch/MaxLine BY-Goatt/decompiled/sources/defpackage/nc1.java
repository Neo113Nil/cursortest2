package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nc1 extends ul1 implements l00, iv0 {
    public ea A;
    public sc1 B;
    public gv2 C;
    public final lz1 D = ij2.j(null);

    public nc1(ea eaVar, sc1 sc1Var, gv2 gv2Var) {
        this.A = eaVar;
        this.B = sc1Var;
        this.C = gv2Var;
    }

    @Override // defpackage.iv0
    public final void y(ks1 ks1Var) {
        this.D.setValue(ks1Var);
    }

    @Override // defpackage.ul1
    public final void y0() {
        ea eaVar = this.A;
        if (eaVar.a == null) {
            eaVar.a = this;
        } else {
            lh.g("Expected textInputModifierNode to be null");
        }
    }

    @Override // defpackage.ul1
    public final void z0() {
        this.A.k(this);
    }
}
