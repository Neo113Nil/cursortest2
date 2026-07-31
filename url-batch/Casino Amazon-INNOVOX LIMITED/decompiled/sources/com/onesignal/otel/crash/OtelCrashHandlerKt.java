package com.onesignal.otel.crash;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: OtelCrashHandler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"isOneSignalAtFault", "", "stackTrace", "", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)Z", "throwable", "", "com.onesignal.otel"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelCrashHandlerKt {
    public static final boolean isOneSignalAtFault(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        return isOneSignalAtFault(stackTrace);
    }

    public static final boolean isOneSignalAtFault(StackTraceElement[] stackTrace) {
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (StringsKt.startsWith$default(className, "com.onesignal", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }
}
