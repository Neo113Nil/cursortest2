package W2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class G extends b3.q {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4223k = AtomicIntegerFieldUpdater.newUpdater(G.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // b3.q, W2.k0
    public final void A(Object obj) {
        B(obj);
    }

    @Override // b3.q, W2.k0
    public final void B(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f4223k;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                b3.a.i(D2.f.b(this.f5684j), AbstractC0295q.a(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
