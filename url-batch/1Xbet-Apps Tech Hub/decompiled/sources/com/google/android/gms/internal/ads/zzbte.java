package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbte extends zzbhv {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbte(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zze(zzbif zzbifVar) {
        this.zza.onNativeAdLoaded(new zzbsx(zzbifVar));
    }
}
