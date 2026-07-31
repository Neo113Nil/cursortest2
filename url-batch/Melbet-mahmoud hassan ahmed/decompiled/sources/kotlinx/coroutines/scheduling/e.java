package kotlinx.coroutines.scheduling;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m6.f1;

/* loaded from: classes.dex */
final class e extends f1 implements j, Executor {

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f18418m = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");

    /* renamed from: h, reason: collision with root package name */
    private final c f18419h;

    /* renamed from: i, reason: collision with root package name */
    private final int f18420i;

    /* renamed from: j, reason: collision with root package name */
    private final String f18421j;

    /* renamed from: k, reason: collision with root package name */
    private final int f18422k;

    /* renamed from: l, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f18423l = new ConcurrentLinkedQueue<>();
    private volatile /* synthetic */ int inFlightTasks = 0;

    public e(c cVar, int i7, String str, int i8) {
        this.f18419h = cVar;
        this.f18420i = i7;
        this.f18421j = str;
        this.f18422k = i8;
    }

    private final void R(Runnable runnable, boolean z6) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18418m;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f18420i) {
                this.f18419h.S(runnable, this, z6);
                return;
            }
            this.f18423l.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f18420i) {
                return;
            } else {
                runnable = this.f18423l.poll();
            }
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.scheduling.j
    public int M() {
        return this.f18422k;
    }

    @Override // m6.f0
    public void P(y5.g gVar, Runnable runnable) {
        R(runnable, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        R(runnable, false);
    }

    @Override // m6.f0
    public String toString() {
        String str = this.f18421j;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f18419h + ']';
    }

    @Override // kotlinx.coroutines.scheduling.j
    public void u() {
        Runnable poll = this.f18423l.poll();
        if (poll != null) {
            this.f18419h.S(poll, this, true);
            return;
        }
        f18418m.decrementAndGet(this);
        Runnable poll2 = this.f18423l.poll();
        if (poll2 == null) {
            return;
        }
        R(poll2, true);
    }
}
