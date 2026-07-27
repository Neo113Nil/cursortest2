package com.appsflyer.internal;

import M2.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* loaded from: classes.dex */
public final class AFd1dSDK {

    @Metadata
    /* renamed from: com.appsflyer.internal.AFd1dSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends p implements Function1<StackTraceElement, CharSequence> {
        public static final AnonymousClass5 AFInAppEventParameterName = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            Intrinsics.checkNotNullParameter(stackTraceElement, "");
            return "at ".concat(String.valueOf(stackTraceElement));
        }
    }

    public static final List<StackTraceElement> values(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!u.n(className, "com.appsflyer")) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return arrayList;
    }
}
