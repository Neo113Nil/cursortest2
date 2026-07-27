package F4;

import D4.InterfaceC0006f;
import G0.C0051a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f706a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f707b = I4.a.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f708c = I4.a.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final C0051a f709d = new C0051a("BUFFERED", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0051a f710e = new C0051a("SHOULD_BUFFER", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final C0051a f711f = new C0051a("S_RESUMING_BY_RCV", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final C0051a f712g = new C0051a("RESUMING_BY_EB", 2);

    /* renamed from: h, reason: collision with root package name */
    public static final C0051a f713h = new C0051a("POISONED", 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0051a f714i = new C0051a("DONE_RCV", 2);

    /* renamed from: j, reason: collision with root package name */
    public static final C0051a f715j = new C0051a("INTERRUPTED_SEND", 2);

    /* renamed from: k, reason: collision with root package name */
    public static final C0051a f716k = new C0051a("INTERRUPTED_RCV", 2);

    /* renamed from: l, reason: collision with root package name */
    public static final C0051a f717l = new C0051a("CHANNEL_CLOSED", 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C0051a f718m = new C0051a("SUSPEND", 2);

    /* renamed from: n, reason: collision with root package name */
    public static final C0051a f719n = new C0051a("SUSPEND_NO_WAITER", 2);

    /* renamed from: o, reason: collision with root package name */
    public static final C0051a f720o = new C0051a("FAILED", 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C0051a f721p = new C0051a("NO_RECEIVE_RESULT", 2);

    /* renamed from: q, reason: collision with root package name */
    public static final C0051a f722q = new C0051a("CLOSE_HANDLER_CLOSED", 2);

    /* renamed from: r, reason: collision with root package name */
    public static final C0051a f723r = new C0051a("CLOSE_HANDLER_INVOKED", 2);

    /* renamed from: s, reason: collision with root package name */
    public static final C0051a f724s = new C0051a("NO_CLOSE_CAUSE", 2);

    public static final boolean a(InterfaceC0006f interfaceC0006f, Object obj, InterfaceC1441l interfaceC1441l) {
        C0051a d6 = interfaceC0006f.d(obj, interfaceC1441l);
        if (d6 == null) {
            return false;
        }
        interfaceC0006f.j(d6);
        return true;
    }
}
