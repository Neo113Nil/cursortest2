package ru.rustore.unitysdk.billingclient.callbacks;

/* loaded from: classes3.dex */
public interface ConfirmPurchaseListener {
    void OnFailure(Throwable th);

    void OnSuccess();
}
