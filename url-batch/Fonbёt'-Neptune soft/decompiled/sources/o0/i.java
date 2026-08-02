package o0;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f3349a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f3350b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f3351c = new AtomicBoolean(false);

    public i(ExecutorService executorService) {
        this.f3349a = executorService;
    }

    @Override // o0.e
    public final void a(c cVar) {
        this.f3350b.add(cVar);
        this.f3349a.execute(new h(this, 0));
    }

    public final void b() {
        ExecutorService executorService = this.f3349a;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f3350b;
        AtomicBoolean atomicBoolean = this.f3351c;
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
