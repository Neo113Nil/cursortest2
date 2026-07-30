package com.appsflyer.internal;

import R5.C0164d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFd1tSDK {

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1tSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends kotlin.jvm.internal.p implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass5 getRevenue = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            Intrinsics.checkNotNullParameter(stackTraceElement, "");
            return "at " + stackTraceElement;
        }
    }

    private static String AFAdRevenueData(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(th, "");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!kotlin.text.p.l(className, "com.appsflyer")) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        String str = th + "\n" + CollectionsKt.s(arrayList, "\n", null, null, AnonymousClass5.getRevenue, 30);
        Intrinsics.checkNotNullParameter(str, "");
        return AFd1pSDK.getMediationNetwork(str, "SHA-256");
    }

    public static final AFc1bSDK AFAdRevenueData(Throwable th, String str) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        String name = th.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return new AFc1bSDK(name + ": " + str, AFAdRevenueData(th), C0164d.b(th), 0, 8, null);
    }
}
