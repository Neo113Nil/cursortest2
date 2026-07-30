package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class h22 {
    public final g22 PxuCJdSBwIXG;
    public final boolean TSizfFm2Yiuu;
    public final g22 lS5Rgt96tfkO;

    public h22(g22 g22Var, g22 g22Var2, boolean z) {
        this.PxuCJdSBwIXG = g22Var;
        this.lS5Rgt96tfkO = g22Var2;
        this.TSizfFm2Yiuu = z;
    }

    public static h22 PxuCJdSBwIXG(h22 h22Var, g22 g22Var, g22 g22Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            g22Var = h22Var.PxuCJdSBwIXG;
        }
        if ((i & 2) != 0) {
            g22Var2 = h22Var.lS5Rgt96tfkO;
        }
        h22Var.getClass();
        return new h22(g22Var, g22Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h22)) {
            return false;
        }
        h22 h22Var = (h22) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, h22Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, h22Var.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == h22Var.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.TSizfFm2Yiuu) + ((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.PxuCJdSBwIXG + ", end=" + this.lS5Rgt96tfkO + ", handlesCrossed=" + this.TSizfFm2Yiuu + ')';
    }
}
