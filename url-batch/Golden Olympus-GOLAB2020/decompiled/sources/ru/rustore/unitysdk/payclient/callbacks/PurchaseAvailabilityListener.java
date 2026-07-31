package ru.rustore.unitysdk.payclient.callbacks;

import ru.rustore.sdk.pay.model.PurchaseAvailabilityResult;

/* loaded from: classes3.dex */
public interface PurchaseAvailabilityListener {
    void OnFailure(Throwable th);

    void OnSuccess(PurchaseAvailabilityResult purchaseAvailabilityResult);
}
