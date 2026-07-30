package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class w70 extends r61 {
    public static final v70 Companion = new v70();
    public final c00 PxuCJdSBwIXG;
    public final float lS5Rgt96tfkO;

    public w70(c00 c00Var, float f) {
        this.PxuCJdSBwIXG = c00Var;
        this.lS5Rgt96tfkO = f;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        x70 x70Var = new x70();
        x70Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        x70Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        return x70Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        x70 x70Var = (x70) m61Var;
        x70Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        x70Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w70)) {
            return false;
        }
        w70 w70Var = (w70) obj;
        return this.PxuCJdSBwIXG == w70Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == w70Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Float.hashCode(this.lS5Rgt96tfkO) + (this.PxuCJdSBwIXG.hashCode() * 31);
    }
}
