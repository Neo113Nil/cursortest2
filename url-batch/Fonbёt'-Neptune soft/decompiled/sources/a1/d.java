package a1;

import Y0.InterfaceC0111e;
import d1.AbstractC0184a;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1303a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1304b = AbstractC0184a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f1305c = AbstractC0184a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final B.m f1306d = new B.m(19, "BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    public static final B.m f1307e = new B.m(19, "SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    public static final B.m f1308f = new B.m(19, "S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    public static final B.m f1309g = new B.m(19, "RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    public static final B.m f1310h = new B.m(19, "POISONED");

    /* renamed from: i, reason: collision with root package name */
    public static final B.m f1311i = new B.m(19, "DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    public static final B.m f1312j = new B.m(19, "INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    public static final B.m f1313k = new B.m(19, "INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    public static final B.m f1314l = new B.m(19, "CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    public static final B.m f1315m = new B.m(19, "SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    public static final B.m f1316n = new B.m(19, "SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    public static final B.m f1317o = new B.m(19, "FAILED");

    /* renamed from: p, reason: collision with root package name */
    public static final B.m f1318p = new B.m(19, "NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    public static final B.m f1319q = new B.m(19, "CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    public static final B.m f1320r = new B.m(19, "CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    public static final B.m f1321s = new B.m(19, "NO_CLOSE_CAUSE");

    public static final boolean a(InterfaceC0111e interfaceC0111e, Object obj, P0.l lVar) {
        B.m c2 = interfaceC0111e.c(obj, lVar);
        if (c2 == null) {
            return false;
        }
        interfaceC0111e.n(c2);
        return true;
    }
}
