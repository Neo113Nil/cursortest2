package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbin {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zza;
    private final NativeCustomTemplateAd.OnCustomClickListener zzb;
    private NativeCustomTemplateAd zzc;

    public zzbin(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomTemplateAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized NativeCustomTemplateAd zzf(zzbhc zzbhcVar) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.zzc;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        zzbhd zzbhdVar = new zzbhd(zzbhcVar);
        this.zzc = zzbhdVar;
        return zzbhdVar;
    }

    public final zzbhm zzd() {
        zzbij zzbijVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new zzbik(this, zzbijVar);
    }

    public final zzbhp zze() {
        return new zzbim(this, null);
    }
}
