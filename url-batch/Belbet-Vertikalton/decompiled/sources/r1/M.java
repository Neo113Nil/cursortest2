package r1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class M extends P {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4047f = AtomicIntegerFieldUpdater.newUpdater(M.class, "_invoked");
    private volatile int _invoked;
    public final Q e;

    public M(Q q2) {
        this.e = q2;
    }

    @Override // i1.InterfaceC0192l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return W0.i.f1345a;
    }

    @Override // r1.Q
    public final void o(Throwable th) {
        if (f4047f.compareAndSet(this, 0, 1)) {
            this.e.g(th);
        }
    }
}
