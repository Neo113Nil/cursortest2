package t1;

import V.q;
import i1.InterfaceC0192l;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import r1.h0;
import w1.t;

/* loaded from: classes.dex */
public final class j extends t {
    public final b e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f4202f;

    public j(long j, j jVar, b bVar, int i) {
        super(j, jVar, i);
        this.e = bVar;
        this.f4202f = new AtomicReferenceArray(d.f4182b * 2);
    }

    @Override // w1.t
    public final int f() {
        return d.f4182b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        j1.h.b(r4);
        r7 = r4.f4180c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0067, code lost:
    
        w1.a.a(r7, r0, r8);
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
    @Override // w1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, a1.i iVar) {
        int i2 = d.f4182b;
        boolean z2 = i >= i2;
        if (z2) {
            i -= i2;
        }
        Object obj = this.f4202f.get(i * 2);
        while (true) {
            Object k2 = k(i);
            boolean z3 = k2 instanceof h0;
            b bVar = this.e;
            if (z3 || (k2 instanceof p)) {
                if (j(k2, i, z2 ? d.j : d.f4188k)) {
                    m(i, null);
                    l(i, !z2);
                    if (z2) {
                        j1.h.b(bVar);
                        InterfaceC0192l interfaceC0192l = bVar.f4180c;
                        if (interfaceC0192l != null) {
                            w1.a.a(interfaceC0192l, obj, iVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == d.j || k2 == d.f4188k) {
                    break;
                }
                if (k2 != d.f4186g && k2 != d.f4185f) {
                    if (k2 == d.i || k2 == d.f4184d || k2 == d.f4189l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k2).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f4202f;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i) {
        return this.f4202f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        long j2;
        if (z2) {
            b bVar = this.e;
            j1.h.b(bVar);
            long j3 = (this.f4500c * d.f4182b) + i;
            if (!bVar.r()) {
                do {
                    atomicLongFieldUpdater = b.f4174f;
                } while (atomicLongFieldUpdater.get(bVar) <= j3);
                int i2 = d.f4183c;
                int i3 = 0;
                while (true) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = b.f4175g;
                    if (i3 < i2) {
                        long j4 = atomicLongFieldUpdater.get(bVar);
                        if (j4 == (atomicLongFieldUpdater3.get(bVar) & 4611686018427387903L) && j4 == atomicLongFieldUpdater.get(bVar)) {
                            break;
                        } else {
                            i3++;
                        }
                    } else {
                        do {
                            j = atomicLongFieldUpdater3.get(bVar);
                        } while (!atomicLongFieldUpdater3.compareAndSet(bVar, j, 4611686018427387904L + (j & 4611686018427387903L)));
                        while (true) {
                            long j5 = atomicLongFieldUpdater.get(bVar);
                            atomicLongFieldUpdater2 = b.f4175g;
                            long j6 = atomicLongFieldUpdater2.get(bVar);
                            long j7 = j6 & 4611686018427387903L;
                            boolean z3 = (j6 & 4611686018427387904L) != 0;
                            if (j5 == j7 && j5 == atomicLongFieldUpdater.get(bVar)) {
                                break;
                            } else if (!z3) {
                                atomicLongFieldUpdater2.compareAndSet(bVar, j6, j7 + 4611686018427387904L);
                            }
                        }
                        do {
                            j2 = atomicLongFieldUpdater2.get(bVar);
                        } while (!atomicLongFieldUpdater2.compareAndSet(bVar, j2, j2 & 4611686018427387903L));
                    }
                }
            }
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f4202f.lazySet(i * 2, obj);
    }

    public final void n(int i, q qVar) {
        this.f4202f.set((i * 2) + 1, qVar);
    }
}
