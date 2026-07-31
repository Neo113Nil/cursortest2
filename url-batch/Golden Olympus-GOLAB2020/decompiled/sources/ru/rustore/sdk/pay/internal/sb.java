package ru.rustore.sdk.pay.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sb {
    @NotNull
    public static rb a(@NotNull String jsonString) {
        String str;
        String str2;
        String str3;
        String str4;
        int i4;
        List list;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString).getJSONObject(b9.h.f15438E0);
        JSONObject jsonProduct = jSONObject.getJSONObject("product");
        JSONObject jSONObject2 = jSONObject.getJSONObject("meta");
        String string = jSONObject.getString("purchaseId");
        String string2 = jSONObject.getString("invoiceId");
        String string3 = jSONObject.has("orderId") ? jSONObject.getString("orderId") : null;
        int optInt = jSONObject.optInt("amount", 0);
        String string4 = jSONObject.getString("amountLabel");
        String string5 = jSONObject.getString("purchaseStatus");
        String string6 = jSONObject.getString("purchaseTime");
        String string7 = jSONObject.getString(b9.h.f15490m);
        String string8 = jSONObject.getString("purchaseType");
        String string9 = jSONObject.has("developerPayload") ? jSONObject.getString("developerPayload") : null;
        int i5 = jSONObject.getInt(FirebaseAnalytics.Param.QUANTITY);
        String string10 = jsonProduct.getString("id");
        Intrinsics.checkNotNullExpressionValue(string10, "jsonProduct.getString(PRODUCT_ID_KEY)");
        String string11 = jsonProduct.getString(b9.h.f15436D0);
        String str5 = string3;
        Intrinsics.checkNotNullExpressionValue(string11, "jsonProduct.getString(PRODUCT_TITLE_KEY)");
        String string12 = jsonProduct.getString("imageUrl");
        Intrinsics.checkNotNullExpressionValue(string12, "jsonProduct.getString(PRODUCT_IMAGE_URL_KEY)");
        Intrinsics.checkNotNullExpressionValue(jsonProduct, "jsonProduct");
        if (!jsonProduct.has("subscriptionTariffs") || jsonProduct.isNull("subscriptionTariffs")) {
            str = string6;
            str2 = string7;
            str3 = string8;
            str4 = string9;
            i4 = i5;
            list = null;
        } else {
            JSONArray jSONArray = jsonProduct.getJSONArray("subscriptionTariffs");
            List createListBuilder = CollectionsKt.createListBuilder();
            str4 = string9;
            int length = jSONArray.length();
            i4 = i5;
            int i6 = 0;
            while (i6 < length) {
                int i7 = length;
                JSONObject jSONObject3 = jSONArray.getJSONObject(i6);
                int i8 = i6;
                int i9 = jSONObject3.getInt("price");
                String str6 = string8;
                String string13 = jSONObject3.getString("periodType");
                String str7 = string7;
                Intrinsics.checkNotNullExpressionValue(string13, "getString(PERIOD_TYPE_KEY)");
                int i10 = jSONObject3.getInt(IronSourceConstants.EVENTS_DURATION);
                String str8 = string6;
                String string14 = jSONObject3.getString("tariffType");
                Intrinsics.checkNotNullExpressionValue(string14, "getString(TARIFF_TYPE_KEY)");
                createListBuilder.add(new kl(i9, string13, i10, string14));
                i6 = i8 + 1;
                length = i7;
                jSONArray = jSONArray;
                string8 = str6;
                string7 = str7;
                string6 = str8;
            }
            str = string6;
            str2 = string7;
            str3 = string8;
            list = CollectionsKt.build(createListBuilder);
        }
        ob obVar = new ob(string10, string11, string12, list);
        h7 h7Var = new h7(jSONObject2.getBoolean("sandbox"));
        Intrinsics.checkNotNullExpressionValue(string, "getString(PURCHASE_ID_KEY)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(INVOICE_ID_KEY)");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(AMOUNT_LABEL_KEY)");
        Intrinsics.checkNotNullExpressionValue(string5, "getString(PURCHASE_STATUS_KEY)");
        String str9 = str;
        Intrinsics.checkNotNullExpressionValue(str9, "getString(PURCHASE_TIME_KEY)");
        String str10 = str2;
        Intrinsics.checkNotNullExpressionValue(str10, "getString(PRODUCT_TYPE_KEY)");
        String str11 = str3;
        Intrinsics.checkNotNullExpressionValue(str11, "getString(PURCHASE_TYPE_KEY)");
        return new rb(string, string2, str5, string4, optInt, string5, str9, str10, str11, str4, i4, obVar, h7Var);
    }
}
