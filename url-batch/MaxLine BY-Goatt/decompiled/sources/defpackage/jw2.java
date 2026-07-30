package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jw2 {
    public static final long b = th2.a(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ jw2(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final boolean b(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int c(long j) {
        return d(j) - e(j);
    }

    public static final int d(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int e(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean f(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String g(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return q40.o(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jw2) {
            return this.a == ((jw2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return g(this.a);
    }
}
