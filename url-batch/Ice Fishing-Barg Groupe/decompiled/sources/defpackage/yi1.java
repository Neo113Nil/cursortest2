package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yi1 {
    public final q4 PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final int lS5Rgt96tfkO;

    public yi1(q4 q4Var, int i, int i2) {
        this.PxuCJdSBwIXG = q4Var;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yi1) {
            yi1 yi1Var = (yi1) obj;
            if (this.PxuCJdSBwIXG == yi1Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == yi1Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == yi1Var.TSizfFm2Yiuu) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.TSizfFm2Yiuu) + o0.lS5Rgt96tfkO(this.lS5Rgt96tfkO, this.PxuCJdSBwIXG.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", startIndex=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", endIndex=");
        return o0.r3s1LDPKFs1S(sb, this.TSizfFm2Yiuu, ')');
    }
}
