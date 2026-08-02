package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
final class zzdz extends zzaz {
    final /* synthetic */ zzea zza;

    zzdz(zzea zzeaVar) {
        this.zza = zzeaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        VideoController videoController;
        zzea zzeaVar = this.zza;
        videoController = zzeaVar.zze;
        videoController.zzb(zzeaVar.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        zzea zzeaVar = this.zza;
        videoController = zzeaVar.zze;
        videoController.zzb(zzeaVar.zzi());
        super.onAdLoaded();
    }
}
