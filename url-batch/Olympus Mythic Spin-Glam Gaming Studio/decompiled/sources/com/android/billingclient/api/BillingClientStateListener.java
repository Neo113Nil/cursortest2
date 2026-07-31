package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes5.dex */
public interface BillingClientStateListener {
    void onBillingServiceDisconnected();

    void onBillingSetupFinished(@NonNull BillingResult billingResult);
}
