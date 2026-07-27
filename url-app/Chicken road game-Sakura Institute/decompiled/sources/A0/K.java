package A0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: b, reason: collision with root package name */
    public static final long f299b = M1.a.j(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f300c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f301a;

    public /* synthetic */ K(long j4) {
        this.f301a = j4;
    }

    public static final boolean a(long j4, long j5) {
        return j4 == j5;
    }

    public static final boolean b(long j4) {
        return ((int) (j4 >> 32)) == ((int) (j4 & 4294967295L));
    }

    public static final int c(long j4) {
        return d(j4) - e(j4);
    }

    public static final int d(long j4) {
        int i2 = (int) (j4 >> 32);
        int i4 = (int) (j4 & 4294967295L);
        return i2 > i4 ? i2 : i4;
    }

    public static final int e(long j4) {
        int i2 = (int) (j4 >> 32);
        int i4 = (int) (j4 & 4294967295L);
        return i2 > i4 ? i4 : i2;
    }

    public static final boolean f(long j4) {
        return ((int) (j4 >> 32)) > ((int) (j4 & 4294967295L));
    }

    public static String g(long j4) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j4 >> 32));
        sb.append(", ");
        return AbstractC0017m.l(sb, (int) (j4 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof K) {
            return this.f301a == ((K) obj).f301a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f301a);
    }

    public final String toString() {
        return g(this.f301a);
    }
}
