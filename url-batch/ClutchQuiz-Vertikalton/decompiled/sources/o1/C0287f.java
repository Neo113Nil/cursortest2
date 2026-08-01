package o1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287f extends O {

    /* renamed from: e, reason: collision with root package name */
    public final C0285d f3340e;

    public C0287f(C0285d c0285d) {
        this.f3340e = c0285d;
    }

    @Override // f1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return U0.i.f864a;
    }

    @Override // o1.P
    public final void o(Throwable th) {
        U n2 = n();
        C0285d c0285d = this.f3340e;
        c0285d.getClass();
        CancellationException s2 = n2.s();
        if (c0285d.n()) {
            X0.d dVar = c0285d.d;
            g1.f.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            s1.f fVar = (s1.f) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.f.h;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                T.r rVar = s1.a.f3641c;
                if (!g1.f.a(obj, rVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, rVar, s2)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != rVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0285d.k(s2);
        if (c0285d.n()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0285d.h;
        InterfaceC0306z interfaceC0306z = (InterfaceC0306z) atomicReferenceFieldUpdater2.get(c0285d);
        if (interfaceC0306z == null) {
            return;
        }
        interfaceC0306z.e();
        atomicReferenceFieldUpdater2.set(c0285d, W.f3329a);
    }
}
