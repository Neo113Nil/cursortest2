package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzaht {
    public final zzadc zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzaht(zzadc zzadcVar, long j, long j2, long[] jArr, int i, int i2) {
        this.zza = new zzadc(zzadcVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i2;
    }

    public static zzaht zzb(zzadc zzadcVar, zzek zzekVar) {
        long[] jArr;
        int i;
        int i2;
        int zzg = zzekVar.zzg();
        int zzp = (zzg & 1) != 0 ? zzekVar.zzp() : -1;
        long zzu = (zzg & 2) != 0 ? zzekVar.zzu() : -1L;
        if ((zzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = zzekVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzg & 8) != 0) {
            zzekVar.zzL(4);
        }
        if (zzekVar.zzb() >= 24) {
            zzekVar.zzL(21);
            int zzo = zzekVar.zzo();
            i2 = zzo & 4095;
            i = zzo >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzaht(zzadcVar, zzp, zzu, jArr, i, i2);
    }

    public final long zza() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return zzet.zzs((j * r4.zzg) - 1, this.zza.zzd);
    }
}
