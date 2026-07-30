package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zn0 extends r61 {
    public final boolean PxuCJdSBwIXG;
    public final pf2 TSizfFm2Yiuu;
    public final z42 Y1f8riQaR6yg;
    public final e81 lS5Rgt96tfkO;

    public zn0(boolean z, e81 e81Var, pf2 pf2Var, z42 z42Var) {
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = e81Var;
        this.TSizfFm2Yiuu = pf2Var;
        this.Y1f8riQaR6yg = z42Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        return new bo0(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, this.Y1f8riQaR6yg);
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        boolean z;
        bo0 bo0Var = (bo0) m61Var;
        boolean z2 = bo0Var.ZbWwgt3aGe7A;
        boolean z3 = this.PxuCJdSBwIXG;
        boolean z4 = true;
        if (z2 != z3) {
            bo0Var.ZbWwgt3aGe7A = z3;
            z = true;
        } else {
            z = false;
        }
        e81 e81Var = bo0Var.pnx5pC0XzaCw;
        e81 e81Var2 = this.lS5Rgt96tfkO;
        if (e81Var != e81Var2) {
            bo0Var.pnx5pC0XzaCw = e81Var2;
            z82 z82Var = bo0Var.aF05bpZJlKEP;
            bt btVar = null;
            if (z82Var != null) {
                z82Var.a92UlCVFR9N8(null);
            }
            bo0Var.aF05bpZJlKEP = fx1.KUoIVIumpKat(bo0Var.GlTbNTgfSMqy(), null, new ao0(bo0Var, btVar, 3), 3);
        }
        pf2 pf2Var = bo0Var.kpCQ9veP6n3I;
        pf2 pf2Var2 = this.TSizfFm2Yiuu;
        if (!cs0.wdg6QnbFHrFF(pf2Var, pf2Var2)) {
            bo0Var.kpCQ9veP6n3I = pf2Var2;
            z = true;
        }
        z42 z42Var = bo0Var.BjEWd04qc7Mw;
        z42 z42Var2 = this.Y1f8riQaR6yg;
        if (!cs0.wdg6QnbFHrFF(z42Var, z42Var2)) {
            if (!cs0.wdg6QnbFHrFF(bo0Var.BjEWd04qc7Mw, z42Var2)) {
                bo0Var.BjEWd04qc7Mw = z42Var2;
                bo0Var.tmVwIGCQF4zR.W7ceZOzvrRuI();
            }
            z = true;
        }
        if (!k10.lS5Rgt96tfkO(bo0Var.IAToe7bXGz4N, 2.0f)) {
            bo0Var.IAToe7bXGz4N = 2.0f;
            z = true;
        }
        if (k10.lS5Rgt96tfkO(bo0Var.e6tOsSdd2EFb, 1.0f)) {
            z4 = z;
        } else {
            bo0Var.e6tOsSdd2EFb = 1.0f;
        }
        if (z4) {
            bo0Var.MDTGUQSX7PXD();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn0)) {
            return false;
        }
        zn0 zn0Var = (zn0) obj;
        return this.PxuCJdSBwIXG == zn0Var.PxuCJdSBwIXG && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, zn0Var.lS5Rgt96tfkO) && this.TSizfFm2Yiuu.equals(zn0Var.TSizfFm2Yiuu) && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, zn0Var.Y1f8riQaR6yg) && k10.lS5Rgt96tfkO(2.0f, 2.0f) && k10.lS5Rgt96tfkO(1.0f, 1.0f);
    }

    public final int hashCode() {
        int hashCode = (this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + o0.Y1f8riQaR6yg(Boolean.hashCode(this.PxuCJdSBwIXG) * 31, 31, false)) * 31)) * 31;
        z42 z42Var = this.Y1f8riQaR6yg;
        return Float.hashCode(1.0f) + o0.PxuCJdSBwIXG(2.0f, (hashCode + (z42Var != null ? z42Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.PxuCJdSBwIXG + ", isError=false, interactionSource=" + this.lS5Rgt96tfkO + ", colors=" + this.TSizfFm2Yiuu + ", textFieldShape=" + this.Y1f8riQaR6yg + ", focusedIndicatorLineThickness=" + ((Object) k10.TSizfFm2Yiuu(2.0f)) + ", unfocusedIndicatorLineThickness=" + ((Object) k10.TSizfFm2Yiuu(1.0f)) + ')';
    }
}
