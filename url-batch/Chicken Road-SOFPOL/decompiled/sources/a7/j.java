package a7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends w0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f266h;
    public final h i;

    public /* synthetic */ j(h hVar, int i) {
        this.f266h = i;
        this.i = hVar;
    }

    @Override // a7.w0
    public final boolean k() {
        switch (this.f266h) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // a7.w0
    public final void l(Throwable th) {
        switch (this.f266h) {
            case 0:
                a1 j7 = j();
                h hVar = this.i;
                Throwable r7 = hVar.r(j7);
                if (hVar.x()) {
                    f7.f fVar = (f7.f) hVar.f260g;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7.f.f2772k;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        d4.t tVar = f7.a.f2762c;
                        if (q6.i.a(obj, tVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, r7)) {
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
                hVar.m(r7);
                if (!hVar.x()) {
                    hVar.p();
                    break;
                }
                break;
            default:
                this.i.k(c6.m.f1757a);
                break;
        }
    }
}
