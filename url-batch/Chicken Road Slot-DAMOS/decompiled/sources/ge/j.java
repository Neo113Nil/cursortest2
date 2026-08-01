package ge;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends g1 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4366s;

    /* renamed from: t, reason: collision with root package name */
    public final h f4367t;

    public /* synthetic */ j(h hVar, int i3) {
        this.f4366s = i3;
        this.f4367t = hVar;
    }

    @Override // ge.g1
    public final boolean k() {
        switch (this.f4366s) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // ge.g1
    public final void l(Throwable th) {
        int i3 = this.f4366s;
        h hVar = this.f4367t;
        switch (i3) {
            case 0:
                Throwable q3 = hVar.q(j());
                if (hVar.w()) {
                    ld.a aVar = hVar.f4356r;
                    aVar.getClass();
                    le.g gVar = (le.g) aVar;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = le.g.f5972v;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(gVar);
                        a8.f fVar = le.b.f5966c;
                        if (Intrinsics.a(obj, fVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, q3)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != fVar) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                hVar.n(q3);
                if (!hVar.w()) {
                    hVar.o();
                    break;
                }
                break;
            default:
                hd.l lVar = hd.n.f4511e;
                hVar.resumeWith(Unit.f5554a);
                break;
        }
    }
}
