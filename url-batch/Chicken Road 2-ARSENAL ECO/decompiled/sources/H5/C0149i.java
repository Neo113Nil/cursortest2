package H5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o5.InterfaceC0564d;

/* renamed from: H5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149i extends Z {

    /* renamed from: j, reason: collision with root package name */
    public final C0147g f1084j;

    public C0149i(C0147g c0147g) {
        this.f1084j = c0147g;
    }

    @Override // x5.InterfaceC0743l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return k5.v.f5219a;
    }

    @Override // H5.b0
    public final void k(Throwable th) {
        g0 j4 = j();
        C0147g c0147g = this.f1084j;
        Throwable p4 = c0147g.p(j4);
        if (c0147g.v()) {
            InterfaceC0564d interfaceC0564d = c0147g.f1078i;
            kotlin.jvm.internal.i.c(interfaceC0564d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            M5.h hVar = (M5.h) interfaceC0564d;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M5.h.f1595m;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                M5.v vVar = M5.a.f1585d;
                if (!kotlin.jvm.internal.i.a(obj, vVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, p4)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0147g.m(p4);
        if (c0147g.v()) {
            return;
        }
        c0147g.n();
    }
}
