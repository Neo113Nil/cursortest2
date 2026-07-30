package com.google.android.gms.internal.ads;

import android.util.Range;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzact {
    private long zza;
    private long zzb;
    private double zzc;
    private Range zzd;

    public zzact(float f) {
        Range range = new Range(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), Double.valueOf(1.0d));
        this.zzd = range;
        this.zzc = ((Double) range.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }

    public final void zza(long j, long j2) {
        double doubleValue;
        zzgrc.zza(j != -9223372036854775807L);
        zzgrc.zza(j2 != -9223372036854775807L);
        long j3 = this.zza;
        if (j3 != -9223372036854775807L) {
            if (this.zzb != -9223372036854775807L && j != j3) {
                doubleValue = (j2 - r4) / (j - j3);
                this.zzc = (this.zzc * 0.800000011920929d) + (((Double) this.zzd.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d);
                this.zza = j;
                this.zzb = j2;
            }
        }
        doubleValue = ((Double) this.zzd.getUpper()).doubleValue();
        this.zzc = (this.zzc * 0.800000011920929d) + (((Double) this.zzd.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d);
        this.zza = j;
        this.zzb = j2;
    }

    public final long zzb(long j) {
        if (this.zza == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.zzb + ((j - r0) * this.zzc));
    }

    public final void zzc(float f) {
        zzgrc.zza(f > 0.0f);
        this.zzd = new Range(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), Double.valueOf(1.0d / f));
        zzd();
    }

    public final void zzd() {
        this.zzc = ((Double) this.zzd.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }
}
