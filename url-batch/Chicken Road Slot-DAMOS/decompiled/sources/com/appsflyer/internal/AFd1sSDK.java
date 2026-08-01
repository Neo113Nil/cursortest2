package com.appsflyer.internal;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFd1sSDK {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/StackTraceElement;", "p0", "", "getCurrencyIso4217Code", "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1sSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends wd.p implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass4 getCurrencyIso4217Code = new AnonymousClass4();

        public AnonymousClass4() {
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
        return AFd1rSDK.AFAdRevenueData(th + "\n" + CollectionsKt.B(arrayList, "\n", null, null, AnonymousClass4.getCurrencyIso4217Code, 30), "SHA-256");
    }

    public static final AFc1aSDK getRevenue(Throwable th, String str) {
        th.getClass();
        str.getClass();
        String str2 = th.getClass().getName() + ": " + str;
        String AFAdRevenueData = AFAdRevenueData(th);
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return new AFc1aSDK(str2, AFAdRevenueData, stringWriter2, 0, 8, null);
    }
}
