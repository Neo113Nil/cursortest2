package com.facebook.bolts;

import com.facebook.bolts.Task;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class UnobservedErrorNotifier {
    private Task<?> task;

    public UnobservedErrorNotifier(Task<?> task) {
        this.task = task;
    }

    public final void finalize() {
        Task.UnobservedExceptionHandler unobservedExceptionHandler;
        Task<?> task = this.task;
        if (task == null || (unobservedExceptionHandler = Task.Companion.getUnobservedExceptionHandler()) == null) {
            return;
        }
        unobservedExceptionHandler.unobservedException(task, new UnobservedTaskException(task.getError()));
    }

    public final void setObserved() {
        this.task = null;
    }
}
