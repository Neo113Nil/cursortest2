package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.cf;
import ru.rustore.sdk.pay.model.ApplicationPurchaseStatus;
import ru.rustore.sdk.pay.model.ProductPurchaseStatus;
import ru.rustore.sdk.pay.model.PurchaseStatus;
import ru.rustore.sdk.pay.model.SubscriptionPurchaseStatus;

/* loaded from: classes3.dex */
public final class b8 extends kotlin.jvm.internal.s implements Function1<PurchaseStatus, cf> {
    public b8(c8 c8Var) {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PurchaseStatus status = (PurchaseStatus) obj;
        Intrinsics.checkNotNullParameter(status, "status");
        return (status == ApplicationPurchaseStatus.CONFIRMED || status == ProductPurchaseStatus.CONFIRMED || status == ProductPurchaseStatus.PAID || status == SubscriptionPurchaseStatus.ACTIVE) ? cf.b.f43916a : cf.a.f43915a;
    }
}
