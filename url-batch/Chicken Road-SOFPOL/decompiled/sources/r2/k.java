package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f6528a;

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static String b(long j7) {
        return ((int) (j7 >> 32)) + " x " + ((int) (j7 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f6528a == ((k) obj).f6528a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6528a);
    }

    public final String toString() {
        return b(this.f6528a);
    }
}
