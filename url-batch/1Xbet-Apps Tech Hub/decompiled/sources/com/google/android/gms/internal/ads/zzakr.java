package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzakr implements zzabp {
    private final zzfq zza;
    private final zzfj zzb = new zzfj();

    /* synthetic */ zzakr(zzfq zzfqVar, zzakq zzakqVar) {
        this.zza = zzfqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final zzabo zza(zzacf zzacfVar, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzacfVar.zzf();
        int min = (int) Math.min(20000L, zzacfVar.zzd() - zzf);
        this.zzb.zzD(min);
        ((zzabu) zzacfVar).zzm(this.zzb.zzI(), 0, min, false);
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            zzfj zzfjVar = this.zzb;
            if (zzfjVar.zza() < 4) {
                return j3 != -9223372036854775807L ? zzabo.zzf(j3, zzf + i) : zzabo.zza;
            }
            if (zzaks.zzh(zzfjVar.zzI(), zzfjVar.zzc()) != 442) {
                zzfjVar.zzH(1);
            } else {
                zzfjVar.zzH(4);
                long zzc = zzakt.zzc(zzfjVar);
                if (zzc != -9223372036854775807L) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzabo.zzd(zzb, zzf);
                        }
                        j2 = i2;
                    } else {
                        if (100000 + zzb > j) {
                            j2 = zzfjVar.zzc();
                            break;
                        }
                        i2 = zzfjVar.zzc();
                        j3 = zzb;
                    }
                }
                int zzd = zzfjVar.zzd();
                if (zzfjVar.zza() >= 10) {
                    zzfjVar.zzH(9);
                    int zzl = zzfjVar.zzl() & 7;
                    if (zzfjVar.zza() >= zzl) {
                        zzfjVar.zzH(zzl);
                        if (zzfjVar.zza() >= 4) {
                            if (zzaks.zzh(zzfjVar.zzI(), zzfjVar.zzc()) == 443) {
                                zzfjVar.zzH(4);
                                int zzp = zzfjVar.zzp();
                                if (zzfjVar.zza() < zzp) {
                                    zzfjVar.zzG(zzd);
                                } else {
                                    zzfjVar.zzH(zzp);
                                }
                            }
                            while (true) {
                                if (zzfjVar.zza() < 4 || (zzh = zzaks.zzh(zzfjVar.zzI(), zzfjVar.zzc())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzfjVar.zzH(4);
                                if (zzfjVar.zza() < 2) {
                                    zzfjVar.zzG(zzd);
                                    break;
                                }
                                zzfjVar.zzG(Math.min(zzfjVar.zzd(), zzfjVar.zzc() + zzfjVar.zzp()));
                            }
                        } else {
                            zzfjVar.zzG(zzd);
                        }
                    } else {
                        zzfjVar.zzG(zzd);
                    }
                } else {
                    zzfjVar.zzG(zzd);
                }
                i = zzfjVar.zzc();
            }
        }
        return zzabo.zze(zzf + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final void zzb() {
        byte[] bArr = zzfs.zzf;
        int length = bArr.length;
        this.zzb.zzE(bArr, 0);
    }
}
