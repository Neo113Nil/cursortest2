package M5;

import H5.AbstractC0161v;
import H5.B;
import H5.C;
import H5.C0147g;
import H5.H;
import H5.s0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class i extends AbstractC0161v implements C {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1600m = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0161v f1601h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1602i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C f1603j;

    /* renamed from: k, reason: collision with root package name */
    public final l f1604k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1605l;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(AbstractC0161v abstractC0161v, int i7) {
        this.f1601h = abstractC0161v;
        this.f1602i = i7;
        C c7 = abstractC0161v instanceof C ? (C) abstractC0161v : null;
        this.f1603j = c7 == null ? B.f1024a : c7;
        this.f1604k = new l();
        this.f1605l = new Object();
    }

    @Override // H5.AbstractC0161v
    public final void F(InterfaceC0569i interfaceC0569i, Runnable runnable) {
        Runnable I6;
        this.f1604k.a(runnable);
        if (f1600m.get(this) >= this.f1602i || !J() || (I6 = I()) == null) {
            return;
        }
        this.f1601h.F(this, new A.a(this, I6, 4, false));
    }

    @Override // H5.AbstractC0161v
    public final void G(InterfaceC0569i interfaceC0569i, Runnable runnable) {
        Runnable I6;
        this.f1604k.a(runnable);
        if (f1600m.get(this) >= this.f1602i || !J() || (I6 = I()) == null) {
            return;
        }
        this.f1601h.G(this, new A.a(this, I6, 4, false));
    }

    public final Runnable I() {
        while (true) {
            Runnable runnable = (Runnable) this.f1604k.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1605l) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1600m;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1604k.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean J() {
        synchronized (this.f1605l) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1600m;
            if (atomicIntegerFieldUpdater.get(this) >= this.f1602i) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // H5.C
    public final void e(long j4, C0147g c0147g) {
        this.f1603j.e(j4, c0147g);
    }

    @Override // H5.C
    public final H g(long j4, s0 s0Var, InterfaceC0569i interfaceC0569i) {
        return this.f1603j.g(j4, s0Var, interfaceC0569i);
    }
}
