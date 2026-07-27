package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class G9 implements IHandlerExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final Looper f6827a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f6828b;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerThreadC0743jb f6829c;

    public G9(String str) {
        this(a(str));
    }

    public static HandlerThreadC0743jb a(String str) {
        HandlerThreadC0743jb handlerThreadC0743jb = new HandlerThreadC0743jb(str + "-" + Gd.f6832a.incrementAndGet());
        handlerThreadC0743jb.start();
        return handlerThreadC0743jb;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f6828b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j2) {
        this.f6828b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j2));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Handler getHandler() {
        return this.f6828b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Looper getLooper() {
        return this.f6827a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z;
        HandlerThreadC0743jb handlerThreadC0743jb = this.f6829c;
        synchronized (handlerThreadC0743jb) {
            z = handlerThreadC0743jb.f8528a;
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(Runnable runnable) {
        this.f6828b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f6828b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC0743jb handlerThreadC0743jb = this.f6829c;
        synchronized (handlerThreadC0743jb) {
            handlerThreadC0743jb.f8528a = false;
            handlerThreadC0743jb.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f6828b.post(futureTask);
        return futureTask;
    }

    public G9(HandlerThreadC0743jb handlerThreadC0743jb) {
        this(handlerThreadC0743jb, handlerThreadC0743jb.getLooper(), new Handler(handlerThreadC0743jb.getLooper()));
    }

    public G9(HandlerThreadC0743jb handlerThreadC0743jb, Looper looper, Handler handler) {
        this.f6829c = handlerThreadC0743jb;
        this.f6827a = looper;
        this.f6828b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j2, TimeUnit timeUnit) {
        this.f6828b.postDelayed(runnable, timeUnit.toMillis(j2));
    }
}
