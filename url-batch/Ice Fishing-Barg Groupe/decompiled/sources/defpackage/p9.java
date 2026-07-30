package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p9 extends r61 {
    public final boolean PxuCJdSBwIXG;
    public final le0 lS5Rgt96tfkO;

    public p9(le0 le0Var, boolean z) {
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = le0Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        ht htVar = new ht();
        htVar.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        htVar.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        return htVar;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        ht htVar = (ht) m61Var;
        htVar.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        htVar.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9)) {
            return false;
        }
        p9 p9Var = (p9) obj;
        return this.PxuCJdSBwIXG == p9Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == p9Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return this.lS5Rgt96tfkO.hashCode() + (Boolean.hashCode(this.PxuCJdSBwIXG) * 31);
    }
}
