package com.facebook.bolts;

import defpackage.lh;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class TaskCompletionSource<TResult> {
    private final Task<TResult> task = new Task<>();

    public final Task<TResult> getTask() {
        return this.task;
    }

    public final void setCancelled() {
        if (trySetCancelled()) {
            return;
        }
        lh.g("Cannot cancel a completed task.");
    }

    public final void setError(Exception exc) {
        if (trySetError(exc)) {
            return;
        }
        lh.g("Cannot set the error on a completed task.");
    }

    public final void setResult(TResult tresult) {
        if (trySetResult(tresult)) {
            return;
        }
        lh.g("Cannot set the result of a completed task.");
    }

    public final boolean trySetCancelled() {
        return this.task.trySetCancelled();
    }

    public final boolean trySetError(Exception exc) {
        return this.task.trySetError(exc);
    }

    public final boolean trySetResult(TResult tresult) {
        return this.task.trySetResult(tresult);
    }
}
