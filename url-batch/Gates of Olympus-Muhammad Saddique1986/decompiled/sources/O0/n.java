package O0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3748a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static String b(long j3) {
        return a(j3, 0L) ? "Unspecified" : a(j3, 4294967296L) ? "Sp" : a(j3, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f3748a == ((n) obj).f3748a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3748a);
    }

    public final String toString() {
        return b(this.f3748a);
    }
}
