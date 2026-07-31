package ru.rustore.sdk.pay.internal;

import com.ironsource.b9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l7 extends kotlin.jvm.internal.s implements Function1<u7, g0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m7 f44505a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(m7 m7Var) {
        super(1);
        this.f44505a = m7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u7 response = (u7) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        h0 h0Var = this.f44505a.f44638b;
        String jsonString = response.f45085c;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString).getJSONObject(b9.h.f15438E0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("product");
        String string = jSONObject.getString("purchaseId");
        String string2 = jSONObject.getString("invoiceId");
        String string3 = jSONObject.getString("description");
        int optInt = jSONObject.optInt("amount", 0);
        String string4 = jSONObject.getString("amountLabel");
        String string5 = jSONObject.getString("purchaseTime");
        String string6 = jSONObject.getString("purchaseStatus");
        String string7 = jSONObject.getString(b9.h.f15490m);
        String string8 = jSONObject.getString("purchaseType");
        String string9 = jSONObject2.getString("id");
        Intrinsics.checkNotNullExpressionValue(string9, "jsonProduct.getString(PRODUCT_ID_KEY)");
        String string10 = jSONObject2.getString(b9.h.f15436D0);
        Intrinsics.checkNotNullExpressionValue(string10, "jsonProduct.getString(PRODUCT_TITLE_KEY)");
        String string11 = jSONObject2.getString("imageUrl");
        Intrinsics.checkNotNullExpressionValue(string11, "jsonProduct.getString(PRODUCT_IMAGE_URL_KEY)");
        ob obVar = new ob(string9, string10, string11, null);
        Intrinsics.checkNotNullExpressionValue(string, "getString(PURCHASE_ID_KEY)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(INVOICE_ID_KEY)");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(DESCRIPTION_KEY)");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(AMOUNT_LABEL_KEY)");
        Intrinsics.checkNotNullExpressionValue(string6, "getString(PURCHASE_STATUS_KEY)");
        Intrinsics.checkNotNullExpressionValue(string7, "getString(PRODUCT_TYPE_KEY)");
        Intrinsics.checkNotNullExpressionValue(string8, "getString(PURCHASE_TYPE_KEY)");
        return new g0(string, string2, string3, optInt, string4, string6, string7, string8, string5, obVar);
    }
}
