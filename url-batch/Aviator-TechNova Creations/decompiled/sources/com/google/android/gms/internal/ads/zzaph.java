package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzaph implements zzaef {
    private final zzfg zza;
    private final zzer zzb = new zzer();

    /* synthetic */ zzaph(zzfg zzfgVar, byte[] bArr) {
        this.zza = zzfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaee zza(zzaev zzaevVar, long j) throws IOException {
        int zzh;
        long zzn = zzaevVar.zzn();
        int min = (int) Math.min(20000L, zzaevVar.zzo() - zzn);
        zzer zzerVar = this.zzb;
        zzerVar.zza(min);
        zzaevVar.zzi(zzerVar.zzi(), 0, min);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (zzerVar.zzd() >= 4) {
            if (zzapi.zzh(zzerVar.zzi(), zzerVar.zzg()) != 442) {
                zzerVar.zzk(1);
            } else {
                zzerVar.zzk(4);
                long zze = zzapj.zze(zzerVar);
                if (zze != -9223372036854775807L) {
                    long zze2 = this.zza.zze(zze);
                    if (zze2 > j) {
                        return j2 == -9223372036854775807L ? zzaee.zza(zze2, zzn) : zzaee.zzc(zzn + i2);
                    }
                    if (100000 + zze2 > j) {
                        return zzaee.zzc(zzn + zzerVar.zzg());
                    }
                    i2 = zzerVar.zzg();
                    j2 = zze2;
                }
                int zze3 = zzerVar.zze();
                if (zzerVar.zzd() >= 10) {
                    zzerVar.zzk(9);
                    int zzs = zzerVar.zzs() & 7;
                    if (zzerVar.zzd() >= zzs) {
                        zzerVar.zzk(zzs);
                        if (zzerVar.zzd() >= 4) {
                            if (zzapi.zzh(zzerVar.zzi(), zzerVar.zzg()) == 443) {
                                zzerVar.zzk(4);
                                int zzt = zzerVar.zzt();
                                if (zzerVar.zzd() < zzt) {
                                    zzerVar.zzh(zze3);
                                } else {
                                    zzerVar.zzk(zzt);
                                }
                            }
                            while (true) {
                                if (zzerVar.zzd() < 4 || (zzh = zzapi.zzh(zzerVar.zzi(), zzerVar.zzg())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzerVar.zzk(4);
                                if (zzerVar.zzd() < 2) {
                                    zzerVar.zzh(zze3);
                                    break;
                                }
                                zzerVar.zzh(Math.min(zzerVar.zze(), zzerVar.zzg() + zzerVar.zzt()));
                            }
                        } else {
                            zzerVar.zzh(zze3);
                        }
                    } else {
                        zzerVar.zzh(zze3);
                    }
                } else {
                    zzerVar.zzh(zze3);
                }
                i = zzerVar.zzg();
            }
        }
        return j2 != -9223372036854775807L ? zzaee.zzb(j2, zzn + i) : zzaee.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzb() {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
