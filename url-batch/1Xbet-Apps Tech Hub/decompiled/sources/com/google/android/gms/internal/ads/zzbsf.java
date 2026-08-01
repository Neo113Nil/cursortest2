package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbsf implements com.google.android.gms.ads.internal.overlay.zzo {
    final /* synthetic */ zzbsh zza;

    zzbsf(zzbsh zzbshVar) {
        this.zza = zzbshVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
        zzcbn.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbp() {
        zzcbn.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzcbn.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbw() {
        MediationInterstitialListener mediationInterstitialListener;
        zzcbn.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbsh zzbshVar = this.zza;
        mediationInterstitialListener = zzbshVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbshVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbz(int i) {
        MediationInterstitialListener mediationInterstitialListener;
        zzcbn.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbsh zzbshVar = this.zza;
        mediationInterstitialListener = zzbshVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbshVar);
    }
}
