package k1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class f extends k0 {

    /* renamed from: f, reason: collision with root package name */
    public final d f678f;

    public f(d dVar) {
        this.f678f = dVar;
    }

    @Override // c1.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return t0.g.f1178a;
    }

    @Override // k1.m0
    public final void o(Throwable th) {
        CancellationException u = n().u();
        d dVar = this.f678f;
        if (dVar.s()) {
            v0.d dVar2 = dVar.f674e;
            dVar2.getClass();
            p1.h hVar = (p1.h) dVar2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p1.h.f1046i;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                o0.a aVar = p1.a.f1036d;
                if (!d1.h.a(obj, aVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, u)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                        break;
                    }
                }
                return;
            }
        }
        dVar.m(u);
        if (dVar.s()) {
            return;
        }
        dVar.n();
    }
}
