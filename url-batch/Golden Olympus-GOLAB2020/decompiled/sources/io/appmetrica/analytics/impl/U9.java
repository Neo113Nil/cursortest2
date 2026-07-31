package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class U9 implements IHandlerExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final Looper f38353a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f38354b;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerThreadC3089xb f38355c;

    public U9(@NonNull String str) {
        this(a(str));
    }

    public static HandlerThreadC3089xb a(String str) {
        HandlerThreadC3089xb handlerThreadC3089xb = new HandlerThreadC3089xb(str + "-" + Od.f38077a.incrementAndGet());
        handlerThreadC3089xb.start();
        return handlerThreadC3089xb;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f38354b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j4) {
        this.f38354b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j4));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Handler getHandler() {
        return this.f38354b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Looper getLooper() {
        return this.f38353a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z4;
        HandlerThreadC3089xb handlerThreadC3089xb = this.f38355c;
        synchronized (handlerThreadC3089xb) {
            z4 = handlerThreadC3089xb.f40163a;
        }
        return z4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(@NonNull Runnable runnable) {
        this.f38354b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f38354b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC3089xb handlerThreadC3089xb = this.f38355c;
        synchronized (handlerThreadC3089xb) {
            handlerThreadC3089xb.f40163a = false;
            handlerThreadC3089xb.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f38354b.post(futureTask);
        return futureTask;
    }

    public U9(HandlerThreadC3089xb handlerThreadC3089xb) {
        this(handlerThreadC3089xb, handlerThreadC3089xb.getLooper(), new Handler(handlerThreadC3089xb.getLooper()));
    }

    public U9(@NonNull HandlerThreadC3089xb handlerThreadC3089xb, @NonNull Looper looper, @NonNull Handler handler) {
        this.f38355c = handlerThreadC3089xb;
        this.f38353a = looper;
        this.f38354b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j4, @NonNull TimeUnit timeUnit) {
        this.f38354b.postDelayed(runnable, timeUnit.toMillis(j4));
    }
}
