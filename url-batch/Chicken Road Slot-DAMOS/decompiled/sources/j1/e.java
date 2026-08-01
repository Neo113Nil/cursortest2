package j1;

import c6.f;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f4927a;

    public static final boolean a(long j, long j3) {
        return j == j3;
    }

    public static final float b(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final boolean c(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static String d(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + f.e0(Float.intBitsToFloat((int) (j >> 32))) + ", " + f.e0(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f4927a == ((e) obj).f4927a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4927a);
    }

    public final String toString() {
        return d(this.f4927a);
    }
}
