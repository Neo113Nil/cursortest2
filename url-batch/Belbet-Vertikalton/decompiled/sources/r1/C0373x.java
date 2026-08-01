package r1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: r1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373x extends w1.s {
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C0373x.class, "_decision");
    private volatile int _decision;

    @Override // w1.s, r1.V
    public final void e(Object obj) {
        f(obj);
    }

    @Override // w1.s, r1.V
    public final void f(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                w1.a.i(H1.l.C(this.f4498d), AbstractC0369t.i(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
