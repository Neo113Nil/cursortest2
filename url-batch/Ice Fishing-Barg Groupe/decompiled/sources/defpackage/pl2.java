package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class pl2 extends r61 {
    public final ny0 PxuCJdSBwIXG;

    public pl2(ny0 ny0Var) {
        this.PxuCJdSBwIXG = ny0Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        ql2 ql2Var = new ql2();
        ql2Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        return ql2Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        ((ql2) m61Var).VhhvGxCb8gfr = this.PxuCJdSBwIXG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pl2) && cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ((pl2) obj).PxuCJdSBwIXG);
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.PxuCJdSBwIXG + ')';
    }
}
