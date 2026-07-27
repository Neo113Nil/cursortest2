package Y2;

import W2.InterfaceC0284f;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final m f4420a = new m(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4421b = b3.a.k(32, 0, 0, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c, reason: collision with root package name */
    public static final int f4422c = b3.a.k(10000, 0, 0, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d, reason: collision with root package name */
    public static final b3.t f4423d = new b3.t("BUFFERED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final b3.t f4424e = new b3.t("SHOULD_BUFFER", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final b3.t f4425f = new b3.t("S_RESUMING_BY_RCV", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final b3.t f4426g = new b3.t("RESUMING_BY_EB", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final b3.t f4427h = new b3.t("POISONED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final b3.t f4428i = new b3.t("DONE_RCV", 0);

    /* renamed from: j, reason: collision with root package name */
    public static final b3.t f4429j = new b3.t("INTERRUPTED_SEND", 0);

    /* renamed from: k, reason: collision with root package name */
    public static final b3.t f4430k = new b3.t("INTERRUPTED_RCV", 0);

    /* renamed from: l, reason: collision with root package name */
    public static final b3.t f4431l = new b3.t("CHANNEL_CLOSED", 0);

    /* renamed from: m, reason: collision with root package name */
    public static final b3.t f4432m = new b3.t("SUSPEND", 0);

    /* renamed from: n, reason: collision with root package name */
    public static final b3.t f4433n = new b3.t("SUSPEND_NO_WAITER", 0);

    /* renamed from: o, reason: collision with root package name */
    public static final b3.t f4434o = new b3.t("FAILED", 0);

    /* renamed from: p, reason: collision with root package name */
    public static final b3.t f4435p = new b3.t("NO_RECEIVE_RESULT", 0);

    /* renamed from: q, reason: collision with root package name */
    public static final b3.t f4436q = new b3.t("CLOSE_HANDLER_CLOSED", 0);

    /* renamed from: r, reason: collision with root package name */
    public static final b3.t f4437r = new b3.t("CLOSE_HANDLER_INVOKED", 0);

    /* renamed from: s, reason: collision with root package name */
    public static final b3.t f4438s = new b3.t("NO_CLOSE_CAUSE", 0);

    public static final boolean a(InterfaceC0284f interfaceC0284f, Object obj, L2.c cVar) {
        b3.t c4 = interfaceC0284f.c(obj, cVar);
        if (c4 == null) {
            return false;
        }
        interfaceC0284f.z(c4);
        return true;
    }
}
