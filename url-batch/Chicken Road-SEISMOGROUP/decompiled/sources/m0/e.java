package m0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.AbstractC0058t;
import k0.C0044e;
import k0.C0049j;
import k0.InterfaceC0043d;
import k0.W;
import p0.AbstractC0084a;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1044a = new k(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1045b = AbstractC0084a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f1046c = AbstractC0084a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1047d = new io.flutter.plugin.editing.a(5, "BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1048e = new io.flutter.plugin.editing.a(5, "SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1049f = new io.flutter.plugin.editing.a(5, "S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1050g = new io.flutter.plugin.editing.a(5, "RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1051h = new io.flutter.plugin.editing.a(5, "POISONED");

    /* renamed from: i, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1052i = new io.flutter.plugin.editing.a(5, "DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1053j = new io.flutter.plugin.editing.a(5, "INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1054k = new io.flutter.plugin.editing.a(5, "INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1055l = new io.flutter.plugin.editing.a(5, "CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1056m = new io.flutter.plugin.editing.a(5, "SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1057n = new io.flutter.plugin.editing.a(5, "SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1058o = new io.flutter.plugin.editing.a(5, "FAILED");

    /* renamed from: p, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1059p = new io.flutter.plugin.editing.a(5, "NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1060q = new io.flutter.plugin.editing.a(5, "CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1061r = new io.flutter.plugin.editing.a(5, "CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f1062s = new io.flutter.plugin.editing.a(5, "NO_CLOSE_CAUSE");

    public static final boolean a(InterfaceC0043d interfaceC0043d, Object obj, d0.l lVar) {
        io.flutter.plugin.editing.a aVar;
        C0044e c0044e = (C0044e) interfaceC0043d;
        c0044e.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0044e.f913h;
            Object obj2 = atomicReferenceFieldUpdater.get(c0044e);
            boolean z = obj2 instanceof W;
            aVar = AbstractC0058t.f937a;
            if (!z) {
                boolean z2 = obj2 instanceof C0049j;
                aVar = null;
                break;
            }
            Object w2 = C0044e.w(obj, c0044e.f949d, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(c0044e, obj2, w2)) {
                if (atomicReferenceFieldUpdater.get(c0044e) != obj2) {
                    break;
                }
            }
            if (!c0044e.s()) {
                c0044e.n();
            }
        }
        if (aVar == null) {
            return false;
        }
        c0044e.o(c0044e.f949d);
        return true;
    }
}
