package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzhx implements zzkm {
    private final zzlw zza;
    private final zzhw zzb;
    private zzll zzc;
    private zzkm zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzhx(zzhw zzhwVar, zzdb zzdbVar) {
        this.zzb = zzhwVar;
        this.zza = new zzlw(zzdbVar);
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j) {
        this.zza.zzc(j);
    }

    public final void zzd(zzll zzllVar) throws zzhz {
        zzkm zzkmVar;
        zzkm zzd = zzllVar.zzd();
        if (zzd == null || zzd == (zzkmVar = this.zzd)) {
            return;
        }
        if (zzkmVar != null) {
            throw zzhz.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzd;
        this.zzc = zzllVar;
        zzd.zzi(this.zza.zzj());
    }

    public final void zze(zzll zzllVar) {
        if (zzllVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final long zzf(boolean z) {
        zzll zzllVar = this.zzc;
        if (zzllVar == null || zzllVar.zzY() || ((z && this.zzc.zze() != 2) || (!this.zzc.zzX() && (z || this.zzc.zzdb())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zza();
            }
        } else {
            zzkm zzkmVar = this.zzd;
            zzkmVar.getClass();
            long zzg = zzkmVar.zzg();
            if (this.zze) {
                zzlw zzlwVar = this.zza;
                if (zzg < zzlwVar.zzg()) {
                    zzlwVar.zzb();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        zzlwVar.zza();
                    }
                }
            }
            zzlw zzlwVar2 = this.zza;
            zzlwVar2.zzc(zzg);
            zzau zzj = zzkmVar.zzj();
            if (!zzj.equals(zzlwVar2.zzj())) {
                zzlwVar2.zzi(zzj);
                this.zzb.zzc(zzj);
            }
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        zzkm zzkmVar = this.zzd;
        zzkmVar.getClass();
        return zzkmVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzi(zzau zzauVar) {
        zzkm zzkmVar = this.zzd;
        if (zzkmVar != null) {
            zzkmVar.zzi(zzauVar);
            zzauVar = this.zzd.zzj();
        }
        this.zza.zzi(zzauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final zzau zzj() {
        zzkm zzkmVar = this.zzd;
        return zzkmVar != null ? zzkmVar.zzj() : this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        zzkm zzkmVar = this.zzd;
        zzkmVar.getClass();
        return zzkmVar.zzh();
    }
}
