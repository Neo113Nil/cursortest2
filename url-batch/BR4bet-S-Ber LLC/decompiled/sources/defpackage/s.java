package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class s extends kr {
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;

    public s(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.o = atomicReferenceFieldUpdater;
        this.p = atomicReferenceFieldUpdater2;
        this.q = atomicReferenceFieldUpdater3;
        this.r = atomicReferenceFieldUpdater4;
        this.s = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.kr
    public final void R(u uVar, u uVar2) {
        this.p.lazySet(uVar, uVar2);
    }

    @Override // defpackage.kr
    public final void S(u uVar, Thread thread) {
        this.o.lazySet(uVar, thread);
    }

    @Override // defpackage.kr
    public final boolean d(v vVar, r rVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(vVar, rVar, r.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(vVar) == rVar);
        return false;
    }

    @Override // defpackage.kr
    public final boolean e(v vVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(vVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(vVar) == obj);
        return false;
    }

    @Override // defpackage.kr
    public final boolean f(v vVar, u uVar, u uVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.q;
            if (atomicReferenceFieldUpdater.compareAndSet(vVar, uVar, uVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(vVar) == uVar);
        return false;
    }
}
