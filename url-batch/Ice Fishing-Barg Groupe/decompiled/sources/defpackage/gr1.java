package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class gr1 {
    public final qz0 PxuCJdSBwIXG;

    public gr1(ae0 ae0Var) {
        this.PxuCJdSBwIXG = new qz0(ae0Var);
    }

    public abstract ir1 PxuCJdSBwIXG(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final jp2 TSizfFm2Yiuu(ir1 ir1Var, jp2 jp2Var) {
        y30 y30Var = null;
        if (jp2Var instanceof y30) {
            if (ir1Var.Y1f8riQaR6yg) {
                y30Var = (y30) jp2Var;
                y30Var.PxuCJdSBwIXG.setValue(ir1Var.PxuCJdSBwIXG());
            }
        } else if (jp2Var instanceof u92) {
            if ((ir1Var.lS5Rgt96tfkO || ir1Var.e9gEMXR7LXtO != null) && !ir1Var.Y1f8riQaR6yg) {
                u92 u92Var = (u92) jp2Var;
                if (cs0.wdg6QnbFHrFF(ir1Var.PxuCJdSBwIXG(), u92Var.PxuCJdSBwIXG)) {
                    y30Var = u92Var;
                }
            }
        } else if (jp2Var instanceof gq) {
            ir1Var.getClass();
        }
        if (y30Var != null) {
            return y30Var;
        }
        if (!ir1Var.Y1f8riQaR6yg) {
            return new u92(ir1Var.PxuCJdSBwIXG());
        }
        Object obj = ir1Var.e9gEMXR7LXtO;
        y72 y72Var = ir1Var.TSizfFm2Yiuu;
        if (y72Var == null) {
            y72Var = jx1.S2OOm9zPNm0h;
        }
        return new y30(new mj1(obj, y72Var));
    }

    public jp2 lS5Rgt96tfkO() {
        return this.PxuCJdSBwIXG;
    }
}
