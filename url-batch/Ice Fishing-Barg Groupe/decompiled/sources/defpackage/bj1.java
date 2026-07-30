package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bj1 implements p8 {
    public final qi2 OPXfSBeufaJ8;
    public final int PxuCJdSBwIXG;
    public final int RAsUl2FVSrh6;
    public final long TSizfFm2Yiuu;
    public final zh2 Y1f8riQaR6yg;
    public final p11 a92UlCVFR9N8;
    public final xm1 e9gEMXR7LXtO;
    public final int lS5Rgt96tfkO;
    public final int rtx2ld2ELZv4;

    public bj1(int i, int i2, long j, zh2 zh2Var, xm1 xm1Var, p11 p11Var, int i3, int i4, qi2 qi2Var) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
        this.TSizfFm2Yiuu = j;
        this.Y1f8riQaR6yg = zh2Var;
        this.e9gEMXR7LXtO = xm1Var;
        this.a92UlCVFR9N8 = p11Var;
        this.RAsUl2FVSrh6 = i3;
        this.rtx2ld2ELZv4 = i4;
        this.OPXfSBeufaJ8 = qi2Var;
        hj2.Companion.getClass();
        if (hj2.PxuCJdSBwIXG(j, hj2.TSizfFm2Yiuu) || hj2.TSizfFm2Yiuu(j) >= 0.0f) {
            return;
        }
        fp0.lS5Rgt96tfkO("lineHeight can't be negative (" + hj2.TSizfFm2Yiuu(j) + ')');
    }

    public final bj1 PxuCJdSBwIXG(bj1 bj1Var) {
        return bj1Var == null ? this : cj1.PxuCJdSBwIXG(this, bj1Var.PxuCJdSBwIXG, bj1Var.lS5Rgt96tfkO, bj1Var.TSizfFm2Yiuu, bj1Var.Y1f8riQaR6yg, bj1Var.e9gEMXR7LXtO, bj1Var.a92UlCVFR9N8, bj1Var.RAsUl2FVSrh6, bj1Var.rtx2ld2ELZv4, bj1Var.OPXfSBeufaJ8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj1)) {
            return false;
        }
        bj1 bj1Var = (bj1) obj;
        if (this.PxuCJdSBwIXG != bj1Var.PxuCJdSBwIXG || this.lS5Rgt96tfkO != bj1Var.lS5Rgt96tfkO || !hj2.PxuCJdSBwIXG(this.TSizfFm2Yiuu, bj1Var.TSizfFm2Yiuu) || !cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, bj1Var.Y1f8riQaR6yg) || !cs0.wdg6QnbFHrFF(this.e9gEMXR7LXtO, bj1Var.e9gEMXR7LXtO) || !cs0.wdg6QnbFHrFF(this.a92UlCVFR9N8, bj1Var.a92UlCVFR9N8)) {
            return false;
        }
        int i = bj1Var.RAsUl2FVSrh6;
        z01 z01Var = g11.Companion;
        return this.RAsUl2FVSrh6 == i && this.rtx2ld2ELZv4 == bj1Var.rtx2ld2ELZv4 && cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, bj1Var.OPXfSBeufaJ8);
    }

    public final int hashCode() {
        int lS5Rgt96tfkO = o0.lS5Rgt96tfkO(this.lS5Rgt96tfkO, Integer.hashCode(this.PxuCJdSBwIXG) * 31, 31);
        gj2 gj2Var = hj2.Companion;
        int TSizfFm2Yiuu = o0.TSizfFm2Yiuu(lS5Rgt96tfkO, 31, this.TSizfFm2Yiuu);
        zh2 zh2Var = this.Y1f8riQaR6yg;
        int hashCode = (TSizfFm2Yiuu + (zh2Var != null ? zh2Var.hashCode() : 0)) * 31;
        xm1 xm1Var = this.e9gEMXR7LXtO;
        int hashCode2 = (hashCode + (xm1Var != null ? xm1Var.hashCode() : 0)) * 31;
        p11 p11Var = this.a92UlCVFR9N8;
        int hashCode3 = (hashCode2 + (p11Var != null ? p11Var.hashCode() : 0)) * 31;
        z01 z01Var = g11.Companion;
        int lS5Rgt96tfkO2 = o0.lS5Rgt96tfkO(this.rtx2ld2ELZv4, o0.lS5Rgt96tfkO(this.RAsUl2FVSrh6, hashCode3, 31), 31);
        qi2 qi2Var = this.OPXfSBeufaJ8;
        return lS5Rgt96tfkO2 + (qi2Var != null ? qi2Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) he2.PxuCJdSBwIXG(this.PxuCJdSBwIXG)) + ", textDirection=" + ((Object) nf2.PxuCJdSBwIXG(this.lS5Rgt96tfkO)) + ", lineHeight=" + ((Object) hj2.Y1f8riQaR6yg(this.TSizfFm2Yiuu)) + ", textIndent=" + this.Y1f8riQaR6yg + ", platformStyle=" + this.e9gEMXR7LXtO + ", lineHeightStyle=" + this.a92UlCVFR9N8 + ", lineBreak=" + ((Object) g11.PxuCJdSBwIXG(this.RAsUl2FVSrh6)) + ", hyphens=" + ((Object) om0.PxuCJdSBwIXG(this.rtx2ld2ELZv4)) + ", textMotion=" + this.OPXfSBeufaJ8 + ')';
    }
}
