package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbsj {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    private final NativeCustomFormatAd.OnCustomClickListener zzb;
    private NativeCustomFormatAd zzc;

    public zzbsj(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized NativeCustomFormatAd zzc(zzbgq zzbgqVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbsk zzbskVar = new zzbsk(zzbgqVar);
        this.zzc = zzbskVar;
        return zzbskVar;
    }

    public final zzbhd zza() {
        return new zzbsi(this, null);
    }

    public final zzbha zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbsh(this, null);
    }

    final /* synthetic */ NativeCustomFormatAd.OnCustomFormatAdLoadedListener zzd() {
        return this.zza;
    }

    final /* synthetic */ NativeCustomFormatAd.OnCustomClickListener zze() {
        return this.zzb;
    }
}
