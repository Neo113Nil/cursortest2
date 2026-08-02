package z3;

import C3.v;
import f3.InterfaceC0430h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x3.AbstractC1541a;
import x3.AbstractC1562w;
import x3.C1554n;
import x3.U;
import x3.b0;

/* loaded from: classes.dex */
public final class o extends AbstractC1541a implements p, g {

    /* renamed from: d, reason: collision with root package name */
    public final c f16336d;

    public o(InterfaceC0430h interfaceC0430h, c cVar) {
        super(interfaceC0430h, true);
        this.f16336d = cVar;
    }

    @Override // x3.AbstractC1541a
    public final void Q(Throwable th, boolean z) {
        if (this.f16336d.g(th, false) || z) {
            return;
        }
        AbstractC1562w.e(this.f16012c, th);
    }

    @Override // x3.AbstractC1541a
    public final void R(Object obj) {
        this.f16336d.g(null, false);
    }

    public final void T(F3.g gVar) {
        c cVar = this.f16336d;
        cVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f16305j;
        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, gVar)) {
            if (atomicReferenceFieldUpdater.get(cVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(cVar);
                    v vVar = e.f16322q;
                    if (obj != vVar) {
                        if (obj == e.f16323r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    v vVar2 = e.f16323r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, vVar, vVar2)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != vVar) {
                            break;
                        }
                    }
                    gVar.invoke(cVar.m());
                    return;
                }
            }
        }
    }

    @Override // x3.d0, x3.T
    public final void b(CancellationException cancellationException) {
        Object A4 = A();
        if (A4 instanceof C1554n) {
            return;
        }
        if ((A4 instanceof b0) && ((b0) A4).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new U(r(), null, this);
        }
        p(cancellationException);
    }

    @Override // z3.r
    public final Object d(h3.c cVar, Object obj) {
        return this.f16336d.d(cVar, obj);
    }

    @Override // z3.r
    public final Object h(Object obj) {
        return this.f16336d.h(obj);
    }

    @Override // x3.d0
    public final void p(CancellationException cancellationException) {
        this.f16336d.g(cancellationException, true);
        o(cancellationException);
    }
}
