package ru.rustore.sdk.pay.internal;

import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.PurchaseId;

/* loaded from: classes3.dex */
public final class y3 extends kotlin.jvm.internal.s implements Function0<ki.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f45254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4 f45255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f45256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(String str, b4 b4Var, PurchaseId purchaseId) {
        super(0);
        this.f45254a = str;
        this.f45255b = b4Var;
        this.f45256c = purchaseId;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = "api/v1/coupon/" + this.f45254a + "/unselection";
        b4 b4Var = this.f45255b;
        PurchaseId purchaseId = this.f45256c;
        b4Var.getClass();
        String jSONObject = new JSONObject(MapsKt.mapOf(TuplesKt.to("purchaseId", purchaseId.getValue()))).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(\n            …ue),\n        ).toString()");
        return new ki.b(str, MapsKt.emptyMap(), StringsKt.G(jSONObject, "\\", "", false, 4, null));
    }
}
