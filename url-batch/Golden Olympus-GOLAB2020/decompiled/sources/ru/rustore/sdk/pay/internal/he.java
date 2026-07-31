package ru.rustore.sdk.pay.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class he extends kotlin.jvm.internal.s implements Function1<u7, le> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ke f44236a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(ke keVar) {
        super(1);
        this.f44236a = keVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        hl hlVar;
        u7 response = (u7) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        me meVar = this.f44236a.f44477b;
        String jsonString = response.f45085c;
        meVar.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jsonResponse = new JSONObject(jsonString).getJSONObject(b9.h.f15438E0);
        JSONObject jSONObject = jsonResponse.getJSONObject("meta");
        JSONObject optJSONObject = jsonResponse.optJSONObject("subscription");
        String string = jsonResponse.getString("purchaseId");
        String string2 = jsonResponse.getString("productId");
        String string3 = jsonResponse.getString("invoiceId");
        Intrinsics.checkNotNullExpressionValue(jsonResponse, "jsonResponse");
        String a4 = d7.a(jsonResponse, "orderId");
        String string4 = jsonResponse.getString("purchaseType");
        String string5 = jsonResponse.getString(b9.h.f15490m);
        String string6 = jsonResponse.getString("description");
        String string7 = jsonResponse.getString("amountLabel");
        int i4 = jsonResponse.getInt("amount");
        String string8 = jsonResponse.getString("currency");
        int i5 = jsonResponse.getInt(FirebaseAnalytics.Param.QUANTITY);
        String string9 = jsonResponse.getString("purchaseStatus");
        String string10 = jsonResponse.getString("purchaseTime");
        String a5 = d7.a(jsonResponse, "developerPayload");
        if (optJSONObject != null) {
            String string11 = optJSONObject.getString("expirationDate");
            str = a4;
            Intrinsics.checkNotNullExpressionValue(string11, "info.getString(SUBSCRIPTION_EXPIRATION_DATE_KEY)");
            String string12 = optJSONObject.getString("period");
            Intrinsics.checkNotNullExpressionValue(string12, "info.getString(SUBSCRIPTION_PERIOD_KEY)");
            hlVar = new hl(string11, string12);
        } else {
            str = a4;
            hlVar = null;
        }
        hl hlVar2 = hlVar;
        h7 h7Var = new h7(jSONObject.getBoolean("sandbox"));
        Intrinsics.checkNotNullExpressionValue(string, "getString(PURCHASE_ID_KEY)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(PRODUCT_ID_KEY)");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(INVOICE_ID_KEY)");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(PURCHASE_TYPE_KEY)");
        Intrinsics.checkNotNullExpressionValue(string5, "getString(PRODUCT_TYPE_KEY)");
        Intrinsics.checkNotNullExpressionValue(string6, "getString(DESCRIPTION_KEY)");
        Intrinsics.checkNotNullExpressionValue(string7, "getString(AMOUNT_LABEL_KEY)");
        Intrinsics.checkNotNullExpressionValue(string8, "getString(CURRENCY_KEY)");
        Intrinsics.checkNotNullExpressionValue(string9, "getString(PURCHASE_STATUS_KEY)");
        Intrinsics.checkNotNullExpressionValue(string10, "getString(PURCHASE_TIME_KEY)");
        return new le(string, string2, string3, str, string4, string5, string6, string7, i4, string8, i5, string9, string10, a5, h7Var, hlVar2);
    }
}
