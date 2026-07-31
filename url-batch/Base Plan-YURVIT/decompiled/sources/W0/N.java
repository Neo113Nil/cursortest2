package W0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class N extends S {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f919j = AtomicIntegerFieldUpdater.newUpdater(N.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: i, reason: collision with root package name */
    public final O0.l f920i;

    public N(O0.l lVar) {
        this.f920i = lVar;
    }

    @Override // O0.l
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        p((Throwable) obj);
        return D0.h.f206a;
    }

    @Override // W0.U
    public final void p(Throwable th) {
        if (f919j.compareAndSet(this, 0, 1)) {
            this.f920i.j(th);
        }
    }
}
