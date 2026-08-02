package t2;

import d2.InterfaceC0300c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;

/* renamed from: t2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1198h extends W {

    /* renamed from: e, reason: collision with root package name */
    public final C1196f f10421e;

    public C1198h(C1196f c1196f) {
        this.f10421e = c1196f;
    }

    @Override // t2.Q
    public final void c(Throwable th) {
        e0 j3 = j();
        C1196f c1196f = this.f10421e;
        Throwable r3 = c1196f.r(j3);
        if (c1196f.w()) {
            InterfaceC0300c interfaceC0300c = c1196f.f10417d;
            kotlin.jvm.internal.j.c(interfaceC0300c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            y2.h hVar = (y2.h) interfaceC0300c;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y2.h.f10843h;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C1148j c1148j = y2.a.f10834d;
                if (!kotlin.jvm.internal.j.a(obj, c1148j)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, c1148j, r3)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != c1148j) {
                        break;
                    }
                }
                return;
            }
        }
        c1196f.o(r3);
        if (c1196f.w()) {
            return;
        }
        c1196f.p();
    }
}
