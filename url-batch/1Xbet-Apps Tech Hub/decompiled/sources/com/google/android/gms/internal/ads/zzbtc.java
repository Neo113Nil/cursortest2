package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbtc {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    private final NativeCustomFormatAd.OnCustomClickListener zzb;
    private NativeCustomFormatAd zzc;

    public zzbtc(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized NativeCustomFormatAd zzf(zzbhc zzbhcVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbtd zzbtdVar = new zzbtd(zzbhcVar);
        this.zzc = zzbtdVar;
        return zzbtdVar;
    }

    public final zzbhm zza() {
        zzbsy zzbsyVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new zzbsz(this, zzbsyVar);
    }

    public final zzbhp zzb() {
        return new zzbtb(this, null);
    }
}
