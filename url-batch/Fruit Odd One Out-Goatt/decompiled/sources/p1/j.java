package p1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class j extends k1.p implements k1.w {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1053h = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: d, reason: collision with root package name */
    public final k1.p f1054d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1055e;

    /* renamed from: f, reason: collision with root package name */
    public final m f1056f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1057g;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public j(k1.p pVar, int i2) {
        this.f1054d = pVar;
        this.f1055e = i2;
        if ((pVar instanceof k1.w ? (k1.w) pVar : null) == null) {
            int i3 = k1.v.f728a;
        }
        this.f1056f = new m();
        this.f1057g = new Object();
    }

    @Override // k1.p
    public final void b(v0.h hVar, Runnable runnable) {
        this.f1056f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1053h;
        if (atomicIntegerFieldUpdater.get(this) < this.f1055e) {
            synchronized (this.f1057g) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f1055e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable d2 = d();
                if (d2 == null) {
                    return;
                }
                this.f1054d.b(this, new i(this, d2));
            }
        }
    }

    public final Runnable d() {
        while (true) {
            Runnable runnable = (Runnable) this.f1056f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1057g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1053h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1056f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
