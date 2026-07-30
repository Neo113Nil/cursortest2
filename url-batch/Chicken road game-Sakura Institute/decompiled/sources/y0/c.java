package y0;

import u3.q;
import u3.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f9778a;

    public static long a(long j8, float f9, int i7) {
        float intBitsToFloat = (i7 & 1) != 0 ? Float.intBitsToFloat((int) (j8 >> 32)) : 0.0f;
        if ((i7 & 2) != 0) {
            f9 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L);
    }

    public static final boolean b(long j8, long j9) {
        return j8 == j9;
    }

    public static final float c(long j8) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final float d(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float e(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static final boolean f(long j8) {
        long j9 = j8 & 9223372034707292159L;
        return (((~j9) & (j9 - 9187343246269874177L)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    public static final long g(long j8, long j9) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) - Float.intBitsToFloat((int) (j9 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) - Float.intBitsToFloat((int) (j9 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long h(long j8, long j9) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) + Float.intBitsToFloat((int) (j8 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) + Float.intBitsToFloat((int) (j8 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long i(long j8, float f9) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) * f9;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) * f9;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String j(long j8) {
        if (!r.h(j8)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + q.k(d(j8)) + ", " + q.k(e(j8)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f9778a == ((c) obj).f9778a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9778a);
    }

    public final String toString() {
        return j(this.f9778a);
    }
}
