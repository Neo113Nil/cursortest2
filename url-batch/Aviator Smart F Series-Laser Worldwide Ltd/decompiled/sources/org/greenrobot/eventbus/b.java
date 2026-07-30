package org.greenrobot.eventbus;

import java.util.logging.Level;

/* loaded from: classes5.dex */
final class b implements Runnable, k {
    private final c eventBus;
    private volatile boolean executorRunning;
    private final j queue = new j();

    b(c cVar) {
        this.eventBus = cVar;
    }

    @Override // org.greenrobot.eventbus.k
    public void enqueue(p pVar, Object obj) {
        i obtainPendingPost = i.obtainPendingPost(pVar, obj);
        synchronized (this) {
            try {
                this.queue.enqueue(obtainPendingPost);
                if (!this.executorRunning) {
                    this.executorRunning = true;
                    this.eventBus.getExecutorService().execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    i poll = this.queue.poll(1000);
                    if (poll == null) {
                        synchronized (this) {
                            poll = this.queue.poll();
                            if (poll == null) {
                                this.executorRunning = false;
                                this.executorRunning = false;
                                return;
                            }
                        }
                    }
                    this.eventBus.invokeSubscriber(poll);
                } catch (InterruptedException e8) {
                    this.eventBus.getLogger().log(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e8);
                    this.executorRunning = false;
                    return;
                }
            } catch (Throwable th) {
                this.executorRunning = false;
                throw th;
            }
        }
    }
}
