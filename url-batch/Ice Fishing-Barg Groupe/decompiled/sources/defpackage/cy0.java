package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cy0 {
    public final wy1 PxuCJdSBwIXG;
    public final v81 TSizfFm2Yiuu;
    public final m6 lS5Rgt96tfkO;

    public cy0(wy1 wy1Var, m6 m6Var) {
        this.PxuCJdSBwIXG = wy1Var;
        this.lS5Rgt96tfkO = m6Var;
        long[] jArr = c02.PxuCJdSBwIXG;
        this.TSizfFm2Yiuu = new v81();
    }

    public final pe0 PxuCJdSBwIXG(int i, Object obj, Object obj2) {
        v81 v81Var = this.TSizfFm2Yiuu;
        by0 by0Var = (by0) v81Var.RAsUl2FVSrh6(obj);
        int i2 = 11;
        if (by0Var != null && by0Var.TSizfFm2Yiuu == i && cs0.wdg6QnbFHrFF(by0Var.lS5Rgt96tfkO, obj2)) {
            on onVar = by0Var.Y1f8riQaR6yg;
            if (onVar != null) {
                return onVar;
            }
            on onVar2 = new on(818252804, true, new bf(i2, by0Var.e9gEMXR7LXtO, by0Var));
            by0Var.Y1f8riQaR6yg = onVar2;
            return onVar2;
        }
        by0 by0Var2 = new by0(this, i, obj, obj2);
        v81Var.cpQdD2nAriOS(obj, by0Var2);
        on onVar3 = by0Var2.Y1f8riQaR6yg;
        if (onVar3 != null) {
            return onVar3;
        }
        on onVar4 = new on(818252804, true, new bf(i2, this, by0Var2));
        by0Var2.Y1f8riQaR6yg = onVar4;
        return onVar4;
    }

    public final Object lS5Rgt96tfkO(Object obj) {
        if (obj != null) {
            by0 by0Var = (by0) this.TSizfFm2Yiuu.RAsUl2FVSrh6(obj);
            if (by0Var != null) {
                return by0Var.lS5Rgt96tfkO;
            }
            zy0 zy0Var = (zy0) this.lS5Rgt96tfkO.PxuCJdSBwIXG();
            int lS5Rgt96tfkO = zy0Var.Y1f8riQaR6yg.lS5Rgt96tfkO(obj);
            if (lS5Rgt96tfkO != -1) {
                zy0Var.lS5Rgt96tfkO(lS5Rgt96tfkO);
            }
        }
        return null;
    }
}
