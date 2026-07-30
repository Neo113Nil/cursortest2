package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zp0 implements mi1 {
    public final ms2 PxuCJdSBwIXG;
    public final hy lS5Rgt96tfkO;

    public zp0(ms2 ms2Var, hy hyVar) {
        this.PxuCJdSBwIXG = ms2Var;
        this.lS5Rgt96tfkO = hyVar;
    }

    @Override // defpackage.mi1
    public final float PxuCJdSBwIXG(cw0 cw0Var) {
        ms2 ms2Var = this.PxuCJdSBwIXG;
        hy hyVar = this.lS5Rgt96tfkO;
        return hyVar.e4HgwifUDUCA(ms2Var.Y1f8riQaR6yg(hyVar, cw0Var));
    }

    @Override // defpackage.mi1
    public final float TSizfFm2Yiuu() {
        ms2 ms2Var = this.PxuCJdSBwIXG;
        hy hyVar = this.lS5Rgt96tfkO;
        return hyVar.e4HgwifUDUCA(ms2Var.PxuCJdSBwIXG(hyVar));
    }

    @Override // defpackage.mi1
    public final float Y1f8riQaR6yg() {
        ms2 ms2Var = this.PxuCJdSBwIXG;
        hy hyVar = this.lS5Rgt96tfkO;
        return hyVar.e4HgwifUDUCA(ms2Var.lS5Rgt96tfkO(hyVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp0)) {
            return false;
        }
        zp0 zp0Var = (zp0) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, zp0Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, zp0Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    @Override // defpackage.mi1
    public final float lS5Rgt96tfkO(cw0 cw0Var) {
        ms2 ms2Var = this.PxuCJdSBwIXG;
        hy hyVar = this.lS5Rgt96tfkO;
        return hyVar.e4HgwifUDUCA(ms2Var.TSizfFm2Yiuu(hyVar, cw0Var));
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.PxuCJdSBwIXG + ", density=" + this.lS5Rgt96tfkO + ')';
    }
}
