package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class bh extends kotlin.jvm.internal.s implements Function1<l8, l8> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f43871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ch f43872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(PurchaseId purchaseId, ch chVar) {
        super(1);
        this.f43871a = purchaseId;
        this.f43872b = chVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l8 payment = (l8) obj;
        Intrinsics.checkNotNullParameter(payment, "payment");
        if (Intrinsics.areEqual(payment.f44507b, this.f43871a)) {
            return payment;
        }
        RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException("Invalid purchase id for purchase with sbp", null, 2, null);
        y7 y7Var = this.f43872b.f43930e;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
