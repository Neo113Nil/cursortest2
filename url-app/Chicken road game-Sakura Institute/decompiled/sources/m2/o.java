package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f6330a;

    public static long a(long j8, float f9, float f10, int i7) {
        if ((i7 & 1) != 0) {
            f9 = Float.intBitsToFloat((int) (j8 >> 32));
        }
        if ((i7 & 2) != 0) {
            f10 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }

    public static final float b(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float c(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static final long d(long j8, long j9) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) - Float.intBitsToFloat((int) (j9 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) - Float.intBitsToFloat((int) (j9 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long e(long j8, long j9) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) + Float.intBitsToFloat((int) (j8 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) + Float.intBitsToFloat((int) (j8 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String f(long j8) {
        return "(" + b(j8) + ", " + c(j8) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f6330a == ((o) obj).f6330a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6330a);
    }

    public final String toString() {
        return f(this.f6330a);
    }
}
