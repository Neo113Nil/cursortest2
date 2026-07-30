package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f406b = r4.a.h(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f407c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f408a;

    public /* synthetic */ j0(long j8) {
        this.f408a = j8;
    }

    public static final boolean a(long j8, long j9) {
        return j8 == j9;
    }

    public static final boolean b(long j8) {
        return ((int) (j8 >> 32)) == ((int) (j8 & 4294967295L));
    }

    public static final int c(long j8) {
        return d(j8) - e(j8);
    }

    public static final int d(long j8) {
        int i7 = (int) (j8 >> 32);
        int i8 = (int) (j8 & 4294967295L);
        return i7 > i8 ? i7 : i8;
    }

    public static final int e(long j8) {
        int i7 = (int) (j8 >> 32);
        int i8 = (int) (j8 & 4294967295L);
        return i7 > i8 ? i8 : i7;
    }

    public static final boolean f(long j8) {
        return ((int) (j8 >> 32)) > ((int) (j8 & 4294967295L));
    }

    public static String g(long j8) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j8 >> 32));
        sb.append(", ");
        return a0.m.l(sb, (int) (j8 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return this.f408a == ((j0) obj).f408a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f408a);
    }

    public final String toString() {
        return g(this.f408a);
    }
}
