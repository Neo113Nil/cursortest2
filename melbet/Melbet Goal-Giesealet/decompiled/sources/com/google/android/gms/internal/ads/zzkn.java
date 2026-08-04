package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzkn {
    public final zzun zza;
    public final Object zzb;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzko zzg;
    public boolean zzh;
    private final zzln[] zzj;
    private final zzym zzk;
    private final zzlc zzl;
    private zzkn zzm;
    private zzyn zzo;
    private long zzp;
    private zzwq zzn = zzwq.zza;
    public final zzwf[] zzc = new zzwf[2];
    private final boolean[] zzi = new boolean[2];

    public zzkn(zzln[] zzlnVarArr, long j, zzym zzymVar, zzyv zzyvVar, zzlc zzlcVar, zzko zzkoVar, zzyn zzynVar, long j2) {
        this.zzj = zzlnVarArr;
        this.zzp = j;
        this.zzk = zzymVar;
        this.zzl = zzlcVar;
        this.zzb = zzkoVar.zza.zza;
        this.zzg = zzkoVar;
        this.zzo = zzynVar;
        zzup zzupVar = zzkoVar.zza;
        long j3 = zzkoVar.zzb;
        long j4 = zzkoVar.zzd;
        zzun zzp = zzlcVar.zzp(zzupVar, zzyvVar, j3);
        this.zza = j4 != -9223372036854775807L ? new zztt(zzp, true, 0L, j4) : zzp;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            zzyn zzynVar = this.zzo;
            if (i >= zzynVar.zza) {
                return;
            }
            zzynVar.zza(i);
            zzyf zzyfVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            zzyn zzynVar = this.zzo;
            if (i >= zzynVar.zza) {
                return;
            }
            zzynVar.zza(i);
            zzyf zzyfVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j) {
        this.zzp = j;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long zzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return zzi == Long.MIN_VALUE ? this.zzg.zze : zzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final void zzh(float f, zzbe zzbeVar, boolean z) throws zzhz {
        this.zze = true;
        this.zzn = this.zza.zzd();
        zzyn zzk = zzk(f, zzbeVar, z);
        zzko zzkoVar = this.zzg;
        long j = zzkoVar.zzb;
        long j2 = zzkoVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long zzl = zzl(zzk, j, false);
        long j3 = this.zzp;
        zzko zzkoVar2 = this.zzg;
        this.zzp = j3 + (zzkoVar2.zzb - zzl);
        this.zzg = zzkoVar2.zza(zzl);
    }

    public final void zzi(long j) {
        zzghc.zzh(zzw());
        if (this.zze) {
            this.zza.zzg(j - this.zzp);
        }
    }

    public final void zzj(zzkl zzklVar) {
        zzghc.zzh(zzw());
        this.zza.zzm(zzklVar);
    }

    public final zzyn zzk(float f, zzbe zzbeVar, boolean z) throws zzhz {
        zzwq zzwqVar = this.zzn;
        zzup zzupVar = this.zzg.zza;
        zzym zzymVar = this.zzk;
        zzln[] zzlnVarArr = this.zzj;
        zzyn zzq = zzymVar.zzq(zzlnVarArr, zzwqVar, zzupVar, zzbeVar);
        for (int i = 0; i < zzq.zza; i++) {
            if (zzq.zza(i)) {
                if (zzq.zzc[i] == null) {
                    zzlnVarArr[i].zza();
                    r2 = false;
                }
                zzghc.zzh(r2);
            } else {
                zzghc.zzh(zzq.zzc[i] == null);
            }
        }
        for (zzyf zzyfVar : zzq.zzc) {
        }
        return zzq;
    }

    public final long zzl(zzyn zzynVar, long j, boolean z) {
        return zzm(zzynVar, j, false, new boolean[2]);
    }

    public final long zzm(zzyn zzynVar, long j, boolean z, boolean[] zArr) {
        zzln[] zzlnVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzynVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z || !zzynVar.zzb(this.zzo, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzlnVarArr = this.zzj;
            if (i2 >= 2) {
                break;
            }
            zzlnVarArr[i2].zza();
            i2++;
        }
        zzv();
        this.zzo = zzynVar;
        zzu();
        zzun zzunVar = this.zza;
        zzyf[] zzyfVarArr = zzynVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzwf[] zzwfVarArr = this.zzc;
        long zze = zzunVar.zze(zzyfVarArr, zArr3, zzwfVarArr, zArr, j);
        for (int i3 = 0; i3 < 2; i3++) {
            zzlnVarArr[i3].zza();
        }
        this.zzf = false;
        for (int i4 = 0; i4 < 2; i4++) {
            if (zzwfVarArr[i4] != null) {
                zzghc.zzh(zzynVar.zza(i4));
                zzlnVarArr[i4].zza();
                this.zzf = true;
            } else {
                zzghc.zzh(zzyfVarArr[i4] == null);
            }
        }
        return zze;
    }

    public final void zzn() {
        zzv();
        zzun zzunVar = this.zza;
        try {
            boolean z = zzunVar instanceof zztt;
            zzlc zzlcVar = this.zzl;
            if (z) {
                zzlcVar.zze(((zztt) zzunVar).zza);
            } else {
                zzlcVar.zze(zzunVar);
            }
        } catch (RuntimeException e) {
            zzds.zzf("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzkn zzknVar) {
        if (zzknVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzknVar;
        zzu();
    }

    public final zzkn zzp() {
        return this.zzm;
    }

    public final zzwq zzq() {
        return this.zzn;
    }

    public final zzyn zzr() {
        return this.zzo;
    }

    public final void zzs() {
        zzun zzunVar = this.zza;
        if (zzunVar instanceof zztt) {
            long j = this.zzg.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zztt) zzunVar).zza(0L, j);
        }
    }

    public final void zzt(zzum zzumVar, long j) {
        this.zzd = true;
        this.zza.zzb(zzumVar, j);
    }
}
