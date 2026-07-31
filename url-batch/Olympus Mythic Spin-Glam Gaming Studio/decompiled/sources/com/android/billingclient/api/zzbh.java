package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes13.dex */
final class zzbh extends com.google.android.gms.internal.play_billing.zzaj {
    final ExternalOfferAvailabilityListener zza;
    final zzch zzb;
    final int zzc;

    /* synthetic */ zzbh(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, zzch zzchVar, int i, zzbl zzblVar) {
        this.zza = externalOfferAvailabilityListener;
        this.zzb = zzchVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzak
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzch zzchVar = this.zzb;
            BillingResult billingResult = zzcj.zzk;
            zzchVar.zzb(zzcg.zzb(92, 23, billingResult), this.zzc);
            this.zza.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int zzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        BillingResult zza = zzcj.zza(zzb, com.google.android.gms.internal.play_billing.zze.zzh(bundle, "BillingClient"));
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + zzb);
            this.zzb.zzb(zzcg.zzb(23, 23, zza), this.zzc);
        }
        this.zza.onExternalOfferAvailabilityResponse(zza);
    }
}
