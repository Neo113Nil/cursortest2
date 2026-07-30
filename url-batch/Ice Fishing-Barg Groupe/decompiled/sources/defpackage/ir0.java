package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ir0 {
    public static final hr0 Companion = new hr0();
    public final long PxuCJdSBwIXG;

    public static final boolean PxuCJdSBwIXG(long j, long j2) {
        return j == j2;
    }

    public static String lS5Rgt96tfkO(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ir0) {
            return this.PxuCJdSBwIXG == ((ir0) obj).PxuCJdSBwIXG;
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
