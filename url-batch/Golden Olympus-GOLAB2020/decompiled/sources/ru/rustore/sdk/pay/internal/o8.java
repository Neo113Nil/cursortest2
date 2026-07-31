package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class o8 extends kotlin.jvm.internal.p implements Function1<u7, s8> {
    public o8(Object obj) {
        super(1, obj, r8.class, "getPaymentDto", "getPaymentDto(Lru/rustore/sdk/pay/internal/network/NetworkRequestResult;)Lru/rustore/sdk/pay/internal/payment/data/PaymentDto;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u7 p02 = (u7) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return r8.a((r8) this.receiver, p02);
    }
}
