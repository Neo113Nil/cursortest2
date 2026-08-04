package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzdwi extends RewardedInterstitialAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwp zzb;

    zzdwi(zzdwp zzdwpVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdwpVar);
        this.zzb = zzdwpVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzm;
        zzdwp zzdwpVar = this.zzb;
        zzm = zzdwp.zzm(loadAdError);
        zzdwpVar.zzg(zzm);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
        this.zzb.zzf(this.zza, rewardedInterstitialAd);
    }
}
