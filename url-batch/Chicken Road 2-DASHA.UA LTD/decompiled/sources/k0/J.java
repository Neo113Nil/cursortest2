package k0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class J extends M {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f833g = AtomicIntegerFieldUpdater.newUpdater(J.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: f, reason: collision with root package name */
    public final d0.l f834f;

    public J(d0.l lVar) {
        this.f834f = lVar;
    }

    @Override // d0.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return U.g.f378a;
    }

    @Override // k0.O
    public final void o(Throwable th) {
        if (f833g.compareAndSet(this, 0, 1)) {
            this.f834f.h(th);
        }
    }
}
