package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jk1 extends xk1 {
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;

    public jk1(float f, float f2) {
        super(3);
        this.TSizfFm2Yiuu = f;
        this.Y1f8riQaR6yg = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk1)) {
            return false;
        }
        jk1 jk1Var = (jk1) obj;
        return Float.compare(this.TSizfFm2Yiuu, jk1Var.TSizfFm2Yiuu) == 0 && Float.compare(this.Y1f8riQaR6yg, jk1Var.Y1f8riQaR6yg) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.Y1f8riQaR6yg) + (Float.hashCode(this.TSizfFm2Yiuu) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", y=");
        return o0.cpQdD2nAriOS(sb, this.Y1f8riQaR6yg, ')');
    }
}
