package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzajs implements zzajr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzajs(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i;
    }

    public static zzajs zzd(long j, long j2, zzafr zzafrVar, zzer zzerVar) {
        int zzs;
        zzer zzerVar2 = zzerVar;
        zzerVar2.zzk(6);
        int zzB = zzerVar2.zzB();
        long j3 = zzafrVar.zzc;
        long j4 = zzB;
        if (zzerVar2.zzB() <= 0) {
            return null;
        }
        long zzr = zzfj.zzr((r4 * zzafrVar.zzg) - 1, zzafrVar.zzd);
        int zzt = zzerVar2.zzt();
        int zzt2 = zzerVar2.zzt();
        int zzt3 = zzerVar2.zzt();
        zzerVar2.zzk(2);
        long[] jArr = new long[zzt];
        long[] jArr2 = new long[zzt];
        int i = 0;
        long j5 = j2 + zzafrVar.zzc;
        while (i < zzt) {
            long j6 = j3;
            jArr[i] = (i * zzr) / zzt;
            jArr2[i] = j5;
            if (zzt3 == 1) {
                zzs = zzerVar2.zzs();
            } else if (zzt3 == 2) {
                zzs = zzerVar2.zzt();
            } else if (zzt3 == 3) {
                zzs = zzerVar2.zzx();
            } else {
                if (zzt3 != 4) {
                    return null;
                }
                zzs = zzerVar2.zzH();
            }
            j5 += zzs * zzt2;
            i++;
            zzerVar2 = zzerVar;
            zzt = zzt;
            j3 = j6;
        }
        long j7 = j2 + j3;
        long j8 = j7 + j4;
        if (j != -1 && j != j8) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 27 + String.valueOf(j8).length());
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(j8);
            zzee.zzc("VbriSeeker", sb.toString());
        }
        if (j8 != j5) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 43 + String.valueOf(j5).length() + 28);
            sb2.append("VBRI bytes and ToC mismatch (using max): ");
            sb2.append(j8);
            sb2.append(", ");
            sb2.append(j5);
            sb2.append("\nSeeking will be inaccurate.");
            zzee.zzc("VbriSeeker", sb2.toString());
            j8 = Math.max(j8, j5);
        }
        return new zzajs(jArr, jArr2, zzr, j7, j8, zzafrVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j) {
        long[] jArr = this.zza;
        int zzm = zzfj.zzm(jArr, j, true, true);
        long j2 = jArr[zzm];
        long[] jArr2 = this.zzb;
        zzafz zzafzVar = new zzafz(j2, jArr2[zzm]);
        if (zzafzVar.zzb >= j || zzm == jArr.length - 1) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i = zzm + 1;
        return new zzafw(zzafzVar, new zzafz(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zze(long j) {
        return this.zza[zzfj.zzm(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final int zzg() {
        return this.zze;
    }
}
