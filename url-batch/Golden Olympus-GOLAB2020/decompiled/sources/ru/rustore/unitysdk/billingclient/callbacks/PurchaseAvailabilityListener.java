package ru.rustore.unitysdk.billingclient.callbacks;

import ru.rustore.sdk.billingclient.model.purchase.PurchaseAvailabilityResult;

/* loaded from: classes3.dex */
public interface PurchaseAvailabilityListener {
    void OnFailure(Throwable th);

    void OnSuccess(PurchaseAvailabilityResult purchaseAvailabilityResult);
}
