package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class ed extends kotlin.jvm.internal.p implements Function1<s9, Unit> {
    public ed(ld ldVar) {
        super(1, ldVar, ld.class, "setActivePaymentMethod", "setActivePaymentMethod(Lru/rustore/sdk/pay/internal/payment/method/domain/PaymentMethod;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s9 p02 = (s9) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((ld) this.receiver).a(p02);
        return Unit.f41027a;
    }
}
