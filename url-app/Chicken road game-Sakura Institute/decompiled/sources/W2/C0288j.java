package W2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;

/* renamed from: W2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288j extends g0 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4273k;

    /* renamed from: l, reason: collision with root package name */
    public final C0286h f4274l;

    public /* synthetic */ C0288j(C0286h c0286h, int i2) {
        this.f4273k = i2;
        this.f4274l = c0286h;
    }

    @Override // W2.g0
    public final boolean k() {
        switch (this.f4273k) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // W2.g0
    public final void l(Throwable th) {
        C0286h c0286h = this.f4274l;
        switch (this.f4273k) {
            case 0:
                Throwable q2 = c0286h.q(j());
                if (c0286h.y()) {
                    C2.a aVar = c0286h.f4265j;
                    Intrinsics.d(aVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
                    b3.f fVar = (b3.f) aVar;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b3.f.f5654n;
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        b3.t tVar = b3.a.f5648c;
                        if (Intrinsics.a(obj, tVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, q2)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c0286h.H(q2);
                if (!c0286h.y()) {
                    c0286h.m();
                    break;
                }
                break;
            default:
                AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                c0286h.u(Unit.f7487a);
                break;
        }
    }
}
