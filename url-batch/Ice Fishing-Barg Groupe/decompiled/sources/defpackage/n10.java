package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class n10 {
    public static final m10 Companion = new m10();
    public final long PxuCJdSBwIXG;

    public final boolean equals(Object obj) {
        if (obj instanceof n10) {
            return this.PxuCJdSBwIXG == ((n10) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        long j = this.PxuCJdSBwIXG;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) k10.TSizfFm2Yiuu(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) k10.TSizfFm2Yiuu(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
