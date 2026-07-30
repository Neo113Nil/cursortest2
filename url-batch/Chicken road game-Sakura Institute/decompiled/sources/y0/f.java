package y0;

import u3.q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f9792a;

    public static final boolean a(long j8, long j9) {
        return j8 == j9;
    }

    public static final float b(long j8) {
        if (j8 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float c(long j8) {
        if (j8 != 9205357640488583168L) {
            return Math.min(Float.intBitsToFloat((int) ((j8 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j8 & 2147483647L)));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float d(long j8) {
        if (j8 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j8 >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final boolean e(long j8) {
        if (j8 == 9205357640488583168L) {
            throw new IllegalStateException("Size is unspecified");
        }
        long j9 = j8 & (~((((-9223372034707292160L) & j8) >>> 31) * (-1)));
        return ((j9 & 4294967295L) & (j9 >>> 32)) == 0;
    }

    public static String f(long j8) {
        if (j8 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + q.k(d(j8)) + ", " + q.k(b(j8)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f9792a == ((f) obj).f9792a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9792a);
    }

    public final String toString() {
        return f(this.f9792a);
    }
}
