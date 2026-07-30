package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class ve extends r61 {
    public final pd PxuCJdSBwIXG;
    public final boolean lS5Rgt96tfkO;

    public ve(pd pdVar, boolean z) {
        this.PxuCJdSBwIXG = pdVar;
        this.lS5Rgt96tfkO = z;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        we weVar = new we();
        weVar.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        weVar.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        return weVar;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        we weVar = (we) m61Var;
        weVar.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        weVar.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ve veVar = obj instanceof ve ? (ve) obj : null;
        return veVar != null && this.PxuCJdSBwIXG.equals(veVar.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == veVar.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.lS5Rgt96tfkO) + (this.PxuCJdSBwIXG.hashCode() * 31);
    }
}
