package M0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3562a;

    public static final boolean a(long j4, long j5) {
        return j4 == j5;
    }

    public static String b(long j4) {
        return a(j4, 0L) ? "Unspecified" : a(j4, 4294967296L) ? "Sp" : a(j4, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f3562a == ((n) obj).f3562a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3562a);
    }

    public final String toString() {
        return b(this.f3562a);
    }
}
