package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ku implements Comparable {
    public static final ju d = new ju(null);
    public static final long e;
    public static final long g;

    static {
        int i = mu.a;
        e = mo.m(4611686018427387903L);
        g = mo.m(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long j4 = j + j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return mo.m(b11.d(j4));
        }
        long j5 = ((j4 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = mu.a;
        return j5;
    }

    public static final boolean b(long j) {
        return j == e || j == g;
    }
}
