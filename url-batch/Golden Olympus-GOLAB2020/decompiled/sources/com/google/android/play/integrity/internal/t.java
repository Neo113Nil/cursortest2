package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f13640a;

    t() {
        this.f13640a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f13640a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void b();

    final TaskCompletionSource c() {
        return this.f13640a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e4) {
            a(e4);
        }
    }

    public t(TaskCompletionSource taskCompletionSource) {
        this.f13640a = taskCompletionSource;
    }
}
