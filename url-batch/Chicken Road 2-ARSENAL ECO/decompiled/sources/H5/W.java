package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class W extends Z {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1050k = AtomicIntegerFieldUpdater.newUpdater(W.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0743l f1051j;

    public W(InterfaceC0743l interfaceC0743l) {
        this.f1051j = interfaceC0743l;
    }

    @Override // x5.InterfaceC0743l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return k5.v.f5219a;
    }

    @Override // H5.b0
    public final void k(Throwable th) {
        if (f1050k.compareAndSet(this, 0, 1)) {
            this.f1051j.invoke(th);
        }
    }
}
