package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v91 {
    public final dc1 PxuCJdSBwIXG;
    public final boolean TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final boolean lS5Rgt96tfkO;

    public v91(dc1 dc1Var, boolean z, boolean z2) {
        if (!dc1Var.PxuCJdSBwIXG && z) {
            u9.e9gEMXR7LXtO(dc1Var.lS5Rgt96tfkO().concat(" does not allow nullable values"));
            throw null;
        }
        this.PxuCJdSBwIXG = dc1Var;
        this.lS5Rgt96tfkO = z;
        this.TSizfFm2Yiuu = z2;
        this.Y1f8riQaR6yg = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v91.class != obj.getClass()) {
            return false;
        }
        v91 v91Var = (v91) obj;
        return this.lS5Rgt96tfkO == v91Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == v91Var.TSizfFm2Yiuu && this.PxuCJdSBwIXG.equals(v91Var.PxuCJdSBwIXG);
    }

    public final int hashCode() {
        return ((((this.PxuCJdSBwIXG.hashCode() * 31) + (this.lS5Rgt96tfkO ? 1 : 0)) * 31) + (this.TSizfFm2Yiuu ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(bu1.PxuCJdSBwIXG(v91.class).TSizfFm2Yiuu());
        sb.append(" Type: " + this.PxuCJdSBwIXG);
        sb.append(" Nullable: " + this.lS5Rgt96tfkO);
        if (this.TSizfFm2Yiuu) {
            sb.append(" DefaultValue: null");
        }
        return sb.toString();
    }
}
