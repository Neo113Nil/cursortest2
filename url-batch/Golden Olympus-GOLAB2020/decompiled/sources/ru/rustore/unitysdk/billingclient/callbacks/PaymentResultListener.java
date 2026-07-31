package ru.rustore.unitysdk.billingclient.callbacks;

import ru.rustore.sdk.billingclient.model.purchase.PaymentResult;

/* loaded from: classes3.dex */
public interface PaymentResultListener {
    void OnFailure(Throwable th);

    void OnSuccess(PaymentResult paymentResult);
}
