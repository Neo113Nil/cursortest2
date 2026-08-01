package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdwz extends AppOpenAd.AppOpenAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdxh zzc;

    zzdwz(zzdxh zzdxhVar, String str, String str2) {
        this.zzc = zzdxhVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdxh zzdxhVar = this.zzc;
        zzl = zzdxh.zzl(loadAdError);
        zzdxhVar.zzm(zzl, this.zzb);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(AppOpenAd appOpenAd) {
        String str = this.zzb;
        this.zzc.zzg(this.zza, appOpenAd, str);
    }
}
