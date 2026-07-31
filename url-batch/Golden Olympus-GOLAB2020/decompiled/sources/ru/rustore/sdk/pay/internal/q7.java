package ru.rustore.sdk.pay.internal;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class q7 {
    @NotNull
    public static RuStorePaymentException.RuStorePaymentNetworkException a(@NotNull u7 requestResult) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(requestResult, "requestResult");
        int i4 = requestResult.f45084b;
        if (i4 < 0) {
            return new RuStorePaymentException.RuStorePaymentNetworkException("NETWORK_ERROR", "", "Network error, response code: " + requestResult.f45084b, null, 8, null);
        }
        if (i4 < 400) {
            return new RuStorePaymentException.RuStorePaymentNetworkException("Internal error", "", "Internal error", null, 8, null);
        }
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(requestResult.f45085c);
            String optString = jSONObject.optString("errorCode", "Internal error");
            String optString2 = jSONObject.optString(CrashHianalyticsData.MESSAGE, "Internal error");
            String optString3 = jSONObject.optString("errorId", "");
            Intrinsics.checkNotNullExpressionValue(optString3, "optString(ERROR_ID_KEY, \"\")");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(MESSAGE_KEY, INTERNAL_ERROR)");
            m243constructorimpl = Result.m243constructorimpl(new RuStorePaymentException.RuStorePaymentNetworkException(optString, optString3, optString2, null, 8, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            m243constructorimpl = new RuStorePaymentException.RuStorePaymentNetworkException("Internal error", "", "Internal error", null, 8, null);
        }
        return (RuStorePaymentException.RuStorePaymentNetworkException) m243constructorimpl;
    }
}
