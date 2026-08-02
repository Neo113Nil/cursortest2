package v2;

import d2.InterfaceC0300c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;
import t2.AbstractC1191a;
import t2.AbstractC1212w;
import t2.C1204n;
import t2.V;
import t2.c0;

/* loaded from: classes.dex */
public final class o extends AbstractC1191a implements p, g {

    /* renamed from: d, reason: collision with root package name */
    public final c f10614d;

    public o(d2.h hVar, c cVar) {
        super(hVar, true);
        this.f10614d = cVar;
    }

    @Override // t2.AbstractC1191a
    public final void T(Throwable th, boolean z) {
        if (this.f10614d.f(th, false) || z) {
            return;
        }
        AbstractC1212w.e(this.f10396c, th);
    }

    @Override // t2.AbstractC1191a
    public final void U(Object obj) {
        this.f10614d.f(null, false);
    }

    public final void W(B2.g gVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar = this.f10614d;
        cVar.getClass();
        do {
            atomicReferenceFieldUpdater = c.f10585j;
            if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, gVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(cVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(cVar);
            C1148j c1148j = e.f10602q;
            if (obj != c1148j) {
                if (obj == e.f10603r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            C1148j c1148j2 = e.f10603r;
            while (!atomicReferenceFieldUpdater.compareAndSet(cVar, c1148j, c1148j2)) {
                if (atomicReferenceFieldUpdater.get(cVar) != c1148j) {
                    break;
                }
            }
            gVar.invoke(cVar.m());
            return;
        }
    }

    @Override // t2.e0, t2.U
    public final void b(CancellationException cancellationException) {
        Object D3 = D();
        if (D3 instanceof C1204n) {
            return;
        }
        if ((D3 instanceof c0) && ((c0) D3).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new V(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // v2.r
    public final Object g(InterfaceC0300c interfaceC0300c, Object obj) {
        return this.f10614d.g(interfaceC0300c, obj);
    }

    @Override // v2.r
    public final Object j(Object obj) {
        return this.f10614d.j(obj);
    }

    @Override // t2.e0
    public final void s(CancellationException cancellationException) {
        this.f10614d.f(cancellationException, true);
        r(cancellationException);
    }
}
