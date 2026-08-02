package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzanb implements zzabt {
    private final zzer zza;
    private final zzek zzb = new zzek();

    /* synthetic */ zzanb(zzer zzerVar, zzana zzanaVar) {
        this.zza = zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final zzabs zza(zzacl zzaclVar, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzaclVar.zzf();
        int min = (int) Math.min(20000L, zzaclVar.zzd() - zzf);
        this.zzb.zzH(min);
        ((zzaby) zzaclVar).zzm(this.zzb.zzM(), 0, min, false);
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            zzek zzekVar = this.zzb;
            if (zzekVar.zzb() < 4) {
                return j3 != -9223372036854775807L ? zzabs.zzf(j3, zzf + i) : zzabs.zza;
            }
            if (zzanc.zzh(zzekVar.zzM(), zzekVar.zzd()) != 442) {
                zzekVar.zzL(1);
            } else {
                zzekVar.zzL(4);
                long zzc = zzand.zzc(zzekVar);
                if (zzc != -9223372036854775807L) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzabs.zzd(zzb, zzf);
                        }
                        j2 = i2;
                    } else {
                        if (100000 + zzb > j) {
                            j2 = zzekVar.zzd();
                            break;
                        }
                        i2 = zzekVar.zzd();
                        j3 = zzb;
                    }
                }
                int zze = zzekVar.zze();
                if (zzekVar.zzb() >= 10) {
                    zzekVar.zzL(9);
                    int zzm = zzekVar.zzm() & 7;
                    if (zzekVar.zzb() >= zzm) {
                        zzekVar.zzL(zzm);
                        if (zzekVar.zzb() >= 4) {
                            if (zzanc.zzh(zzekVar.zzM(), zzekVar.zzd()) == 443) {
                                zzekVar.zzL(4);
                                int zzq = zzekVar.zzq();
                                if (zzekVar.zzb() < zzq) {
                                    zzekVar.zzK(zze);
                                } else {
                                    zzekVar.zzL(zzq);
                                }
                            }
                            while (true) {
                                if (zzekVar.zzb() < 4 || (zzh = zzanc.zzh(zzekVar.zzM(), zzekVar.zzd())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzekVar.zzL(4);
                                if (zzekVar.zzb() < 2) {
                                    zzekVar.zzK(zze);
                                    break;
                                }
                                zzekVar.zzK(Math.min(zzekVar.zze(), zzekVar.zzd() + zzekVar.zzq()));
                            }
                        } else {
                            zzekVar.zzK(zze);
                        }
                    } else {
                        zzekVar.zzK(zze);
                    }
                } else {
                    zzekVar.zzK(zze);
                }
                i = zzekVar.zzd();
            }
        }
        return zzabs.zze(zzf + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final void zzb() {
        byte[] bArr = zzet.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
    }
}
