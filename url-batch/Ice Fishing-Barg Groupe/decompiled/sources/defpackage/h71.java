package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class h71 {
    public final long PxuCJdSBwIXG;
    public final boolean TSizfFm2Yiuu;
    public final long lS5Rgt96tfkO;

    public h71(long j, long j2, boolean z) {
        this.PxuCJdSBwIXG = j;
        this.lS5Rgt96tfkO = j2;
        this.TSizfFm2Yiuu = z;
    }

    public final h71 PxuCJdSBwIXG(h71 h71Var) {
        return new h71(bf1.e9gEMXR7LXtO(this.PxuCJdSBwIXG, h71Var.PxuCJdSBwIXG), Math.max(this.lS5Rgt96tfkO, h71Var.lS5Rgt96tfkO), this.TSizfFm2Yiuu);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h71)) {
            return false;
        }
        h71 h71Var = (h71) obj;
        return bf1.lS5Rgt96tfkO(this.PxuCJdSBwIXG, h71Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == h71Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == h71Var.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.TSizfFm2Yiuu) + o0.TSizfFm2Yiuu(Long.hashCode(this.PxuCJdSBwIXG) * 31, 31, this.lS5Rgt96tfkO);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) bf1.RAsUl2FVSrh6(this.PxuCJdSBwIXG)) + ", timeMillis=" + this.lS5Rgt96tfkO + ", shouldApplyImmediately=" + this.TSizfFm2Yiuu + ')';
    }
}
