package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
final class zzpt {
    private final zzpv zza;
    private int zzb = 1;
    private long zzc = zzd();

    public zzpt(zzpv zzpvVar) {
        this.zza = zzpvVar;
    }

    private final long zzd() {
        zzpv zzpvVar = this.zza;
        Preconditions.checkNotNull(zzpvVar);
        long longValue = ((Long) zzgi.zzu.zza(null)).longValue();
        long longValue2 = ((Long) zzgi.zzv.zza(null)).longValue();
        for (int i4 = 1; i4 < this.zzb; i4++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        return zzpvVar.zzaU().currentTimeMillis() + Math.min(longValue, longValue2);
    }

    public final void zzb() {
        this.zzb++;
        this.zzc = zzd();
    }

    public final boolean zzc() {
        return this.zza.zzaU().currentTimeMillis() >= this.zzc;
    }
}
