package com.onesignal.debug.internal.crash;

/* loaded from: classes.dex */
public abstract class d {
    public static final String buildBlockFingerprint(StackTraceElement[] stackTrace) {
        String str;
        String str2;
        kotlin.jvm.internal.i.e(stackTrace, "stackTrace");
        StackTraceElement stackTraceElement = null;
        int i7 = 0;
        StackTraceElement stackTraceElement2 = stackTrace.length == 0 ? null : stackTrace[0];
        if (stackTraceElement2 == null || (str = stackTraceElement2.toString()) == null) {
            str = "unknown";
        }
        int length = stackTrace.length;
        while (true) {
            if (i7 >= length) {
                break;
            }
            StackTraceElement stackTraceElement3 = stackTrace[i7];
            String className = stackTraceElement3.getClassName();
            kotlin.jvm.internal.i.d(className, "getClassName(...)");
            if (F5.q.I(className, "com.onesignal")) {
                stackTraceElement = stackTraceElement3;
                break;
            }
            i7++;
        }
        if (stackTraceElement == null || (str2 = stackTraceElement.toString()) == null) {
            str2 = "none";
        }
        return "top=" + str + "|onesignal=" + str2;
    }

    public static final l classifyBlock(long j4, long j7, long j8, long j9, long j10, long j11, boolean z5) {
        if (!z5) {
            j10 = j11;
        }
        return j7 - j8 > j9 ? l.FROZEN_PROCESS : j4 <= j10 ? l.RESPONSIVE : z5 ? l.FOREGROUND_ANR : l.BACKGROUND_WARNING;
    }
}
