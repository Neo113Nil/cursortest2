package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class el implements Comparable {
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;

    static {
        int i = fl.a;
        f = mv.n(4611686018427387903L);
        g = mv.n(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long j4 = j + j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return mv.n(d50.i(j4));
        }
        long j5 = ((j4 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = fl.a;
        return j5;
    }

    public static final boolean b(long j) {
        return j == f || j == g;
    }
}
