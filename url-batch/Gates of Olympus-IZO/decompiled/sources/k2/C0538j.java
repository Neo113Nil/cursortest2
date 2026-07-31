package k2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: k2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538j extends b0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5368h;

    /* renamed from: i, reason: collision with root package name */
    public final C0536h f5369i;

    public /* synthetic */ C0538j(C0536h c0536h, int i3) {
        this.f5368h = i3;
        this.f5369i = c0536h;
    }

    @Override // k2.b0
    public final boolean k() {
        switch (this.f5368h) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // k2.b0
    public final void l(Throwable th) {
        switch (this.f5368h) {
            case 0:
                f0 j3 = j();
                C0536h c0536h = this.f5369i;
                Throwable o3 = c0536h.o(j3);
                if (c0536h.w()) {
                    p2.f fVar = (p2.f) c0536h.f5364g;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p2.f.f6773k;
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        j1.p pVar = p2.a.f6763c;
                        if (Z1.i.a(obj, pVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, pVar, o3)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != pVar) {
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
                c0536h.v(o3);
                if (!c0536h.w()) {
                    c0536h.l();
                    break;
                }
                break;
            default:
                this.f5369i.resumeWith(L1.z.f2729a);
                break;
        }
    }
}
