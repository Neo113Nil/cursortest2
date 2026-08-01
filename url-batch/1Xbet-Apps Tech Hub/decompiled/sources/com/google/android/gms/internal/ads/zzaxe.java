package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaxe extends zzaxl {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzaxe(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaxm
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzaxm
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxm
    public final void zzd(zzaxj zzaxjVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzaxf(zzaxjVar, this.zzb));
        }
    }
}
