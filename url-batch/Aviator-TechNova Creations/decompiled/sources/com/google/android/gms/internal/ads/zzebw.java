package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzebw extends AdListener {
    final /* synthetic */ zzecc zza;

    zzebw(zzecc zzeccVar) {
        Objects.requireNonNull(zzeccVar);
        this.zza = zzeccVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzm;
        zzecc zzeccVar = this.zza;
        zzm = zzecc.zzm(loadAdError);
        zzeccVar.zzg(zzm);
    }
}
