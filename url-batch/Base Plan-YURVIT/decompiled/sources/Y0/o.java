package Y0;

import B0.E;
import F.L;
import W0.AbstractC0061a;
import W0.AbstractC0081v;
import W0.C0074n;
import W0.Q;
import W0.X;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class o extends AbstractC0061a implements p, f {

    /* renamed from: h, reason: collision with root package name */
    public final b f1049h;

    public o(G0.i iVar, b bVar) {
        super(iVar, true);
        this.f1049h = bVar;
    }

    @Override // W0.AbstractC0061a
    public final void T(Throwable th, boolean z2) {
        if (this.f1049h.f(th, false) || z2) {
            return;
        }
        AbstractC0081v.d(this.f941g, th);
    }

    @Override // W0.AbstractC0061a
    public final void U(Object obj) {
        this.f1049h.f(null, false);
    }

    public final void W(L l2) {
        b bVar = this.f1049h;
        bVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f1016n;
        while (!atomicReferenceFieldUpdater.compareAndSet(bVar, null, l2)) {
            if (atomicReferenceFieldUpdater.get(bVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(bVar);
                    E e2 = d.f1035q;
                    if (obj != e2) {
                        if (obj == d.f1036r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    E e3 = d.f1036r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, e2, e3)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != e2) {
                            break;
                        }
                    }
                    l2.j(bVar.m());
                    return;
                }
            }
        }
    }

    @Override // W0.Z, W0.P
    public final void b(CancellationException cancellationException) {
        Object D2 = D();
        if (D2 instanceof C0074n) {
            return;
        }
        if ((D2 instanceof X) && ((X) D2).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Q(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // Y0.r
    public final Object k(I0.b bVar, Object obj) {
        return this.f1049h.k(bVar, obj);
    }

    @Override // Y0.r
    public final Object l(Object obj) {
        return this.f1049h.l(obj);
    }

    @Override // W0.Z
    public final void s(CancellationException cancellationException) {
        this.f1049h.f(cancellationException, true);
        r(cancellationException);
    }
}
