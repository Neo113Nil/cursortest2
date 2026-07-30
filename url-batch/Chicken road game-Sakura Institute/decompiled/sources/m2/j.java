package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f6321a;

    public static final boolean a(long j8, long j9) {
        return j8 == j9;
    }

    public static String b(long j8) {
        return ((int) (j8 >> 32)) + " x " + ((int) (j8 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f6321a == ((j) obj).f6321a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6321a);
    }

    public final String toString() {
        return b(this.f6321a);
    }
}
