package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzaju implements zzajr {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzaju(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = i2;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1L;
    }

    public static zzaju zzd(zzajt zzajtVar, long j) {
        long zzb = zzajtVar.zzb();
        if (zzb == -9223372036854775807L) {
            return null;
        }
        zzafr zzafrVar = zzajtVar.zza;
        return new zzaju(j, zzafrVar.zzc, zzb, zzafrVar.zzf, zzajtVar.zzc, zzajtVar.zzf);
    }

    private final long zzh(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        if (!zzb()) {
            zzafz zzafzVar = new zzafz(0L, this.zza + this.zzb);
            return new zzafw(zzafzVar, zzafzVar);
        }
        long j2 = this.zzc;
        String str = zzfj.zza;
        long max = Math.max(0L, Math.min(j, j2));
        double d = (max * 100.0d) / j2;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        long j3 = this.zze;
        zzafz zzafzVar2 = new zzafz(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j3), j3 - 1)));
        return new zzafw(zzafzVar2, zzafzVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j) {
        if (!zzb()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        long[] jArr2 = jArr;
        double d = (j2 * 256.0d) / this.zze;
        int zzm = zzfj.zzm(jArr2, (long) d, true, true);
        long zzh = zzh(zzm);
        long j3 = jArr2[zzm];
        int i = zzm + 1;
        long zzh2 = zzh(i);
        return zzh + Math.round((j3 == (zzm == 99 ? 256L : jArr2[i]) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j3) / (r0 - j3)) * (zzh2 - zzh));
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zzd;
    }
}
