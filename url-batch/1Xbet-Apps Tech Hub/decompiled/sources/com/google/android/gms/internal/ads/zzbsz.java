package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbsz extends zzbhl {
    final /* synthetic */ zzbtc zza;

    /* synthetic */ zzbsz(zzbtc zzbtcVar, zzbsy zzbsyVar) {
        this.zza = zzbtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhm
    public final void zze(zzbhc zzbhcVar, String str) {
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomFormatAd zzf;
        zzbtc zzbtcVar = this.zza;
        onCustomClickListener = zzbtcVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbtcVar.zzb;
        zzf = zzbtcVar.zzf(zzbhcVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
