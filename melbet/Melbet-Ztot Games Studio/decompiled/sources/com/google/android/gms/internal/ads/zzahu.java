package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzahu implements zzahr {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzahu(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = i2;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1L;
    }

    public static zzahu zzb(zzaht zzahtVar, long j) {
        long[] jArr;
        long zza = zzahtVar.zza();
        if (zza == -9223372036854775807L) {
            return null;
        }
        long j2 = zzahtVar.zzc;
        if (j2 == -1 || (jArr = zzahtVar.zzf) == null) {
            zzadc zzadcVar = zzahtVar.zza;
            return new zzahu(j, zzadcVar.zzc, zza, zzadcVar.zzf, -1L, null);
        }
        zzadc zzadcVar2 = zzahtVar.zza;
        return new zzahu(j, zzadcVar2.zzc, zza, zzadcVar2.zzf, j2, jArr);
    }

    private final long zzf(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zze(long j) {
        if (!zzh()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        zzdi.zzb(jArr);
        double d = (j2 * 256.0d) / this.zze;
        int zzc = zzet.zzc(jArr, (long) d, true, true);
        long zzf = zzf(zzc);
        long j3 = jArr[zzc];
        int i = zzc + 1;
        long zzf2 = zzf(i);
        return zzf + Math.round((j3 == (zzc == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (zzf2 - zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j) {
        if (!zzh()) {
            zzadj zzadjVar = new zzadj(0L, this.zza + this.zzb);
            return new zzadg(zzadjVar, zzadjVar);
        }
        long max = Math.max(0L, Math.min(j, this.zzc));
        double d = (max * 100.0d) / this.zzc;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzg;
                zzdi.zzb(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j2 = this.zze;
        zzadj zzadjVar2 = new zzadj(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j2), j2 - 1)));
        return new zzadg(zzadjVar2, zzadjVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return this.zzg != null;
    }
}
