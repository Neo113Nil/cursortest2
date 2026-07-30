package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y20 extends r61 {
    public static final x20 Companion = new x20();
    public static final wnqUPcAvl7HT OPXfSBeufaJ8 = new wnqUPcAvl7HT(13);
    public final y62 PxuCJdSBwIXG;
    public final qe0 RAsUl2FVSrh6;
    public final boolean TSizfFm2Yiuu;
    public final e81 Y1f8riQaR6yg;
    public final qe0 a92UlCVFR9N8;
    public final boolean e9gEMXR7LXtO;
    public final th1 lS5Rgt96tfkO;
    public final boolean rtx2ld2ELZv4;

    public y20(y62 y62Var, th1 th1Var, boolean z, e81 e81Var, boolean z2, qe0 qe0Var, qe0 qe0Var2, boolean z3) {
        this.PxuCJdSBwIXG = y62Var;
        this.lS5Rgt96tfkO = th1Var;
        this.TSizfFm2Yiuu = z;
        this.Y1f8riQaR6yg = e81Var;
        this.e9gEMXR7LXtO = z2;
        this.a92UlCVFR9N8 = qe0Var;
        this.RAsUl2FVSrh6 = qe0Var2;
        this.rtx2ld2ELZv4 = z3;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        wnqUPcAvl7HT wnqupcavl7ht = OPXfSBeufaJ8;
        boolean z = this.TSizfFm2Yiuu;
        e81 e81Var = this.Y1f8riQaR6yg;
        th1 th1Var = this.lS5Rgt96tfkO;
        c30 c30Var = new c30(wnqupcavl7ht, z, e81Var, th1Var);
        c30Var.POWyO8hTM6YC = this.PxuCJdSBwIXG;
        c30Var.i68hK7ahKtgp = th1Var;
        c30Var.zf8DYfih6EZu = this.e9gEMXR7LXtO;
        c30Var.wLFCmsViZrNT = this.a92UlCVFR9N8;
        c30Var.xbgXKYA2cIfu = this.RAsUl2FVSrh6;
        c30Var.nxJAScVArhE9 = this.rtx2ld2ELZv4;
        return c30Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        boolean z;
        boolean z2;
        c30 c30Var = (c30) m61Var;
        y62 y62Var = c30Var.POWyO8hTM6YC;
        y62 y62Var2 = this.PxuCJdSBwIXG;
        if (cs0.wdg6QnbFHrFF(y62Var, y62Var2)) {
            z = false;
        } else {
            c30Var.POWyO8hTM6YC = y62Var2;
            z = true;
        }
        th1 th1Var = c30Var.i68hK7ahKtgp;
        th1 th1Var2 = this.lS5Rgt96tfkO;
        if (th1Var != th1Var2) {
            c30Var.i68hK7ahKtgp = th1Var2;
            z = true;
        }
        boolean z3 = c30Var.nxJAScVArhE9;
        boolean z4 = this.rtx2ld2ELZv4;
        if (z3 != z4) {
            c30Var.nxJAScVArhE9 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        c30Var.wLFCmsViZrNT = this.a92UlCVFR9N8;
        c30Var.xbgXKYA2cIfu = this.RAsUl2FVSrh6;
        c30Var.zf8DYfih6EZu = this.e9gEMXR7LXtO;
        c30Var.e(OPXfSBeufaJ8, this.TSizfFm2Yiuu, this.Y1f8riQaR6yg, th1Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y20.class == obj.getClass()) {
            y20 y20Var = (y20) obj;
            if (this.PxuCJdSBwIXG == y20Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == y20Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == y20Var.TSizfFm2Yiuu && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, y20Var.Y1f8riQaR6yg) && this.e9gEMXR7LXtO == y20Var.e9gEMXR7LXtO && cs0.wdg6QnbFHrFF(this.a92UlCVFR9N8, y20Var.a92UlCVFR9N8) && cs0.wdg6QnbFHrFF(this.RAsUl2FVSrh6, y20Var.RAsUl2FVSrh6) && this.rtx2ld2ELZv4 == y20Var.rtx2ld2ELZv4) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int Y1f8riQaR6yg = o0.Y1f8riQaR6yg((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31, 31, this.TSizfFm2Yiuu);
        e81 e81Var = this.Y1f8riQaR6yg;
        return Boolean.hashCode(this.rtx2ld2ELZv4) + ((this.RAsUl2FVSrh6.hashCode() + ((this.a92UlCVFR9N8.hashCode() + o0.Y1f8riQaR6yg((Y1f8riQaR6yg + (e81Var != null ? e81Var.hashCode() : 0)) * 31, 31, this.e9gEMXR7LXtO)) * 31)) * 31);
    }
}
