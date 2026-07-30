package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzapt {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfg zza = new zzfg(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzer zzb = new zzer();

    zzapt(int i) {
    }

    private final int zze(zzaev zzaevVar) {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzaevVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzaev zzaevVar, zzafv zzafvVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzaevVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzaevVar);
                return 0;
            }
            if (this.zzd) {
                long j2 = this.zzf;
                if (j2 == -9223372036854775807L) {
                    zze(zzaevVar);
                    return 0;
                }
                zzfg zzfgVar = this.zza;
                this.zzh = zzfgVar.zzf(this.zzg) - zzfgVar.zze(j2);
                zze(zzaevVar);
                return 0;
            }
            int min = (int) Math.min(112800L, zzaevVar.zzo());
            if (zzaevVar.zzn() != 0) {
                zzafvVar.zza = 0L;
                return 1;
            }
            zzer zzerVar = this.zzb;
            zzerVar.zza(min);
            zzaevVar.zzl();
            zzaevVar.zzi(zzerVar.zzi(), 0, min);
            int zzg = zzerVar.zzg();
            int zze = zzerVar.zze();
            while (true) {
                if (zzg >= zze) {
                    break;
                }
                if (zzerVar.zzi()[zzg] == 71) {
                    long zzb = zzaqd.zzb(zzerVar, zzg, i);
                    if (zzb != -9223372036854775807L) {
                        j = zzb;
                        break;
                    }
                }
                zzg++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
        long zzo = zzaevVar.zzo();
        int min2 = (int) Math.min(112800L, zzo);
        long j3 = zzo - min2;
        if (zzaevVar.zzn() != j3) {
            zzafvVar.zza = j3;
            return 1;
        }
        zzer zzerVar2 = this.zzb;
        zzerVar2.zza(min2);
        zzaevVar.zzl();
        zzaevVar.zzi(zzerVar2.zzi(), 0, min2);
        int zzg2 = zzerVar2.zzg();
        int zze2 = zzerVar2.zze();
        int i2 = zze2 - 188;
        while (true) {
            if (i2 < zzg2) {
                break;
            }
            byte[] zzi = zzerVar2.zzi();
            int i3 = -4;
            int i4 = 0;
            while (true) {
                if (i3 > 4) {
                    break;
                }
                int i5 = (i3 * Opcodes.NEWARRAY) + i2;
                if (i5 < zzg2 || i5 >= zze2 || zzi[i5] != 71) {
                    i4 = 0;
                } else {
                    i4++;
                    if (i4 == 5) {
                        long zzb2 = zzaqd.zzb(zzerVar2, i2, i);
                        if (zzb2 != -9223372036854775807L) {
                            j = zzb2;
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

    public final long zzc() {
        return this.zzh;
    }

    public final zzfg zzd() {
        return this.zza;
    }
}
