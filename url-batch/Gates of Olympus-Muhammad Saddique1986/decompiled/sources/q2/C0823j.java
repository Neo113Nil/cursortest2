package q2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: q2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823j extends b0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7907h;

    /* renamed from: i, reason: collision with root package name */
    public final C0821h f7908i;

    public /* synthetic */ C0823j(C0821h c0821h, int i3) {
        this.f7907h = i3;
        this.f7908i = c0821h;
    }

    @Override // q2.b0
    public final boolean k() {
        switch (this.f7907h) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // q2.b0
    public final void l(Throwable th) {
        switch (this.f7907h) {
            case 0:
                f0 j3 = j();
                C0821h c0821h = this.f7908i;
                Throwable p3 = c0821h.p(j3);
                if (c0821h.x()) {
                    v2.f fVar = (v2.f) c0821h.f7903g;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v2.f.f9794k;
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        m1.q qVar = v2.a.f9784c;
                        if (f2.j.a(obj, qVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, qVar, p3)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != qVar) {
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
                c0821h.C(p3);
                if (!c0821h.x()) {
                    c0821h.n();
                    break;
                }
                break;
            default:
                this.f7908i.u(R1.y.f4171a);
                break;
        }
    }
}
