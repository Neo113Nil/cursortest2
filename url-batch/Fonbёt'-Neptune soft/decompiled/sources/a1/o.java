package a1;

import D0.P;
import Y0.AbstractC0107a;
import Y0.AbstractC0127v;
import Y0.C0120n;
import Y0.Q;
import Y0.X;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class o extends AbstractC0107a implements p, f {

    /* renamed from: h, reason: collision with root package name */
    public final b f1333h;

    public o(H0.i iVar, b bVar) {
        super(iVar, true);
        this.f1333h = bVar;
    }

    @Override // Y0.AbstractC0107a
    public final void U(Throwable th, boolean z2) {
        if (this.f1333h.f(th, false) || z2) {
            return;
        }
        AbstractC0127v.d(this.f1195g, th);
    }

    @Override // Y0.AbstractC0107a
    public final void V(Object obj) {
        this.f1333h.f(null, false);
    }

    public final void X(P p2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b bVar = this.f1333h;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f1299o;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, p2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(bVar);
            B.m mVar = d.f1319q;
            if (obj != mVar) {
                if (obj == d.f1320r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            B.m mVar2 = d.f1320r;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, mVar, mVar2)) {
                if (atomicReferenceFieldUpdater.get(bVar) != mVar) {
                    break;
                }
            }
            p2.i(bVar.m());
            return;
        }
    }

    @Override // Y0.Z, Y0.P
    public final void a(CancellationException cancellationException) {
        Object E2 = E();
        if (E2 instanceof C0120n) {
            return;
        }
        if ((E2 instanceof X) && ((X) E2).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Q(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // a1.r
    public final Object g(Object obj) {
        return this.f1333h.g(obj);
    }

    @Override // a1.r
    public final Object l(H0.d dVar, Object obj) {
        return this.f1333h.l(dVar, obj);
    }

    @Override // Y0.Z
    public final void t(CancellationException cancellationException) {
        this.f1333h.f(cancellationException, true);
        s(cancellationException);
    }
}
