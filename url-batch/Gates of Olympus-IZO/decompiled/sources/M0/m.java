package M0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f2782a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f2782a == ((m) obj).f2782a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2782a);
    }

    public final String toString() {
        long j3 = this.f2782a;
        return a(j3, 0L) ? "Unspecified" : a(j3, 4294967296L) ? "Sp" : a(j3, 8589934592L) ? "Em" : "Invalid";
    }
}
