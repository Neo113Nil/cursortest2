package z6;

import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final long f9286d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f9287e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9288f = 0;

    static {
        int i = b.f9289a;
        f9286d = o.z(4611686018427387903L);
        f9287e = o.z(-4611686018427387903L);
    }

    public static final long a(long j7, long j8) {
        long j9 = 1000000;
        long j10 = j8 / j9;
        long j11 = j7 + j10;
        if (-4611686018426L > j11 || j11 >= 4611686018427L) {
            return o.z(o.u(j11));
        }
        long j12 = ((j11 * j9) + (j8 - (j10 * j9))) << 1;
        int i = b.f9289a;
        return j12;
    }

    public static final boolean b(long j7) {
        return j7 == f9286d || j7 == f9287e;
    }
}
