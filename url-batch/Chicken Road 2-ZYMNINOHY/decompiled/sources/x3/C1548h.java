package x3;

import f3.InterfaceC0425c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: x3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1548h extends V {

    /* renamed from: e, reason: collision with root package name */
    public final C1546f f16038e;

    public C1548h(C1546f c1546f) {
        this.f16038e = c1546f;
    }

    @Override // x3.P
    public final void d(Throwable th) {
        d0 j4 = j();
        C1546f c1546f = this.f16038e;
        Throwable p2 = c1546f.p(j4);
        if (c1546f.u()) {
            InterfaceC0425c interfaceC0425c = c1546f.f16034d;
            kotlin.jvm.internal.i.c(interfaceC0425c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            C3.h hVar = (C3.h) interfaceC0425c;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3.h.f292h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C3.v vVar = C3.a.f282d;
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, p2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
                        break;
                    }
                }
                return;
            }
        }
        c1546f.m(p2);
        if (c1546f.u()) {
            return;
        }
        c1546f.n();
    }
}
