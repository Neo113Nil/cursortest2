package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yt extends r61 {
    public final yk2 PxuCJdSBwIXG;
    public final ln0 RAsUl2FVSrh6;
    public final yz0 TSizfFm2Yiuu;
    public final boolean Y1f8riQaR6yg;
    public final eh2 a92UlCVFR9N8;
    public final df1 e9gEMXR7LXtO;
    public final oh2 lS5Rgt96tfkO;
    public final va0 rtx2ld2ELZv4;

    public yt(yk2 yk2Var, oh2 oh2Var, yz0 yz0Var, boolean z, df1 df1Var, eh2 eh2Var, ln0 ln0Var, va0 va0Var) {
        this.PxuCJdSBwIXG = yk2Var;
        this.lS5Rgt96tfkO = oh2Var;
        this.TSizfFm2Yiuu = yz0Var;
        this.Y1f8riQaR6yg = z;
        this.e9gEMXR7LXtO = df1Var;
        this.a92UlCVFR9N8 = eh2Var;
        this.RAsUl2FVSrh6 = ln0Var;
        this.rtx2ld2ELZv4 = va0Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        bu buVar = new bu();
        buVar.ZbWwgt3aGe7A = this.PxuCJdSBwIXG;
        buVar.pnx5pC0XzaCw = this.lS5Rgt96tfkO;
        buVar.IAToe7bXGz4N = this.TSizfFm2Yiuu;
        buVar.e6tOsSdd2EFb = this.Y1f8riQaR6yg;
        buVar.jyegZNwi31qc = this.e9gEMXR7LXtO;
        eh2 eh2Var = this.a92UlCVFR9N8;
        buVar.aF05bpZJlKEP = eh2Var;
        buVar.kpCQ9veP6n3I = this.RAsUl2FVSrh6;
        buVar.rZjpSjn4zoMv = this.rtx2ld2ELZv4;
        eh2Var.a92UlCVFR9N8 = new zt(buVar, 4);
        return buVar;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        bu buVar = (bu) m61Var;
        boolean z = buVar.e6tOsSdd2EFb;
        ln0 ln0Var = buVar.kpCQ9veP6n3I;
        eh2 eh2Var = buVar.aF05bpZJlKEP;
        buVar.ZbWwgt3aGe7A = this.PxuCJdSBwIXG;
        oh2 oh2Var = this.lS5Rgt96tfkO;
        buVar.pnx5pC0XzaCw = oh2Var;
        buVar.IAToe7bXGz4N = this.TSizfFm2Yiuu;
        boolean z2 = this.Y1f8riQaR6yg;
        buVar.e6tOsSdd2EFb = z2;
        buVar.jyegZNwi31qc = this.e9gEMXR7LXtO;
        eh2 eh2Var2 = this.a92UlCVFR9N8;
        buVar.aF05bpZJlKEP = eh2Var2;
        ln0 ln0Var2 = this.RAsUl2FVSrh6;
        buVar.kpCQ9veP6n3I = ln0Var2;
        buVar.rZjpSjn4zoMv = this.rtx2ld2ELZv4;
        if (z2 != z || z2 != z || !cs0.wdg6QnbFHrFF(ln0Var2, ln0Var) || !vi2.TSizfFm2Yiuu(oh2Var.lS5Rgt96tfkO)) {
            th0.S2OOm9zPNm0h(buVar);
        }
        if (eh2Var2 != eh2Var) {
            eh2Var2.a92UlCVFR9N8 = new zt(buVar, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yt) {
            yt ytVar = (yt) obj;
            if (this.PxuCJdSBwIXG.equals(ytVar.PxuCJdSBwIXG) && this.lS5Rgt96tfkO.equals(ytVar.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == ytVar.TSizfFm2Yiuu && this.Y1f8riQaR6yg == ytVar.Y1f8riQaR6yg && this.e9gEMXR7LXtO.equals(ytVar.e9gEMXR7LXtO) && this.a92UlCVFR9N8 == ytVar.a92UlCVFR9N8 && cs0.wdg6QnbFHrFF(this.RAsUl2FVSrh6, ytVar.RAsUl2FVSrh6) && cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, ytVar.rtx2ld2ELZv4)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.rtx2ld2ELZv4.hashCode() + ((this.RAsUl2FVSrh6.hashCode() + ((this.a92UlCVFR9N8.hashCode() + ((this.e9gEMXR7LXtO.hashCode() + o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg((this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.Y1f8riQaR6yg), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.PxuCJdSBwIXG + ", value=" + this.lS5Rgt96tfkO + ", state=" + this.TSizfFm2Yiuu + ", readOnly=false, enabled=" + this.Y1f8riQaR6yg + ", isPassword=false, offsetMapping=" + this.e9gEMXR7LXtO + ", manager=" + this.a92UlCVFR9N8 + ", imeOptions=" + this.RAsUl2FVSrh6 + ", focusRequester=" + this.rtx2ld2ELZv4 + ')';
    }
}
