package com.onesignal.otel.crash;

import B4.r;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OtelCrashHandlerKt {
    public static final boolean isOneSignalAtFault(Throwable throwable) {
        i.e(throwable, "throwable");
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        i.d(stackTrace, "getStackTrace(...)");
        return isOneSignalAtFault(stackTrace);
    }

    public static final boolean isOneSignalAtFault(StackTraceElement[] stackTrace) {
        i.e(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            i.d(className, "getClassName(...)");
            if (r.O(className, "com.onesignal", false)) {
                return true;
            }
        }
        return false;
    }
}
