package n6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;
import s6.AbstractC0898a;

/* renamed from: n6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0777j extends b0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f7066m;

    /* renamed from: n, reason: collision with root package name */
    public final C0775h f7067n;

    public /* synthetic */ C0777j(C0775h c0775h, int i2) {
        this.f7066m = i2;
        this.f7067n = c0775h;
    }

    @Override // n6.b0
    public final boolean j() {
        switch (this.f7066m) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // n6.b0
    public final void k(Throwable th) {
        int i2 = this.f7066m;
        C0775h c0775h = this.f7067n;
        switch (i2) {
            case 0:
                Throwable q4 = c0775h.q(i());
                if (c0775h.w()) {
                    V5.b bVar = c0775h.f7062l;
                    Intrinsics.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
                    s6.f fVar = (s6.f) bVar;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s6.f.f7826p;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        C0654a c0654a = AbstractC0898a.f7820c;
                        if (Intrinsics.a(obj, c0654a)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, c0654a, q4)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != c0654a) {
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
                c0775h.n(q4);
                if (!c0775h.w()) {
                    c0775h.o();
                    break;
                }
                break;
            default:
                R5.l lVar = R5.n.f2421d;
                c0775h.resumeWith(Unit.f6114a);
                break;
        }
    }
}
