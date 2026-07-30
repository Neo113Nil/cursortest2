package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class ri1 extends r61 {
    public final qi1 PxuCJdSBwIXG;
    public final jl lS5Rgt96tfkO;

    public ri1(qi1 qi1Var, jl jlVar) {
        this.PxuCJdSBwIXG = qi1Var;
        this.lS5Rgt96tfkO = jlVar;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        si1 si1Var = new si1();
        si1Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        si1Var.S2OOm9zPNm0h = true;
        si1Var.ZbWwgt3aGe7A = r.a92UlCVFR9N8;
        si1Var.pnx5pC0XzaCw = gs.lS5Rgt96tfkO;
        si1Var.IAToe7bXGz4N = 1.0f;
        si1Var.e6tOsSdd2EFb = this.lS5Rgt96tfkO;
        return si1Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        si1 si1Var = (si1) m61Var;
        boolean z = si1Var.S2OOm9zPNm0h;
        qi1 qi1Var = this.PxuCJdSBwIXG;
        boolean z2 = (z && a62.PxuCJdSBwIXG(si1Var.VhhvGxCb8gfr.Y1f8riQaR6yg(), qi1Var.Y1f8riQaR6yg())) ? false : true;
        si1Var.VhhvGxCb8gfr = qi1Var;
        si1Var.S2OOm9zPNm0h = true;
        si1Var.ZbWwgt3aGe7A = r.a92UlCVFR9N8;
        si1Var.pnx5pC0XzaCw = gs.lS5Rgt96tfkO;
        si1Var.IAToe7bXGz4N = 1.0f;
        si1Var.e6tOsSdd2EFb = this.lS5Rgt96tfkO;
        if (z2) {
            ng0.e6tOsSdd2EFb(si1Var);
        }
        fx1.IXK6ba3ucyzm(si1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri1)) {
            return false;
        }
        ri1 ri1Var = (ri1) obj;
        if (!cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ri1Var.PxuCJdSBwIXG)) {
            return false;
        }
        pd pdVar = r.a92UlCVFR9N8;
        return pdVar.equals(pdVar) && Float.compare(1.0f, 1.0f) == 0 && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, ri1Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        int PxuCJdSBwIXG = o0.PxuCJdSBwIXG(1.0f, (gs.lS5Rgt96tfkO.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + o0.Y1f8riQaR6yg(this.PxuCJdSBwIXG.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        jl jlVar = this.lS5Rgt96tfkO;
        return PxuCJdSBwIXG + (jlVar == null ? 0 : jlVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.PxuCJdSBwIXG + ", sizeToIntrinsics=true, alignment=" + r.a92UlCVFR9N8 + ", contentScale=" + gs.lS5Rgt96tfkO + ", alpha=1.0, colorFilter=" + this.lS5Rgt96tfkO + ')';
    }
}
