package Y0;

import B0.E;
import W0.InterfaceC0065e;
import b1.AbstractC0115a;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1019a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1020b = AbstractC0115a.j("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f1021c = AbstractC0115a.j("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final E f1022d;

    /* renamed from: e, reason: collision with root package name */
    public static final E f1023e;

    /* renamed from: f, reason: collision with root package name */
    public static final E f1024f;

    /* renamed from: g, reason: collision with root package name */
    public static final E f1025g;

    /* renamed from: h, reason: collision with root package name */
    public static final E f1026h;

    /* renamed from: i, reason: collision with root package name */
    public static final E f1027i;

    /* renamed from: j, reason: collision with root package name */
    public static final E f1028j;

    /* renamed from: k, reason: collision with root package name */
    public static final E f1029k;

    /* renamed from: l, reason: collision with root package name */
    public static final E f1030l;

    /* renamed from: m, reason: collision with root package name */
    public static final E f1031m;

    /* renamed from: n, reason: collision with root package name */
    public static final E f1032n;

    /* renamed from: o, reason: collision with root package name */
    public static final E f1033o;

    /* renamed from: p, reason: collision with root package name */
    public static final E f1034p;

    /* renamed from: q, reason: collision with root package name */
    public static final E f1035q;

    /* renamed from: r, reason: collision with root package name */
    public static final E f1036r;

    /* renamed from: s, reason: collision with root package name */
    public static final E f1037s;

    static {
        int i2 = 14;
        f1022d = new E(i2, "BUFFERED");
        f1023e = new E(i2, "SHOULD_BUFFER");
        f1024f = new E(i2, "S_RESUMING_BY_RCV");
        f1025g = new E(i2, "RESUMING_BY_EB");
        f1026h = new E(i2, "POISONED");
        f1027i = new E(i2, "DONE_RCV");
        f1028j = new E(i2, "INTERRUPTED_SEND");
        f1029k = new E(i2, "INTERRUPTED_RCV");
        f1030l = new E(i2, "CHANNEL_CLOSED");
        f1031m = new E(i2, "SUSPEND");
        f1032n = new E(i2, "SUSPEND_NO_WAITER");
        f1033o = new E(i2, "FAILED");
        f1034p = new E(i2, "NO_RECEIVE_RESULT");
        f1035q = new E(i2, "CLOSE_HANDLER_CLOSED");
        f1036r = new E(i2, "CLOSE_HANDLER_INVOKED");
        f1037s = new E(i2, "NO_CLOSE_CAUSE");
    }

    public static final boolean a(InterfaceC0065e interfaceC0065e, Object obj, b1.q qVar) {
        E f2 = interfaceC0065e.f(obj, qVar);
        if (f2 == null) {
            return false;
        }
        interfaceC0065e.n(f2);
        return true;
    }
}
