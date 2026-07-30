package M0;

import R0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: M0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067z extends R0.u {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f700i = AtomicIntegerFieldUpdater.newUpdater(C0067z.class, "_decision");
    private volatile int _decision;

    @Override // R0.u, M0.Z
    public final void o(Object obj) {
        p(obj);
    }

    @Override // R0.u, M0.Z
    public final void p(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f700i;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC0068a.i(o.g.r(this.f936h), AbstractC0063v.h(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
