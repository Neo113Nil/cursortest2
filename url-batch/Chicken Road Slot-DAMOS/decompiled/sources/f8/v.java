package f8;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v extends k7.e {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4187i;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f4188r;

    public v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f4187i = atomicReferenceFieldUpdater;
        this.f4188r = atomicIntegerFieldUpdater;
    }

    @Override // k7.e
    public final void k(c0 c0Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4187i;
            if (atomicReferenceFieldUpdater.compareAndSet(c0Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(c0Var) == null);
    }

    @Override // k7.e
    public final int m(c0 c0Var) {
        return this.f4188r.decrementAndGet(c0Var);
    }
}
