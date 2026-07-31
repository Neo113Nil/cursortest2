package ru.rustore.unitysdk.payclient.callbacks;

import ru.rustore.sdk.pay.model.ProductPurchaseResult;

/* loaded from: classes3.dex */
public interface ProductPurchaseResultListener {
    void OnFailure(Throwable th);

    void OnSuccess(ProductPurchaseResult productPurchaseResult);
}
