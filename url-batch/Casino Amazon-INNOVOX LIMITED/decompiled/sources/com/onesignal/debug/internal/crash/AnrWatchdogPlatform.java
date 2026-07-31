package com.onesignal.debug.internal.crash;

import com.onesignal.core.BuildConfig;
import io.opentelemetry.semconv.JvmAttributes;
import kotlin.Metadata;

/* compiled from: OtelAnrDetector.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lcom/onesignal/debug/internal/crash/AnrWatchdogPlatform;", "", "mainThread", "Ljava/lang/Thread;", "mainThreadStackTrace", "", "Ljava/lang/StackTraceElement;", "()[Ljava/lang/StackTraceElement;", "now", "", "postToMainThread", "", JvmAttributes.JvmThreadStateValues.RUNNABLE, "Ljava/lang/Runnable;", "removeFromMainThread", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AnrWatchdogPlatform {
    Thread mainThread();

    StackTraceElement[] mainThreadStackTrace();

    long now();

    void postToMainThread(Runnable runnable);

    void removeFromMainThread(Runnable runnable);
}
