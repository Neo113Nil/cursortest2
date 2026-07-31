package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
@zzh
/* loaded from: classes6.dex */
public interface BillingConfigResponseListener {
    void onBillingConfigResponse(@NonNull BillingResult billingResult, @Nullable BillingConfig billingConfig);
}
