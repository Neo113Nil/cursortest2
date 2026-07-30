package O7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class X extends a0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2575y = AtomicIntegerFieldUpdater.newUpdater(X.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: x, reason: collision with root package name */
    public final E7.l f2576x;

    public X(E7.l lVar) {
        this.f2576x = lVar;
    }

    @Override // O7.c0
    public final void i(Throwable th) {
        if (f2575y.compareAndSet(this, 0, 1)) {
            this.f2576x.invoke(th);
        }
    }

    @Override // E7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return q7.v.f40183a;
    }
}
