package J5;

import H5.AbstractC0141a;
import H5.AbstractC0165z;
import H5.C0156p;
import H5.Y;
import H5.e0;
import M5.v;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class p extends AbstractC0141a implements q, f {

    /* renamed from: i, reason: collision with root package name */
    public final b f1338i;

    public p(InterfaceC0569i interfaceC0569i, b bVar) {
        super(interfaceC0569i, true);
        this.f1338i = bVar;
    }

    @Override // H5.AbstractC0141a
    public final void T(Throwable th, boolean z5) {
        if (this.f1338i.i(th, false) || z5) {
            return;
        }
        AbstractC0165z.i(this.f1053h, th);
    }

    @Override // H5.AbstractC0141a
    public final void U(Object obj) {
        this.f1338i.i(null, false);
    }

    public final void W(o oVar) {
        b bVar = this.f1338i;
        bVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f1302o;
        while (!atomicReferenceFieldUpdater.compareAndSet(bVar, null, oVar)) {
            if (atomicReferenceFieldUpdater.get(bVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(bVar);
                    v vVar = d.f1321q;
                    if (obj != vVar) {
                        if (obj == d.f1322r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    v vVar2 = d.f1322r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, vVar, vVar2)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != vVar) {
                            break;
                        }
                    }
                    oVar.invoke(bVar.n());
                    return;
                }
            }
        }
    }

    @Override // J5.s
    public final Object b(Object obj, AbstractC0607c abstractC0607c) {
        return this.f1338i.b(obj, abstractC0607c);
    }

    @Override // J5.r
    public final Object c(InterfaceC0564d interfaceC0564d) {
        return this.f1338i.c(interfaceC0564d);
    }

    @Override // H5.g0, H5.X
    public final void d(CancellationException cancellationException) {
        Object C6 = C();
        if (C6 instanceof C0156p) {
            return;
        }
        if ((C6 instanceof e0) && ((e0) C6).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Y(q(), null, this);
        }
        o(cancellationException);
    }

    @Override // J5.s
    public final Object g(Object obj) {
        return this.f1338i.g(obj);
    }

    @Override // H5.g0
    public final void o(CancellationException cancellationException) {
        this.f1338i.i(cancellationException, true);
        n(cancellationException);
    }
}
