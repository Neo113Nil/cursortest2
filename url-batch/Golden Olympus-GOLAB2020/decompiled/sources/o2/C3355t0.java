package o2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o2.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3355t0 extends AbstractC3363x0 {

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f42101g = AtomicIntegerFieldUpdater.newUpdater(C3355t0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3353s0 f42102f;

    public C3355t0(InterfaceC3353s0 interfaceC3353s0) {
        this.f42102f = interfaceC3353s0;
    }

    @Override // o2.InterfaceC3353s0
    public void a(Throwable th) {
        if (f42101g.compareAndSet(this, 0, 1)) {
            this.f42102f.a(th);
        }
    }
}
