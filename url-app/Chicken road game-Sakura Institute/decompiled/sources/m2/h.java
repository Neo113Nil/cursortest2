package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f6315a;

    public static final boolean a(long j8, long j9) {
        return j8 == j9;
    }

    public static final long b(long j8, long j9) {
        return ((((int) (j8 >> 32)) - ((int) (j9 >> 32))) << 32) | ((((int) (j8 & 4294967295L)) - ((int) (j9 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j8, long j9) {
        return ((((int) (j8 >> 32)) + ((int) (j9 >> 32))) << 32) | ((((int) (j8 & 4294967295L)) + ((int) (j9 & 4294967295L))) & 4294967295L);
    }

    public static String d(long j8) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j8 >> 32));
        sb.append(", ");
        return a0.m.l(sb, (int) (j8 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f6315a == ((h) obj).f6315a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6315a);
    }

    public final String toString() {
        return d(this.f6315a);
    }
}
