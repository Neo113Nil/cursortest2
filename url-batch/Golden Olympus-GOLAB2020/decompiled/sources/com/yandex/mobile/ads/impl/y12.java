package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y12 {
    private static boolean a(StackTraceElement stackTraceElement, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((u50) obj).a() == v50.f33499b) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                String stackTraceElement2 = stackTraceElement.toString();
                Intrinsics.checkNotNullExpressionValue(stackTraceElement2, "toString(...)");
                if (StringsKt.P(stackTraceElement2, ((u50) obj2).b(), false, 2, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(@NotNull StackTraceElement[] stackTraceElementArr, @NotNull Set exclusions) {
        String className;
        StackTraceElement stackTraceElement;
        String className2;
        StackTraceElement stackTraceElement2;
        String className3;
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        Intrinsics.checkNotNullParameter(exclusions, "exclusions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : exclusions) {
            if (((u50) obj).a() == v50.f33500c) {
                arrayList.add(obj);
            }
        }
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                String arrays = Arrays.toString(stackTraceElementArr);
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                if (StringsKt.P(arrays, ((u50) obj2).b(), false, 2, null)) {
                    return false;
                }
            }
        }
        int length = stackTraceElementArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            StackTraceElement stackTraceElement3 = stackTraceElementArr[i5];
            String className4 = stackTraceElement3.getClassName();
            Intrinsics.checkNotNullExpressionValue(className4, "getClassName(...)");
            if ((StringsKt.K(className4, "com.yandex.mobile.ads", false, 2, null) || StringsKt.K(className4, "com.monetization.ads", false, 2, null) || StringsKt.K(className4, "com.yandex.div", false, 2, null)) && !a(stackTraceElement3, exclusions)) {
                break;
            }
            i5++;
        }
        if (i5 == -1) {
            return false;
        }
        do {
            i5++;
            StackTraceElement stackTraceElement4 = (StackTraceElement) AbstractC3219i.N(stackTraceElementArr, i5);
            if (stackTraceElement4 == null || a(stackTraceElement4, exclusions) || (stackTraceElement = (StackTraceElement) AbstractC3219i.N(stackTraceElementArr, i5)) == null || (className2 = stackTraceElement.getClassName()) == null || ((!StringsKt.K(className2, "com.yandex.mobile.ads", false, 2, null) && !StringsKt.K(className2, "com.monetization.ads", false, 2, null) && !StringsKt.K(className2, "com.yandex.div", false, 2, null)) || (stackTraceElement2 = (StackTraceElement) AbstractC3219i.N(stackTraceElementArr, i5)) == null || (className3 = stackTraceElement2.getClassName()) == null)) {
                break;
            }
        } while (!Intrinsics.areEqual(className3, CallbackStackTraceMarker.class.getName()));
        StackTraceElement stackTraceElement5 = (StackTraceElement) AbstractC3219i.N(stackTraceElementArr, i5);
        if (stackTraceElement5 != null && (className = stackTraceElement5.getClassName()) != null && Intrinsics.areEqual(className, CallbackStackTraceMarker.class.getName())) {
            z4 = true;
        }
        return !z4;
    }
}
