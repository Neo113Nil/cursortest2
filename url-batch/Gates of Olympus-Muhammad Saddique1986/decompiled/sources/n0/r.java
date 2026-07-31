package n0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f7307a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static String b(long j3) {
        return "PointerId(value=" + j3 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f7307a == ((r) obj).f7307a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7307a);
    }

    public final String toString() {
        return b(this.f7307a);
    }
}
