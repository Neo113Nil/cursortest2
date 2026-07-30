package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p10 {
    public static final o10 Companion = new o10();
    public final long PxuCJdSBwIXG;

    public static final float PxuCJdSBwIXG(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float lS5Rgt96tfkO(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p10) {
            return this.PxuCJdSBwIXG == ((p10) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        long j = this.PxuCJdSBwIXG;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) k10.TSizfFm2Yiuu(lS5Rgt96tfkO(j))) + " x " + ((Object) k10.TSizfFm2Yiuu(PxuCJdSBwIXG(j)));
    }
}
