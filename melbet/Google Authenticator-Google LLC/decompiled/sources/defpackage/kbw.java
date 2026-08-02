package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbw implements Executor {
    private final Thread.UncaughtExceptionHandler a;
    private final Queue b = new ConcurrentLinkedQueue();
    private final AtomicReference c = new AtomicReference();

    public kbw(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public final void a() {
        while (a.j(this.c, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.c.set(null);
                    throw th2;
                }
            }
            this.c.set(null);
            if (this.b.isEmpty()) {
                return;
            }
        }
    }

    public final void b(Runnable runnable) {
        runnable.getClass();
        this.b.add(runnable);
    }

    public final void c() {
        hoq.I(Thread.currentThread() == this.c.get(), "Not called from the SynchronizationContext");
    }

    public final kuq d(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        kbv kbvVar = new kbv(runnable);
        return new kuq(kbvVar, (ScheduledFuture) scheduledExecutorService.schedule(new kbu(this, kbvVar, runnable, 0), j, timeUnit));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
