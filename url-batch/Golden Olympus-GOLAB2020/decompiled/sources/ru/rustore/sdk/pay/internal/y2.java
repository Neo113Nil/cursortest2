package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class y2 extends kotlin.jvm.internal.s implements Function1<PurchaseId, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PurchaseId f45252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f45253b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(PurchaseId purchaseId, z2 z2Var) {
        super(1);
        this.f45252a = purchaseId;
        this.f45253b = z2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PurchaseId confirmedPurchaseId = (PurchaseId) obj;
        Intrinsics.checkNotNullParameter(confirmedPurchaseId, "confirmedPurchaseId");
        if (Intrinsics.areEqual(confirmedPurchaseId, this.f45252a)) {
            return Unit.f41027a;
        }
        RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException("Mismatched purchase id on purchase confirmation", null, 2, null);
        y7 y7Var = this.f45253b.f45310b;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
