package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbtb extends zzbho {
    final /* synthetic */ zzbtc zza;

    /* synthetic */ zzbtb(zzbtc zzbtcVar, zzbta zzbtaVar) {
        this.zza = zzbtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zze(zzbhc zzbhcVar) {
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener;
        NativeCustomFormatAd zzf;
        zzbtc zzbtcVar = this.zza;
        onCustomFormatAdLoadedListener = zzbtcVar.zza;
        zzf = zzbtcVar.zzf(zzbhcVar);
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(zzf);
    }
}
