package n0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f6222a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static String b(long j3) {
        return "PointerId(value=" + j3 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f6222a == ((l) obj).f6222a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6222a);
    }

    public final String toString() {
        return b(this.f6222a);
    }
}
