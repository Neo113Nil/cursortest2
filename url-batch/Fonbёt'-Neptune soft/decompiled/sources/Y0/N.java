package Y0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class N extends S {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1173j = AtomicIntegerFieldUpdater.newUpdater(N.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: i, reason: collision with root package name */
    public final P0.l f1174i;

    public N(P0.l lVar) {
        this.f1174i = lVar;
    }

    @Override // P0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return F0.h.f469a;
    }

    @Override // Y0.U
    public final void o(Throwable th) {
        if (f1173j.compareAndSet(this, 0, 1)) {
            this.f1174i.i(th);
        }
    }
}
