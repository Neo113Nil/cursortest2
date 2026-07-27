package l0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f7922a;

    public static final boolean a(long j4, long j5) {
        return j4 == j5;
    }

    public static String b(long j4) {
        return "PointerId(value=" + j4 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f7922a == ((r) obj).f7922a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7922a);
    }

    public final String toString() {
        return b(this.f7922a);
    }
}
