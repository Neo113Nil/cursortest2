package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class uu0 extends r61 {
    public final le0 PxuCJdSBwIXG;
    public final le0 lS5Rgt96tfkO;

    public uu0(le0 le0Var, le0 le0Var2) {
        this.PxuCJdSBwIXG = le0Var;
        this.lS5Rgt96tfkO = le0Var2;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        wu0 wu0Var = new wu0();
        wu0Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        wu0Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        return wu0Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        wu0 wu0Var = (wu0) m61Var;
        wu0Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        wu0Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu0)) {
            return false;
        }
        uu0 uu0Var = (uu0) obj;
        return this.PxuCJdSBwIXG == uu0Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == uu0Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        le0 le0Var = this.PxuCJdSBwIXG;
        int hashCode = (le0Var != null ? le0Var.hashCode() : 0) * 31;
        le0 le0Var2 = this.lS5Rgt96tfkO;
        return hashCode + (le0Var2 != null ? le0Var2.hashCode() : 0);
    }
}
