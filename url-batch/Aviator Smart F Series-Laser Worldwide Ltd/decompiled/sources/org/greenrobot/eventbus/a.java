package org.greenrobot.eventbus;

/* loaded from: classes5.dex */
class a implements Runnable, k {
    private final c eventBus;
    private final j queue = new j();

    a(c cVar) {
        this.eventBus = cVar;
    }

    @Override // org.greenrobot.eventbus.k
    public void enqueue(p pVar, Object obj) {
        this.queue.enqueue(i.obtainPendingPost(pVar, obj));
        this.eventBus.getExecutorService().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        i poll = this.queue.poll();
        if (poll == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.eventBus.invokeSubscriber(poll);
    }
}
