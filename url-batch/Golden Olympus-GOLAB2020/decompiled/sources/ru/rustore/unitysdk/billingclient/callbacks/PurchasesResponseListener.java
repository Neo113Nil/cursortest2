package ru.rustore.unitysdk.billingclient.callbacks;

import java.util.List;
import ru.rustore.sdk.billingclient.model.purchase.Purchase;

/* loaded from: classes3.dex */
public interface PurchasesResponseListener {
    void OnFailure(Throwable th);

    void OnSuccess(List<Purchase> list);
}
