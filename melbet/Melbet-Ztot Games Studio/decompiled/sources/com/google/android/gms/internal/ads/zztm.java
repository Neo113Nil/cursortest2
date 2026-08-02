package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zztm implements zzug, zzuf {
    public final zzug zza;
    long zzb;
    private zzuf zzc;
    private zztl[] zzd = new zztl[0];
    private long zze = 0;

    public zztm(zzug zzugVar, boolean z, long j, long j2) {
        this.zza = zzugVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zza(long j, zzlj zzljVar) {
        if (j == 0) {
            return 0L;
        }
        long max = Math.max(0L, Math.min(zzljVar.zzc, j));
        long j2 = zzljVar.zzd;
        long j3 = this.zzb;
        long max2 = Math.max(0L, Math.min(j2, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j));
        if (max != zzljVar.zzc || max2 != zzljVar.zzd) {
            zzljVar = new zzlj(max, max2);
        }
        return this.zza.zza(j, zzljVar);
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzb < j) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzc < j) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long zzd = zzd();
            return zzd != -9223372036854775807L ? zzd : j;
        }
        long zzd2 = this.zza.zzd();
        if (zzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        zzdi.zzf(zzd2 >= 0);
        long j2 = this.zzb;
        zzdi.zzf(j2 == Long.MIN_VALUE || zzd2 <= j2);
        return zzd2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 > r8) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zze(long j) {
        this.zze = -9223372036854775807L;
        boolean z = false;
        for (zztl zztlVar : this.zzd) {
            if (zztlVar != null) {
                zztlVar.zzc();
            }
        }
        long zze = this.zza.zze(j);
        if (zze != j) {
            if (zze >= 0) {
                long j2 = this.zzb;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            zzdi.zzf(z);
            return zze;
        }
        z = true;
        zzdi.zzf(z);
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ void zzf(zzvz zzvzVar) {
        zzuf zzufVar = this.zzc;
        zzufVar.getClass();
        zzufVar.zzf(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r4 > r7) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzg(zzxv[] zzxvVarArr, boolean[] zArr, zzvx[] zzvxVarArr, boolean[] zArr2, long j) {
        int length = zzvxVarArr.length;
        this.zzd = new zztl[length];
        zzvx[] zzvxVarArr2 = new zzvx[length];
        int i = 0;
        while (true) {
            zzvx zzvxVar = null;
            if (i >= zzvxVarArr.length) {
                break;
            }
            zztl[] zztlVarArr = this.zzd;
            zztl zztlVar = (zztl) zzvxVarArr[i];
            zztlVarArr[i] = zztlVar;
            if (zztlVar != null) {
                zzvxVar = zztlVar.zza;
            }
            zzvxVarArr2[i] = zzvxVar;
            i++;
        }
        long zzg = this.zza.zzg(zzxvVarArr, zArr, zzvxVarArr2, zArr2, j);
        long j2 = (zzq() && j == 0) ? 0L : j;
        this.zze = -9223372036854775807L;
        boolean z = true;
        if (zzg != j2) {
            if (zzg >= 0) {
                long j3 = this.zzb;
                if (j3 != Long.MIN_VALUE) {
                }
            }
            z = false;
        }
        zzdi.zzf(z);
        for (int i2 = 0; i2 < zzvxVarArr.length; i2++) {
            zzvx zzvxVar2 = zzvxVarArr2[i2];
            if (zzvxVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zztl[] zztlVarArr2 = this.zzd;
                zztl zztlVar2 = zztlVarArr2[i2];
                if (zztlVar2 == null || zztlVar2.zza != zzvxVar2) {
                    zztlVarArr2[i2] = new zztl(this, zzvxVar2);
                }
            }
            zzvxVarArr[i2] = this.zzd[i2];
        }
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final zzwi zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzl(zzuf zzufVar, long j) {
        this.zzc = zzufVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final boolean zzo(zzkf zzkfVar) {
        return this.zza.zzo(zzkfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final boolean zzp() {
        return this.zza.zzp();
    }

    final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzuf
    public final void zzh(zzug zzugVar) {
        zzuf zzufVar = this.zzc;
        zzufVar.getClass();
        zzufVar.zzh(this);
    }
}
