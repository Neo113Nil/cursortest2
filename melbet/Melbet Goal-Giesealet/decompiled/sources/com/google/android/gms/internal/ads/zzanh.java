package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzanh implements zzacf {
    private final zzel zza;
    private final zzef zzb = new zzef();
    private final int zzc;

    public zzanh(int i, zzel zzelVar, int i2) {
        this.zzc = i;
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final zzace zza(zzacv zzacvVar, long j) throws IOException {
        int zza;
        int zza2;
        long zzn = zzacvVar.zzn();
        int min = (int) Math.min(112800L, zzacvVar.zzo() - zzn);
        zzef zzefVar = this.zzb;
        zzefVar.zza(min);
        zzacvVar.zzi(zzefVar.zzi(), 0, min);
        int zze = zzefVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzefVar.zzd() >= 188 && (zza2 = (zza = zzant.zza(zzefVar.zzi(), zzefVar.zzg(), zze)) + 188) <= zze) {
            long zzb = zzant.zzb(zzefVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zze2 = this.zza.zze(zzb);
                if (zze2 > j) {
                    return j3 == -9223372036854775807L ? zzace.zza(zze2, zzn) : zzace.zzc(zzn + j4);
                }
                j4 = zza;
                if (100000 + zze2 > j) {
                    return zzace.zzc(zzn + j4);
                }
                j3 = zze2;
            }
            zzefVar.zzh(zza2);
            j2 = zza2;
        }
        return j3 != -9223372036854775807L ? zzace.zzb(j3, zzn + j2) : zzace.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final void zzb() {
        byte[] bArr = zzeo.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
