package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzebu extends RewardedAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzecc zzb;

    zzebu(zzecc zzeccVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzeccVar);
        this.zzb = zzeccVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzm;
        zzecc zzeccVar = this.zzb;
        zzm = zzecc.zzm(loadAdError);
        zzeccVar.zzg(zzm);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedAd rewardedAd) {
        this.zzb.zzf(this.zza, rewardedAd);
    }
}
