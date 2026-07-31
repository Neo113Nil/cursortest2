package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class ng extends kotlin.jvm.internal.s implements Function1<j8, j8> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f44702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ og f44703b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(PurchaseId purchaseId, og ogVar) {
        super(1);
        this.f44702a = purchaseId;
        this.f44703b = ogVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j8 payment = (j8) obj;
        Intrinsics.checkNotNullParameter(payment, "payment");
        if (Intrinsics.areEqual(payment.f44366b, this.f44702a)) {
            return payment;
        }
        RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException("Invalid purchase id for purchase with saved card", null, 2, null);
        y7 y7Var = this.f44703b.f44757g;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
