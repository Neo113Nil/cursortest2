package ru.rustore.sdk.pay.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ie extends kotlin.jvm.internal.s implements Function1<u7, List<? extends le>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ke f44331a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(ke keVar) {
        super(1);
        this.f44331a = keVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        hl hlVar;
        u7 response = (u7) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        af afVar = this.f44331a.f44478c;
        String jsonString = response.f45085c;
        afVar.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        List createListBuilder = CollectionsKt.createListBuilder();
        JSONArray jSONArray = new JSONObject(jsonString).getJSONArray(b9.h.f15438E0);
        int length = jSONArray.length();
        int i4 = 0;
        while (i4 < length) {
            JSONObject fromJson$lambda$2$lambda$1 = jSONArray.getJSONObject(i4);
            JSONObject jSONObject = fromJson$lambda$2$lambda$1.getJSONObject("meta");
            JSONObject subscriptionJSONObject = fromJson$lambda$2$lambda$1.optJSONObject("subscription");
            String string = fromJson$lambda$2$lambda$1.getString("purchaseId");
            String string2 = fromJson$lambda$2$lambda$1.getString("productId");
            String string3 = fromJson$lambda$2$lambda$1.getString("invoiceId");
            Intrinsics.checkNotNullExpressionValue(fromJson$lambda$2$lambda$1, "fromJson$lambda$2$lambda$1");
            String a4 = d7.a(fromJson$lambda$2$lambda$1, "orderId");
            String string4 = fromJson$lambda$2$lambda$1.getString("purchaseType");
            String string5 = fromJson$lambda$2$lambda$1.getString(b9.h.f15490m);
            String string6 = fromJson$lambda$2$lambda$1.getString("description");
            String string7 = fromJson$lambda$2$lambda$1.getString("amountLabel");
            JSONArray jSONArray2 = jSONArray;
            int i5 = fromJson$lambda$2$lambda$1.getInt("amount");
            String string8 = fromJson$lambda$2$lambda$1.getString("currency");
            int i6 = fromJson$lambda$2$lambda$1.getInt(FirebaseAnalytics.Param.QUANTITY);
            String string9 = fromJson$lambda$2$lambda$1.getString("purchaseStatus");
            int i7 = length;
            String string10 = fromJson$lambda$2$lambda$1.getString("purchaseTime");
            int i8 = i4;
            String a5 = d7.a(fromJson$lambda$2$lambda$1, "developerPayload");
            if (subscriptionJSONObject != null) {
                Intrinsics.checkNotNullExpressionValue(subscriptionJSONObject, "subscriptionJSONObject");
                String string11 = subscriptionJSONObject.getString("expirationDate");
                str = a4;
                Intrinsics.checkNotNullExpressionValue(string11, "info.getString(SUBSCRIPTION_EXPIRATION_DATE_KEY)");
                String string12 = subscriptionJSONObject.getString("period");
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
            createListBuilder.add(new le(string, string2, string3, str, string4, string5, string6, string7, i5, string8, i6, string9, string10, a5, h7Var, hlVar2));
            i4 = i8 + 1;
            jSONArray = jSONArray2;
            length = i7;
        }
        return CollectionsKt.build(createListBuilder);
    }
}
