package m0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k0.d0;
import p0.AbstractC0084a;
import p0.v;

/* loaded from: classes.dex */
public final class k extends v {

    /* renamed from: e, reason: collision with root package name */
    public final c f1068e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f1069f;

    public k(long j2, k kVar, c cVar, int i2) {
        super(j2, kVar, i2);
        this.f1068e = cVar;
        this.f1069f = new AtomicReferenceArray(e.f1045b * 2);
    }

    @Override // p0.v
    public final int f() {
        return e.f1045b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        e0.h.b(r4);
        r7 = r4.f1042c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0067, code lost:
    
        p0.AbstractC0084a.a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // p0.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, W.i iVar) {
        int i3 = e.f1045b;
        boolean z = i2 >= i3;
        if (z) {
            i2 -= i3;
        }
        Object obj = this.f1069f.get(i2 * 2);
        while (true) {
            Object k2 = k(i2);
            boolean z2 = k2 instanceof d0;
            c cVar = this.f1068e;
            if (z2 || (k2 instanceof u)) {
                if (j(i2, k2, z ? e.f1053j : e.f1054k)) {
                    m(i2, null);
                    l(i2, !z);
                    if (z) {
                        e0.h.b(cVar);
                        d0.l lVar = cVar.f1042c;
                        if (lVar != null) {
                            AbstractC0084a.a(lVar, obj, iVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == e.f1053j || k2 == e.f1054k) {
                    break;
                }
                if (k2 != e.f1050g && k2 != e.f1049f) {
                    if (k2 == e.f1052i || k2 == e.f1047d || k2 == e.f1055l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k2).toString());
                }
            }
        }
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f1069f;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f1069f.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        long j3;
        if (z) {
            c cVar = this.f1068e;
            e0.h.b(cVar);
            long j4 = (this.f1179c * e.f1045b) + i2;
            if (!cVar.r()) {
                do {
                    atomicLongFieldUpdater = c.f1034f;
                } while (atomicLongFieldUpdater.get(cVar) <= j4);
                int i3 = e.f1046c;
                int i4 = 0;
                while (true) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = c.f1035g;
                    if (i4 < i3) {
                        long j5 = atomicLongFieldUpdater.get(cVar);
                        if (j5 == (atomicLongFieldUpdater3.get(cVar) & 4611686018427387903L) && j5 == atomicLongFieldUpdater.get(cVar)) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        do {
                            j2 = atomicLongFieldUpdater3.get(cVar);
                        } while (!atomicLongFieldUpdater3.compareAndSet(cVar, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
                        while (true) {
                            long j6 = atomicLongFieldUpdater.get(cVar);
                            atomicLongFieldUpdater2 = c.f1035g;
                            long j7 = atomicLongFieldUpdater2.get(cVar);
                            long j8 = j7 & 4611686018427387903L;
                            boolean z2 = (j7 & 4611686018427387904L) != 0;
                            if (j6 == j8 && j6 == atomicLongFieldUpdater.get(cVar)) {
                                break;
                            } else if (!z2) {
                                atomicLongFieldUpdater2.compareAndSet(cVar, j7, j8 + 4611686018427387904L);
                            }
                        }
                        do {
                            j3 = atomicLongFieldUpdater2.get(cVar);
                        } while (!atomicLongFieldUpdater2.compareAndSet(cVar, j3, j3 & 4611686018427387903L));
                    }
                }
            }
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f1069f.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, io.flutter.plugin.editing.a aVar) {
        this.f1069f.set((i2 * 2) + 1, aVar);
    }
}
