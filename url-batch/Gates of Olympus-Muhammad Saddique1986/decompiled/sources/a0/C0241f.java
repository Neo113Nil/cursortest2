package a0;

import h2.AbstractC0508a;

/* renamed from: a0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241f {

    /* renamed from: a, reason: collision with root package name */
    public final long f4736a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final float b(long j3) {
        if (j3 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j3 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float c(long j3) {
        if (j3 != 9205357640488583168L) {
            return Math.min(Float.intBitsToFloat((int) ((j3 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j3 & 2147483647L)));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float d(long j3) {
        if (j3 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j3 >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final boolean e(long j3) {
        if (j3 == 9205357640488583168L) {
            throw new IllegalStateException("Size is unspecified");
        }
        long j4 = j3 & (~((((-9223372034707292160L) & j3) >>> 31) * (-1)));
        return ((j4 & 4294967295L) & (j4 >>> 32)) == 0;
    }

    public static String f(long j3) {
        if (j3 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC0508a.Y(d(j3)) + ", " + AbstractC0508a.Y(b(j3)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0241f) {
            return this.f4736a == ((C0241f) obj).f4736a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4736a);
    }

    public final String toString() {
        return f(this.f4736a);
    }
}
