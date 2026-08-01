package s1;

import c1.AbstractC0091d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: s1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339w extends w1.q {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4070e = AtomicIntegerFieldUpdater.newUpdater(C0339w.class, "_decision");
    private volatile int _decision;

    @Override // w1.q, s1.U
    public final void g(Object obj) {
        i(obj);
    }

    @Override // w1.q, s1.U
    public final void i(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f4070e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                w1.a.c(AbstractC0091d.m(this.d), AbstractC0335s.h(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
