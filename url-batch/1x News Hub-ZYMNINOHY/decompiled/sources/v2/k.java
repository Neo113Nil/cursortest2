package v2;

import java.util.concurrent.atomic.AtomicReferenceArray;
import n0.C1148j;
import t2.p0;
import y2.t;

/* loaded from: classes.dex */
public final class k extends t {

    /* renamed from: e, reason: collision with root package name */
    public final c f10610e;
    public final /* synthetic */ AtomicReferenceArray f;

    public k(long j3, k kVar, c cVar, int i3) {
        super(j3, kVar, i3);
        this.f10610e = cVar;
        this.f = new AtomicReferenceArray(e.f10589b * 2);
    }

    @Override // y2.t
    public final int f() {
        return e.f10589b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.j.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // y2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i3, d2.h hVar) {
        int i4 = e.f10589b;
        boolean z = i3 >= i4;
        if (z) {
            i3 -= i4;
        }
        this.f.get(i3 * 2);
        while (true) {
            Object k3 = k(i3);
            boolean z2 = k3 instanceof p0;
            c cVar = this.f10610e;
            if (z2 || (k3 instanceof s)) {
                if (j(k3, i3, z ? e.f10596j : e.f10597k)) {
                    m(i3, null);
                    l(i3, !z);
                    if (z) {
                        kotlin.jvm.internal.j.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k3 == e.f10596j || k3 == e.f10597k) {
                    break;
                }
                if (k3 != e.f10593g && k3 != e.f) {
                    if (k3 == e.f10595i || k3 == e.f10591d || k3 == e.f10598l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k3).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i3, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int i4 = (i3 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i3) {
        return this.f.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z) {
        if (z) {
            c cVar = this.f10610e;
            kotlin.jvm.internal.j.b(cVar);
            cVar.C((this.f10866c * e.f10589b) + i3);
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.f.set(i3 * 2, obj);
    }

    public final void n(int i3, C1148j c1148j) {
        this.f.set((i3 * 2) + 1, c1148j);
    }
}
