package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzdwf extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ BaseAdView zzb;
    final /* synthetic */ zzdwp zzc;

    zzdwf(zzdwp zzdwpVar, String str, BaseAdView baseAdView) {
        this.zza = str;
        this.zzb = baseAdView;
        Objects.requireNonNull(zzdwpVar);
        this.zzc = zzdwpVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzm;
        zzdwp zzdwpVar = this.zzc;
        zzm = zzdwp.zzm(loadAdError);
        zzdwpVar.zzg(zzm);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzc.zzf(this.zza, this.zzb);
    }
}
