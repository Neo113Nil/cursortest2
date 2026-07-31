package ru.rustore.sdk.pay.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.rustore.sdk.pay.model.InvoiceId;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final /* synthetic */ class oa extends kotlin.jvm.internal.p implements Function1<s8, h8> {
    public oa(Object obj) {
        super(1, obj, r9.class, "mapToPaymentWithPhone", "mapToPaymentWithPhone(Lru/rustore/sdk/pay/internal/payment/data/PaymentDto;)Lru/rustore/sdk/pay/internal/payment/domain/Payment$MobilePhone;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s8 dto = (s8) obj;
        Intrinsics.checkNotNullParameter(dto, "p0");
        r9 r9Var = (r9) this.receiver;
        r9Var.getClass();
        Intrinsics.checkNotNullParameter(dto, "dto");
        PurchaseId purchaseId = new PurchaseId(dto.f44968a);
        InvoiceId invoiceId = new InvoiceId(dto.f44969b);
        String str = dto.f44970c;
        if (str != null && !StringsKt.z(str)) {
            return new h8(new Url(dto.f44970c), purchaseId, invoiceId, r9Var.f44896a.a(dto.f44972e));
        }
        RuStorePaymentException.RuStorePaymentCommonException throwable = new RuStorePaymentException.RuStorePaymentCommonException("The payment URL for mobile phone account is invalid", null, 2, null);
        y7 y7Var = r9Var.f44897b;
        y7Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u3.e.i(y7Var.f45263a, throwable, null, 2, null);
        throw throwable;
    }
}
