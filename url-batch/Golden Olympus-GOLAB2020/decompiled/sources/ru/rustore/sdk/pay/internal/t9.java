package ru.rustore.sdk.pay.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t9 {
    @NotNull
    public static v9 a(@NotNull JSONObject jsonObject) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString("paymentMethod");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(PAYMENT_METHOD_KEY)");
        try {
            Result.Companion companion = Result.Companion;
            String string2 = jsonObject.getString("cardBindingId");
            String string3 = jsonObject.getString("bankIcon");
            String string4 = jsonObject.getString("paymentSystemIcon");
            String string5 = jsonObject.getString("paymentSystem");
            String string6 = jsonObject.getString("maskedNumber");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(CARD_BINDING_ID_KEY)");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(BANK_ICON_KEY)");
            Intrinsics.checkNotNullExpressionValue(string6, "getString(MASKED_NUMBER_KEY)");
            Intrinsics.checkNotNullExpressionValue(string4, "getString(PAYMENT_SYSTEM_ICON_KEY)");
            Intrinsics.checkNotNullExpressionValue(string5, "getString(PAYMENT_SYSTEM_KEY)");
            m243constructorimpl = Result.m243constructorimpl(new v2(string2, string3, string6, string4, string5));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        return new v9(string, (v2) m243constructorimpl);
    }
}
