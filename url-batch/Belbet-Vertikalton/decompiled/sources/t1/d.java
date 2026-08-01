package t1;

import V.q;
import i1.InterfaceC0192l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r1.AbstractC0369t;
import r1.C0355e;
import r1.C0360j;
import r1.InterfaceC0354d;
import r1.Y;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f4181a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4182b = w1.a.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f4183c = w1.a.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final q f4184d = new q("BUFFERED", 1);
    public static final q e = new q("SHOULD_BUFFER", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final q f4185f = new q("S_RESUMING_BY_RCV", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final q f4186g = new q("RESUMING_BY_EB", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final q f4187h = new q("POISONED", 1);
    public static final q i = new q("DONE_RCV", 1);
    public static final q j = new q("INTERRUPTED_SEND", 1);

    /* renamed from: k, reason: collision with root package name */
    public static final q f4188k = new q("INTERRUPTED_RCV", 1);

    /* renamed from: l, reason: collision with root package name */
    public static final q f4189l = new q("CHANNEL_CLOSED", 1);

    /* renamed from: m, reason: collision with root package name */
    public static final q f4190m = new q("SUSPEND", 1);

    /* renamed from: n, reason: collision with root package name */
    public static final q f4191n = new q("SUSPEND_NO_WAITER", 1);

    /* renamed from: o, reason: collision with root package name */
    public static final q f4192o = new q("FAILED", 1);

    /* renamed from: p, reason: collision with root package name */
    public static final q f4193p = new q("NO_RECEIVE_RESULT", 1);

    /* renamed from: q, reason: collision with root package name */
    public static final q f4194q = new q("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r, reason: collision with root package name */
    public static final q f4195r = new q("CLOSE_HANDLER_INVOKED", 1);

    /* renamed from: s, reason: collision with root package name */
    public static final q f4196s = new q("NO_CLOSE_CAUSE", 1);

    public static final boolean a(InterfaceC0354d interfaceC0354d, Object obj, InterfaceC0192l interfaceC0192l) {
        q qVar;
        C0355e c0355e = (C0355e) interfaceC0354d;
        c0355e.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0355e.f4068g;
            Object obj2 = atomicReferenceFieldUpdater.get(c0355e);
            boolean z2 = obj2 instanceof Y;
            qVar = AbstractC0369t.f4091a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0360j;
                qVar = null;
                break;
            }
            Object v2 = C0355e.v((Y) obj2, obj, c0355e.f4099c, interfaceC0192l);
            while (!atomicReferenceFieldUpdater.compareAndSet(c0355e, obj2, v2)) {
                if (atomicReferenceFieldUpdater.get(c0355e) != obj2) {
                    break;
                }
            }
            if (!c0355e.r()) {
                c0355e.l();
            }
        }
        if (qVar == null) {
            return false;
        }
        c0355e.m(c0355e.f4099c);
        return true;
    }
}
