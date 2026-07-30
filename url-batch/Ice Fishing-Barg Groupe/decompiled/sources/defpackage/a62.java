package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class a62 {
    public static final z52 Companion = new z52();
    public final long PxuCJdSBwIXG;

    public /* synthetic */ a62(long j) {
        this.PxuCJdSBwIXG = j;
    }

    public static final boolean PxuCJdSBwIXG(long j, long j2) {
        return j == j2;
    }

    public static final boolean TSizfFm2Yiuu(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static String Y1f8riQaR6yg(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + ng0.EpkonXwzFgDB(Float.intBitsToFloat((int) (j >> 32))) + ", " + ng0.EpkonXwzFgDB(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final float lS5Rgt96tfkO(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a62) {
            return this.PxuCJdSBwIXG == ((a62) obj).PxuCJdSBwIXG;
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
