package Y;

import a.AbstractC0345a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f4372a;

    public static long a(long j4, float f4, int i2) {
        float intBitsToFloat = (i2 & 1) != 0 ? Float.intBitsToFloat((int) (j4 >> 32)) : 0.0f;
        if ((i2 & 2) != 0) {
            f4 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
    }

    public static final boolean b(long j4, long j5) {
        return j4 == j5;
    }

    public static final float c(long j4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final float d(long j4) {
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static final float e(long j4) {
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static final boolean f(long j4) {
        long j5 = j4 & 9223372034707292159L;
        return (((~j5) & (j5 - 9187343246269874177L)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    public static final long g(long j4, long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) - Float.intBitsToFloat((int) (j5 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long h(long j4, long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) + Float.intBitsToFloat((int) (j4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) + Float.intBitsToFloat((int) (j4 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long i(float f4, long j4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) * f4;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) * f4;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String j(long j4) {
        if (!AbstractC0345a.z(j4)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + M1.a.W(d(j4)) + ", " + M1.a.W(e(j4)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f4372a == ((c) obj).f4372a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4372a);
    }

    public final String toString() {
        return j(this.f4372a);
    }
}
