package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class AFf1dSDK {
    public final boolean AFInAppEventParameterName(String str) {
        return values(this, str);
    }

    private static /* synthetic */ boolean values(AFf1dSDK aFf1dSDK, String str) {
        return AFInAppEventParameterName(str, TimeUnit.HOURS, 1L);
    }

    private static boolean AFInAppEventParameterName(String str, TimeUnit timeUnit, long j) {
        Long longOrNull;
        Object m9577constructorimpl;
        Intrinsics.checkNotNullParameter(timeUnit, "");
        if (str != null && (longOrNull = StringsKt.toLongOrNull(str)) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m9577constructorimpl = Result.m9577constructorimpl(Boolean.valueOf(Math.abs(longOrNull.longValue() - TimeUnit.MILLISECONDS.toSeconds(AFb1tSDK.AFInAppEventType().values().unregisterClient().AFKeystoreWrapper())) < timeUnit.toSeconds(1L)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m9577constructorimpl = Result.m9577constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m9580exceptionOrNullimpl = Result.m9580exceptionOrNullimpl(m9577constructorimpl);
            if (m9580exceptionOrNullimpl != null) {
                AFLogger.afErrorLog(new StringBuilder("Could not convert ").append(str).append(" to TS").toString(), m9580exceptionOrNullimpl);
            }
            if (Result.m9583isFailureimpl(m9577constructorimpl)) {
                m9577constructorimpl = null;
            }
            Boolean bool = (Boolean) m9577constructorimpl;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
