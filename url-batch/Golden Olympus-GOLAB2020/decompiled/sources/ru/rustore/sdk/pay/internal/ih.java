package ru.rustore.sdk.pay.internal;

import com.google.android.gms.common.Scopes;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.AppUserEmail;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final class ih extends kotlin.jvm.internal.s implements Function0<ki.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kh f44343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f44344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppUserEmail f44345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(kh khVar, PurchaseId purchaseId, AppUserEmail appUserEmail) {
        super(0);
        this.f44343a = khVar;
        this.f44344b = purchaseId;
        this.f44345c = appUserEmail;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        kh khVar = this.f44343a;
        PurchaseId purchaseId = this.f44344b;
        AppUserEmail appUserEmail = this.f44345c;
        khVar.getClass();
        String jSONObject = new JSONObject(MapsKt.mapOf(TuplesKt.to("purchaseId", purchaseId.getValue()), TuplesKt.to(Scopes.EMAIL, appUserEmail.getValue()))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(\n            …  ),\n        ).toString()");
        return new ki.b("v1/monetization/api/receipt/send", MapsKt.emptyMap(), StringsKt.G(jSONObject, "\\", "", false, 4, null));
    }
}
