package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ep0 extends ul1 implements rz2, iv0 {
    public static final u30 C = new u30(12);
    public boolean A;
    public ks1 B;

    public final fp0 G0() {
        if (!this.z) {
            return null;
        }
        rz2 i = nk2.i(this, fp0.B);
        if (i instanceof fp0) {
            return (fp0) i;
        }
        return null;
    }

    @Override // defpackage.rz2
    public final Object r() {
        return C;
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.iv0
    public final void y(ks1 ks1Var) {
        fp0 G0;
        this.B = ks1Var;
        if (this.A) {
            if (!ks1Var.Q0().z) {
                fp0 G02 = G0();
                if (G02 != null) {
                    G02.G0(null);
                    return;
                }
                return;
            }
            ks1 ks1Var2 = this.B;
            if (ks1Var2 == null || !ks1Var2.Q0().z || (G0 = G0()) == null) {
                return;
            }
            G0.G0(this.B);
        }
    }
}
