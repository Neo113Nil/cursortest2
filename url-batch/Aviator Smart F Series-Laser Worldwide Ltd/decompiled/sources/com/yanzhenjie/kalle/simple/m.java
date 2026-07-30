package com.yanzhenjie.kalle.simple;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes4.dex */
final class m extends FutureTask implements com.yanzhenjie.kalle.e {
    private final d mCallback;
    private a mWorker;

    m(a aVar, d dVar) {
        super(aVar);
        this.mWorker = aVar;
        this.mCallback = dVar;
    }

    @Override // com.yanzhenjie.kalle.e
    public void cancel() {
        cancel(true);
        this.mWorker.cancel();
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        try {
            this.mCallback.onResponse((j) get());
        } catch (CancellationException unused) {
            this.mCallback.onCancel();
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (isCancelled()) {
                this.mCallback.onCancel();
            } else if (cause == null || !(cause instanceof Exception)) {
                this.mCallback.onException(new Exception(cause));
            } else {
                this.mCallback.onException((Exception) cause);
            }
        } catch (Exception e9) {
            if (isCancelled()) {
                this.mCallback.onCancel();
            } else {
                this.mCallback.onException(e9);
            }
        }
        this.mCallback.onEnd();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.mCallback.onStart();
        super.run();
    }
}
