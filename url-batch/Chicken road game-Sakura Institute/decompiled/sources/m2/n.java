package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f6329a;

    public static final boolean a(long j8, long j9) {
        return j8 == j9;
    }

    public static String b(long j8) {
        return a(j8, 0L) ? "Unspecified" : a(j8, 4294967296L) ? "Sp" : a(j8, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f6329a == ((n) obj).f6329a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6329a);
    }

    public final String toString() {
        return b(this.f6329a);
    }
}
