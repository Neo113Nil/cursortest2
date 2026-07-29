package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes2.dex */
final class zzg<TResult> implements zzq<TResult> {
    private final Object mLock = new Object();
    private final Executor zzafk;

    @GuardedBy("mLock")
    private OnCanceledListener zzafq;

    public zzg(Executor executor, OnCanceledListener onCanceledListener) {
        this.zzafk = executor;
        this.zzafq = onCanceledListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzafq = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void onComplete(Task task) {
        if (task.isCanceled()) {
            synchronized (this.mLock) {
                if (this.zzafq == null) {
                    return;
                }
                this.zzafk.execute(new zzh(this));
            }
        }
    }
}
