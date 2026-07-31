package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes6.dex */
public interface PurchaseHistoryResponseListener {
    void onPurchaseHistoryResponse(@NonNull BillingResult billingResult, @Nullable List<PurchaseHistoryRecord> list);
}
