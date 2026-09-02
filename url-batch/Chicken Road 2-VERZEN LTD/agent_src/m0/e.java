package m0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.AbstractC0060t;
import k0.C0046e;
import k0.C0051j;
import k0.InterfaceC0045d;
import k0.W;
import p0.AbstractC0090a;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1001a = new k(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1002b = AbstractC0090a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f1003c = AbstractC0090a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1004d = new io.flutter.plugin.platform.c(4, "BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1005e = new io.flutter.plugin.platform.c(4, "SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1006f = new io.flutter.plugin.platform.c(4, "S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1007g = new io.flutter.plugin.platform.c(4, "RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1008h = new io.flutter.plugin.platform.c(4, "POISONED");

    /* renamed from: i, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1009i = new io.flutter.plugin.platform.c(4, "DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1010j = new io.flutter.plugin.platform.c(4, "INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1011k = new io.flutter.plugin.platform.c(4, "INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1012l = new io.flutter.plugin.platform.c(4, "CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1013m = new io.flutter.plugin.platform.c(4, "SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1014n = new io.flutter.plugin.platform.c(4, "SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1015o = new io.flutter.plugin.platform.c(4, "FAILED");

    /* renamed from: p, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1016p = new io.flutter.plugin.platform.c(4, "NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1017q = new io.flutter.plugin.platform.c(4, "CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1018r = new io.flutter.plugin.platform.c(4, "CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1019s = new io.flutter.plugin.platform.c(4, "NO_CLOSE_CAUSE");

    public static final boolean a(InterfaceC0045d interfaceC0045d, Object obj, d0.l lVar) {
        io.flutter.plugin.platform.c cVar;
        C0046e c0046e = (C0046e) interfaceC0045d;
        c0046e.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0046e.f860h;
            Object obj2 = atomicReferenceFieldUpdater.get(c0046e);
            boolean z2 = obj2 instanceof W;
            cVar = AbstractC0060t.f884a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0051j;
                cVar = null;
                break;
            }
            Object w2 = C0046e.w(obj, c0046e.f896d, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(c0046e, obj2, w2)) {
                if (atomicReferenceFieldUpdater.get(c0046e) != obj2) {
                    break;
                }
            }
            if (!c0046e.s()) {
                c0046e.n();
            }
        }
        if (cVar == null) {
            return false;
        }
        c0046e.o(c0046e.f896d);
        return true;
    }
}
