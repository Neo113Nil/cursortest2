package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;

/* loaded from: classes.dex */
final class zzde {
    static void zza(zzjd zzjdVar, BillingResult billingResult, zzcz zzczVar, int i4, int i5) {
        int i6 = zzcy.zza;
        zzczVar.zzb(zzcy.zzb(zzjdVar, i4, billingResult, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), i5);
    }

    static void zzb(zzjd zzjdVar, BillingResult billingResult, zzcz zzczVar, int i4, int i5, String str) {
        int i6 = zzcy.zza;
        zzczVar.zzb(zzcy.zzb(zzjdVar, i4, billingResult, str, zzjk.BROADCAST_ACTION_UNSPECIFIED), i5);
    }
}
