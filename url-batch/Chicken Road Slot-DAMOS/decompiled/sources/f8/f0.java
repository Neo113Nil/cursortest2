package f8;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 extends AtomicReference implements Executor, Runnable {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f4140s = 0;

    /* renamed from: d, reason: collision with root package name */
    public c6.e f4141d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f4142e;

    /* renamed from: i, reason: collision with root package name */
    public Runnable f4143i;

    /* renamed from: r, reason: collision with root package name */
    public Thread f4144r;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == e0.f4133e) {
            this.f4142e = null;
            this.f4141d = null;
            return;
        }
        this.f4144r = Thread.currentThread();
        try {
            c6.e eVar = this.f4141d;
            Objects.requireNonNull(eVar);
            a1.n nVar = (a1.n) eVar.f1815i;
            if (((Thread) nVar.f41i) == this.f4144r) {
                this.f4141d = null;
                if (((Runnable) nVar.f40e) != null) {
                    throw new IllegalStateException();
                }
                nVar.f40e = runnable;
                Executor executor = this.f4142e;
                Objects.requireNonNull(executor);
                nVar.f42r = executor;
                this.f4142e = null;
            } else {
                Executor executor2 = this.f4142e;
                Objects.requireNonNull(executor2);
                this.f4142e = null;
                this.f4143i = runnable;
                executor2.execute(this);
            }
            this.f4144r = null;
        } catch (Throwable th) {
            this.f4144r = null;
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.f4144r) {
            Runnable runnable = this.f4143i;
            Objects.requireNonNull(runnable);
            this.f4143i = null;
            runnable.run();
            return;
        }
        a1.n nVar = new a1.n(17, false);
        nVar.f41i = currentThread;
        c6.e eVar = this.f4141d;
        Objects.requireNonNull(eVar);
        eVar.f1815i = nVar;
        this.f4141d = null;
        try {
            Runnable runnable2 = this.f4143i;
            Objects.requireNonNull(runnable2);
            this.f4143i = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) nVar.f40e;
                if (runnable3 == null || (executor = (Executor) nVar.f42r) == null) {
                    break;
                }
                nVar.f40e = null;
                nVar.f42r = null;
                executor.execute(runnable3);
            }
        } finally {
            nVar.f41i = null;
        }
    }
}
