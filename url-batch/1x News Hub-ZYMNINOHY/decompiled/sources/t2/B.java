package t2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class B extends y2.s {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10375e = AtomicIntegerFieldUpdater.newUpdater(B.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // y2.s, t2.e0
    public final void o(Object obj) {
        p(obj);
    }

    @Override // y2.s, t2.e0
    public final void p(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f10375e;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                y2.a.g(C2.b.x(this.f10864d), AbstractC1212w.i(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
