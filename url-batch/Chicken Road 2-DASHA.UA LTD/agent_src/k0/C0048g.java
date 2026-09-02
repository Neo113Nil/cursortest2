package k0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p0.AbstractC0090a;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048g extends M {

    /* renamed from: f, reason: collision with root package name */
    public final C0046e f865f;

    public C0048g(C0046e c0046e) {
        this.f865f = c0046e;
    }

    @Override // d0.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return U.g.f378a;
    }

    @Override // k0.O
    public final void o(Throwable th) {
        T n2 = n();
        C0046e c0046e = this.f865f;
        c0046e.getClass();
        CancellationException v2 = n2.v();
        if (c0046e.s()) {
            W.d dVar = c0046e.f862e;
            e0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            p0.h hVar = (p0.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.h.f1139i;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                io.flutter.plugin.platform.c cVar = AbstractC0090a.f1129d;
                if (!e0.h.a(obj, cVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, v2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != cVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0046e.m(v2);
        if (c0046e.s()) {
            return;
        }
        c0046e.n();
    }
}
