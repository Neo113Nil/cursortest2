package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lx0 extends r61 {
    public final float PxuCJdSBwIXG;
    public final boolean lS5Rgt96tfkO;

    public lx0(float f, boolean z) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = z;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        mx0 mx0Var = new mx0();
        mx0Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        mx0Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        return mx0Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        mx0 mx0Var = (mx0) m61Var;
        mx0Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        mx0Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        lx0 lx0Var = obj instanceof lx0 ? (lx0) obj : null;
        return lx0Var != null && this.PxuCJdSBwIXG == lx0Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == lx0Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.lS5Rgt96tfkO) + (Float.hashCode(this.PxuCJdSBwIXG) * 31);
    }
}
