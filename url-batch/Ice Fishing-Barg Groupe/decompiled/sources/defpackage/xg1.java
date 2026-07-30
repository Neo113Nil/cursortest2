package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xg1 extends nh1 {
    public static final xg1 TSizfFm2Yiuu = new xg1(0, 3, 1);

    @Override // defpackage.nh1
    public final void PxuCJdSBwIXG(of0 of0Var, r9 r9Var, e72 e72Var, ju1 ju1Var, oh1 oh1Var) {
        op0 op0Var;
        a72 a72Var = (a72) of0Var.Y1f8riQaR6yg(1);
        nf0 nf0Var = (nf0) of0Var.Y1f8riQaR6yg(0);
        g80 g80Var = (g80) of0Var.Y1f8riQaR6yg(2);
        e72 Y1f8riQaR6yg = a72Var.Y1f8riQaR6yg();
        if (oh1Var != null) {
            try {
                op0Var = new op0(28, oh1Var, e72Var);
            } catch (Throwable th) {
                Y1f8riQaR6yg.e9gEMXR7LXtO(false);
                throw th;
            }
        } else {
            op0Var = null;
        }
        if (!g80Var.Y1f8riQaR6yg.POWyO8hTM6YC()) {
            mp.PxuCJdSBwIXG("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        g80Var.TSizfFm2Yiuu.gGoUzNp9JO5I(r9Var, Y1f8riQaR6yg, ju1Var, op0Var);
        Y1f8riQaR6yg.e9gEMXR7LXtO(true);
        e72Var.Y1f8riQaR6yg();
        nf0Var.getClass();
        e72Var.e6tOsSdd2EFb(a72Var, a72Var.PxuCJdSBwIXG(nf0Var));
        e72Var.dgRBjINgWbAK();
    }
}
