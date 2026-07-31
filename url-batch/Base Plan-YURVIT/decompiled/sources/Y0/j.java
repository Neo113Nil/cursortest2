package Y0;

import W0.l0;
import b1.v;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends v {

    /* renamed from: i, reason: collision with root package name */
    public final b f1043i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceArray f1044j;

    public j(long j2, j jVar, b bVar, int i2) {
        super(j2, jVar, i2);
        this.f1043i = bVar;
        this.f1044j = new AtomicReferenceArray(d.f1020b * 2);
    }

    @Override // b1.v
    public final int f() {
        return d.f1020b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        P0.h.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // b1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, G0.i iVar) {
        int i3 = d.f1020b;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        this.f1044j.get(i2 * 2);
        while (true) {
            Object k2 = k(i2);
            boolean z3 = k2 instanceof l0;
            b bVar = this.f1043i;
            if (z3 || (k2 instanceof s)) {
                if (j(i2, k2, z2 ? d.f1028j : d.f1029k)) {
                    m(i2, null);
                    l(i2, !z2);
                    if (z2) {
                        P0.h.b(bVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == d.f1028j || k2 == d.f1029k) {
                    break;
                }
                if (k2 != d.f1025g && k2 != d.f1024f) {
                    if (k2 == d.f1027i || k2 == d.f1022d || k2 == d.f1030l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k2).toString());
                }
            }
        }
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i3 = (i2 * 2) + 1;
        do {
            atomicReferenceArray = this.f1044j;
            if (atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i3) == obj);
        return false;
    }

    public final Object k(int i2) {
        return this.f1044j.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        if (z2) {
            b bVar = this.f1043i;
            P0.h.b(bVar);
            bVar.C((this.f1777g * d.f1020b) + i2);
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f1044j.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, Object obj) {
        this.f1044j.set((i2 * 2) + 1, obj);
    }
}
