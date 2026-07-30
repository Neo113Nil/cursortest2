package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class tl {
    public static final sl Companion = new sl();
    public final String PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final long lS5Rgt96tfkO;

    public tl(int i, long j, String str) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = j;
        this.TSizfFm2Yiuu = i;
        if (str.length() == 0) {
            u9.XL4ISE6Oc65B("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            u9.XL4ISE6Oc65B("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float PxuCJdSBwIXG(int i);

    public boolean TSizfFm2Yiuu() {
        return false;
    }

    public abstract long Y1f8riQaR6yg(float f, float f2, float f3);

    public abstract long a92UlCVFR9N8(float f, float f2, float f3, float f4, tl tlVar);

    public abstract float e9gEMXR7LXtO(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tl tlVar = (tl) obj;
        if (this.TSizfFm2Yiuu == tlVar.TSizfFm2Yiuu && this.PxuCJdSBwIXG.equals(tlVar.PxuCJdSBwIXG)) {
            return ml.PxuCJdSBwIXG(this.lS5Rgt96tfkO, tlVar.lS5Rgt96tfkO);
        }
        return false;
    }

    public int hashCode() {
        return o0.TSizfFm2Yiuu(this.PxuCJdSBwIXG.hashCode() * 31, 31, this.lS5Rgt96tfkO) + this.TSizfFm2Yiuu;
    }

    public abstract float lS5Rgt96tfkO(int i);

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.PxuCJdSBwIXG);
        sb.append(" (id=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", model=");
        long j = this.lS5Rgt96tfkO;
        sb.append((Object) (ml.PxuCJdSBwIXG(j, 12884901888L) ? "Rgb" : ml.PxuCJdSBwIXG(j, 12884901889L) ? "Xyz" : ml.PxuCJdSBwIXG(j, 12884901890L) ? "Lab" : ml.PxuCJdSBwIXG(j, 17179869187L) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
