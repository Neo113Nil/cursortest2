package com.google.firebase.concurrent;

import com.google.firebase.components.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
class LimitedConcurrencyExecutor implements Executor {
    private final Executor delegate;
    private final LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
    private final Semaphore semaphore;

    public LimitedConcurrencyExecutor(Executor executor, int i) {
        Preconditions.checkArgument(i > 0, "concurrency must be positive.");
        this.delegate = executor;
        this.semaphore = new Semaphore(i, true);
    }

    private Runnable decorate(Runnable runnable) {
        return new a(2, this, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decorate$0(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.semaphore.release();
            maybeEnqueueNext();
        }
    }

    private void maybeEnqueueNext() {
        while (this.semaphore.tryAcquire()) {
            Runnable poll = this.queue.poll();
            if (poll == null) {
                this.semaphore.release();
                return;
            }
            this.delegate.execute(decorate(poll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.queue.offer(runnable);
        maybeEnqueueNext();
    }
}
