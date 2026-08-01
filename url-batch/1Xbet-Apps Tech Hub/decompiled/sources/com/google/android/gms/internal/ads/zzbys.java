package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbys {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzbzs zzc;

    zzbys(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbzs zzbzsVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzbzsVar;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaq)).booleanValue()) {
            this.zzc.zzt();
        }
    }

    public final void zzb(int i, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzap)).booleanValue()) {
            return;
        }
        if (j - this.zzb.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaq)).booleanValue()) {
            this.zzb.zzL(i);
            this.zzb.zzM(j);
        } else {
            this.zzb.zzL(-1);
            this.zzb.zzM(j);
        }
        zza();
    }
}
