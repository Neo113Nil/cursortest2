package M0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f2768a;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final long b(long j3, long j4) {
        return ((((int) (j3 >> 32)) - ((int) (j4 >> 32))) << 32) | ((((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j3, long j4) {
        return ((((int) (j3 >> 32)) + ((int) (j4 >> 32))) << 32) | ((((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L))) & 4294967295L);
    }

    public static String d(long j3) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return AbstractC0080b.k(sb, (int) (j3 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f2768a == ((g) obj).f2768a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2768a);
    }

    public final String toString() {
        return d(this.f2768a);
    }
}
