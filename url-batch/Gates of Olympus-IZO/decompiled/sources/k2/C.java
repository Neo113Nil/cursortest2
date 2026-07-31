package k2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class C extends p2.r {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5310h = AtomicIntegerFieldUpdater.newUpdater(C.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p2.r, k2.f0
    public final void l(Object obj) {
        q(obj);
    }

    @Override // p2.r, k2.f0
    public final void q(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f5310h;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                p2.a.j(M1.B.G(this.f6804g), AbstractC0552y.r(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
