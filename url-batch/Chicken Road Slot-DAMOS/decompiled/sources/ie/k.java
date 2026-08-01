package ie;

import a2.r;
import ge.b2;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import le.s;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k extends s {

    /* renamed from: e, reason: collision with root package name */
    public final c f4752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4753f;

    public k(long j, k kVar, c cVar, int i3) {
        super(j, kVar, i3);
        this.f4752e = cVar;
        this.f4753f = new AtomicReferenceArray(e.f4731b * 2);
    }

    @Override // le.s
    public final int f() {
        return e.f4731b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // le.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i3, CoroutineContext coroutineContext) {
        int i10 = e.f4731b;
        boolean z10 = i3 >= i10;
        if (z10) {
            i3 -= i10;
        }
        this.f4753f.get(i3 * 2);
        while (true) {
            Object k10 = k(i3);
            boolean z11 = k10 instanceof b2;
            c cVar = this.f4752e;
            if (z11 || (k10 instanceof p)) {
                if (j(i3, k10, z10 ? e.j : e.f4738k)) {
                    m(i3, null);
                    l(i3, !z10);
                    if (z10) {
                        cVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (k10 == e.j || k10 == e.f4738k) {
                    break;
                }
                if (k10 != e.g && k10 != e.f4735f) {
                    if (k10 == e.f4737i || k10 == e.f4733d || k10 == e.f4739l) {
                        return;
                    }
                    r.n(k10, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean j(int i3, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i3 * 2) + 1;
        do {
            atomicReferenceArray = this.f4753f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object k(int i3) {
        return this.f4753f.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z10) {
        if (z10) {
            c cVar = this.f4752e;
            cVar.getClass();
            cVar.D((this.f5999c * e.f4731b) + i3);
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.f4753f.set(i3 * 2, obj);
    }

    public final void n(int i3, Object obj) {
        this.f4753f.set((i3 * 2) + 1, obj);
    }
}
