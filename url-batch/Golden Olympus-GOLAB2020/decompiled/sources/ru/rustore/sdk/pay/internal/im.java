package ru.rustore.sdk.pay.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.rustore.sdk.install.identifier.model.InstallationId;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.AppUserEmail;
import ru.rustore.sdk.pay.model.AppUserId;
import ru.rustore.sdk.pay.model.DeveloperPayload;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.ProductPurchaseParams;
import ru.rustore.sdk.pay.model.Quantity;

/* loaded from: classes3.dex */
public final class im extends kotlin.jvm.internal.s implements Function0<ki.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jm f44350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProductPurchaseParams f44351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(jm jmVar, ProductPurchaseParams productPurchaseParams) {
        super(0);
        this.f44350a = jmVar;
        this.f44351b = productPurchaseParams;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InstallationId installationId = this.f44350a.f44399b.f45262a.getInstallationId();
        String str = "api/v1/purchases/products/" + this.f44351b.getProductId().getValue() + "/twoStepPayment";
        jm jmVar = this.f44350a;
        ProductPurchaseParams productPurchaseParams = this.f44351b;
        jmVar.getClass();
        Quantity quantity = productPurchaseParams.getQuantity();
        Pair pair = TuplesKt.to(FirebaseAnalytics.Param.QUANTITY, Integer.valueOf(quantity != null ? quantity.getValue() : 1));
        OrderId orderId = productPurchaseParams.getOrderId();
        Pair pair2 = TuplesKt.to("orderId", orderId != null ? orderId.getValue() : null);
        DeveloperPayload developerPayload = productPurchaseParams.getDeveloperPayload();
        Pair pair3 = TuplesKt.to("developerPayload", developerPayload != null ? developerPayload.getValue() : null);
        AppUserId appUserId = productPurchaseParams.getAppUserId();
        Pair pair4 = TuplesKt.to("appUserId", appUserId != null ? appUserId.getValue() : null);
        AppUserEmail appUserEmail = productPurchaseParams.getAppUserEmail();
        String jSONObject = new JSONObject(MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to("appUserEmail", appUserEmail != null ? appUserEmail.getValue() : null))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(\n            …  ),\n        ).toString()");
        String G3 = StringsKt.G(jSONObject, "\\", "", false, 4, null);
        Map createMapBuilder = MapsKt.createMapBuilder();
        if (installationId != null) {
            createMapBuilder.put("rustore-install-id", installationId.getValue());
        }
        return new ki.b(str, MapsKt.build(createMapBuilder), G3);
    }
}
