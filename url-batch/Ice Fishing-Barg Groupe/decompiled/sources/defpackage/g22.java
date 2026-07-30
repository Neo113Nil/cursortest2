package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g22 {
    public final iv1 PxuCJdSBwIXG;
    public final long TSizfFm2Yiuu;
    public final int lS5Rgt96tfkO;

    public g22(iv1 iv1Var, int i, long j) {
        this.PxuCJdSBwIXG = iv1Var;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g22)) {
            return false;
        }
        g22 g22Var = (g22) obj;
        return this.PxuCJdSBwIXG == g22Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == g22Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == g22Var.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        return Long.hashCode(this.TSizfFm2Yiuu) + o0.lS5Rgt96tfkO(this.lS5Rgt96tfkO, this.PxuCJdSBwIXG.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.PxuCJdSBwIXG + ", offset=" + this.lS5Rgt96tfkO + ", selectableId=" + this.TSizfFm2Yiuu + ')';
    }
}
