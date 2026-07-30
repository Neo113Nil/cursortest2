package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t22 {
    public final ji0 PxuCJdSBwIXG;
    public final s22 TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final long lS5Rgt96tfkO;

    public t22(ji0 ji0Var, long j, s22 s22Var, boolean z) {
        this.PxuCJdSBwIXG = ji0Var;
        this.lS5Rgt96tfkO = j;
        this.TSizfFm2Yiuu = s22Var;
        this.Y1f8riQaR6yg = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t22)) {
            return false;
        }
        t22 t22Var = (t22) obj;
        return this.PxuCJdSBwIXG == t22Var.PxuCJdSBwIXG && bf1.lS5Rgt96tfkO(this.lS5Rgt96tfkO, t22Var.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == t22Var.TSizfFm2Yiuu && this.Y1f8riQaR6yg == t22Var.Y1f8riQaR6yg;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Y1f8riQaR6yg) + ((this.TSizfFm2Yiuu.hashCode() + o0.TSizfFm2Yiuu(this.PxuCJdSBwIXG.hashCode() * 31, 31, this.lS5Rgt96tfkO)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.PxuCJdSBwIXG + ", position=" + ((Object) bf1.RAsUl2FVSrh6(this.lS5Rgt96tfkO)) + ", anchor=" + this.TSizfFm2Yiuu + ", visible=" + this.Y1f8riQaR6yg + ')';
    }
}
