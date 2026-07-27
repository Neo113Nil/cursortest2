package D4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class W extends Z {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f483f = AtomicIntegerFieldUpdater.newUpdater(W.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1441l f484e;

    public W(InterfaceC1441l interfaceC1441l) {
        this.f484e = interfaceC1441l;
    }

    @Override // t4.InterfaceC1441l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return f4.v.f5689a;
    }

    @Override // D4.b0
    public final void k(Throwable th) {
        if (f483f.compareAndSet(this, 0, 1)) {
            this.f484e.invoke(th);
        }
    }
}
