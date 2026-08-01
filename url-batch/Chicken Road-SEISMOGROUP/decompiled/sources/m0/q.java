package m0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.AbstractC0040a;
import k0.AbstractC0058t;
import k0.C0050k;
import k0.L;
import k0.Q;

/* loaded from: classes.dex */
public final class q extends AbstractC0040a implements r, g {

    /* renamed from: e, reason: collision with root package name */
    public final c f1075e;

    public q(W.i iVar, c cVar) {
        super(iVar, true);
        this.f1075e = cVar;
    }

    @Override // k0.AbstractC0040a
    public final void K(Throwable th, boolean z) {
        if (this.f1075e.e(th, false) || z) {
            return;
        }
        AbstractC0058t.c(this.f906d, th);
    }

    @Override // k0.AbstractC0040a
    public final void L(Object obj) {
        this.f1075e.e(null, false);
    }

    public final void N(p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar = this.f1075e;
        cVar.getClass();
        do {
            atomicReferenceFieldUpdater = c.f1040l;
            if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, pVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(cVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(cVar);
            io.flutter.plugin.editing.a aVar = e.f1060q;
            if (obj != aVar) {
                if (obj == e.f1061r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            io.flutter.plugin.editing.a aVar2 = e.f1061r;
            while (!atomicReferenceFieldUpdater.compareAndSet(cVar, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(cVar) != aVar) {
                    break;
                }
            }
            pVar.h(cVar.k());
            return;
        }
    }

    @Override // k0.T, k0.K
    public final void a(CancellationException cancellationException) {
        Object y2 = y();
        if (y2 instanceof C0050k) {
            return;
        }
        if ((y2 instanceof Q) && ((Q) y2).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new L(r(), null, this);
        }
        p(cancellationException);
    }

    @Override // m0.t
    public final Object h(Object obj) {
        return this.f1075e.h(obj);
    }

    @Override // k0.T
    public final void p(CancellationException cancellationException) {
        this.f1075e.e(cancellationException, true);
        o(cancellationException);
    }
}
