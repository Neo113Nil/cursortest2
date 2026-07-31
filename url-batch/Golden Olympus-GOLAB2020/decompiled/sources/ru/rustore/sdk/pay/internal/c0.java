package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.model.ApplicationPurchaseResult;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function1<hf, ApplicationPurchaseResult> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f43893a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var) {
        super(1);
        this.f43893a = d0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hf purchaseResult = (hf) obj;
        Intrinsics.checkNotNullParameter(purchaseResult, "purchaseResult");
        if (purchaseResult instanceof hf.a.c) {
            f0 f0Var = ((hf.a.c) purchaseResult).f44243a;
            return new ApplicationPurchaseResult.Success(f0Var.f44047a, f0Var.f44048b, f0Var.f44050d);
        }
        if (purchaseResult instanceof hf.a.C0258a) {
            hf.a.C0258a c0258a = (hf.a.C0258a) purchaseResult;
            return new ApplicationPurchaseResult.Cancelled(c0258a.f44237a, c0258a.f44238b);
        }
        if (purchaseResult instanceof hf.a.b) {
            hf.a.b bVar = (hf.a.b) purchaseResult;
            return new ApplicationPurchaseResult.Failure(bVar.f44240b, bVar.f44241c, bVar.f44239a, bVar.f44242d);
        }
        String concat = "Incorrect type of purchase result: ".concat(purchaseResult.getClass().getSimpleName());
        Intrinsics.checkNotNullExpressionValue(concat, "StringBuilder().apply(builderAction).toString()");
        RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException(concat, null, 2, null);
        y7 y7Var = this.f43893a.f43951f;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
