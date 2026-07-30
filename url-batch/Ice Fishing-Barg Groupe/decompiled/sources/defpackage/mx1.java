package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mx1 {
    public static final lx1 Companion = new lx1();
    public final float PxuCJdSBwIXG;
    public final long RAsUl2FVSrh6;
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final long a92UlCVFR9N8;
    public final long e9gEMXR7LXtO;
    public final float lS5Rgt96tfkO;
    public final long rtx2ld2ELZv4;

    static {
        du.Companion.getClass();
        ki0.a92UlCVFR9N8(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public mx1(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
        this.TSizfFm2Yiuu = f3;
        this.Y1f8riQaR6yg = f4;
        this.e9gEMXR7LXtO = j;
        this.a92UlCVFR9N8 = j2;
        this.RAsUl2FVSrh6 = j3;
        this.rtx2ld2ELZv4 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx1)) {
            return false;
        }
        mx1 mx1Var = (mx1) obj;
        return Float.compare(this.PxuCJdSBwIXG, mx1Var.PxuCJdSBwIXG) == 0 && Float.compare(this.lS5Rgt96tfkO, mx1Var.lS5Rgt96tfkO) == 0 && Float.compare(this.TSizfFm2Yiuu, mx1Var.TSizfFm2Yiuu) == 0 && Float.compare(this.Y1f8riQaR6yg, mx1Var.Y1f8riQaR6yg) == 0 && du.PxuCJdSBwIXG(this.e9gEMXR7LXtO, mx1Var.e9gEMXR7LXtO) && du.PxuCJdSBwIXG(this.a92UlCVFR9N8, mx1Var.a92UlCVFR9N8) && du.PxuCJdSBwIXG(this.RAsUl2FVSrh6, mx1Var.RAsUl2FVSrh6) && du.PxuCJdSBwIXG(this.rtx2ld2ELZv4, mx1Var.rtx2ld2ELZv4);
    }

    public final int hashCode() {
        return Long.hashCode(this.rtx2ld2ELZv4) + o0.TSizfFm2Yiuu(o0.TSizfFm2Yiuu(o0.TSizfFm2Yiuu(o0.PxuCJdSBwIXG(this.Y1f8riQaR6yg, o0.PxuCJdSBwIXG(this.TSizfFm2Yiuu, o0.PxuCJdSBwIXG(this.lS5Rgt96tfkO, Float.hashCode(this.PxuCJdSBwIXG) * 31, 31), 31), 31), 31, this.e9gEMXR7LXtO), 31, this.a92UlCVFR9N8), 31, this.RAsUl2FVSrh6);
    }

    public final String toString() {
        String str = ng0.EpkonXwzFgDB(this.PxuCJdSBwIXG) + ", " + ng0.EpkonXwzFgDB(this.lS5Rgt96tfkO) + ", " + ng0.EpkonXwzFgDB(this.TSizfFm2Yiuu) + ", " + ng0.EpkonXwzFgDB(this.Y1f8riQaR6yg);
        long j = this.e9gEMXR7LXtO;
        long j2 = this.a92UlCVFR9N8;
        boolean PxuCJdSBwIXG = du.PxuCJdSBwIXG(j, j2);
        long j3 = this.RAsUl2FVSrh6;
        long j4 = this.rtx2ld2ELZv4;
        if (!PxuCJdSBwIXG || !du.PxuCJdSBwIXG(j2, j3) || !du.PxuCJdSBwIXG(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) du.lS5Rgt96tfkO(j)) + ", topRight=" + ((Object) du.lS5Rgt96tfkO(j2)) + ", bottomRight=" + ((Object) du.lS5Rgt96tfkO(j3)) + ", bottomLeft=" + ((Object) du.lS5Rgt96tfkO(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + ng0.EpkonXwzFgDB(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + ng0.EpkonXwzFgDB(Float.intBitsToFloat(i)) + ", y=" + ng0.EpkonXwzFgDB(Float.intBitsToFloat(i2)) + ')';
    }
}
