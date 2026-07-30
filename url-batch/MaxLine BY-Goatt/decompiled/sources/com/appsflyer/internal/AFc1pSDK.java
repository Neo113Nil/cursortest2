package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import defpackage.o81;
import defpackage.tp2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFc1pSDK {
    private static String AFInAppEventParameterName;
    private static String AFKeystoreWrapper;
    public final ExecutorService valueOf;
    public final AFc1mSDK values;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: com.appsflyer.internal.AFc1pSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends o81 implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass1 AFKeystoreWrapper = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            stackTraceElement.getClass();
            return "at ".concat(String.valueOf(stackTraceElement));
        }
    }

    public AFc1pSDK(AFc1mSDK aFc1mSDK, ExecutorService executorService) {
        this.values = aFc1mSDK;
        this.valueOf = executorService;
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

    public static final List<StackTraceElement> valueOf(Throwable th) {
        th.getClass();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            if (!tp2.o(className, "com.appsflyer", false)) {
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
}
