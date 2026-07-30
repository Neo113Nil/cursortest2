package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ryVscX7ZL4Ux extends f2 {
    public final AtomicReferenceFieldUpdater BjEWd04qc7Mw;
    public final AtomicReferenceFieldUpdater aF05bpZJlKEP;
    public final AtomicReferenceFieldUpdater kpCQ9veP6n3I;
    public final AtomicReferenceFieldUpdater ozEBbv0hFTAB;
    public final AtomicReferenceFieldUpdater rZjpSjn4zoMv;

    public ryVscX7ZL4Ux(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.aF05bpZJlKEP = atomicReferenceFieldUpdater;
        this.kpCQ9veP6n3I = atomicReferenceFieldUpdater2;
        this.rZjpSjn4zoMv = atomicReferenceFieldUpdater3;
        this.BjEWd04qc7Mw = atomicReferenceFieldUpdater4;
        this.ozEBbv0hFTAB = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.f2
    public final boolean OPXfSBeufaJ8(gGoUzNp9JO5I ggouznp9jo5i, nLZGh9p8gVSu nlzgh9p8gvsu) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.BjEWd04qc7Mw;
            if (atomicReferenceFieldUpdater.compareAndSet(ggouznp9jo5i, nlzgh9p8gvsu, nLZGh9p8gVSu.lS5Rgt96tfkO)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(ggouznp9jo5i) == nlzgh9p8gvsu);
        return false;
    }

    @Override // defpackage.f2
    public final void amuv7NJvPxHu(Pf0ThKz3j5YS pf0ThKz3j5YS, Thread thread) {
        this.aF05bpZJlKEP.lazySet(pf0ThKz3j5YS, thread);
    }

    @Override // defpackage.f2
    public final boolean dgRBjINgWbAK(gGoUzNp9JO5I ggouznp9jo5i, Pf0ThKz3j5YS pf0ThKz3j5YS, Pf0ThKz3j5YS pf0ThKz3j5YS2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.rZjpSjn4zoMv;
            if (atomicReferenceFieldUpdater.compareAndSet(ggouznp9jo5i, pf0ThKz3j5YS, pf0ThKz3j5YS2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(ggouznp9jo5i) == pf0ThKz3j5YS);
        return false;
    }

    @Override // defpackage.f2
    public final void ryVscX7ZL4Ux(Pf0ThKz3j5YS pf0ThKz3j5YS, Pf0ThKz3j5YS pf0ThKz3j5YS2) {
        this.kpCQ9veP6n3I.lazySet(pf0ThKz3j5YS, pf0ThKz3j5YS2);
    }

    @Override // defpackage.f2
    public final boolean wdg6QnbFHrFF(gGoUzNp9JO5I ggouznp9jo5i, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.ozEBbv0hFTAB;
            if (atomicReferenceFieldUpdater.compareAndSet(ggouznp9jo5i, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(ggouznp9jo5i) == obj);
        return false;
    }
}
