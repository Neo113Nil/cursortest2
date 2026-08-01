package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbiq extends zzbhv {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbiq(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhw
    public final void zze(zzbif zzbifVar) {
        this.zza.onUnifiedNativeAdLoaded(new zzbig(zzbifVar));
    }
}
