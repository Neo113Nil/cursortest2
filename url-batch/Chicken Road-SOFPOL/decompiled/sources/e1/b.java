package e1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f2455a;

    public static long a(int i, long j7) {
        return (Float.floatToRawIntBits((i & 1) != 0 ? Float.intBitsToFloat((int) (j7 >> 32)) : 0.0f) << 32) | (Float.floatToRawIntBits((i & 2) != 0 ? Float.intBitsToFloat((int) (j7 & 4294967295L)) : 0.0f) & 4294967295L);
    }

    public static final boolean b(long j7, long j8) {
        return j7 == j8;
    }

    public static final float c(long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
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

    public static final long f(long j7, float f6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) * f6;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) * f6;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String g(long j7) {
        if ((9223372034707292159L & j7) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + s6.a.L(Float.intBitsToFloat((int) (j7 >> 32))) + ", " + s6.a.L(Float.intBitsToFloat((int) (j7 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f2455a == ((b) obj).f2455a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2455a);
    }

    public final String toString() {
        return g(this.f2455a);
    }
}
