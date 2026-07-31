package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes13.dex */
final class zzbk {
    private final List zza;
    private final BillingResult zzb;

    zzbk(BillingResult billingResult, @Nullable List list) {
        this.zza = list;
        this.zzb = billingResult;
    }

    final BillingResult zza() {
        return this.zzb;
    }

    final List zzb() {
        return this.zza;
    }
}
