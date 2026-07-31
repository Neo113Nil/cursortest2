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
import ru.rustore.sdk.pay.internal.g;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.AppUserEmail;
import ru.rustore.sdk.pay.model.AppUserId;
import ru.rustore.sdk.pay.model.DeveloperPayload;
import ru.rustore.sdk.pay.model.OrderId;
import ru.rustore.sdk.pay.model.ProductPurchaseParams;
import ru.rustore.sdk.pay.model.Quantity;

/* loaded from: classes3.dex */
public final class vb extends kotlin.jvm.internal.s implements Function0<ki.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wb f45125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProductPurchaseParams f45126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.a f45127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(wb wbVar, ProductPurchaseParams productPurchaseParams, g.a aVar) {
        super(0);
        this.f45125a = wbVar;
        this.f45126b = productPurchaseParams;
        this.f45127c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        InstallationId installationId = this.f45125a.f45163b.f45262a.getInstallationId();
        String str2 = "api/v1/purchases/products/" + this.f45126b.getProductId().getValue();
        wb wbVar = this.f45125a;
        ProductPurchaseParams productPurchaseParams = this.f45126b;
        g.a aVar = this.f45127c;
        wbVar.getClass();
        Quantity quantity = productPurchaseParams.getQuantity();
        Pair pair = TuplesKt.to(FirebaseAnalytics.Param.QUANTITY, Integer.valueOf(quantity != null ? quantity.getValue() : 1));
        OrderId orderId = productPurchaseParams.getOrderId();
        Pair pair2 = TuplesKt.to("orderId", orderId != null ? orderId.getValue() : null);
        DeveloperPayload developerPayload = productPurchaseParams.getDeveloperPayload();
        Pair pair3 = TuplesKt.to("developerPayload", developerPayload != null ? developerPayload.getValue() : null);
        AppUserId appUserId = productPurchaseParams.getAppUserId();
        Pair pair4 = TuplesKt.to("appUserId", appUserId != null ? appUserId.getValue() : null);
        AppUserEmail appUserEmail = productPurchaseParams.getAppUserEmail();
        Pair pair5 = TuplesKt.to("appUserEmail", appUserEmail != null ? appUserEmail.getValue() : null);
        if (aVar instanceof g.a.C0257a) {
            str = "ONE_STEP";
        } else {
            if (!(aVar instanceof g.a.b)) {
                throw new W1.m();
            }
            str = "TWO_STEP";
        }
        String jSONObject = new JSONObject(MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, TuplesKt.to("preferredPurchaseType", str))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(\n            …  ),\n        ).toString()");
        String G3 = StringsKt.G(jSONObject, "\\", "", false, 4, null);
        Map createMapBuilder = MapsKt.createMapBuilder();
        if (installationId != null) {
            createMapBuilder.put("rustore-install-id", installationId.getValue());
        }
        return new ki.b(str2, MapsKt.build(createMapBuilder), G3);
    }
}
