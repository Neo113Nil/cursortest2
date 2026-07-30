package O0;

import D.M;
import M0.AbstractC0043a;
import M0.AbstractC0063v;
import M0.C0056n;
import M0.Q;
import M0.X;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class o extends AbstractC0043a implements p, f {

    /* renamed from: h, reason: collision with root package name */
    public final b f749h;

    public o(w0.i iVar, b bVar) {
        super(iVar, true);
        this.f749h = bVar;
    }

    @Override // M0.AbstractC0043a
    public final void S(Throwable th, boolean z2) {
        if (this.f749h.g(th, false) || z2) {
            return;
        }
        AbstractC0063v.d(th, this.f652g);
    }

    @Override // M0.AbstractC0043a
    public final void T(Object obj) {
        this.f749h.g(null, false);
    }

    public final void V(M m2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b bVar = this.f749h;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f716o;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, m2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(bVar);
            A.j jVar = d.f736q;
            if (obj != jVar) {
                if (obj == d.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            A.j jVar2 = d.r;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, jVar, jVar2)) {
                if (atomicReferenceFieldUpdater.get(bVar) != jVar) {
                    break;
                }
            }
            m2.i(bVar.m());
            return;
        }
    }

    @Override // M0.Z, M0.P
    public final void a(CancellationException cancellationException) {
        Object C2 = C();
        if (C2 instanceof C0056n) {
            return;
        }
        if ((C2 instanceof X) && ((X) C2).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Q(t(), null, this);
        }
        r(cancellationException);
    }

    @Override // O0.r
    public final Object d(Object obj, w0.d dVar) {
        return this.f749h.d(obj, dVar);
    }

    @Override // O0.r
    public final Object l(Object obj) {
        return this.f749h.l(obj);
    }

    @Override // M0.Z
    public final void r(CancellationException cancellationException) {
        this.f749h.g(cancellationException, true);
        q(cancellationException);
    }
}
