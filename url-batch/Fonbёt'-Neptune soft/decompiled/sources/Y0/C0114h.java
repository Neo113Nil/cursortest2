package Y0;

import d1.AbstractC0184a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Y0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114h extends S {

    /* renamed from: i, reason: collision with root package name */
    public final C0112f f1207i;

    public C0114h(C0112f c0112f) {
        this.f1207i = c0112f;
    }

    @Override // P0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return F0.h.f469a;
    }

    @Override // Y0.U
    public final void o(Throwable th) {
        Z n2 = n();
        C0112f c0112f = this.f1207i;
        Throwable t2 = c0112f.t(n2);
        if (c0112f.y()) {
            H0.d dVar = c0112f.f1204h;
            Q0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            d1.h hVar = (d1.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d1.h.f2075l;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                B.m mVar = AbstractC0184a.f2065d;
                if (!Q0.h.a(obj, mVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, mVar, t2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != mVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0112f.q(t2);
        if (c0112f.y()) {
            return;
        }
        c0112f.r();
    }
}
