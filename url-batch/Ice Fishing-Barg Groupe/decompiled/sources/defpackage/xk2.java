package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xk2 {
    public static final wk2 Companion = new wk2();
    public static final long lS5Rgt96tfkO = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);
    public final long PxuCJdSBwIXG;

    public static final boolean PxuCJdSBwIXG(long j, long j2) {
        return j == j2;
    }

    public static String lS5Rgt96tfkO(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xk2) {
            return this.PxuCJdSBwIXG == ((xk2) obj).PxuCJdSBwIXG;
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
