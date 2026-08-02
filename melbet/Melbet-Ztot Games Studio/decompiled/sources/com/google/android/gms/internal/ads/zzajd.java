package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzajd implements zzajj {
    private final zzaji zza;
    private final long zzb;
    private final long zzc;
    private final zzajo zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzajd(zzajo zzajoVar, long j, long j2, long j3, long j4, boolean z) {
        zzdi.zzd(j >= 0 && j2 > j);
        this.zzd = zzajoVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzaji();
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final /* bridge */ /* synthetic */ zzadi zze() {
        zzajb zzajbVar = null;
        if (this.zzf != 0) {
            return new zzajc(this, zzajbVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzg(long j) {
        this.zzh = Math.max(0L, Math.min(j, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    @Override // com.google.android.gms.internal.ads.zzajj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzd(zzacl zzaclVar) throws IOException {
        long max;
        int i = this.zze;
        if (i == 0) {
            long zzf = zzaclVar.zzf();
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
                    long zzf2 = zzaclVar.zzf();
                    if (this.zza.zzc(zzaclVar, j3)) {
                        this.zza.zzb(zzaclVar, false);
                        zzaclVar.zzj();
                        long j4 = this.zzh;
                        zzaji zzajiVar = this.zza;
                        long j5 = zzajiVar.zzb;
                        long j6 = j4 - j5;
                        int i2 = zzajiVar.zzd + zzajiVar.zze;
                        if (j6 < 0 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.zzj = zzf2;
                                this.zzl = j5;
                            } else {
                                this.zzi = zzaclVar.zzf() + i2;
                                this.zzk = j5;
                            }
                            long j7 = this.zzj;
                            long j8 = this.zzi;
                            long j9 = j7 - j8;
                            if (j9 < 100000) {
                                this.zzj = j8;
                                max = j8;
                            } else {
                                max = Math.max(j8, Math.min((zzaclVar.zzf() - (i2 * (j6 <= 0 ? 2L : 1L))) + ((j6 * j9) / (this.zzl - this.zzk)), j7 - 1));
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
                this.zza.zzc(zzaclVar, -1L);
                this.zza.zzb(zzaclVar, false);
                zzaji zzajiVar2 = this.zza;
                if (zzajiVar2.zzb > this.zzh) {
                    zzaclVar.zzj();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                ((zzaby) zzaclVar).zzo(zzajiVar2.zzd + zzajiVar2.zze, false);
                this.zzi = zzaclVar.zzf();
                this.zzk = this.zza.zzb;
            }
        }
        this.zza.zza();
        if (!this.zza.zzc(zzaclVar, -1L)) {
            throw new EOFException();
        }
        this.zza.zzb(zzaclVar, false);
        zzaji zzajiVar3 = this.zza;
        ((zzaby) zzaclVar).zzo(zzajiVar3.zzd + zzajiVar3.zze, false);
        long j10 = this.zza.zzb;
        while (true) {
            zzaji zzajiVar4 = this.zza;
            if ((zzajiVar4.zza & 4) == 4 || !zzajiVar4.zzc(zzaclVar, -1L) || zzaclVar.zzf() >= this.zzc || !this.zza.zzb(zzaclVar, true)) {
                break;
            }
            zzaji zzajiVar5 = this.zza;
            if (!zzaco.zze(zzaclVar, zzajiVar5.zzd + zzajiVar5.zze)) {
                break;
            }
            j10 = this.zza.zzb;
        }
        this.zzf = j10;
        this.zze = 4;
        return this.zzg;
    }
}
