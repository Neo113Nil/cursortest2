package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzalc {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfq zza = new zzfq(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfj zzb = new zzfj();

    zzalc(int i) {
    }

    private final int zze(zzacf zzacfVar) {
        byte[] bArr = zzfs.zzf;
        int length = bArr.length;
        this.zzb.zzE(bArr, 0);
        this.zzc = true;
        zzacfVar.zzj();
        return 0;
    }

    public final int zza(zzacf zzacfVar, zzadb zzadbVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzacfVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzacfVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j2 = zzd - min;
            if (zzacfVar.zzf() == j2) {
                this.zzb.zzD(min);
                zzacfVar.zzj();
                ((zzabu) zzacfVar).zzm(this.zzb.zzI(), 0, min, false);
                zzfj zzfjVar = this.zzb;
                int zzc = zzfjVar.zzc();
                int zzd2 = zzfjVar.zzd();
                int i2 = zzd2 - 188;
                while (true) {
                    if (i2 < zzc) {
                        break;
                    }
                    byte[] zzI = zzfjVar.zzI();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * Opcodes.NEWARRAY) + i2;
                        if (i5 < zzc || i5 >= zzd2 || zzI[i5] != 71) {
                            i4 = 0;
                        } else {
                            i4++;
                            if (i4 == 5) {
                                long zzb = zzalm.zzb(zzfjVar, i2, i);
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
            zzadbVar.zza = j2;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzacfVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zze(zzacfVar);
                    return 0;
                }
                zzfq zzfqVar = this.zza;
                long zzb2 = zzfqVar.zzb(this.zzg) - zzfqVar.zzb(j3);
                this.zzh = zzb2;
                if (zzb2 < 0) {
                    zzez.zzf("TsDurationReader", "Invalid duration: " + zzb2 + ". Using TIME_UNSET instead.");
                    this.zzh = -9223372036854775807L;
                }
                zze(zzacfVar);
                return 0;
            }
            int min2 = (int) Math.min(112800L, zzacfVar.zzd());
            if (zzacfVar.zzf() == 0) {
                this.zzb.zzD(min2);
                zzacfVar.zzj();
                ((zzabu) zzacfVar).zzm(this.zzb.zzI(), 0, min2, false);
                zzfj zzfjVar2 = this.zzb;
                int zzc2 = zzfjVar2.zzc();
                int zzd3 = zzfjVar2.zzd();
                while (true) {
                    if (zzc2 >= zzd3) {
                        break;
                    }
                    if (zzfjVar2.zzI()[zzc2] == 71) {
                        long zzb3 = zzalm.zzb(zzfjVar2, zzc2, i);
                        if (zzb3 != -9223372036854775807L) {
                            j = zzb3;
                            break;
                        }
                    }
                    zzc2++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
            zzadbVar.zza = 0L;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfq zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
