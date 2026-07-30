package Q7;

import O7.y0;
import T7.t;
import T7.v;
import java.util.concurrent.atomic.AtomicReferenceArray;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class k extends t {

    /* renamed from: x, reason: collision with root package name */
    public final c f2772x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f2773y;

    public k(long j9, k kVar, c cVar, int i) {
        super(j9, kVar, i);
        this.f2772x = cVar;
        this.f2773y = new AtomicReferenceArray(e.f2750b * 2);
    }

    @Override // T7.t
    public final int f() {
        return e.f2750b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.h.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // T7.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, InterfaceC5138i interfaceC5138i) {
        int i4 = e.f2750b;
        boolean z8 = i >= i4;
        if (z8) {
            i -= i4;
        }
        this.f2773y.get(i * 2);
        while (true) {
            Object k6 = k(i);
            boolean z9 = k6 instanceof y0;
            c cVar = this.f2772x;
            if (z9 || (k6 instanceof s)) {
                if (j(i, k6, z8 ? e.f2757j : e.f2758k)) {
                    m(i, null);
                    l(i, !z8);
                    if (z8) {
                        kotlin.jvm.internal.h.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k6 == e.f2757j || k6 == e.f2758k) {
                    break;
                }
                if (k6 != e.f2755g && k6 != e.f2754f) {
                    if (k6 == e.i || k6 == e.f2752d || k6 == e.f2759l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k6).toString());
                }
            }
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f2773y;
        int i4 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i) {
        return this.f2773y.get((i * 2) + 1);
    }

    public final void l(int i, boolean z8) {
        if (z8) {
            c cVar = this.f2772x;
            kotlin.jvm.internal.h.b(cVar);
            cVar.D((this.f3166v * e.f2750b) + i);
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f2773y.set(i * 2, obj);
    }

    public final void n(int i, v vVar) {
        this.f2773y.set((i * 2) + 1, vVar);
    }
}
