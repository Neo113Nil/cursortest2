package O0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f3749a;

    public static long a(long j3, float f3, float f4, int i3) {
        if ((i3 & 1) != 0) {
            f3 = Float.intBitsToFloat((int) (j3 >> 32));
        }
        if ((i3 & 2) != 0) {
            f4 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static final long d(long j3, long j4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (j4 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long e(long j3, long j4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) + Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String f(long j3) {
        return "(" + b(j3) + ", " + c(j3) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f3749a == ((o) obj).f3749a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3749a);
    }

    public final String toString() {
        return f(this.f3749a);
    }
}
