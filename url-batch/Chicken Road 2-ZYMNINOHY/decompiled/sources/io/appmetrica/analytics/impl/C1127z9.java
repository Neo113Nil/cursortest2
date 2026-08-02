package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1127z9 implements IHandlerExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final Looper f13096a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f13097b;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerThreadC0534cb f13098c;

    public C1127z9(String str) {
        this(a(str));
    }

    public static HandlerThreadC0534cb a(String str) {
        HandlerThreadC0534cb handlerThreadC0534cb = new HandlerThreadC0534cb(str + TokenBuilder.TOKEN_DELIMITER + ThreadFactoryC1131zd.f13101a.incrementAndGet());
        handlerThreadC0534cb.start();
        return handlerThreadC0534cb;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13097b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j4) {
        this.f13097b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j4));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Handler getHandler() {
        return this.f13097b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Looper getLooper() {
        return this.f13096a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z;
        HandlerThreadC0534cb handlerThreadC0534cb = this.f13098c;
        synchronized (handlerThreadC0534cb) {
            z = handlerThreadC0534cb.f11600a;
        }
        return z;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(Runnable runnable) {
        this.f13097b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f13097b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC0534cb handlerThreadC0534cb = this.f13098c;
        synchronized (handlerThreadC0534cb) {
            handlerThreadC0534cb.f11600a = false;
            handlerThreadC0534cb.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f13097b.post(futureTask);
        return futureTask;
    }

    public C1127z9(HandlerThreadC0534cb handlerThreadC0534cb) {
        this(handlerThreadC0534cb, handlerThreadC0534cb.getLooper(), new Handler(handlerThreadC0534cb.getLooper()));
    }

    public C1127z9(HandlerThreadC0534cb handlerThreadC0534cb, Looper looper, Handler handler) {
        this.f13098c = handlerThreadC0534cb;
        this.f13096a = looper;
        this.f13097b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j4, TimeUnit timeUnit) {
        this.f13097b.postDelayed(runnable, timeUnit.toMillis(j4));
    }
}
