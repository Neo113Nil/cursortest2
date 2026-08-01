package j1;

import c6.f;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f4914a;

    public static final boolean a(long j, long j3) {
        return j == j3;
    }

    public static final float b(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final long c(long j, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long d(long j, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String e(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + f.e0(Float.intBitsToFloat((int) (j >> 32))) + ", " + f.e0(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f4914a == ((b) obj).f4914a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4914a);
    }

    public final String toString() {
        return e(this.f4914a);
    }
}
