package a1;

import Y0.AbstractC0127v;
import Y0.l0;
import d1.AbstractC0184a;
import d1.v;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends v {

    /* renamed from: i, reason: collision with root package name */
    public final b f1327i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceArray f1328j;

    public j(long j2, j jVar, b bVar, int i2) {
        super(j2, jVar, i2);
        this.f1327i = bVar;
        this.f1328j = new AtomicReferenceArray(d.f1304b * 2);
    }

    @Override // d1.v
    public final int f() {
        return d.f1304b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0060, code lost:
    
        Q0.h.b(r4);
        r7 = r4.f1301f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0067, code lost:
    
        r7 = d1.AbstractC0184a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006d, code lost:
    
        Y0.AbstractC0127v.d(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    @Override // d1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, H0.i iVar) {
        F0.b a2;
        int i3 = d.f1304b;
        boolean z2 = i2 >= i3;
        if (z2) {
            i2 -= i3;
        }
        Object obj = this.f1328j.get(i2 * 2);
        while (true) {
            Object k2 = k(i2);
            boolean z3 = k2 instanceof l0;
            b bVar = this.f1327i;
            if (z3 || (k2 instanceof s)) {
                if (j(i2, k2, z2 ? d.f1312j : d.f1313k)) {
                    m(i2, null);
                    l(i2, !z2);
                    if (z2) {
                        Q0.h.b(bVar);
                        P0.l lVar = bVar.f1301f;
                        if (lVar == null || (a2 = AbstractC0184a.a(lVar, obj, null)) == null) {
                            return;
                        }
                        AbstractC0127v.d(iVar, a2);
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == d.f1312j || k2 == d.f1313k) {
                    break;
                }
                if (k2 != d.f1309g && k2 != d.f1308f) {
                    if (k2 == d.f1311i || k2 == d.f1306d || k2 == d.f1314l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k2).toString());
                }
            }
        }
    }

    public final boolean j(int i2, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f1328j;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f1328j.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        if (z2) {
            b bVar = this.f1327i;
            Q0.h.b(bVar);
            bVar.C((this.f2107g * d.f1304b) + i2);
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f1328j.lazySet(i2 * 2, obj);
    }

    public final void n(int i2, B.m mVar) {
        this.f1328j.set((i2 * 2) + 1, mVar);
    }
}
