package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tk1 extends xk1 {
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final float a92UlCVFR9N8;
    public final float e9gEMXR7LXtO;

    public tk1(float f, float f2, float f3, float f4) {
        super(2);
        this.TSizfFm2Yiuu = f;
        this.Y1f8riQaR6yg = f2;
        this.e9gEMXR7LXtO = f3;
        this.a92UlCVFR9N8 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk1)) {
            return false;
        }
        tk1 tk1Var = (tk1) obj;
        return Float.compare(this.TSizfFm2Yiuu, tk1Var.TSizfFm2Yiuu) == 0 && Float.compare(this.Y1f8riQaR6yg, tk1Var.Y1f8riQaR6yg) == 0 && Float.compare(this.e9gEMXR7LXtO, tk1Var.e9gEMXR7LXtO) == 0 && Float.compare(this.a92UlCVFR9N8, tk1Var.a92UlCVFR9N8) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a92UlCVFR9N8) + o0.PxuCJdSBwIXG(this.e9gEMXR7LXtO, o0.PxuCJdSBwIXG(this.Y1f8riQaR6yg, Float.hashCode(this.TSizfFm2Yiuu) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", dy1=");
        sb.append(this.Y1f8riQaR6yg);
        sb.append(", dx2=");
        sb.append(this.e9gEMXR7LXtO);
        sb.append(", dy2=");
        return o0.cpQdD2nAriOS(sb, this.a92UlCVFR9N8, ')');
    }
}
