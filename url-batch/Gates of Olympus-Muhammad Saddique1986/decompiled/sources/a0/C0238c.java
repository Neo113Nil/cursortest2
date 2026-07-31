package a0;

import h2.AbstractC0508a;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238c {

    /* renamed from: a, reason: collision with root package name */
    public final long f4722a;

    public static long a(long j3, float f3, int i3) {
        float intBitsToFloat = (i3 & 1) != 0 ? Float.intBitsToFloat((int) (j3 >> 32)) : 0.0f;
        if ((i3 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
    }

    public static final boolean b(long j3, long j4) {
        return j3 == j4;
    }

    public static final float c(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final float d(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final float e(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static final boolean f(long j3) {
        long j4 = j3 & 9223372034707292159L;
        return (((~j4) & (j4 - 9187343246269874177L)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    public static final long g(long j3, long j4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (j4 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long h(long j3, long j4) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) + Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long i(long j3, float f3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * f3;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f3;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String j(long j3) {
        if (!l0.c.D(j3)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AbstractC0508a.Y(d(j3)) + ", " + AbstractC0508a.Y(e(j3)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0238c) {
            return this.f4722a == ((C0238c) obj).f4722a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4722a);
    }

    public final String toString() {
        return j(this.f4722a);
    }
}
