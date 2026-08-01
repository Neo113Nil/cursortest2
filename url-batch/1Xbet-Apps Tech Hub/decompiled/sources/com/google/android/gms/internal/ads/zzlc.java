package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzlc {
    public final zzui zza;
    public final Object zzb;
    public boolean zzd;
    public boolean zze;
    public zzld zzf;
    public boolean zzg;
    private final zzmb[] zzi;
    private final zzye zzj;
    private final zzlr zzk;
    private zzlc zzl;
    private zzyf zzn;
    private long zzo;
    private zzwl zzm = zzwl.zza;
    public final zzwa[] zzc = new zzwa[2];
    private final boolean[] zzh = new boolean[2];

    public zzlc(zzmb[] zzmbVarArr, long j, zzye zzyeVar, zzyn zzynVar, zzlr zzlrVar, zzld zzldVar, zzyf zzyfVar) {
        this.zzi = zzmbVarArr;
        this.zzo = j;
        this.zzj = zzyeVar;
        this.zzk = zzlrVar;
        this.zzb = zzldVar.zza.zza;
        this.zzf = zzldVar;
        this.zzn = zzyfVar;
        zzuk zzukVar = zzldVar.zza;
        long j2 = zzldVar.zzb;
        long j3 = zzldVar.zzd;
        zzui zzp = zzlrVar.zzp(zzukVar, zzynVar, j2);
        this.zza = j3 != -9223372036854775807L ? new zztp(zzp, true, 0L, j3) : zzp;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzyf zzyfVar = this.zzn;
            if (i >= zzyfVar.zza) {
                return;
            }
            zzyfVar.zzb(i);
            zzxy zzxyVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzyf zzyfVar = this.zzn;
            if (i >= zzyfVar.zza) {
                return;
            }
            zzyfVar.zzb(i);
            zzxy zzxyVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzyf zzyfVar, long j, boolean z) {
        return zzb(zzyfVar, j, false, new boolean[2]);
    }

    public final long zzb(zzyf zzyfVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzyfVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzyfVar.zza(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzmb[] zzmbVarArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzmbVarArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzyfVar;
        zzt();
        long zzg = this.zza.zzg(zzyfVar.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzmb[] zzmbVarArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzmbVarArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zzwa[] zzwaVarArr = this.zzc;
            if (i4 >= 2) {
                return zzg;
            }
            if (zzwaVarArr[i4] != null) {
                zzef.zzf(zzyfVar.zzb(i4));
                this.zzi[i4].zzb();
                this.zze = true;
            } else {
                zzef.zzf(zzyfVar.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long zzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return zzb == Long.MIN_VALUE ? this.zzf.zze : zzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzlc zzg() {
        return this.zzl;
    }

    public final zzwl zzh() {
        return this.zzm;
    }

    public final zzyf zzi() {
        return this.zzn;
    }

    public final zzyf zzj(float f, zzda zzdaVar) throws zzit {
        zzyf zzo = this.zzj.zzo(this.zzi, this.zzm, this.zzf.zza, zzdaVar);
        for (zzxy zzxyVar : zzo.zzc) {
        }
        return zzo;
    }

    public final void zzk(long j, float f, long j2) {
        zzef.zzf(zzu());
        long j3 = j - this.zzo;
        zzky zzkyVar = new zzky();
        zzkyVar.zze(j3);
        zzkyVar.zzf(f);
        zzkyVar.zzd(j2);
        this.zza.zzo(new zzla(zzkyVar, null));
    }

    public final void zzl(float f, zzda zzdaVar) throws zzit {
        this.zzd = true;
        this.zzm = this.zza.zzi();
        zzyf zzj = zzj(f, zzdaVar);
        zzld zzldVar = this.zzf;
        long j = zzldVar.zzb;
        long j2 = zzldVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long zza = zza(zzj, j, false);
        long j3 = this.zzo;
        zzld zzldVar2 = this.zzf;
        this.zzo = j3 + (zzldVar2.zzb - zza);
        this.zzf = zzldVar2.zzb(zza);
    }

    public final void zzm(long j) {
        zzef.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzui zzuiVar = this.zza;
        try {
            boolean z = zzuiVar instanceof zztp;
            zzlr zzlrVar = this.zzk;
            if (z) {
                zzlrVar.zzi(((zztp) zzuiVar).zza);
            } else {
                zzlrVar.zzi(zzuiVar);
            }
        } catch (RuntimeException e) {
            zzez.zzd("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzlc zzlcVar) {
        if (zzlcVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzlcVar;
        zzt();
    }

    public final void zzp(long j) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzui zzuiVar = this.zza;
        if (zzuiVar instanceof zztp) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zztp) zzuiVar).zzn(0L, j);
        }
    }

    public final boolean zzr() {
        if (this.zzd) {
            return !this.zze || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }
}
