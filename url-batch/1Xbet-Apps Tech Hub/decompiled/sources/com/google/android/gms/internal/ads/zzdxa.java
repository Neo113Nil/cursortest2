package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdxa extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ AdView zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdxh zzd;

    zzdxa(zzdxh zzdxhVar, String str, AdView adView, String str2) {
        this.zzd = zzdxhVar;
        this.zza = str;
        this.zzb = adView;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdxh zzdxhVar = this.zzd;
        zzl = zzdxh.zzl(loadAdError);
        zzdxhVar.zzm(zzl, this.zzc);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
