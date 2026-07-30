package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzali implements zzalp {
    private final zzalo zza;
    private final long zzb;
    private final long zzc;
    private final zzalt zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzali(zzalt zzaltVar, long j, long j2, long j3, long j4, boolean z) {
        zzgrc.zza(j >= 0 && j2 > j);
        this.zzd = zzaltVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzalo();
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzb(long j) {
        long j2 = this.zzf - 1;
        String str = zzfj.zza;
        this.zzh = Math.max(0L, Math.min(j, j2));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final /* bridge */ /* synthetic */ zzafy zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzalh(this, bArr);
        }
        return null;
    }

    final /* synthetic */ long zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ zzalt zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzalp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza(zzaev zzaevVar) throws IOException {
        long j;
        long j2;
        long max;
        int i = this.zze;
        if (i == 0) {
            long zzn = zzaevVar.zzn();
            this.zzg = zzn;
            this.zze = 1;
            long j3 = this.zzc - 65307;
            if (j3 > zzn) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j4 = this.zzi;
                long j5 = this.zzj;
                if (j4 == j5) {
                    max = -1;
                    j2 = -1;
                } else {
                    long zzn2 = zzaevVar.zzn();
                    zzalo zzaloVar = this.zza;
                    if (zzaloVar.zzb(zzaevVar, j5)) {
                        zzaloVar.zzc(zzaevVar, false);
                        zzaevVar.zzl();
                        long j6 = this.zzh;
                        j = 2;
                        long j7 = zzaloVar.zzb;
                        long j8 = j6 - j7;
                        int i2 = zzaloVar.zzd + zzaloVar.zze;
                        if (j8 < 0 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.zzj = zzn2;
                                this.zzl = j7;
                            } else {
                                this.zzi = zzaevVar.zzn() + i2;
                                this.zzk = j7;
                            }
                            long j9 = this.zzj;
                            long j10 = this.zzi;
                            long j11 = j9 - j10;
                            if (j11 < 100000) {
                                this.zzj = j10;
                                j2 = -1;
                                max = j10;
                            } else {
                                long zzn3 = zzaevVar.zzn() - (i2 * (j8 <= 0 ? 2L : 1L));
                                j2 = -1;
                                String str = zzfj.zza;
                                max = Math.max(j10, Math.min(zzn3 + ((j8 * j11) / (this.zzl - this.zzk)), j9 - 1));
                            }
                        } else {
                            max = -1;
                            j2 = -1;
                        }
                        if (max == j2) {
                            return max;
                        }
                        this.zze = 3;
                    } else {
                        max = this.zzi;
                        if (max == zzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j2 = -1;
                    }
                }
                j = 2;
                if (max == j2) {
                }
            } else {
                if (i != 3) {
                    return -1L;
                }
                j2 = -1;
                j = 2;
            }
            while (true) {
                zzalo zzaloVar2 = this.zza;
                zzaloVar2.zzb(zzaevVar, j2);
                zzaloVar2.zzc(zzaevVar, false);
                if (zzaloVar2.zzb > this.zzh) {
                    zzaevVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + j);
                }
                zzaevVar.zzf(zzaloVar2.zzd + zzaloVar2.zze);
                this.zzi = zzaevVar.zzn();
                this.zzk = zzaloVar2.zzb;
                j2 = -1;
            }
        }
        zzalo zzaloVar3 = this.zza;
        zzaloVar3.zza();
        if (!zzaloVar3.zzb(zzaevVar, -1L)) {
            throw new EOFException();
        }
        zzaloVar3.zzc(zzaevVar, false);
        zzaevVar.zzf(zzaloVar3.zzd + zzaloVar3.zze);
        long j12 = zzaloVar3.zzb;
        while ((zzaloVar3.zza & 4) != 4 && zzaloVar3.zzb(zzaevVar, -1L) && zzaevVar.zzn() < this.zzc && zzaloVar3.zzc(zzaevVar, true) && zzaey.zzd(zzaevVar, zzaloVar3.zzd + zzaloVar3.zze)) {
            j12 = zzaloVar3.zzb;
        }
        this.zzf = j12;
        this.zze = 4;
        return this.zzg;
    }
}
