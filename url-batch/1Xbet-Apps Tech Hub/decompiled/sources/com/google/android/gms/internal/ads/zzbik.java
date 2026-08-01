package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbik extends zzbhl {
    final /* synthetic */ zzbin zza;

    /* synthetic */ zzbik(zzbin zzbinVar, zzbij zzbijVar) {
        this.zza = zzbinVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhm
    public final void zze(zzbhc zzbhcVar, String str) {
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener;
        NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener2;
        NativeCustomTemplateAd zzf;
        zzbin zzbinVar = this.zza;
        onCustomClickListener = zzbinVar.zzb;
        if (onCustomClickListener == null) {
            return;
        }
        onCustomClickListener2 = zzbinVar.zzb;
        zzf = zzbinVar.zzf(zzbhcVar);
        onCustomClickListener2.onCustomClick(zzf, str);
    }
}
