package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzakt {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfq zza = new zzfq(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfj zzb = new zzfj();

    zzakt() {
    }

    public static long zzc(zzfj zzfjVar) {
        int zzc = zzfjVar.zzc();
        if (zzfjVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzfjVar.zzC(bArr, 0, 9);
        zzfjVar.zzG(zzc);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    private final int zzf(zzacf zzacfVar) {
        byte[] bArr = zzfs.zzf;
        int length = bArr.length;
        this.zzb.zzE(bArr, 0);
        this.zzc = true;
        zzacfVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzacfVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j2 = zzd - min;
            if (zzacfVar.zzf() != j2) {
                zzadbVar.zza = j2;
                return 1;
            }
            this.zzb.zzD(min);
            zzacfVar.zzj();
            ((zzabu) zzacfVar).zzm(this.zzb.zzI(), 0, min, false);
            zzfj zzfjVar = this.zzb;
            int zzc = zzfjVar.zzc();
            int zzd2 = zzfjVar.zzd() - 4;
            while (true) {
                if (zzd2 < zzc) {
                    break;
                }
                if (zzg(zzfjVar.zzI(), zzd2) == 442) {
                    zzfjVar.zzG(zzd2 + 4);
                    long zzc2 = zzc(zzfjVar);
                    if (zzc2 != -9223372036854775807L) {
                        j = zzc2;
                        break;
                    }
                }
                zzd2--;
            }
            this.zzg = j;
            this.zze = true;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zzf(zzacfVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zzf(zzacfVar);
                    return 0;
                }
                zzfq zzfqVar = this.zza;
                long zzb = zzfqVar.zzb(this.zzg) - zzfqVar.zzb(j3);
                this.zzh = zzb;
                if (zzb < 0) {
                    zzez.zzf("PsDurationReader", "Invalid duration: " + zzb + ". Using TIME_UNSET instead.");
                    this.zzh = -9223372036854775807L;
                }
                zzf(zzacfVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, zzacfVar.zzd());
            if (zzacfVar.zzf() != 0) {
                zzadbVar.zza = 0L;
                return 1;
            }
            this.zzb.zzD(min2);
            zzacfVar.zzj();
            ((zzabu) zzacfVar).zzm(this.zzb.zzI(), 0, min2, false);
            zzfj zzfjVar2 = this.zzb;
            int zzc3 = zzfjVar2.zzc();
            int zzd3 = zzfjVar2.zzd();
            while (true) {
                if (zzc3 >= zzd3 - 3) {
                    break;
                }
                if (zzg(zzfjVar2.zzI(), zzc3) == 442) {
                    zzfjVar2.zzG(zzc3 + 4);
                    long zzc4 = zzc(zzfjVar2);
                    if (zzc4 != -9223372036854775807L) {
                        j = zzc4;
                        break;
                    }
                }
                zzc3++;
            }
            this.zzf = j;
            this.zzd = true;
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfq zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
