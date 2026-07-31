package ru.rustore.sdk.pay.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.pay.internal.cf;
import ru.rustore.sdk.pay.internal.hf;
import ru.rustore.sdk.pay.internal.k5;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final /* synthetic */ class l5 extends kotlin.jvm.internal.p implements Function1<cf, Unit> {
    public l5(n5 n5Var) {
        super(1, n5Var, n5.class, "handlePurchasePaymentResult", "handlePurchasePaymentResult(Lru/rustore/sdk/pay/internal/purchase/domain/PurchasePaymentResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cf p02 = (cf) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        n5 n5Var = (n5) this.receiver;
        if (p02 instanceof cf.b) {
            k5 value = n5Var.f44680d.getValue();
            if (value instanceof k5.a) {
                hf.a.c purchaseResult = new hf.a.c(((k5.a) value).f44416a);
                j5 j5Var = (j5) n5Var.f44677a.f45452T2.getValue();
                j5Var.getClass();
                Intrinsics.checkNotNullParameter(purchaseResult, "purchaseResult");
                j5Var.f44361a.a((hf) purchaseResult, false);
            } else if (value instanceof k5.c) {
                hf.b.c purchaseResult2 = new hf.b.c(((k5.c) value).f44418a);
                j5 j5Var2 = (j5) n5Var.f44677a.f45452T2.getValue();
                j5Var2.getClass();
                Intrinsics.checkNotNullParameter(purchaseResult2, "purchaseResult");
                j5Var2.f44361a.a((hf) purchaseResult2, false);
            }
        } else {
            n5Var.getClass();
            if (p02 instanceof cf.a) {
                n5Var.a((Throwable) new RuStorePaymentException.RuStorePaymentCommonException("External payment was rejected", null, 2, null));
            }
        }
        return Unit.f41027a;
    }
}
