package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f6536a;

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f6536a == ((p) obj).f6536a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6536a);
    }

    public final String toString() {
        long j7 = this.f6536a;
        return a(j7, 0L) ? "Unspecified" : a(j7, 4294967296L) ? "Sp" : a(j7, 8589934592L) ? "Em" : "Invalid";
    }
}
