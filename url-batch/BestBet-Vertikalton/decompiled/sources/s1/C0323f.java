package s1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: s1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323f extends O {

    /* renamed from: e, reason: collision with root package name */
    public final C0321d f4043e;

    public C0323f(C0321d c0321d) {
        this.f4043e = c0321d;
    }

    @Override // j1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return X0.g.f1277c;
    }

    @Override // s1.P
    public final void o(Throwable th) {
        U n2 = n();
        C0321d c0321d = this.f4043e;
        c0321d.getClass();
        CancellationException u2 = n2.u();
        if (c0321d.n()) {
            b1.d dVar = c0321d.d;
            k1.e.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            w1.f fVar = (w1.f) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.f.h;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                U.q qVar = w1.a.f4490c;
                if (!k1.e.a(obj, qVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, qVar, u2)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != qVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0321d.k(u2);
        if (c0321d.n()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0321d.h;
        InterfaceC0342z interfaceC0342z = (InterfaceC0342z) atomicReferenceFieldUpdater2.get(c0321d);
        if (interfaceC0342z == null) {
            return;
        }
        interfaceC0342z.e();
        atomicReferenceFieldUpdater2.set(c0321d, W.f4032a);
    }
}
