package C3;

import f3.InterfaceC0430h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x3.AbstractC1558s;
import x3.AbstractC1564y;
import x3.InterfaceC1565z;

/* loaded from: classes.dex */
public final class i extends AbstractC1558s implements InterfaceC1565z {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f297g = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1558s f298c;

    /* renamed from: d, reason: collision with root package name */
    public final int f299d;

    /* renamed from: e, reason: collision with root package name */
    public final l f300e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f301f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i(AbstractC1558s abstractC1558s, int i4) {
        this.f298c = abstractC1558s;
        this.f299d = i4;
        if ((abstractC1558s instanceof InterfaceC1565z ? (InterfaceC1565z) abstractC1558s : null) == null) {
            int i5 = AbstractC1564y.f16074a;
        }
        this.f300e = new l();
        this.f301f = new Object();
    }

    @Override // x3.AbstractC1558s
    public final void s(InterfaceC0430h interfaceC0430h, Runnable runnable) {
        this.f300e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f297g;
        if (atomicIntegerFieldUpdater.get(this) < this.f299d) {
            synchronized (this.f301f) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f299d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable u4 = u();
                if (u4 == null) {
                    return;
                }
                this.f298c.s(this, new B.a(this, u4, 2, false));
            }
        }
    }

    public final Runnable u() {
        while (true) {
            Runnable runnable = (Runnable) this.f300e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f301f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f297g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f300e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
