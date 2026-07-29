package com.google.android.gms.tasks;

/* loaded from: classes2.dex */
public class TaskCompletionSource<TResult> {
    private final zzu<TResult> zzafh = new zzu<>();

    public TaskCompletionSource() {
    }

    public TaskCompletionSource(CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }

    public Task<TResult> getTask() {
        return this.zzafh;
    }

    public void setException(Exception exc) {
        this.zzafh.setException(exc);
    }

    public void setResult(TResult tresult) {
        this.zzafh.setResult(tresult);
    }

    public boolean trySetException(Exception exc) {
        return this.zzafh.trySetException(exc);
    }

    public boolean trySetResult(TResult tresult) {
        return this.zzafh.trySetResult(tresult);
    }
}
