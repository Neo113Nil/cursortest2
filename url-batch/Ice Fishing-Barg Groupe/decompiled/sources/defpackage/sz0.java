package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class sz0 extends r61 {
    public final f4 PxuCJdSBwIXG;
    public final eh2 TSizfFm2Yiuu;
    public final yz0 lS5Rgt96tfkO;

    public sz0(f4 f4Var, yz0 yz0Var, eh2 eh2Var) {
        this.PxuCJdSBwIXG = f4Var;
        this.lS5Rgt96tfkO = yz0Var;
        this.TSizfFm2Yiuu = eh2Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        return new tz0(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu);
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        tz0 tz0Var = (tz0) m61Var;
        if (tz0Var.S9EYkSpbGuxq) {
            tz0Var.VhhvGxCb8gfr.RAsUl2FVSrh6();
            tz0Var.VhhvGxCb8gfr.dgRBjINgWbAK(tz0Var);
        }
        f4 f4Var = this.PxuCJdSBwIXG;
        tz0Var.VhhvGxCb8gfr = f4Var;
        if (tz0Var.S9EYkSpbGuxq) {
            if (f4Var.PxuCJdSBwIXG != null) {
                hp0.TSizfFm2Yiuu("Expected textInputModifierNode to be null");
            }
            f4Var.PxuCJdSBwIXG = tz0Var;
        }
        tz0Var.S2OOm9zPNm0h = this.lS5Rgt96tfkO;
        tz0Var.ZbWwgt3aGe7A = this.TSizfFm2Yiuu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sz0) {
            sz0 sz0Var = (sz0) obj;
            return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, sz0Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == sz0Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == sz0Var.TSizfFm2Yiuu;
        }
        return false;
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.PxuCJdSBwIXG + ", legacyTextFieldState=" + this.lS5Rgt96tfkO + ", textFieldSelectionManager=" + this.TSizfFm2Yiuu + ')';
    }
}
