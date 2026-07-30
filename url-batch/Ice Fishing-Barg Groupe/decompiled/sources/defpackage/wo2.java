package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class wo2 extends r61 {
    public final float PxuCJdSBwIXG;
    public final float lS5Rgt96tfkO;

    public wo2(float f, float f2) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        xo2 xo2Var = new xo2();
        xo2Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        xo2Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        return xo2Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        xo2 xo2Var = (xo2) m61Var;
        xo2Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        xo2Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wo2)) {
            return false;
        }
        wo2 wo2Var = (wo2) obj;
        return k10.lS5Rgt96tfkO(this.PxuCJdSBwIXG, wo2Var.PxuCJdSBwIXG) && k10.lS5Rgt96tfkO(this.lS5Rgt96tfkO, wo2Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return Float.hashCode(this.lS5Rgt96tfkO) + (Float.hashCode(this.PxuCJdSBwIXG) * 31);
    }
}
