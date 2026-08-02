package z3;

import C3.t;
import f3.InterfaceC0430h;
import java.util.concurrent.atomic.AtomicReferenceArray;
import x3.p0;

/* loaded from: classes.dex */
public final class k extends t {

    /* renamed from: e, reason: collision with root package name */
    public final c f16330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f16331f;

    public k(long j4, k kVar, c cVar, int i4) {
        super(j4, kVar, i4);
        this.f16330e = cVar;
        this.f16331f = new AtomicReferenceArray(e.f16309b * 2);
    }

    @Override // C3.t
    public final int f() {
        return e.f16309b;
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
    @Override // C3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i4, InterfaceC0430h interfaceC0430h) {
        int i5 = e.f16309b;
        boolean z = i4 >= i5;
        if (z) {
            i4 -= i5;
        }
        this.f16331f.get(i4 * 2);
        while (true) {
            Object k4 = k(i4);
            boolean z4 = k4 instanceof p0;
            c cVar = this.f16330e;
            if (z4 || (k4 instanceof s)) {
                if (j(k4, i4, z ? e.f16317j : e.f16318k)) {
                    m(i4, null);
                    l(i4, !z);
                    if (z) {
                        kotlin.jvm.internal.i.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k4 == e.f16317j || k4 == e.f16318k) {
                    break;
                }
                if (k4 != e.f16314g && k4 != e.f16313f) {
                    if (k4 == e.f16316i || k4 == e.f16311d || k4 == e.f16319l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k4).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i4, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i5 = (i4 * 2) + 1;
        do {
            atomicReferenceArray = this.f16331f;
            if (atomicReferenceArray.compareAndSet(i5, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i5) == obj);
        return false;
    }

    public final Object k(int i4) {
        return this.f16331f.get((i4 * 2) + 1);
    }

    public final void l(int i4, boolean z) {
        if (z) {
            c cVar = this.f16330e;
            kotlin.jvm.internal.i.b(cVar);
            cVar.C((this.f318c * e.f16309b) + i4);
        }
        h();
    }

    public final void m(int i4, Object obj) {
        this.f16331f.set(i4 * 2, obj);
    }

    public final void n(int i4, Object obj) {
        this.f16331f.set((i4 * 2) + 1, obj);
    }
}
