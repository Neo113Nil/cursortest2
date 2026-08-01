package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbyc extends zzbxp {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbyd zzb;

    public zzbyc(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbyd zzbydVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbydVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final void zzg() {
        zzbyd zzbydVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbydVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbydVar);
    }
}
