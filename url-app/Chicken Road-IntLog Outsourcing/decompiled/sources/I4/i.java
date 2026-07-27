package I4;

import D4.A;
import D4.AbstractC0020u;
import D4.B;
import D4.C0007g;
import D4.G;
import D4.s0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public final class i extends AbstractC0020u implements B {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1298h = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0020u f1299c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f1301e;

    /* renamed from: f, reason: collision with root package name */
    public final l f1302f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1303g;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(AbstractC0020u abstractC0020u, int i2) {
        this.f1299c = abstractC0020u;
        this.f1300d = i2;
        B b6 = abstractC0020u instanceof B ? (B) abstractC0020u : null;
        this.f1301e = b6 == null ? A.f456a : b6;
        this.f1302f = new l();
        this.f1303g = new Object();
    }

    @Override // D4.AbstractC0020u
    public final void C(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        Runnable F2;
        this.f1302f.a(runnable);
        if (f1298h.get(this) >= this.f1300d || !G() || (F2 = F()) == null) {
            return;
        }
        this.f1299c.C(this, new A0.a(this, 24, F2));
    }

    @Override // D4.AbstractC0020u
    public final void D(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        Runnable F2;
        this.f1302f.a(runnable);
        if (f1298h.get(this) >= this.f1300d || !G() || (F2 = F()) == null) {
            return;
        }
        this.f1299c.D(this, new A0.a(this, 24, F2));
    }

    public final Runnable F() {
        while (true) {
            Runnable runnable = (Runnable) this.f1302f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1303g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1298h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1302f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean G() {
        synchronized (this.f1303g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1298h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f1300d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // D4.B
    public final void p(long j2, C0007g c0007g) {
        this.f1301e.p(j2, c0007g);
    }

    @Override // D4.B
    public final G y(long j2, s0 s0Var, InterfaceC1223i interfaceC1223i) {
        return this.f1301e.y(j2, s0Var, interfaceC1223i);
    }
}
