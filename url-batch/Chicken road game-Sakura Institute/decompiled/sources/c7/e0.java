package c7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 extends h7.p {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1686j = AtomicIntegerFieldUpdater.newUpdater(e0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // h7.p, c7.f1
    public final void i(Object obj) {
        j(obj);
    }

    @Override // h7.p, c7.f1
    public final void j(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f1686j;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                h7.a.h(a8.m.A(this.f4702i), a0.q(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
