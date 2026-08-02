package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhj extends AbstractExecutorService implements AutoCloseable {
    public final Set a;
    public final dhn b;
    public final dhr c;
    public final boolean d;
    public final hvm e;
    private final AtomicInteger f = new AtomicInteger(1000);
    private final dhl g;
    private final ExecutorService h;
    private final kee i;

    public dhj(dhn dhnVar, dhr dhrVar, boolean z, hvm hvmVar, dhl dhlVar, Set set, ExecutorService executorService, kee keeVar) {
        this.g = dhlVar;
        this.a = set;
        this.h = executorService;
        this.i = keeVar;
        this.b = dhnVar;
        this.c = dhrVar;
        this.d = z;
        this.e = hvmVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.h.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.d(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dhr dhrVar = this.c;
        dhrVar.c();
        boolean b = dhm.b();
        ExecutorService executorService = this.h;
        if (b) {
            executorService.execute(new dhi(this, runnable));
        } else {
            executorService.execute(runnable);
        }
        dhrVar.a();
        if (!dhm.b()) {
            return;
        }
        int i = ((hqf) this.i.a).d.get();
        dhrVar.b();
        if (i < 1000) {
            return;
        }
        while (true) {
            AtomicInteger atomicInteger = this.f;
            int i2 = atomicInteger.get();
            if (i < i2) {
                return;
            }
            if (atomicInteger.compareAndSet(i2, i2 + i2)) {
                dhrVar.b();
                dhm.a(this.b, this.g.a(), new dho(a.ai(i, "Queue size of ", " exceeds starvation threshold of 1000")));
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.h.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.h.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        ((hqf) this.h).b(false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.h.shutdownNow();
    }

    public final String toString() {
        return "Monitoring[" + this.h.toString() + "]";
    }
}
