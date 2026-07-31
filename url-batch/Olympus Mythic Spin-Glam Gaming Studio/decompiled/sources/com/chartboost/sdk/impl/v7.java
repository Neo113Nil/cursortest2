package com.chartboost.sdk.impl;

import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.si;
import java.lang.Thread;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class v7 {
    public static final v7 a = new v7();
    public static q7 b;

    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        b = Chartboost.isSdkStarted() ? fi.a() : null;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.chartboost.sdk.impl.v7$$ExternalSyntheticLambda0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                v7.a(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    public static final void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        v7 v7Var = a;
        Intrinsics.checkNotNull(th);
        if (v7Var.b(th)) {
            try {
                q7 q7Var = b;
                if (q7Var != null) {
                    q7Var.track((pi) new l7(si.i.o, v7Var.a(th), null, null, null, 28, null));
                }
            } catch (Exception unused) {
            }
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public final String a(Throwable th) {
        String jSONObject = new JSONObject().put("reason", "dismiss_event due to the unhandled exceptions").put("error", String.valueOf(th)).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final boolean b(Throwable th) {
        String className;
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (stackTraceElement != null && (className = stackTraceElement.getClassName()) != null) {
                Intrinsics.checkNotNull(className);
                if (StringsKt.startsWith$default(className, "com.chartboost.sdk", false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
