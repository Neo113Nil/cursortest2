package com.onesignal.debug.internal.crash;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class a implements k {
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    @Override // com.onesignal.debug.internal.crash.k
    public Thread mainThread() {
        Thread thread = Looper.getMainLooper().getThread();
        kotlin.jvm.internal.i.d(thread, "getThread(...)");
        return thread;
    }

    @Override // com.onesignal.debug.internal.crash.k
    public StackTraceElement[] mainThreadStackTrace() {
        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
        kotlin.jvm.internal.i.d(stackTrace, "getStackTrace(...)");
        return stackTrace;
    }

    @Override // com.onesignal.debug.internal.crash.k
    public long now() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.onesignal.debug.internal.crash.k
    public void postToMainThread(Runnable runnable) {
        kotlin.jvm.internal.i.e(runnable, "runnable");
        this.mainHandler.post(runnable);
    }

    @Override // com.onesignal.debug.internal.crash.k
    public void removeFromMainThread(Runnable runnable) {
        kotlin.jvm.internal.i.e(runnable, "runnable");
        this.mainHandler.removeCallbacks(runnable);
    }
}
