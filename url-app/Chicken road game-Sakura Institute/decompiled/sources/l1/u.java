package l1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final long f5829a;

    public static final boolean a(long j8, long j9) {
        return j8 == j9;
    }

    public static String b(long j8) {
        return "PointerId(value=" + j8 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f5829a == ((u) obj).f5829a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5829a);
    }

    public final String toString() {
        return b(this.f5829a);
    }
}
