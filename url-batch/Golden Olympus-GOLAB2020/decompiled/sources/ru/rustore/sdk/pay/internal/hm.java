package ru.rustore.sdk.pay.internal;

import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.DeveloperPayload;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final class hm extends kotlin.jvm.internal.s implements Function0<ki.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeveloperPayload f44293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f44294b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(PurchaseId purchaseId, DeveloperPayload developerPayload) {
        super(0);
        this.f44293a = developerPayload;
        this.f44294b = purchaseId;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DeveloperPayload developerPayload = this.f44293a;
        String jSONObject = new JSONObject(MapsKt.mapOf(TuplesKt.to("developerPayload", developerPayload != null ? developerPayload.getValue() : null))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(mapOf(DEVELOP…              .toString()");
        return new ki.b("api/v1/purchases/" + this.f44294b.getValue() + "/confirmation", MapsKt.emptyMap(), StringsKt.G(jSONObject, "\\", "", false, 4, null));
    }
}
