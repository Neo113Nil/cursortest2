package com.ironsource;

import io.jsonwebtoken.JwtParser;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ll {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f17097a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17098b;

    public ll(@Nullable String str, int i4) {
        this.f17097a = str;
        this.f17098b = i4;
    }

    private final String b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        String a4 = a(stackTrace, 6);
        String b4 = b(stackTrace, 6);
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{a4, b4}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    public final int a() {
        return this.f17098b;
    }

    @NotNull
    public final String c() {
        String str = this.f17097a;
        if (str == null || str.length() == 0) {
            return b();
        }
        return b() + " - " + this.f17097a;
    }

    private final String a(StackTraceElement[] stackTraceElementArr, int i4) {
        List emptyList;
        List emptyList2;
        if (stackTraceElementArr.length <= i4) {
            return "";
        }
        String className = stackTraceElementArr[i4].getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
        List g4 = new Regex("\\.").g(className, 0);
        if (!g4.isEmpty()) {
            ListIterator listIterator = g4.listIterator(g4.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    emptyList = CollectionsKt.take(g4, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt.emptyList();
        String str = ((String[]) emptyList.toArray(new String[0]))[r4.length - 1];
        if (!StringsKt.P(str, "$", false, 2, null)) {
            return str;
        }
        List g5 = new Regex("\\$").g(str, 0);
        if (!g5.isEmpty()) {
            ListIterator listIterator2 = g5.listIterator(g5.size());
            while (listIterator2.hasPrevious()) {
                if (((String) listIterator2.previous()).length() != 0) {
                    emptyList2 = CollectionsKt.take(g5, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList2 = CollectionsKt.emptyList();
        return ((String[]) emptyList2.toArray(new String[0]))[0];
    }

    private final String b(StackTraceElement[] stackTraceElementArr, int i4) {
        List emptyList;
        int i5;
        List emptyList2;
        List emptyList3;
        if (stackTraceElementArr.length <= i4) {
            return "";
        }
        String className = stackTraceElementArr[i4].getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
        List g4 = new Regex("\\.").g(className, 0);
        if (!g4.isEmpty()) {
            ListIterator listIterator = g4.listIterator(g4.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    emptyList = CollectionsKt.take(g4, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt.emptyList();
        String[] strArr = (String[]) emptyList.toArray(new String[0]);
        String str = strArr[strArr.length - 1];
        if (StringsKt.P(str, "$", false, 2, null)) {
            List g5 = new Regex("\\$").g(str, 0);
            if (!g5.isEmpty()) {
                ListIterator listIterator2 = g5.listIterator(g5.size());
                while (listIterator2.hasPrevious()) {
                    if (((String) listIterator2.previous()).length() != 0) {
                        emptyList3 = CollectionsKt.take(g5, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList3 = CollectionsKt.emptyList();
            return ((String[]) emptyList3.toArray(new String[0]))[1] + JwtParser.SEPARATOR_CHAR + stackTraceElementArr[i4].getMethodName();
        }
        String methodName = stackTraceElementArr[i4].getMethodName();
        Intrinsics.checkNotNullExpressionValue(methodName, "stackTrace[depth].methodName");
        if (!StringsKt.P(methodName, "$", false, 2, null) || stackTraceElementArr.length <= (i5 = i4 + 1)) {
            String methodName2 = stackTraceElementArr[i4].getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName2, "stackTrace[depth].methodName");
            return methodName2;
        }
        String className2 = stackTraceElementArr[i5].getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "stackTrace[depth + 1]\n                .className");
        List g6 = new Regex("\\$").g(className2, 0);
        if (!g6.isEmpty()) {
            ListIterator listIterator3 = g6.listIterator(g6.size());
            while (listIterator3.hasPrevious()) {
                if (((String) listIterator3.previous()).length() != 0) {
                    emptyList2 = CollectionsKt.take(g6, listIterator3.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList2 = CollectionsKt.emptyList();
        String[] strArr2 = (String[]) emptyList2.toArray(new String[0]);
        if (strArr2.length <= 1) {
            String methodName3 = stackTraceElementArr[i5].getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName3, "{\n              stackTra….methodName\n            }");
            return methodName3;
        }
        return strArr2[1] + JwtParser.SEPARATOR_CHAR + stackTraceElementArr[i5].getMethodName();
    }
}
