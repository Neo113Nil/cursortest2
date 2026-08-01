package o1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303w extends s1.q {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3367e = AtomicIntegerFieldUpdater.newUpdater(C0303w.class, "_decision");
    private volatile int _decision;

    @Override // s1.q, o1.U
    public final void f(Object obj) {
        g(obj);
    }

    @Override // s1.q, o1.U
    public final void g(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f3367e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                s1.a.c(T.d.y(this.d), AbstractC0299s.i(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
