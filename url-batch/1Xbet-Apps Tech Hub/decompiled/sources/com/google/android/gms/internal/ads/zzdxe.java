package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdxe extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdxh zzb;

    zzdxe(zzdxh zzdxhVar, String str) {
        this.zzb = zzdxhVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdxh zzdxhVar = this.zzb;
        zzl = zzdxh.zzl(loadAdError);
        zzdxhVar.zzm(zzl, this.zza);
    }
}
