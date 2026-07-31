package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class t2 extends kotlin.jvm.internal.s implements Function1<PurchaseId, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f45028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2 f45029b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(PurchaseId purchaseId, u2 u2Var) {
        super(1);
        this.f45028a = purchaseId;
        this.f45029b = u2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PurchaseId cancelledPurchaseId = (PurchaseId) obj;
        Intrinsics.checkNotNullParameter(cancelledPurchaseId, "cancelledPurchaseId");
        if (Intrinsics.areEqual(cancelledPurchaseId, this.f45028a)) {
            return Unit.f41027a;
        }
        RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException("Mismatched purchase id on purchase cancellation", null, 2, null);
        y7 y7Var = this.f45029b.f45070b;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
