package J5;

import H5.x0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class j extends M5.t {

    /* renamed from: j, reason: collision with root package name */
    public final b f1329j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceArray f1330k;

    public j(long j4, j jVar, b bVar, int i7) {
        super(j4, jVar, i7);
        this.f1329j = bVar;
        this.f1330k = new AtomicReferenceArray(d.f1306b * 2);
    }

    @Override // M5.t
    public final int f() {
        return d.f1306b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.i.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // M5.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i7, InterfaceC0569i interfaceC0569i) {
        int i8 = d.f1306b;
        boolean z5 = i7 >= i8;
        if (z5) {
            i7 -= i8;
        }
        this.f1330k.get(i7 * 2);
        while (true) {
            Object k4 = k(i7);
            boolean z6 = k4 instanceof x0;
            b bVar = this.f1329j;
            if (z6 || (k4 instanceof t)) {
                if (j(k4, i7, z5 ? d.f1314j : d.f1315k)) {
                    m(i7, null);
                    l(i7, !z5);
                    if (z5) {
                        kotlin.jvm.internal.i.b(bVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k4 == d.f1314j || k4 == d.f1315k) {
                    break;
                }
                if (k4 != d.f1311g && k4 != d.f1310f) {
                    if (k4 == d.f1313i || k4 == d.f1308d || k4 == d.f1316l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k4).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i7, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i8 = (i7 * 2) + 1;
        do {
            atomicReferenceArray = this.f1330k;
            if (atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i8) == obj);
        return false;
    }

    public final Object k(int i7) {
        return this.f1330k.get((i7 * 2) + 1);
    }

    public final void l(int i7, boolean z5) {
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        if (z5) {
            b bVar = this.f1329j;
            kotlin.jvm.internal.i.b(bVar);
            long j8 = (this.f1622h * d.f1306b) + i7;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f1297j;
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = b.f1296i;
            if (!bVar.v()) {
                while (atomicLongFieldUpdater3.get(bVar) <= j8) {
                }
                int i8 = d.f1307c;
                int i9 = 0;
                while (true) {
                    if (i9 < i8) {
                        long j9 = atomicLongFieldUpdater3.get(bVar);
                        if (j9 == (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) && j9 == atomicLongFieldUpdater3.get(bVar)) {
                            break;
                        } else {
                            i9++;
                        }
                    } else {
                        do {
                            j4 = atomicLongFieldUpdater2.get(bVar);
                        } while (!atomicLongFieldUpdater2.compareAndSet(bVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L));
                        while (true) {
                            long j10 = atomicLongFieldUpdater3.get(bVar);
                            atomicLongFieldUpdater = b.f1297j;
                            long j11 = atomicLongFieldUpdater.get(bVar);
                            long j12 = j11 & 4611686018427387903L;
                            boolean z6 = (j11 & 4611686018427387904L) != 0;
                            if (j10 == j12 && j10 == atomicLongFieldUpdater3.get(bVar)) {
                                break;
                            } else if (!z6) {
                                atomicLongFieldUpdater.compareAndSet(bVar, j11, 4611686018427387904L + j12);
                            }
                        }
                        do {
                            j7 = atomicLongFieldUpdater.get(bVar);
                        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j7, j7 & 4611686018427387903L));
                    }
                }
            }
        }
        h();
    }

    public final void m(int i7, Object obj) {
        this.f1330k.lazySet(i7 * 2, obj);
    }

    public final void n(int i7, Object obj) {
        this.f1330k.set((i7 * 2) + 1, obj);
    }
}
