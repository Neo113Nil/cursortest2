package ru.rustore.unitysdk.payclient.callbacks;

/* loaded from: classes3.dex */
public interface ConfirmTwoStepPurchaseListener {
    void OnFailure(Throwable th);

    void OnSuccess();
}
