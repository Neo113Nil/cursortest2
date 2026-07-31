package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes10.dex */
public interface PurchasesUpdatedListener {
    void onPurchasesUpdated(@NonNull BillingResult billingResult, @Nullable List<Purchase> list);
}
