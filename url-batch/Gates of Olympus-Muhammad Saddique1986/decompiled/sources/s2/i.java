package s2;

import e2.InterfaceC0427f;
import q2.InterfaceC0819f;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o f8388a = new o(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f8389b = v2.a.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f8390c = v2.a.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final m1.q f8391d = new m1.q("BUFFERED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final m1.q f8392e = new m1.q("SHOULD_BUFFER", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final m1.q f8393f = new m1.q("S_RESUMING_BY_RCV", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final m1.q f8394g = new m1.q("RESUMING_BY_EB", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final m1.q f8395h = new m1.q("POISONED", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final m1.q f8396i = new m1.q("DONE_RCV", 1);

    /* renamed from: j, reason: collision with root package name */
    public static final m1.q f8397j = new m1.q("INTERRUPTED_SEND", 1);

    /* renamed from: k, reason: collision with root package name */
    public static final m1.q f8398k = new m1.q("INTERRUPTED_RCV", 1);

    /* renamed from: l, reason: collision with root package name */
    public static final m1.q f8399l = new m1.q("CHANNEL_CLOSED", 1);

    /* renamed from: m, reason: collision with root package name */
    public static final m1.q f8400m = new m1.q("SUSPEND", 1);

    /* renamed from: n, reason: collision with root package name */
    public static final m1.q f8401n = new m1.q("SUSPEND_NO_WAITER", 1);

    /* renamed from: o, reason: collision with root package name */
    public static final m1.q f8402o = new m1.q("FAILED", 1);

    /* renamed from: p, reason: collision with root package name */
    public static final m1.q f8403p = new m1.q("NO_RECEIVE_RESULT", 1);

    /* renamed from: q, reason: collision with root package name */
    public static final m1.q f8404q = new m1.q("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r, reason: collision with root package name */
    public static final m1.q f8405r = new m1.q("CLOSE_HANDLER_INVOKED", 1);

    /* renamed from: s, reason: collision with root package name */
    public static final m1.q f8406s = new m1.q("NO_CLOSE_CAUSE", 1);

    public static final boolean a(InterfaceC0819f interfaceC0819f, Object obj, InterfaceC0427f interfaceC0427f) {
        m1.q j3 = interfaceC0819f.j(obj, interfaceC0427f);
        if (j3 == null) {
            return false;
        }
        interfaceC0819f.B(j3);
        return true;
    }
}
