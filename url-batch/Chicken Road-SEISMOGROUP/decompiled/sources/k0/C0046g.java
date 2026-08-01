package k0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p0.AbstractC0084a;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046g extends M {

    /* renamed from: f, reason: collision with root package name */
    public final C0044e f918f;

    public C0046g(C0044e c0044e) {
        this.f918f = c0044e;
    }

    @Override // d0.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return U.g.f433a;
    }

    @Override // k0.O
    public final void o(Throwable th) {
        T n2 = n();
        C0044e c0044e = this.f918f;
        c0044e.getClass();
        CancellationException v2 = n2.v();
        if (c0044e.s()) {
            W.d dVar = c0044e.f915e;
            e0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            p0.h hVar = (p0.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.h.f1147i;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                io.flutter.plugin.editing.a aVar = AbstractC0084a.f1137d;
                if (!e0.h.a(obj, aVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, v2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0044e.m(v2);
        if (c0044e.s()) {
            return;
        }
        c0044e.n();
    }
}
