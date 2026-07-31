package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f6537a;

    public static long a(long j7, float f6, float f8, int i) {
        if ((i & 1) != 0) {
            f6 = Float.intBitsToFloat((int) (j7 >> 32));
        }
        if ((i & 2) != 0) {
            f8 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L);
    }

    public static final float b(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    public static final float c(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    public static final long d(long j7, long j8) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (j8 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) - Float.intBitsToFloat((int) (j8 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long e(long j7, long j8) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) + Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String f(long j7) {
        return "(" + b(j7) + ", " + c(j7) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f6537a == ((q) obj).f6537a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6537a);
    }

    public final String toString() {
        return f(this.f6537a);
    }
}
