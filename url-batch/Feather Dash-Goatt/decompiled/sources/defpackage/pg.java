package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pg extends e81 {
    public final we g;
    public final /* synthetic */ AtomicReferenceArray h;

    public pg(long j, pg pgVar, we weVar, int i) {
        super(j, pgVar, i);
        this.g = weVar;
        this.h = new AtomicReferenceArray(ye.b * 2);
    }

    @Override // defpackage.e81
    public final int k() {
        return ye.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        r(r5, null);
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
    @Override // defpackage.e81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, CoroutineContext coroutineContext) {
        int i2 = ye.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i * 2);
        while (true) {
            Object p = p(i);
            boolean z2 = p instanceof yn1;
            we weVar = this.g;
            if (z2 || (p instanceof zn1)) {
                if (o(p, i, z ? ye.j : ye.k)) {
                    r(i, null);
                    q(i, !z);
                    if (z) {
                        weVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (p == ye.j || p == ye.k) {
                    break;
                }
                if (p != ye.g && p != ye.f) {
                    if (p == ye.i || p == ye.d || p == ye.l) {
                        return;
                    }
                    af.j(p, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean o(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object p(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void q(int i, boolean z) {
        if (z) {
            we weVar = this.g;
            weVar.getClass();
            weVar.L((this.e * ye.b) + i);
        }
        m();
    }

    public final void r(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void s(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
