package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaiv implements zzajc {
    private final zzajb zza;
    private final long zzb;
    private final long zzc;
    private final zzajh zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaiv(zzajh zzajhVar, long j, long j2, long j3, long j4, boolean z) {
        zzef.zzd(j >= 0 && j2 > j);
        this.zzd = zzajhVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzajb();
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final /* bridge */ /* synthetic */ zzade zze() {
        zzait zzaitVar = null;
        if (this.zzf != 0) {
            return new zzaiu(this, zzaitVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void zzg(long j) {
        this.zzh = Math.max(0L, Math.min(j, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    @Override // com.google.android.gms.internal.ads.zzajc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzd(zzacf zzacfVar) throws IOException {
        long max;
        int i = this.zze;
        if (i == 0) {
            long zzf = zzacfVar.zzf();
            this.zzg = zzf;
            this.zze = 1;
            long j = this.zzc - 65307;
            if (j > zzf) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j2 = this.zzi;
                long j3 = this.zzj;
                if (j2 != j3) {
                    long zzf2 = zzacfVar.zzf();
                    if (this.zza.zzc(zzacfVar, j3)) {
                        this.zza.zzb(zzacfVar, false);
                        zzacfVar.zzj();
                        long j4 = this.zzh;
                        zzajb zzajbVar = this.zza;
                        long j5 = zzajbVar.zzb;
                        long j6 = j4 - j5;
                        int i2 = zzajbVar.zzd + zzajbVar.zze;
                        if (j6 < 0 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.zzj = zzf2;
                                this.zzl = j5;
                            } else {
                                this.zzi = zzacfVar.zzf() + i2;
                                this.zzk = j5;
                            }
                            long j7 = this.zzj;
                            long j8 = this.zzi;
                            long j9 = j7 - j8;
                            if (j9 < 100000) {
                                this.zzj = j8;
                                max = j8;
                            } else {
                                max = Math.max(j8, Math.min((zzacfVar.zzf() - (i2 * (j6 <= 0 ? 2L : 1L))) + ((j6 * j9) / (this.zzl - this.zzk)), j7 - 1));
                            }
                        }
                    } else {
                        max = this.zzi;
                        if (max == zzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (max == -1) {
                        return max;
                    }
                    this.zze = 3;
                }
                max = -1;
                if (max == -1) {
                }
            } else if (i != 3) {
                return -1L;
            }
            while (true) {
                this.zza.zzc(zzacfVar, -1L);
                this.zza.zzb(zzacfVar, false);
                zzajb zzajbVar2 = this.zza;
                if (zzajbVar2.zzb > this.zzh) {
                    zzacfVar.zzj();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                ((zzabu) zzacfVar).zzo(zzajbVar2.zzd + zzajbVar2.zze, false);
                this.zzi = zzacfVar.zzf();
                this.zzk = this.zza.zzb;
            }
        }
        this.zza.zza();
        if (!this.zza.zzc(zzacfVar, -1L)) {
            throw new EOFException();
        }
        this.zza.zzb(zzacfVar, false);
        zzajb zzajbVar3 = this.zza;
        ((zzabu) zzacfVar).zzo(zzajbVar3.zzd + zzajbVar3.zze, false);
        long j10 = this.zza.zzb;
        while (true) {
            zzajb zzajbVar4 = this.zza;
            if ((zzajbVar4.zza & 4) == 4 || !zzajbVar4.zzc(zzacfVar, -1L) || zzacfVar.zzf() >= this.zzc || !this.zza.zzb(zzacfVar, true)) {
                break;
            }
            zzajb zzajbVar5 = this.zza;
            if (!zzaci.zze(zzacfVar, zzajbVar5.zzd + zzajbVar5.zze)) {
                break;
            }
            j10 = this.zza.zzb;
        }
        this.zzf = j10;
        this.zze = 4;
        return this.zzg;
    }
}
