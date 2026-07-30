package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hj2 {
    public static final gj2 Companion = new gj2();
    public static final long TSizfFm2Yiuu;
    public static final jj2[] lS5Rgt96tfkO;
    public final long PxuCJdSBwIXG;

    static {
        ij2 ij2Var = jj2.Companion;
        ij2Var.getClass();
        jj2 jj2Var = new jj2(0L);
        ij2Var.getClass();
        jj2 jj2Var2 = new jj2(4294967296L);
        ij2Var.getClass();
        lS5Rgt96tfkO = new jj2[]{jj2Var, jj2Var2, new jj2(8589934592L)};
        TSizfFm2Yiuu = ki0.wLFCmsViZrNT(0L, Float.NaN);
    }

    public /* synthetic */ hj2(long j) {
        this.PxuCJdSBwIXG = j;
    }

    public static final boolean PxuCJdSBwIXG(long j, long j2) {
        return j == j2;
    }

    public static final float TSizfFm2Yiuu(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String Y1f8riQaR6yg(long j) {
        long lS5Rgt96tfkO2 = lS5Rgt96tfkO(j);
        ij2 ij2Var = jj2.Companion;
        ij2Var.getClass();
        if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO2, 0L)) {
            return "Unspecified";
        }
        ij2Var.getClass();
        if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO2, 4294967296L)) {
            return TSizfFm2Yiuu(j) + ".sp";
        }
        ij2Var.getClass();
        if (!jj2.PxuCJdSBwIXG(lS5Rgt96tfkO2, 8589934592L)) {
            return "Invalid";
        }
        return TSizfFm2Yiuu(j) + ".em";
    }

    public static final long lS5Rgt96tfkO(long j) {
        return lS5Rgt96tfkO[(int) ((j & 1095216660480L) >>> 32)].PxuCJdSBwIXG;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hj2) {
            return this.PxuCJdSBwIXG == ((hj2) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return Y1f8riQaR6yg(this.PxuCJdSBwIXG);
    }
}
