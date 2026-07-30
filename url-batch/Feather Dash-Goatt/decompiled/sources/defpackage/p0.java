package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class p0 extends m90 {
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;
    public final AtomicReferenceFieldUpdater t;
    public final AtomicReferenceFieldUpdater u;

    public p0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.q = atomicReferenceFieldUpdater;
        this.r = atomicReferenceFieldUpdater2;
        this.s = atomicReferenceFieldUpdater3;
        this.t = atomicReferenceFieldUpdater4;
        this.u = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.m90
    public final void G(r0 r0Var, r0 r0Var2) {
        this.r.lazySet(r0Var, r0Var2);
    }

    @Override // defpackage.m90
    public final void H(r0 r0Var, Thread thread) {
        this.q.lazySet(r0Var, thread);
    }

    @Override // defpackage.m90
    public final boolean s(s0 s0Var, o0 o0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.t;
            if (atomicReferenceFieldUpdater.compareAndSet(s0Var, o0Var, o0.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(s0Var) == o0Var);
        return false;
    }

    @Override // defpackage.m90
    public final boolean t(s0 s0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.u;
            if (atomicReferenceFieldUpdater.compareAndSet(s0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(s0Var) == obj);
        return false;
    }

    @Override // defpackage.m90
    public final boolean u(s0 s0Var, r0 r0Var, r0 r0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(s0Var, r0Var, r0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(s0Var) == r0Var);
        return false;
    }
}
