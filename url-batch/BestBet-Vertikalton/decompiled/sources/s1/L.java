package s1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class L extends O {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4018f = AtomicIntegerFieldUpdater.newUpdater(L.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final P f4019e;

    public L(P p2) {
        this.f4019e = p2;
    }

    @Override // j1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return X0.g.f1277c;
    }

    @Override // s1.P
    public final void o(Throwable th) {
        if (f4018f.compareAndSet(this, 0, 1)) {
            this.f4019e.g(th);
        }
    }
}
