package ru.rustore.unitysdk.payclient.callbacks;

import ru.rustore.sdk.pay.model.Purchase;

/* loaded from: classes3.dex */
public interface PurchaseResponseListener {
    void OnFailure(Throwable th);

    void OnSuccess(Purchase purchase);
}
