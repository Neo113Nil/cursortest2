package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ew0 {
    public final int PxuCJdSBwIXG;
    public final boolean TSizfFm2Yiuu;
    public final int lS5Rgt96tfkO;

    public ew0(int i, int i2, boolean z) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
        this.TSizfFm2Yiuu = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew0)) {
            return false;
        }
        ew0 ew0Var = (ew0) obj;
        return this.PxuCJdSBwIXG == ew0Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == ew0Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == ew0Var.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.TSizfFm2Yiuu) + o0.lS5Rgt96tfkO(this.lS5Rgt96tfkO, Integer.hashCode(this.PxuCJdSBwIXG) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.PxuCJdSBwIXG + ", end=" + this.lS5Rgt96tfkO + ", isRtl=" + this.TSizfFm2Yiuu + ')';
    }
}
