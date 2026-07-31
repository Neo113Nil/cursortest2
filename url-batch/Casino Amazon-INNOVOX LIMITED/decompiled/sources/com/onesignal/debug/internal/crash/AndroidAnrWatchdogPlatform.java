package com.onesignal.debug.internal.crash;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.onesignal.core.BuildConfig;
import io.opentelemetry.semconv.JvmAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelAnrDetector.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/onesignal/debug/internal/crash/AndroidAnrWatchdogPlatform;", "Lcom/onesignal/debug/internal/crash/AnrWatchdogPlatform;", "()V", "mainHandler", "Landroid/os/Handler;", "mainThread", "Ljava/lang/Thread;", "mainThreadStackTrace", "", "Ljava/lang/StackTraceElement;", "()[Ljava/lang/StackTraceElement;", "now", "", "postToMainThread", "", JvmAttributes.JvmThreadStateValues.RUNNABLE, "Ljava/lang/Runnable;", "removeFromMainThread", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AndroidAnrWatchdogPlatform implements AnrWatchdogPlatform {
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    @Override // com.onesignal.debug.internal.crash.AnrWatchdogPlatform
    public void postToMainThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.mainHandler.post(runnable);
    }

    @Override // com.onesignal.debug.internal.crash.AnrWatchdogPlatform
    public void removeFromMainThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.mainHandler.removeCallbacks(runnable);
    }

    @Override // com.onesignal.debug.internal.crash.AnrWatchdogPlatform
    public Thread mainThread() {
        Thread thread = Looper.getMainLooper().getThread();
        Intrinsics.checkNotNullExpressionValue(thread, "getThread(...)");
        return thread;
    }

    @Override // com.onesignal.debug.internal.crash.AnrWatchdogPlatform
    public StackTraceElement[] mainThreadStackTrace() {
        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        return stackTrace;
    }

    @Override // com.onesignal.debug.internal.crash.AnrWatchdogPlatform
    public long now() {
        return SystemClock.uptimeMillis();
    }
}
