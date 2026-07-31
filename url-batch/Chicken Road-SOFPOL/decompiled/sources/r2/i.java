package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f6522a;

    public static final boolean a(long j7, long j8) {
        return j7 == j8;
    }

    public static final long b(long j7, long j8) {
        return ((((int) (j7 >> 32)) - ((int) (j8 >> 32))) << 32) | ((((int) (j7 & 4294967295L)) - ((int) (j8 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j7, long j8) {
        return ((((int) (j7 >> 32)) + ((int) (j8 >> 32))) << 32) | ((((int) (j7 & 4294967295L)) + ((int) (j8 & 4294967295L))) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f6522a == ((i) obj).f6522a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6522a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j7 = this.f6522a;
        sb.append((int) (j7 >> 32));
        sb.append(", ");
        return a0.q.k(sb, (int) (j7 & 4294967295L), ')');
    }
}
