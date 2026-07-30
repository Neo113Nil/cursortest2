package m1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.t;
import k1.t0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f854a = new k(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f855b = p1.a.i("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f856c = p1.a.i("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final o0.a f857d = new o0.a(2, "BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    public static final o0.a f858e = new o0.a(2, "SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    public static final o0.a f859f = new o0.a(2, "S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    public static final o0.a f860g = new o0.a(2, "RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    public static final o0.a f861h = new o0.a(2, "POISONED");

    /* renamed from: i, reason: collision with root package name */
    public static final o0.a f862i = new o0.a(2, "DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    public static final o0.a f863j = new o0.a(2, "INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    public static final o0.a f864k = new o0.a(2, "INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    public static final o0.a f865l = new o0.a(2, "CHANNEL_CLOSED");
    public static final o0.a m = new o0.a(2, "SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    public static final o0.a f866n = new o0.a(2, "SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    public static final o0.a f867o = new o0.a(2, "FAILED");

    /* renamed from: p, reason: collision with root package name */
    public static final o0.a f868p = new o0.a(2, "NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    public static final o0.a f869q = new o0.a(2, "CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    public static final o0.a f870r = new o0.a(2, "CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    public static final o0.a f871s = new o0.a(2, "NO_CLOSE_CAUSE");

    public static final boolean a(k1.d dVar, Object obj, p1.q qVar) {
        dVar.getClass();
        o0.a aVar = t.f717a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.d.f672h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(dVar);
            if (!(obj2 instanceof t0)) {
                aVar = null;
                break;
            }
            int i2 = dVar.f731d;
            if (!(obj instanceof k1.j) && i2 != 1) {
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(dVar, obj2, obj)) {
                if (atomicReferenceFieldUpdater.get(dVar) != obj2) {
                    break;
                }
            }
            if (!dVar.s()) {
                dVar.n();
            }
        }
        if (aVar == null) {
            return false;
        }
        dVar.o(dVar.f731d);
        return true;
    }
}
