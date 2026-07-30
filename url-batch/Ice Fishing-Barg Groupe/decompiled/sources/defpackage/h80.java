package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class h80 {
    public final float PxuCJdSBwIXG;
    public final long TSizfFm2Yiuu;
    public final float lS5Rgt96tfkO;

    public h80(float f, float f2, long j) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
        this.TSizfFm2Yiuu = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h80)) {
            return false;
        }
        h80 h80Var = (h80) obj;
        return Float.compare(this.PxuCJdSBwIXG, h80Var.PxuCJdSBwIXG) == 0 && Float.compare(this.lS5Rgt96tfkO, h80Var.lS5Rgt96tfkO) == 0 && this.TSizfFm2Yiuu == h80Var.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        return Long.hashCode(this.TSizfFm2Yiuu) + o0.PxuCJdSBwIXG(this.lS5Rgt96tfkO, Float.hashCode(this.PxuCJdSBwIXG) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.PxuCJdSBwIXG + ", distance=" + this.lS5Rgt96tfkO + ", duration=" + this.TSizfFm2Yiuu + ')';
    }
}
