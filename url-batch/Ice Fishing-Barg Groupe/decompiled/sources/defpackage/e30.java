package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class e30 extends r61 {
    public final le0 PxuCJdSBwIXG;

    public e30(le0 le0Var) {
        this.PxuCJdSBwIXG = le0Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        d30 d30Var = new d30();
        d30Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        return d30Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        ((d30) m61Var).VhhvGxCb8gfr = this.PxuCJdSBwIXG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e30) {
            return this.PxuCJdSBwIXG == ((e30) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode();
    }
}
