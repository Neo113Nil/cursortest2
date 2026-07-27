package D4;

import G0.C0051a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.InterfaceC1218d;

/* renamed from: D4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009i extends Z {

    /* renamed from: e, reason: collision with root package name */
    public final C0007g f517e;

    public C0009i(C0007g c0007g) {
        this.f517e = c0007g;
    }

    @Override // t4.InterfaceC1441l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return f4.v.f5689a;
    }

    @Override // D4.b0
    public final void k(Throwable th) {
        g0 j2 = j();
        C0007g c0007g = this.f517e;
        Throwable q5 = c0007g.q(j2);
        if (c0007g.w()) {
            InterfaceC1218d interfaceC1218d = c0007g.f511d;
            kotlin.jvm.internal.i.c(interfaceC1218d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            I4.h hVar = (I4.h) interfaceC1218d;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I4.h.f1293h;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C0051a c0051a = I4.a.f1283d;
                if (!kotlin.jvm.internal.i.a(obj, c0051a)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, c0051a, q5)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != c0051a) {
                        break;
                    }
                }
                return;
            }
        }
        c0007g.n(q5);
        if (c0007g.w()) {
            return;
        }
        c0007g.o();
    }
}
