package M0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f3563a;

    public static long a(long j4, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f4 = Float.intBitsToFloat((int) (j4 >> 32));
        }
        if ((i2 & 2) != 0) {
            f5 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
    }

    public static final float b(long j4) {
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static final float c(long j4) {
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static final long d(long j4, long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) - Float.intBitsToFloat((int) (j5 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long e(long j4, long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) + Float.intBitsToFloat((int) (j4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) + Float.intBitsToFloat((int) (j4 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String f(long j4) {
        return "(" + b(j4) + ", " + c(j4) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f3563a == ((o) obj).f3563a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3563a);
    }

    public final String toString() {
        return f(this.f3563a);
    }
}
