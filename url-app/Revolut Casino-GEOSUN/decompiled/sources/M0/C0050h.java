package M0;

import R0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u0.C0247g;

/* renamed from: M0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050h extends S {

    /* renamed from: i, reason: collision with root package name */
    public final C0048f f664i;

    public C0050h(C0048f c0048f) {
        this.f664i = c0048f;
    }

    @Override // E0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return C0247g.f3005a;
    }

    @Override // M0.U
    public final void o(Throwable th) {
        Z n2 = n();
        C0048f c0048f = this.f664i;
        Throwable r = c0048f.r(n2);
        if (c0048f.w()) {
            w0.d dVar = c0048f.f661h;
            F0.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            R0.h hVar = (R0.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R0.h.f906l;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                A.j jVar = AbstractC0068a.f896d;
                if (!F0.i.a(obj, jVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, jVar, r)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != jVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0048f.o(r);
        if (c0048f.w()) {
            return;
        }
        c0048f.p();
    }
}
