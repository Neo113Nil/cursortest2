package r1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: r1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357g extends P {
    public final C0355e e;

    public C0357g(C0355e c0355e) {
        this.e = c0355e;
    }

    @Override // i1.InterfaceC0192l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return W0.i.f1345a;
    }

    @Override // r1.Q
    public final void o(Throwable th) {
        V n2 = n();
        C0355e c0355e = this.e;
        c0355e.getClass();
        CancellationException o2 = n2.o();
        if (c0355e.r()) {
            a1.d dVar = c0355e.f4070d;
            j1.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            w1.g gVar = (w1.g) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.g.f4473h;
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                V.q qVar = w1.a.f4465d;
                if (!j1.h.a(obj, qVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, qVar, o2)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != qVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0355e.k(o2);
        if (c0355e.r()) {
            return;
        }
        c0355e.l();
    }
}
