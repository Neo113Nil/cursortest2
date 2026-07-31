package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.Purchase;

/* loaded from: classes3.dex */
public final /* synthetic */ class ef extends kotlin.jvm.internal.p implements Function1<le, Purchase> {
    public ef(Object obj) {
        super(1, obj, bf.class, "mapToModel", "mapToModel(Lru/rustore/sdk/pay/internal/purchase/data/PurchaseDto;)Lru/rustore/sdk/pay/model/Purchase;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        le p02 = (le) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((bf) this.receiver).a(p02);
    }
}
