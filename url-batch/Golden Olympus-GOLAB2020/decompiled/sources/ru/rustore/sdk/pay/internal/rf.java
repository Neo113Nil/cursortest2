package ru.rustore.sdk.pay.internal;

import com.ironsource.b9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rf extends kotlin.jvm.internal.s implements Function1<u7, uf> {
    public rf(sf sfVar) {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u7 response = (u7) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        String jsonString = response.f45085c;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString).getJSONObject(b9.h.f15438E0);
        String string = jSONObject.getString("purchaseId");
        Intrinsics.checkNotNullExpressionValue(string, "jsonResponse.getString(PURCHASE_ID_KEY)");
        String string2 = jSONObject.getString(b9.h.f15490m);
        Intrinsics.checkNotNullExpressionValue(string2, "jsonResponse.getString(PRODUCT_TYPE_KEY)");
        String string3 = jSONObject.getString("purchaseStatus");
        Intrinsics.checkNotNullExpressionValue(string3, "jsonResponse.getString(PURCHASE_STATUS_KEY)");
        return new uf(string, string2, string3);
    }
}
