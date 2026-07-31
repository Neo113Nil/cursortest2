package m2;

import k2.InterfaceC0534f;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final m f5951a = new m(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f5952b = p2.a.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f5953c = p2.a.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final j1.p f5954d = new j1.p("BUFFERED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final j1.p f5955e = new j1.p("SHOULD_BUFFER", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final j1.p f5956f = new j1.p("S_RESUMING_BY_RCV", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final j1.p f5957g = new j1.p("RESUMING_BY_EB", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final j1.p f5958h = new j1.p("POISONED", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final j1.p f5959i = new j1.p("DONE_RCV", 1);

    /* renamed from: j, reason: collision with root package name */
    public static final j1.p f5960j = new j1.p("INTERRUPTED_SEND", 1);

    /* renamed from: k, reason: collision with root package name */
    public static final j1.p f5961k = new j1.p("INTERRUPTED_RCV", 1);

    /* renamed from: l, reason: collision with root package name */
    public static final j1.p f5962l = new j1.p("CHANNEL_CLOSED", 1);

    /* renamed from: m, reason: collision with root package name */
    public static final j1.p f5963m = new j1.p("SUSPEND", 1);

    /* renamed from: n, reason: collision with root package name */
    public static final j1.p f5964n = new j1.p("SUSPEND_NO_WAITER", 1);

    /* renamed from: o, reason: collision with root package name */
    public static final j1.p f5965o = new j1.p("FAILED", 1);
    public static final j1.p p = new j1.p("NO_RECEIVE_RESULT", 1);

    /* renamed from: q, reason: collision with root package name */
    public static final j1.p f5966q = new j1.p("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r, reason: collision with root package name */
    public static final j1.p f5967r = new j1.p("CLOSE_HANDLER_INVOKED", 1);

    /* renamed from: s, reason: collision with root package name */
    public static final j1.p f5968s = new j1.p("NO_CLOSE_CAUSE", 1);

    public static final boolean a(InterfaceC0534f interfaceC0534f, Object obj, Y1.f fVar) {
        j1.p i3 = interfaceC0534f.i(obj, fVar);
        if (i3 == null) {
            return false;
        }
        interfaceC0534f.t(i3);
        return true;
    }
}
