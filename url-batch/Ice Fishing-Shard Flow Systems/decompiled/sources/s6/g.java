package s6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import n6.AbstractC0764B;
import n6.AbstractC0786t;
import n6.C0775h;
import n6.H;
import n6.InterfaceC0765C;
import n6.r0;

/* loaded from: classes.dex */
public final class g extends AbstractC0786t implements InterfaceC0765C {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7831p = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0765C f7832i;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0786t f7833l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7834m;

    /* renamed from: n, reason: collision with root package name */
    public final k f7835n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f7836o;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(AbstractC0786t abstractC0786t, int i2) {
        InterfaceC0765C interfaceC0765C = abstractC0786t instanceof InterfaceC0765C ? (InterfaceC0765C) abstractC0786t : null;
        this.f7832i = interfaceC0765C == null ? AbstractC0764B.f7008a : interfaceC0765C;
        this.f7833l = abstractC0786t;
        this.f7834m = i2;
        this.f7835n = new k();
        this.f7836o = new Object();
    }

    @Override // n6.AbstractC0786t
    public final void E(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable I7;
        this.f7835n.a(runnable);
        if (f7831p.get(this) >= this.f7834m || !J() || (I7 = I()) == null) {
            return;
        }
        this.f7833l.E(this, new F.a(27, this, I7, false));
    }

    @Override // n6.AbstractC0786t
    public final void F(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable I7;
        this.f7835n.a(runnable);
        if (f7831p.get(this) >= this.f7834m || !J() || (I7 = I()) == null) {
            return;
        }
        this.f7833l.F(this, new F.a(27, this, I7, false));
    }

    public final Runnable I() {
        while (true) {
            Runnable runnable = (Runnable) this.f7835n.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f7836o) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7831p;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f7835n.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean J() {
        synchronized (this.f7836o) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7831p;
            if (atomicIntegerFieldUpdater.get(this) >= this.f7834m) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // n6.InterfaceC0765C
    public final void h(long j, C0775h c0775h) {
        this.f7832i.h(j, c0775h);
    }

    @Override // n6.InterfaceC0765C
    public final H s(long j, r0 r0Var, CoroutineContext coroutineContext) {
        return this.f7832i.s(j, r0Var, coroutineContext);
    }

    @Override // n6.AbstractC0786t
    public final String toString() {
        return this.f7833l + ".limitedParallelism(" + this.f7834m + ')';
    }
}
