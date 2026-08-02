package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzanl {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzer zza = new zzer(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzek zzb = new zzek();

    zzanl(int i) {
    }

    private final int zze(zzacl zzaclVar) {
        byte[] bArr = zzet.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzaclVar.zzj();
        return 0;
    }

    public final int zza(zzacl zzaclVar, zzadf zzadfVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzaclVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzaclVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j2 = zzd - min;
            if (zzaclVar.zzf() == j2) {
                this.zzb.zzH(min);
                zzaclVar.zzj();
                ((zzaby) zzaclVar).zzm(this.zzb.zzM(), 0, min, false);
                zzek zzekVar = this.zzb;
                int zzd2 = zzekVar.zzd();
                int zze = zzekVar.zze();
                int i2 = zze - 188;
                while (true) {
                    if (i2 < zzd2) {
                        break;
                    }
                    byte[] zzM = zzekVar.zzM();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * 188) + i2;
                        if (i5 < zzd2 || i5 >= zze || zzM[i5] != 71) {
                            i4 = 0;
                        } else {
                            i4++;
                            if (i4 == 5) {
                                long zzb = zzanu.zzb(zzekVar, i2, i);
                                if (zzb != -9223372036854775807L) {
                                    j = zzb;
                                    break;
                                }
                            }
                        }
                        i3++;
                    }
                    i2--;
                }
                this.zzg = j;
                this.zze = true;
                return 0;
            }
            zzadfVar.zza = j2;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzaclVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zze(zzaclVar);
                    return 0;
                }
                zzer zzerVar = this.zza;
                this.zzh = zzerVar.zzc(this.zzg) - zzerVar.zzb(j3);
                zze(zzaclVar);
                return 0;
            }
            int min2 = (int) Math.min(112800L, zzaclVar.zzd());
            if (zzaclVar.zzf() == 0) {
                this.zzb.zzH(min2);
                zzaclVar.zzj();
                ((zzaby) zzaclVar).zzm(this.zzb.zzM(), 0, min2, false);
                zzek zzekVar2 = this.zzb;
                int zzd3 = zzekVar2.zzd();
                int zze2 = zzekVar2.zze();
                while (true) {
                    if (zzd3 >= zze2) {
                        break;
                    }
                    if (zzekVar2.zzM()[zzd3] == 71) {
                        long zzb2 = zzanu.zzb(zzekVar2, zzd3, i);
                        if (zzb2 != -9223372036854775807L) {
                            j = zzb2;
                            break;
                        }
                    }
                    zzd3++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
            zzadfVar.zza = 0L;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzer zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
