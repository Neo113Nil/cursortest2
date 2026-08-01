package x2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f10324a;

    public static final boolean a(long j, long j3) {
        return j == j3;
    }

    public static final long b(long j, long j3) {
        return ((((int) (j >> 32)) - ((int) (j3 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j, long j3) {
        return ((((int) (j >> 32)) + ((int) (j3 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j3 & 4294967295L))) & 4294967295L);
    }

    public static String d(long j) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return v4.a.m(sb2, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f10324a == ((i) obj).f10324a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10324a);
    }

    public final String toString() {
        return d(this.f10324a);
    }
}
