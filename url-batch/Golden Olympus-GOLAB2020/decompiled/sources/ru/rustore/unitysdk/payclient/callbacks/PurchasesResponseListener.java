package ru.rustore.unitysdk.payclient.callbacks;

import java.util.List;
import ru.rustore.sdk.pay.model.Purchase;

/* loaded from: classes3.dex */
public interface PurchasesResponseListener {
    void OnFailure(Throwable th);

    void OnSuccess(List<Purchase> list);
}
