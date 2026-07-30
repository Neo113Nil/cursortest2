package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uw1 implements yn0 {
    public final boolean PxuCJdSBwIXG;
    public final long lS5Rgt96tfkO;

    public uw1(long j, boolean z) {
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = j;
    }

    @Override // defpackage.yn0
    public final tx PxuCJdSBwIXG(e81 e81Var) {
        return new zx(e81Var, this.PxuCJdSBwIXG, new yx(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw1)) {
            return false;
        }
        uw1 uw1Var = (uw1) obj;
        if (this.PxuCJdSBwIXG == uw1Var.PxuCJdSBwIXG && k10.lS5Rgt96tfkO(Float.NaN, Float.NaN)) {
            return hl.TSizfFm2Yiuu(this.lS5Rgt96tfkO, uw1Var.lS5Rgt96tfkO);
        }
        return false;
    }

    @Override // defpackage.yn0
    public final int hashCode() {
        int PxuCJdSBwIXG = o0.PxuCJdSBwIXG(Float.NaN, Boolean.hashCode(this.PxuCJdSBwIXG) * 31, 961);
        gl glVar = hl.Companion;
        return Long.hashCode(this.lS5Rgt96tfkO) + PxuCJdSBwIXG;
    }
}
