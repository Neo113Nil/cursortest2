package io.reactivex.rxjava3.internal.schedulers;

import com.fillr.browsersdk.Fillr;
import com.google.common.primitives.UnsignedBytes;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class ScheduledDirectTask extends AtomicReference implements Callable, Disposable {
    public static final FutureTask DISPOSED;
    public static final FutureTask FINISHED;
    public final boolean interruptOnCancel = true;
    public final Runnable runnable;
    public Thread runner;

    static {
        Fillr.AnonymousClass3 anonymousClass3 = Functions.EMPTY_RUNNABLE;
        FINISHED = new FutureTask(anonymousClass3, null);
        DISPOSED = new FutureTask(anonymousClass3, null);
    }

    public ScheduledDirectTask(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = FINISHED;
        this.runner = Thread.currentThread();
        try {
            try {
                this.runnable.run();
                return null;
            } finally {
                lazySet(futureTask);
                this.runner = null;
            }
        } catch (Throwable th) {
            UnsignedBytes.onError(th);
            throw th;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == FINISHED || future == (futureTask = DISPOSED) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        if (this.runner == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.interruptOnCancel);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Future future = (Future) get();
        if (future == FINISHED) {
            str = "Finished";
        } else if (future == DISPOSED) {
            str = "Disposed";
        } else if (this.runner != null) {
            str = "Running on " + this.runner;
        } else {
            str = "Waiting";
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ScheduledDirectTask[", str, "]");
    }
}
