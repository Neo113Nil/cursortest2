package W0;

import b1.AbstractC0115a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: W0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068h extends S {

    /* renamed from: i, reason: collision with root package name */
    public final C0066f f953i;

    public C0068h(C0066f c0066f) {
        this.f953i = c0066f;
    }

    @Override // O0.l
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        p((Throwable) obj);
        return D0.h.f206a;
    }

    @Override // W0.U
    public final void p(Throwable th) {
        Z o2 = o();
        C0066f c0066f = this.f953i;
        Throwable s2 = c0066f.s(o2);
        if (c0066f.x()) {
            G0.d dVar = c0066f.f950h;
            P0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            b1.h hVar = (b1.h) dVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1.h.f1748l;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                B0.E e2 = AbstractC0115a.f1738d;
                if (!P0.h.a(obj, e2)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, e2, s2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != e2) {
                        break;
                    }
                }
                return;
            }
        }
        c0066f.p(s2);
        if (c0066f.x()) {
            return;
        }
        c0066f.q();
    }
}
