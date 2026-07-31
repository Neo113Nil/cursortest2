package com.chartboost.sdk.impl;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public abstract class w7 {
    public static final String a(Throwable th, int i) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (StringsKt.startsWith$default(className, "com.chartboost.sdk", false, 2, (Object) null)) {
                arrayList.add(stackTraceElement);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.take(arrayList, i), " | ", null, null, 0, null, b.b, 30, null);
        return joinToString$default.length() == 0 ? "<no_sdk_frames>" : joinToString$default;
    }

    public static final class b extends Lambda implements Function1 {
        public static final b b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            return StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null) + "." + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
        }
    }

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            return StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null) + "." + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
        }
    }

    public static final String a(Exception exc) {
        String message;
        return (exc == null || (message = exc.getMessage()) == null) ? "Unknown error" : message;
    }

    public static final String a(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (StringsKt.startsWith$default(className, "com.chartboost.sdk", false, 2, (Object) null)) {
                arrayList.add(stackTraceElement);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String className2 = ((StackTraceElement) obj).getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (!StringsKt.contains$default((CharSequence) className2, (CharSequence) "ExceptionUtils", false, 2, (Object) null)) {
                arrayList2.add(obj);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.take(arrayList2, i), " | ", null, null, 0, null, a.b, 30, null);
        return joinToString$default.length() == 0 ? "<no_sdk_frames>" : joinToString$default;
    }
}
