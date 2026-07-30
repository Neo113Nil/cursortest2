package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class AFc1pSDK {
    private static String AFInAppEventParameterName;
    private static String AFKeystoreWrapper;
    public final ExecutorService valueOf;
    public final AFc1mSDK values;

    public static final List<StackTraceElement> valueOf(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!StringsKt.startsWith$default(className, "com.appsflyer", false, 2, (Object) null)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return arrayList;
    }

    public AFc1pSDK() {
    }

    public static void AFInAppEventParameterName(String str) {
        AFKeystoreWrapper = str;
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        AFInAppEventParameterName = sb.toString();
    }

    public static void AFKeystoreWrapper(String str) {
        if (AFKeystoreWrapper == null) {
            AFInAppEventParameterName(AFa1dSDK.valueOf().AFInAppEventParameterName().AFVersionDeclaration().AFInAppEventType);
        }
        String str2 = AFKeystoreWrapper;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, AFInAppEventParameterName));
        }
    }

    public AFc1pSDK(AFc1mSDK aFc1mSDK, ExecutorService executorService) {
        this.values = aFc1mSDK;
        this.valueOf = executorService;
    }
}
