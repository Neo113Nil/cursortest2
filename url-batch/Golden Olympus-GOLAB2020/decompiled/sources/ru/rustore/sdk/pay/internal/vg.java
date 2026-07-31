package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class vg extends kotlin.jvm.internal.s implements Function1<k8, k8> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f45135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wg f45136b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(PurchaseId purchaseId, wg wgVar) {
        super(1);
        this.f45135a = purchaseId;
        this.f45136b = wgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k8 payment = (k8) obj;
        Intrinsics.checkNotNullParameter(payment, "payment");
        if (Intrinsics.areEqual(payment.f44423b, this.f45135a)) {
            return payment;
        }
        RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException("Invalid purchase id for purchase with sber pay", null, 2, null);
        y7 y7Var = this.f45136b.f45175e;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
