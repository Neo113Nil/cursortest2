package q2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class C extends v2.q {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7849h = AtomicIntegerFieldUpdater.newUpdater(C.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // v2.q, q2.f0
    public final void A(Object obj) {
        D(obj);
    }

    @Override // v2.q, q2.f0
    public final void D(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f7849h;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                v2.a.j(l0.c.B(this.f9824g), AbstractC0837y.s(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
