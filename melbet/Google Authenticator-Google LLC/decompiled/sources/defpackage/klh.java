package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klh implements Executor, Runnable {
    private static final Logger b = Logger.getLogger(klh.class.getName());
    private static final kle c;
    private final Executor d;
    private final Queue e = new ConcurrentLinkedQueue();
    public volatile int a = 0;

    static {
        kle klgVar;
        try {
            klgVar = new klf(AtomicIntegerFieldUpdater.newUpdater(klh.class, "a"));
        } catch (Throwable th) {
            b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            klgVar = new klg();
        }
        c = klgVar;
    }

    public klh(Executor executor) {
        executor.getClass();
        this.d = executor;
    }

    private final void a(Runnable runnable) {
        if (c.a(this)) {
            try {
                this.d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.b(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.e.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Runnable runnable = (Runnable) this.e.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "run", "Exception while executing runnable " + runnable.toString(), (Throwable) e);
                }
            } catch (Throwable th) {
                c.b(this);
                throw th;
            }
        }
        c.b(this);
        if (this.e.isEmpty()) {
            return;
        }
        a(null);
    }
}
