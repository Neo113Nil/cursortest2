package m1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.j0;
import k1.o0;
import k1.t;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class q extends k1.a implements g, r {

    /* renamed from: e, reason: collision with root package name */
    public final c f884e;

    public q(v0.h hVar, c cVar) {
        super(hVar, true);
        this.f884e = cVar;
    }

    @Override // k1.a
    public final void K(Throwable th, boolean z2) {
        if (this.f884e.e(th, false) || z2) {
            return;
        }
        t.c(this.f661d, th);
    }

    @Override // k1.a
    public final void L(Object obj) {
        this.f884e.e(null, false);
    }

    public final void N(p pVar) {
        c cVar = this.f884e;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f851k;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, pVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    o0.a aVar = e.f869q;
                    if (obj != aVar) {
                        if (obj == e.f870r) {
                            f0.l.b("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            f0.l.f("Another handler is already registered: ", obj);
                            return;
                        }
                    }
                    o0.a aVar2 = e.f870r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, aVar, aVar2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != aVar) {
                            break;
                        }
                    }
                    pVar.h(cVar.k());
                    return;
                }
            }
        }
    }

    @Override // m1.r
    public final Object c(Object obj) {
        return this.f884e.c(obj);
    }

    @Override // k1.q0, m1.g
    public final void g(CancellationException cancellationException) {
        Object x2 = x();
        if (x2 instanceof k1.j) {
            return;
        }
        if ((x2 instanceof o0) && ((o0) x2).c()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new j0(q(), null, this);
        }
        o(cancellationException);
    }

    @Override // k1.q0
    public final void o(CancellationException cancellationException) {
        this.f884e.e(cancellationException, true);
        n(cancellationException);
    }
}
