package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaeq {
    private final zzaep zza;
    private final zzaeb zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzaeq(int i, zzaep zzaepVar, zzaeb zzaebVar) {
        this.zza = zzaepVar;
        int zzc = zzaepVar.zzc();
        boolean z = true;
        if (zzc != 1) {
            if (zzc == 2) {
                zzc = 2;
            } else {
                z = false;
            }
        }
        zzghc.zza(z);
        this.zzc = zzj(i, zzc == 2 ? 1667497984 : 1651965952);
        this.zze = zzaepVar.zzd();
        this.zzb = zzaebVar;
        this.zzd = zzc == 2 ? zzj(i, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[512];
        this.zzn = new int[512];
        this.zzf = zzaepVar.zzd;
    }

    private final long zzh(int i) {
        return (this.zze * i) / this.zzf;
    }

    private final zzadw zzi(int i) {
        return new zzadw(this.zzn[i] * zzh(1), this.zzm[i]);
    }

    private static int zzj(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    public final void zza(long j, boolean z) {
        if (this.zzl == -1) {
            this.zzl = j;
        }
        if (z) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i = this.zzk;
            jArr2[i] = j;
            this.zzn[i] = this.zzj;
            this.zzk = i + 1;
        }
        this.zzj++;
    }

    public final void zzb() {
        int i;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i = this.zzk) <= 0) {
            return;
        }
        this.zzf = i;
    }

    public final boolean zzc(int i) {
        return this.zzc == i || this.zzd == i;
    }

    public final void zzd(int i) {
        this.zzg = i;
        this.zzh = i;
    }

    public final boolean zze(zzacv zzacvVar) throws IOException {
        int i = this.zzh;
        zzaeb zzaebVar = this.zzb;
        int zzy = i - zzaebVar.zzy(zzacvVar, i, false);
        this.zzh = zzy;
        boolean z = zzy == 0;
        if (z) {
            if (this.zzg > 0) {
                zzaebVar.zzx(zzh(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z;
    }

    public final void zzf(long j) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[zzeo.zzm(this.zzm, j, true, true)];
        }
    }

    public final zzadt zzg(long j) {
        if (this.zzk == 0) {
            zzadw zzadwVar = new zzadw(0L, this.zzl);
            return new zzadt(zzadwVar, zzadwVar);
        }
        int zzh = (int) (j / zzh(1));
        int zzl = zzeo.zzl(this.zzn, zzh, true, true);
        if (this.zzn[zzl] == zzh) {
            zzadw zzi = zzi(zzl);
            return new zzadt(zzi, zzi);
        }
        zzadw zzi2 = zzi(zzl);
        int i = zzl + 1;
        return i < this.zzm.length ? new zzadt(zzi2, zzi(i)) : new zzadt(zzi2, zzi2);
    }
}
