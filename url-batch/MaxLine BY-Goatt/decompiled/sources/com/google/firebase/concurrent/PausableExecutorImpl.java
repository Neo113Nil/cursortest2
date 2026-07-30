package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class PausableExecutorImpl implements PausableExecutor {
    private final Executor delegate;
    private volatile boolean paused;
    final LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

    public PausableExecutorImpl(boolean z, Executor executor) {
        this.paused = z;
        this.delegate = executor;
    }

    private void maybeEnqueueNext() {
        if (this.paused) {
            return;
        }
        Runnable poll = this.queue.poll();
        while (poll != null) {
            this.delegate.execute(poll);
            poll = !this.paused ? this.queue.poll() : null;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.queue.offer(runnable);
        maybeEnqueueNext();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.paused;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.paused = true;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.paused = false;
        maybeEnqueueNext();
    }
}
