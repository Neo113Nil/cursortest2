package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tt extends vg2 {
    public final lq g;
    public final /* synthetic */ AtomicReferenceArray h;

    public tt(long j, tt ttVar, lq lqVar, int i) {
        super(j, ttVar, i);
        this.g = lqVar;
        this.h = new AtomicReferenceArray(nq.b * 2);
    }

    @Override // defpackage.vg2
    public final int k() {
        return nq.b;
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
    @Override // defpackage.vg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, CoroutineContext coroutineContext) {
        int i2 = nq.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i * 2);
        while (true) {
            Object p = p(i);
            boolean z2 = p instanceof g63;
            lq lqVar = this.g;
            if (z2 || (p instanceof h63)) {
                if (o(i, p, z ? nq.j : nq.k)) {
                    r(i, null);
                    q(i, !z);
                    if (z) {
                        lqVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (p == nq.j || p == nq.k) {
                    break;
                }
                if (p != nq.g && p != nq.f) {
                    if (p == nq.i || p == nq.d || p == nq.l) {
                        return;
                    }
                    dm0.i(p, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean o(int i, Object obj, Object obj2) {
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
            lq lqVar = this.g;
            lqVar.getClass();
            lqVar.P((this.e * nq.b) + i);
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
