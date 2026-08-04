package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzamx implements zzacf {
    private final zzel zza;
    private final zzef zzb = new zzef();

    /* synthetic */ zzamx(zzel zzelVar, byte[] bArr) {
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final zzace zza(zzacv zzacvVar, long j) throws IOException {
        int zzh;
        long zzn = zzacvVar.zzn();
        int min = (int) Math.min(20000L, zzacvVar.zzo() - zzn);
        zzef zzefVar = this.zzb;
        zzefVar.zza(min);
        zzacvVar.zzi(zzefVar.zzi(), 0, min);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (zzefVar.zzd() >= 4) {
            if (zzamy.zzh(zzefVar.zzi(), zzefVar.zzg()) != 442) {
                zzefVar.zzk(1);
            } else {
                zzefVar.zzk(4);
                long zze = zzamz.zze(zzefVar);
                if (zze != -9223372036854775807L) {
                    long zze2 = this.zza.zze(zze);
                    if (zze2 > j) {
                        return j2 == -9223372036854775807L ? zzace.zza(zze2, zzn) : zzace.zzc(zzn + i2);
                    }
                    if (100000 + zze2 > j) {
                        return zzace.zzc(zzn + zzefVar.zzg());
                    }
                    i2 = zzefVar.zzg();
                    j2 = zze2;
                }
                int zze3 = zzefVar.zze();
                if (zzefVar.zzd() >= 10) {
                    zzefVar.zzk(9);
                    int zzs = zzefVar.zzs() & 7;
                    if (zzefVar.zzd() >= zzs) {
                        zzefVar.zzk(zzs);
                        if (zzefVar.zzd() >= 4) {
                            if (zzamy.zzh(zzefVar.zzi(), zzefVar.zzg()) == 443) {
                                zzefVar.zzk(4);
                                int zzt = zzefVar.zzt();
                                if (zzefVar.zzd() < zzt) {
                                    zzefVar.zzh(zze3);
                                } else {
                                    zzefVar.zzk(zzt);
                                }
                            }
                            while (true) {
                                if (zzefVar.zzd() < 4 || (zzh = zzamy.zzh(zzefVar.zzi(), zzefVar.zzg())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzefVar.zzk(4);
                                if (zzefVar.zzd() < 2) {
                                    zzefVar.zzh(zze3);
                                    break;
                                }
                                zzefVar.zzh(Math.min(zzefVar.zze(), zzefVar.zzg() + zzefVar.zzt()));
                            }
                        } else {
                            zzefVar.zzh(zze3);
                        }
                    } else {
                        zzefVar.zzh(zze3);
                    }
                } else {
                    zzefVar.zzh(zze3);
                }
                i = zzefVar.zzg();
            }
        }
        return j2 != -9223372036854775807L ? zzace.zzb(j2, zzn + i) : zzace.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final void zzb() {
        byte[] bArr = zzeo.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
