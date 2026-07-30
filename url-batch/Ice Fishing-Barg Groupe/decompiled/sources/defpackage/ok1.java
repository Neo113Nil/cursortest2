package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ok1 extends xk1 {
    public final float RAsUl2FVSrh6;
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final float a92UlCVFR9N8;
    public final float e9gEMXR7LXtO;
    public final float rtx2ld2ELZv4;

    public ok1(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.TSizfFm2Yiuu = f;
        this.Y1f8riQaR6yg = f2;
        this.e9gEMXR7LXtO = f3;
        this.a92UlCVFR9N8 = f4;
        this.RAsUl2FVSrh6 = f5;
        this.rtx2ld2ELZv4 = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok1)) {
            return false;
        }
        ok1 ok1Var = (ok1) obj;
        return Float.compare(this.TSizfFm2Yiuu, ok1Var.TSizfFm2Yiuu) == 0 && Float.compare(this.Y1f8riQaR6yg, ok1Var.Y1f8riQaR6yg) == 0 && Float.compare(this.e9gEMXR7LXtO, ok1Var.e9gEMXR7LXtO) == 0 && Float.compare(this.a92UlCVFR9N8, ok1Var.a92UlCVFR9N8) == 0 && Float.compare(this.RAsUl2FVSrh6, ok1Var.RAsUl2FVSrh6) == 0 && Float.compare(this.rtx2ld2ELZv4, ok1Var.rtx2ld2ELZv4) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.rtx2ld2ELZv4) + o0.PxuCJdSBwIXG(this.RAsUl2FVSrh6, o0.PxuCJdSBwIXG(this.a92UlCVFR9N8, o0.PxuCJdSBwIXG(this.e9gEMXR7LXtO, o0.PxuCJdSBwIXG(this.Y1f8riQaR6yg, Float.hashCode(this.TSizfFm2Yiuu) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", dy1=");
        sb.append(this.Y1f8riQaR6yg);
        sb.append(", dx2=");
        sb.append(this.e9gEMXR7LXtO);
        sb.append(", dy2=");
        sb.append(this.a92UlCVFR9N8);
        sb.append(", dx3=");
        sb.append(this.RAsUl2FVSrh6);
        sb.append(", dy3=");
        return o0.cpQdD2nAriOS(sb, this.rtx2ld2ELZv4, ')');
    }
}
