package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lk1 extends xk1 {
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final float a92UlCVFR9N8;
    public final float e9gEMXR7LXtO;

    public lk1(float f, float f2, float f3, float f4) {
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
        if (!(obj instanceof lk1)) {
            return false;
        }
        lk1 lk1Var = (lk1) obj;
        return Float.compare(this.TSizfFm2Yiuu, lk1Var.TSizfFm2Yiuu) == 0 && Float.compare(this.Y1f8riQaR6yg, lk1Var.Y1f8riQaR6yg) == 0 && Float.compare(this.e9gEMXR7LXtO, lk1Var.e9gEMXR7LXtO) == 0 && Float.compare(this.a92UlCVFR9N8, lk1Var.a92UlCVFR9N8) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a92UlCVFR9N8) + o0.PxuCJdSBwIXG(this.e9gEMXR7LXtO, o0.PxuCJdSBwIXG(this.Y1f8riQaR6yg, Float.hashCode(this.TSizfFm2Yiuu) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", y1=");
        sb.append(this.Y1f8riQaR6yg);
        sb.append(", x2=");
        sb.append(this.e9gEMXR7LXtO);
        sb.append(", y2=");
        return o0.cpQdD2nAriOS(sb, this.a92UlCVFR9N8, ')');
    }
}
