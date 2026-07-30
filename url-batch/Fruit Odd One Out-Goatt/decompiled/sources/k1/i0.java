package k1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class i0 extends k0 {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f686g = AtomicIntegerFieldUpdater.newUpdater(i0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: f, reason: collision with root package name */
    public final c1.l f687f;

    public i0(c1.l lVar) {
        this.f687f = lVar;
    }

    @Override // c1.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return t0.g.f1178a;
    }

    @Override // k1.m0
    public final void o(Throwable th) {
        if (f686g.compareAndSet(this, 0, 1)) {
            this.f687f.h(th);
        }
    }
}
