package c7;

import a7.s1;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends f7.r {

    /* renamed from: e, reason: collision with root package name */
    public final c f1800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f1801f;

    public k(long j7, k kVar, c cVar, int i) {
        super(j7, kVar, i);
        this.f1800e = cVar;
        this.f1801f = new AtomicReferenceArray(e.f1778b * 2);
    }

    @Override // f7.r
    public final int f() {
        return e.f1778b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        q6.i.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // f7.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, g6.h hVar) {
        int i8 = e.f1778b;
        boolean z3 = i >= i8;
        if (z3) {
            i -= i8;
        }
        this.f1801f.get(i * 2);
        while (true) {
            Object k3 = k(i);
            boolean z7 = k3 instanceof s1;
            c cVar = this.f1800e;
            if (z7 || (k3 instanceof s)) {
                if (j(i, k3, z3 ? e.f1785j : e.f1786k)) {
                    m(i, null);
                    l(i, !z3);
                    if (z3) {
                        q6.i.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k3 == e.f1785j || k3 == e.f1786k) {
                    break;
                }
                if (k3 != e.f1783g && k3 != e.f1782f) {
                    if (k3 == e.i || k3 == e.f1780d || k3 == e.f1787l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k3).toString());
                }
            }
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i8 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f1801f;
            if (atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i8) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.f1801f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z3) {
        if (z3) {
            c cVar = this.f1800e;
            q6.i.b(cVar);
            cVar.E((this.f2799c * e.f1778b) + i);
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f1801f.set(i * 2, obj);
    }

    public final void n(int i, Object obj) {
        this.f1801f.set((i * 2) + 1, obj);
    }
}
