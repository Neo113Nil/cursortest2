package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzahp implements zzahn {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzahp(long j, int i, long j2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    public static zzahp zzb(long j, long j2, zzacy zzacyVar, zzfj zzfjVar) {
        int zzo;
        int i = zzacyVar.zzg;
        int i2 = zzacyVar.zzd;
        int zzf = zzfjVar.zzf();
        if ((zzf & 1) != 1 || (zzo = zzfjVar.zzo()) == 0) {
            return null;
        }
        int i3 = zzf & 6;
        long zzs = zzfs.zzs(zzo, i * 1000000, i2, RoundingMode.FLOOR);
        if (i3 != 6) {
            return new zzahp(j2, zzacyVar.zzc, zzs, -1L, null);
        }
        long zzt = zzfjVar.zzt();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = zzfjVar.zzl();
        }
        if (j != -1) {
            long j3 = j2 + zzt;
            if (j != j3) {
                zzez.zzf("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new zzahp(j2, zzacyVar.zzc, zzs, zzt, jArr);
    }

    private final long zze(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final long zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final long zzd(long j) {
        if (!zzh()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzf;
        zzef.zzb(jArr);
        double d = (j2 * 256.0d) / this.zzd;
        int zzc = zzfs.zzc(jArr, (long) d, true, true);
        long zze = zze(zzc);
        long j3 = jArr[zzc];
        int i = zzc + 1;
        long zze2 = zze(i);
        return zze + Math.round((j3 == (zzc == 99 ? 256L : jArr[i]) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j3) / (r0 - j3)) * (zze2 - zze));
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadc zzg(long j) {
        if (!zzh()) {
            zzadf zzadfVar = new zzadf(0L, this.zza + this.zzb);
            return new zzadc(zzadfVar, zzadfVar);
        }
        long max = Math.max(0L, Math.min(j, this.zzc));
        double d = (max * 100.0d) / this.zzc;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzf;
                zzef.zzb(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j2 = this.zzd;
        zzadf zzadfVar2 = new zzadf(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j2), j2 - 1)));
        return new zzadc(zzadfVar2, zzadfVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzh() {
        return this.zzf != null;
    }
}
