package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
final class zzeq extends zzcd {
    final /* synthetic */ PreloadCallback zza;

    zzeq(zzex zzexVar, PreloadCallback preloadCallback) {
        this.zza = preloadCallback;
        Objects.requireNonNull(zzexVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(zzft zzftVar) {
        PreloadConfiguration zzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(zzftVar);
        if (zzr != null) {
            this.zza.onAdsAvailable(zzr);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(zzft zzftVar) {
        PreloadConfiguration zzr = com.google.android.gms.ads.internal.util.client.zzf.zzr(zzftVar);
        if (zzr != null) {
            this.zza.onAdsExhausted(zzr);
        }
    }
}
