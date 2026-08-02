package Y0;

import d1.AbstractC0184a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Y0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131z extends d1.u {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1243i = AtomicIntegerFieldUpdater.newUpdater(C0131z.class, "_decision");
    private volatile int _decision;

    @Override // d1.u, Y0.Z
    public final void q(Object obj) {
        r(obj);
    }

    @Override // d1.u, Y0.Z
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f1243i;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC0184a.h(i1.a.t(this.f2105h), AbstractC0127v.h(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
