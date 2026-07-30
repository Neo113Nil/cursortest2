package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nk1 extends xk1 {
    public final float OPXfSBeufaJ8;
    public final boolean RAsUl2FVSrh6;
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final boolean a92UlCVFR9N8;
    public final float e9gEMXR7LXtO;
    public final float rtx2ld2ELZv4;

    public nk1(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.TSizfFm2Yiuu = f;
        this.Y1f8riQaR6yg = f2;
        this.e9gEMXR7LXtO = f3;
        this.a92UlCVFR9N8 = z;
        this.RAsUl2FVSrh6 = z2;
        this.rtx2ld2ELZv4 = f4;
        this.OPXfSBeufaJ8 = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk1)) {
            return false;
        }
        nk1 nk1Var = (nk1) obj;
        return Float.compare(this.TSizfFm2Yiuu, nk1Var.TSizfFm2Yiuu) == 0 && Float.compare(this.Y1f8riQaR6yg, nk1Var.Y1f8riQaR6yg) == 0 && Float.compare(this.e9gEMXR7LXtO, nk1Var.e9gEMXR7LXtO) == 0 && this.a92UlCVFR9N8 == nk1Var.a92UlCVFR9N8 && this.RAsUl2FVSrh6 == nk1Var.RAsUl2FVSrh6 && Float.compare(this.rtx2ld2ELZv4, nk1Var.rtx2ld2ELZv4) == 0 && Float.compare(this.OPXfSBeufaJ8, nk1Var.OPXfSBeufaJ8) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.OPXfSBeufaJ8) + o0.PxuCJdSBwIXG(this.rtx2ld2ELZv4, o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg(o0.PxuCJdSBwIXG(this.e9gEMXR7LXtO, o0.PxuCJdSBwIXG(this.Y1f8riQaR6yg, Float.hashCode(this.TSizfFm2Yiuu) * 31, 31), 31), 31, this.a92UlCVFR9N8), 31, this.RAsUl2FVSrh6), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.Y1f8riQaR6yg);
        sb.append(", theta=");
        sb.append(this.e9gEMXR7LXtO);
        sb.append(", isMoreThanHalf=");
        sb.append(this.a92UlCVFR9N8);
        sb.append(", isPositiveArc=");
        sb.append(this.RAsUl2FVSrh6);
        sb.append(", arcStartDx=");
        sb.append(this.rtx2ld2ELZv4);
        sb.append(", arcStartDy=");
        return o0.cpQdD2nAriOS(sb, this.OPXfSBeufaJ8, ')');
    }
}
