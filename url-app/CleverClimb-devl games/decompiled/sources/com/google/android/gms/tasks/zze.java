package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zze<TResult, TContinuationResult> implements OnCanceledListener, OnFailureListener, OnSuccessListener<TContinuationResult>, zzq<TResult> {
    private final Executor zzafk;
    private final Continuation<TResult, Task<TContinuationResult>> zzafl;
    private final zzu<TContinuationResult> zzafm;

    public zze(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation, zzu<TContinuationResult> zzuVar) {
        this.zzafk = executor;
        this.zzafl = continuation;
        this.zzafm = zzuVar;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zzafm.zzdp();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(Task<TResult> task) {
        this.zzafk.execute(new zzf(this, task));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.zzafm.setException(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.zzafm.setResult(tcontinuationresult);
    }
}
