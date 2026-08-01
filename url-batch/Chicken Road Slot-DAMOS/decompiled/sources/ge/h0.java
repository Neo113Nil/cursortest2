package ge;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 extends le.r {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4358s = AtomicIntegerFieldUpdater.newUpdater(h0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // le.r, ge.k1
    public final void k(Object obj) {
        l(obj);
    }

    @Override // le.r, ge.k1
    public final void l(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f4358s;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 1) {
                    kotlin.collections.i0.l("Already resumed");
                    return;
                } else {
                    le.b.g(a0.u(obj), md.f.b(this.f5997r));
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
