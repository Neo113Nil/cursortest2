package ru.rustore.sdk.pay.internal;

import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.ki;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.SdkTheme;

/* loaded from: classes3.dex */
public final class c9 extends kotlin.jvm.internal.s implements Function0<ki.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SdkTheme f43905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f43906b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(SdkTheme sdkTheme, PurchaseId purchaseId) {
        super(0);
        this.f43905a = sdkTheme;
        this.f43906b = purchaseId;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PurchaseId purchaseId = this.f43906b;
        StringBuilder sb = new StringBuilder();
        sb.append("api/v1/purchases/" + purchaseId.getValue() + "/payment/extras");
        sb.append("?supportedPaymentMethods=CARD,SBP,CARD_BINDING,SBER_PAY,MOBILE");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return new ki.a(sb2, MapsKt.mapOf(TuplesKt.to("Sdk-UI-Theme", this.f43905a.name())));
    }
}
