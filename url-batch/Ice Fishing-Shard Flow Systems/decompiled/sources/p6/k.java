package p6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import n6.w0;

/* loaded from: classes.dex */
public final class k extends s6.r {

    /* renamed from: e, reason: collision with root package name */
    public final c f7256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f7257f;

    public k(long j, k kVar, c cVar, int i2) {
        super(j, kVar, i2);
        this.f7256e = cVar;
        this.f7257f = new AtomicReferenceArray(e.f7234b * 2);
    }

    @Override // s6.r
    public final int f() {
        return e.f7234b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.Intrinsics.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // s6.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i2, CoroutineContext coroutineContext) {
        int i5 = e.f7234b;
        boolean z7 = i2 >= i5;
        if (z7) {
            i2 -= i5;
        }
        this.f7257f.get(i2 * 2);
        while (true) {
            Object k7 = k(i2);
            boolean z8 = k7 instanceof w0;
            c cVar = this.f7256e;
            if (z8 || (k7 instanceof t)) {
                if (j(k7, i2, z7 ? e.j : e.f7242k)) {
                    m(i2, null);
                    l(i2, !z7);
                    if (z7) {
                        Intrinsics.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (k7 == e.j || k7 == e.f7242k) {
                    break;
                }
                if (k7 != e.f7239g && k7 != e.f7238f) {
                    if (k7 == e.f7241i || k7 == e.f7236d || k7 == e.f7243l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k7).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i2, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i5 = (i2 * 2) + 1;
        do {
            atomicReferenceArray = this.f7257f;
            if (atomicReferenceArray.compareAndSet(i5, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i5) == obj);
        return false;
    }

    public final Object k(int i2) {
        return this.f7257f.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z7) {
        if (z7) {
            c cVar = this.f7256e;
            Intrinsics.b(cVar);
            cVar.D((this.f7854c * e.f7234b) + i2);
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f7257f.set(i2 * 2, obj);
    }

    public final void n(int i2, Object obj) {
        this.f7257f.set((i2 * 2) + 1, obj);
    }
}
