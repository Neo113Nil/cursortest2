package m1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k1.y0;
import p1.u;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class k extends u {

    /* renamed from: e, reason: collision with root package name */
    public final c f877e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f878f;

    public k(long j2, k kVar, c cVar, int i2) {
        super(j2, kVar, i2);
        this.f877e = cVar;
        this.f878f = new AtomicReferenceArray(e.f855b * 2);
    }

    @Override // p1.u
    public final int f() {
        return e.f855b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // p1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, v0.h hVar) {
        int i3 = e.f855b;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        this.f878f.get(i2 * 2);
        while (true) {
            Object k2 = k(i2);
            boolean z3 = k2 instanceof y0;
            c cVar = this.f877e;
            if (z3 || (k2 instanceof s)) {
                if (j(i2, k2, z2 ? e.f863j : e.f864k)) {
                    m(i2, null);
                    l(i2, !z2);
                    if (z2) {
                        cVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == e.f863j || k2 == e.f864k) {
                    break;
                }
                if (k2 != e.f860g && k2 != e.f859f) {
                    if (k2 == e.f862i || k2 == e.f857d || k2 == e.f865l) {
                        return;
                    }
                    f0.l.f("unexpected state: ", k2);
                    return;
                }
            }
        }
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i3 = (i2 * 2) + 1;
        do {
            atomicReferenceArray = this.f878f;
            if (atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i3) == obj);
        return false;
    }

    public final Object k(int i2) {
        return this.f878f.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        if (z2) {
            c cVar = this.f877e;
            cVar.getClass();
            long j4 = (this.f1075c * e.f855b) + i2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f846f;
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = c.f845e;
            if (!cVar.r()) {
                while (atomicLongFieldUpdater3.get(cVar) <= j4) {
                }
                int i3 = e.f856c;
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        long j5 = atomicLongFieldUpdater3.get(cVar);
                        if (j5 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j5 == atomicLongFieldUpdater3.get(cVar)) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        do {
                            j2 = atomicLongFieldUpdater2.get(cVar);
                        } while (!atomicLongFieldUpdater2.compareAndSet(cVar, j2, (j2 & 4611686018427387903L) + 4611686018427387904L));
                        while (true) {
                            long j6 = atomicLongFieldUpdater3.get(cVar);
                            atomicLongFieldUpdater = c.f846f;
                            long j7 = atomicLongFieldUpdater.get(cVar);
                            long j8 = j7 & 4611686018427387903L;
                            boolean z3 = (j7 & 4611686018427387904L) != 0;
                            if (j6 == j8 && j6 == atomicLongFieldUpdater3.get(cVar)) {
                                break;
                            } else if (!z3) {
                                atomicLongFieldUpdater.compareAndSet(cVar, j7, 4611686018427387904L + j8);
                            }
                        }
                        do {
                            j3 = atomicLongFieldUpdater.get(cVar);
                        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j3, j3 & 4611686018427387903L));
                    }
                }
            }
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f878f.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, Object obj) {
        this.f878f.set((i2 * 2) + 1, obj);
    }
}
