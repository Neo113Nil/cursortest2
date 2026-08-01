package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbim extends zzbho {
    final /* synthetic */ zzbin zza;

    /* synthetic */ zzbim(zzbin zzbinVar, zzbil zzbilVar) {
        this.zza = zzbinVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zze(zzbhc zzbhcVar) {
        NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener;
        NativeCustomTemplateAd zzf;
        zzbin zzbinVar = this.zza;
        onCustomTemplateAdLoadedListener = zzbinVar.zza;
        zzf = zzbinVar.zzf(zzbhcVar);
        onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(zzf);
    }
}
