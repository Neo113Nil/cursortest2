package O0;

import M0.InterfaceC0047e;
import R0.AbstractC0068a;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f720a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f721b = AbstractC0068a.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f722c = AbstractC0068a.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final A.j f723d;

    /* renamed from: e, reason: collision with root package name */
    public static final A.j f724e;

    /* renamed from: f, reason: collision with root package name */
    public static final A.j f725f;

    /* renamed from: g, reason: collision with root package name */
    public static final A.j f726g;

    /* renamed from: h, reason: collision with root package name */
    public static final A.j f727h;

    /* renamed from: i, reason: collision with root package name */
    public static final A.j f728i;

    /* renamed from: j, reason: collision with root package name */
    public static final A.j f729j;

    /* renamed from: k, reason: collision with root package name */
    public static final A.j f730k;

    /* renamed from: l, reason: collision with root package name */
    public static final A.j f731l;

    /* renamed from: m, reason: collision with root package name */
    public static final A.j f732m;

    /* renamed from: n, reason: collision with root package name */
    public static final A.j f733n;

    /* renamed from: o, reason: collision with root package name */
    public static final A.j f734o;

    /* renamed from: p, reason: collision with root package name */
    public static final A.j f735p;

    /* renamed from: q, reason: collision with root package name */
    public static final A.j f736q;
    public static final A.j r;

    /* renamed from: s, reason: collision with root package name */
    public static final A.j f737s;

    static {
        int i2 = 11;
        f723d = new A.j(i2, "BUFFERED");
        f724e = new A.j(i2, "SHOULD_BUFFER");
        f725f = new A.j(i2, "S_RESUMING_BY_RCV");
        f726g = new A.j(i2, "RESUMING_BY_EB");
        f727h = new A.j(i2, "POISONED");
        f728i = new A.j(i2, "DONE_RCV");
        f729j = new A.j(i2, "INTERRUPTED_SEND");
        f730k = new A.j(i2, "INTERRUPTED_RCV");
        f731l = new A.j(i2, "CHANNEL_CLOSED");
        f732m = new A.j(i2, "SUSPEND");
        f733n = new A.j(i2, "SUSPEND_NO_WAITER");
        f734o = new A.j(i2, "FAILED");
        f735p = new A.j(i2, "NO_RECEIVE_RESULT");
        f736q = new A.j(i2, "CLOSE_HANDLER_CLOSED");
        r = new A.j(i2, "CLOSE_HANDLER_INVOKED");
        f737s = new A.j(i2, "NO_CLOSE_CAUSE");
    }

    public static final boolean a(InterfaceC0047e interfaceC0047e, Object obj, E0.l lVar) {
        A.j e2 = interfaceC0047e.e(obj, lVar);
        if (e2 == null) {
            return false;
        }
        interfaceC0047e.j(e2);
        return true;
    }
}
