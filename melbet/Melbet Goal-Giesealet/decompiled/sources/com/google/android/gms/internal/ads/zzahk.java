package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzahk {
    public final zzado zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzahk(zzado zzadoVar, long j, long j2, long[] jArr, int i, int i2) {
        this.zza = new zzado(zzadoVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i2;
    }

    public static zzahk zza(zzado zzadoVar, zzef zzefVar) {
        long[] jArr;
        int i;
        int i2;
        int zzB = zzefVar.zzB();
        int zzH = (zzB & 1) != 0 ? zzefVar.zzH() : -1;
        long zzz = (zzB & 2) != 0 ? zzefVar.zzz() : -1L;
        if ((zzB & 4) == 4) {
            jArr = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr[i3] = zzefVar.zzs();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((zzB & 8) != 0) {
            zzefVar.zzk(4);
        }
        if (zzefVar.zzd() >= 24) {
            zzefVar.zzk(21);
            int zzx = zzefVar.zzx();
            i2 = zzx & 4095;
            i = zzx >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzahk(zzadoVar, zzH, zzz, jArr2, i, i2);
    }

    public final long zzb() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return zzeo.zzr((j * r4.zzg) - 1, this.zza.zzd);
    }
}
