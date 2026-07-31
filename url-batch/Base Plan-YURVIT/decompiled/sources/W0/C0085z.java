package W0;

import a.AbstractC0086a;
import b1.AbstractC0115a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: W0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085z extends b1.u {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f987i = AtomicIntegerFieldUpdater.newUpdater(C0085z.class, "_decision");
    private volatile int _decision;

    @Override // b1.u, W0.Z
    public final void p(Object obj) {
        q(obj);
    }

    @Override // b1.u, W0.Z
    public final void q(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f987i;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC0115a.g(AbstractC0086a.v(this.f1775h), AbstractC0081v.g(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
