package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jj2 {
    public static final ij2 Companion = new ij2();
    public final long PxuCJdSBwIXG;

    public static final boolean PxuCJdSBwIXG(long j, long j2) {
        return j == j2;
    }

    public static String lS5Rgt96tfkO(long j) {
        return PxuCJdSBwIXG(j, 0L) ? "Unspecified" : PxuCJdSBwIXG(j, 4294967296L) ? "Sp" : PxuCJdSBwIXG(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jj2) {
            return this.PxuCJdSBwIXG == ((jj2) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return lS5Rgt96tfkO(this.PxuCJdSBwIXG);
    }
}
