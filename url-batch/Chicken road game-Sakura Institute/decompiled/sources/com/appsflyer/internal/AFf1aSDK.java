package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class AFf1aSDK {
    public final boolean AFKeystoreWrapper(String str) {
        return AFInAppEventParameterName(this, str);
    }

    private static /* synthetic */ boolean AFInAppEventParameterName(AFf1aSDK aFf1aSDK, String str) {
        return AFKeystoreWrapper(str, TimeUnit.HOURS, 1L);
    }

    private static boolean AFKeystoreWrapper(String str, TimeUnit timeUnit, long j) {
        Long longOrNull;
        Object m6819constructorimpl;
        Intrinsics.checkNotNullParameter(timeUnit, "");
        if (str != null && (longOrNull = StringsKt.toLongOrNull(str)) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m6819constructorimpl = Result.m6819constructorimpl(Boolean.valueOf(Math.abs(longOrNull.longValue() - TimeUnit.MILLISECONDS.toSeconds(AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().e().AFInAppEventType())) < timeUnit.toSeconds(1L)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m6822exceptionOrNullimpl = Result.m6822exceptionOrNullimpl(m6819constructorimpl);
            if (m6822exceptionOrNullimpl != null) {
                AFLogger.afErrorLog(new StringBuilder("Could not convert ").append(str).append(" to TS").toString(), m6822exceptionOrNullimpl);
            }
            if (Result.m6825isFailureimpl(m6819constructorimpl)) {
                m6819constructorimpl = null;
            }
            Boolean bool = (Boolean) m6819constructorimpl;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
