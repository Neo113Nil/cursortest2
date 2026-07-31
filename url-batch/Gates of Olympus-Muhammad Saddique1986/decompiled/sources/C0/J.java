package C0;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final long f567b = O2.l.J(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f568c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f569a;

    public /* synthetic */ J(long j3) {
        this.f569a = j3;
    }

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final boolean b(long j3) {
        return ((int) (j3 >> 32)) == ((int) (j3 & 4294967295L));
    }

    public static final int c(long j3) {
        return d(j3) - e(j3);
    }

    public static final int d(long j3) {
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        return i3 > i4 ? i3 : i4;
    }

    public static final int e(long j3) {
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        return i3 > i4 ? i4 : i3;
    }

    public static final boolean f(long j3) {
        return ((int) (j3 >> 32)) > ((int) (j3 & 4294967295L));
    }

    public static String g(long j3) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return A.k.j(sb, (int) (j3 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J) {
            return this.f569a == ((J) obj).f569a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f569a);
    }

    public final String toString() {
        return g(this.f569a);
    }
}
