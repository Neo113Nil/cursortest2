package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.pc0;
import defpackage.ry0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFd1tSDK {

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StackTraceElement;", "p0", "", "getCurrencyIso4217Code", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1tSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends pc0 implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass5 getRevenue = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            stackTraceElement.getClass();
            return "at " + stackTraceElement;
        }
    }

    private static String AFAdRevenueData(Throwable th) {
        th.getClass();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            if (!className.startsWith("com.appsflyer")) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return AFd1pSDK.getMediationNetwork(th + "\n" + CollectionsKt.r(arrayList, "\n", null, null, AnonymousClass5.getRevenue, 30), "SHA-256");
    }

    public static final AFc1bSDK AFAdRevenueData(Throwable th, String str) {
        th.getClass();
        str.getClass();
        th.getClass();
        String str2 = th.getClass().getName() + ": " + str;
        String AFAdRevenueData = AFAdRevenueData(th);
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return new AFc1bSDK(str2, AFAdRevenueData, stringWriter2, 0, 8, null);
    }
}
