package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uk1 extends xk1 {
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;

    public uk1(float f, float f2) {
        super(1);
        this.TSizfFm2Yiuu = f;
        this.Y1f8riQaR6yg = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk1)) {
            return false;
        }
        uk1 uk1Var = (uk1) obj;
        return Float.compare(this.TSizfFm2Yiuu, uk1Var.TSizfFm2Yiuu) == 0 && Float.compare(this.Y1f8riQaR6yg, uk1Var.Y1f8riQaR6yg) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.Y1f8riQaR6yg) + (Float.hashCode(this.TSizfFm2Yiuu) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", dy=");
        return o0.cpQdD2nAriOS(sb, this.Y1f8riQaR6yg, ')');
    }
}
