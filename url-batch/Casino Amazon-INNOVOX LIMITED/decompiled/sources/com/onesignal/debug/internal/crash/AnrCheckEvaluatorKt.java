package com.onesignal.debug.internal.crash;

import com.facebook.react.uimanager.ViewProps;
import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AnrCheckEvaluator.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0002\u0010\u0005\u001a@\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¨\u0006\u0011"}, d2 = {"buildBlockFingerprint", "", "stackTrace", "", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)Ljava/lang/String;", "classifyBlock", "Lcom/onesignal/debug/internal/crash/BlockClassification;", "timeSinceLastResponseMs", "", "actualSleepMs", "checkIntervalMs", "frozenSlackMs", "anrThresholdMs", "backgroundThresholdMs", "inForeground", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnrCheckEvaluatorKt {
    public static final BlockClassification classifyBlock(long j, long j2, long j3, long j4, long j5, long j6, boolean z) {
        if (!z) {
            j5 = j6;
        }
        if (j2 - j3 > j4) {
            return BlockClassification.FROZEN_PROCESS;
        }
        if (j <= j5) {
            return BlockClassification.RESPONSIVE;
        }
        if (z) {
            return BlockClassification.FOREGROUND_ANR;
        }
        return BlockClassification.BACKGROUND_WARNING;
    }

    public static final String buildBlockFingerprint(StackTraceElement[] stackTrace) {
        String str;
        StackTraceElement stackTraceElement;
        String str2;
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        StackTraceElement stackTraceElement2 = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
        if (stackTraceElement2 == null || (str = stackTraceElement2.toString()) == null) {
            str = "unknown";
        }
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            stackTraceElement = null;
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement3 = stackTrace[i];
            String className = stackTraceElement3.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (StringsKt.startsWith$default(className, "com.onesignal", false, 2, (Object) null)) {
                stackTraceElement = stackTraceElement3;
                break;
            }
            i++;
        }
        if (stackTraceElement == null || (str2 = stackTraceElement.toString()) == null) {
            str2 = ViewProps.NONE;
        }
        return "top=" + str + "|onesignal=" + str2;
    }
}
