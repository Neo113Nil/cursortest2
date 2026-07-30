package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cg0 {
    public final int PxuCJdSBwIXG;
    public final boolean TSizfFm2Yiuu;
    public final String Y1f8riQaR6yg;
    public final boolean lS5Rgt96tfkO;

    public cg0(int i, boolean z, boolean z2, String str) {
        str.getClass();
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = z;
        this.TSizfFm2Yiuu = z2;
        this.Y1f8riQaR6yg = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg0)) {
            return false;
        }
        cg0 cg0Var = (cg0) obj;
        return this.PxuCJdSBwIXG == cg0Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == cg0Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == cg0Var.TSizfFm2Yiuu && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, cg0Var.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        return this.Y1f8riQaR6yg.hashCode() + o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg(Integer.hashCode(this.PxuCJdSBwIXG) * 31, 31, this.lS5Rgt96tfkO), 31, this.TSizfFm2Yiuu);
    }

    public final String toString() {
        return "GateConfigEntity(id=" + this.PxuCJdSBwIXG + ", valueSaved=" + this.lS5Rgt96tfkO + ", customTab=" + this.TSizfFm2Yiuu + ", customTabLink=" + this.Y1f8riQaR6yg + ")";
    }
}
