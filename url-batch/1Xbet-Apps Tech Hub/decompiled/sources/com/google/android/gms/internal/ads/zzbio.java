package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbio implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu zzb;
    final /* synthetic */ zzbip zzc;

    zzbio(zzbip zzbipVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zzc = zzbipVar;
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (!this.zza.zzb(this.zzb)) {
            zzcbn.zzj("Could not bind.");
            return;
        }
        zzbip zzbipVar = this.zzc;
        AdManagerAdView adManagerAdView = this.zza;
        onAdManagerAdViewLoadedListener = zzbipVar.zza;
        onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(adManagerAdView);
    }
}
