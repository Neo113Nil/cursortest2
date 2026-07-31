package e1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f2469a;

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static final float b(long j7) {
        return Math.min(Float.intBitsToFloat((int) ((j7 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j7 & 2147483647L)));
    }

    public static final boolean c(long j7) {
        return (j7 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j7 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j7 & 4294967295L)) <= 0.0f);
    }

    public static String d(long j7) {
        if (j7 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + s6.a.L(Float.intBitsToFloat((int) (j7 >> 32))) + ", " + s6.a.L(Float.intBitsToFloat((int) (j7 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f2469a == ((e) obj).f2469a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2469a);
    }

    public final String toString() {
        return d(this.f2469a);
    }
}
