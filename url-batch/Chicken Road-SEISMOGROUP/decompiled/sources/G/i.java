package G;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f297a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f298b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f299c = new AtomicBoolean(false);

    public i(ExecutorService executorService) {
        this.f297a = executorService;
    }

    @Override // G.e
    public final void a(c cVar) {
        this.f298b.add(cVar);
        this.f297a.execute(new h(this, 0));
    }

    public final void b() {
        ExecutorService executorService = this.f297a;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f298b;
        AtomicBoolean atomicBoolean = this.f299c;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                atomicBoolean.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    executorService.execute(new h(this, 1));
                }
            }
        }
    }
}
