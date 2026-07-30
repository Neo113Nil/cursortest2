package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class n30 extends r61 {
    public final le0 PxuCJdSBwIXG;

    public n30(le0 le0Var) {
        this.PxuCJdSBwIXG = le0Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        return new dh(new eh(), this.PxuCJdSBwIXG);
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        dh dhVar = (dh) m61Var;
        dhVar.ZbWwgt3aGe7A = this.PxuCJdSBwIXG;
        dhVar.W7ceZOzvrRuI();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n30) {
            return this.PxuCJdSBwIXG == ((n30) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode();
    }
}
