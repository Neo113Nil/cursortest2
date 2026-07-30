package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ra2 extends l30 {
    public static final qa2 Companion = new qa2();
    public final float PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final float lS5Rgt96tfkO;

    static {
        ta2.Companion.getClass();
        va2.Companion.getClass();
    }

    public ra2(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
        this.TSizfFm2Yiuu = i;
        this.Y1f8riQaR6yg = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra2)) {
            return false;
        }
        ra2 ra2Var = (ra2) obj;
        return this.PxuCJdSBwIXG == ra2Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == ra2Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == ra2Var.TSizfFm2Yiuu && this.Y1f8riQaR6yg == ra2Var.Y1f8riQaR6yg;
    }

    public final int hashCode() {
        return o0.lS5Rgt96tfkO(this.Y1f8riQaR6yg, o0.lS5Rgt96tfkO(this.TSizfFm2Yiuu, o0.PxuCJdSBwIXG(this.lS5Rgt96tfkO, Float.hashCode(this.PxuCJdSBwIXG) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", miter=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.TSizfFm2Yiuu;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.Y1f8riQaR6yg;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
