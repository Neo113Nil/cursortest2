package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzbxo {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    zzbxo(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbya zzbyaVar) {
        this.zza = zzgVar;
    }

    public final void zza(int i, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzak)).booleanValue()) {
            return;
        }
        if (j - this.zza.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzal)).booleanValue()) {
            this.zza.zzM(i);
            this.zza.zzN(j);
        } else {
            this.zza.zzM(-1);
            this.zza.zzN(j);
        }
    }
}
