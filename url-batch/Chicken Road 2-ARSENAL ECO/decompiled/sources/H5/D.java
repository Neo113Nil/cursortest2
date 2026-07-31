package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class D extends M5.s {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1025j = AtomicIntegerFieldUpdater.newUpdater(D.class, "_decision");
    private volatile int _decision;

    @Override // M5.s, H5.g0
    public final void k(Object obj) {
        l(obj);
    }

    @Override // M5.s, H5.g0
    public final void l(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f1025j;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                M5.a.h(AbstractC0165z.m(obj), AbstractC0676f.m(this.f1620i));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
