package ru.rustore.unitysdk.billingclient.callbacks;

import ru.rustore.sdk.billingclient.model.purchase.Purchase;

/* loaded from: classes3.dex */
public interface PurchaseInfoResponseListener {
    void OnFailure(Throwable th);

    void OnSuccess(Purchase purchase);
}
