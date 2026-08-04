package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzdyi implements zzgoq {
    final /* synthetic */ zzdyo zza;

    zzdyi(zzdyo zzdyoVar) {
        Objects.requireNonNull(zzdyoVar);
        this.zza = zzdyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcu zzfcuVar = (zzfcu) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcw)).booleanValue()) {
            this.zza.zzf().zzdU(zzfcuVar);
        }
    }
}
