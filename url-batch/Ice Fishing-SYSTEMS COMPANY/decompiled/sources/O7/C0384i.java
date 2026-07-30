package O7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v7.InterfaceC5133d;

/* renamed from: O7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0384i extends a0 {

    /* renamed from: x, reason: collision with root package name */
    public final C0382g f2608x;

    public C0384i(C0382g c0382g) {
        this.f2608x = c0382g;
    }

    @Override // O7.c0
    public final void i(Throwable th) {
        h0 h9 = h();
        C0382g c0382g = this.f2608x;
        Throwable p6 = c0382g.p(h9);
        if (c0382g.v()) {
            InterfaceC5133d interfaceC5133d = c0382g.f2599w;
            kotlin.jvm.internal.h.c(interfaceC5133d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            T7.h hVar = (T7.h) interfaceC5133d;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T7.h.f3139A;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                T7.v vVar = T7.a.f3129d;
                if (!kotlin.jvm.internal.h.a(obj, vVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, p6)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0382g.m(p6);
        if (c0382g.v()) {
            return;
        }
        c0382g.n();
    }

    @Override // E7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return q7.v.f40183a;
    }
}
