package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class G9 implements IHandlerExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final Looper f6034a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f6035b;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerThreadC0592jb f6036c;

    public G9(String str) {
        this(a(str));
    }

    public static HandlerThreadC0592jb a(String str) {
        HandlerThreadC0592jb handlerThreadC0592jb = new HandlerThreadC0592jb(str + TokenBuilder.TOKEN_DELIMITER + Gd.f6039a.incrementAndGet());
        handlerThreadC0592jb.start();
        return handlerThreadC0592jb;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f6035b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j3) {
        this.f6035b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Handler getHandler() {
        return this.f6035b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Looper getLooper() {
        return this.f6034a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z;
        HandlerThreadC0592jb handlerThreadC0592jb = this.f6036c;
        synchronized (handlerThreadC0592jb) {
            z = handlerThreadC0592jb.f7634a;
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(Runnable runnable) {
        this.f6035b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f6035b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC0592jb handlerThreadC0592jb = this.f6036c;
        synchronized (handlerThreadC0592jb) {
            handlerThreadC0592jb.f7634a = false;
            handlerThreadC0592jb.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f6035b.post(futureTask);
        return futureTask;
    }

    public G9(HandlerThreadC0592jb handlerThreadC0592jb) {
        this(handlerThreadC0592jb, handlerThreadC0592jb.getLooper(), new Handler(handlerThreadC0592jb.getLooper()));
    }

    public G9(HandlerThreadC0592jb handlerThreadC0592jb, Looper looper, Handler handler) {
        this.f6036c = handlerThreadC0592jb;
        this.f6034a = looper;
        this.f6035b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j3, TimeUnit timeUnit) {
        this.f6035b.postDelayed(runnable, timeUnit.toMillis(j3));
    }
}
