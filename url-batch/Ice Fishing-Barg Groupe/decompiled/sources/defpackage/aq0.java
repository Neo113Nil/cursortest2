package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class aq0 {
    public final int PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final int lS5Rgt96tfkO;

    public aq0(int i, int i2, int i3, int i4) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
        this.TSizfFm2Yiuu = i3;
        this.Y1f8riQaR6yg = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq0)) {
            return false;
        }
        aq0 aq0Var = (aq0) obj;
        return this.PxuCJdSBwIXG == aq0Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == aq0Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == aq0Var.TSizfFm2Yiuu && this.Y1f8riQaR6yg == aq0Var.Y1f8riQaR6yg;
    }

    public final int hashCode() {
        return (((((this.PxuCJdSBwIXG * 31) + this.lS5Rgt96tfkO) * 31) + this.TSizfFm2Yiuu) * 31) + this.Y1f8riQaR6yg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", top=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", right=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", bottom=");
        return o0.r3s1LDPKFs1S(sb, this.Y1f8riQaR6yg, ')');
    }
}
