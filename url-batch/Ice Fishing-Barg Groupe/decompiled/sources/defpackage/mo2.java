package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mo2 implements ms2 {
    public final ms2 PxuCJdSBwIXG;
    public final ms2 lS5Rgt96tfkO;

    public mo2(ms2 ms2Var, ms2 ms2Var2) {
        this.PxuCJdSBwIXG = ms2Var;
        this.lS5Rgt96tfkO = ms2Var2;
    }

    @Override // defpackage.ms2
    public final int PxuCJdSBwIXG(hy hyVar) {
        return Math.max(this.PxuCJdSBwIXG.PxuCJdSBwIXG(hyVar), this.lS5Rgt96tfkO.PxuCJdSBwIXG(hyVar));
    }

    @Override // defpackage.ms2
    public final int TSizfFm2Yiuu(hy hyVar, cw0 cw0Var) {
        return Math.max(this.PxuCJdSBwIXG.TSizfFm2Yiuu(hyVar, cw0Var), this.lS5Rgt96tfkO.TSizfFm2Yiuu(hyVar, cw0Var));
    }

    @Override // defpackage.ms2
    public final int Y1f8riQaR6yg(hy hyVar, cw0 cw0Var) {
        return Math.max(this.PxuCJdSBwIXG.Y1f8riQaR6yg(hyVar, cw0Var), this.lS5Rgt96tfkO.Y1f8riQaR6yg(hyVar, cw0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo2)) {
            return false;
        }
        mo2 mo2Var = (mo2) obj;
        return mo2Var.PxuCJdSBwIXG.equals(this.PxuCJdSBwIXG) && mo2Var.lS5Rgt96tfkO.equals(this.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return (this.lS5Rgt96tfkO.hashCode() * 31) + this.PxuCJdSBwIXG.hashCode();
    }

    @Override // defpackage.ms2
    public final int lS5Rgt96tfkO(hy hyVar) {
        return Math.max(this.PxuCJdSBwIXG.lS5Rgt96tfkO(hyVar), this.lS5Rgt96tfkO.lS5Rgt96tfkO(hyVar));
    }

    public final String toString() {
        return "(" + this.PxuCJdSBwIXG + " ∪ " + this.lS5Rgt96tfkO + ')';
    }
}
