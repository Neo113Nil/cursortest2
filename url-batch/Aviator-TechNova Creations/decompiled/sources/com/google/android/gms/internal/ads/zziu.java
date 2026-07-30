package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zziu implements zzlm {
    private final zzmw zza;
    private final zzit zzb;
    private zzml zzc;
    private zzlm zzd;
    private boolean zze = true;
    private boolean zzf;

    public zziu(zzit zzitVar, zzdn zzdnVar) {
        this.zzb = zzitVar;
        this.zza = new zzmw(zzdnVar);
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

    public final void zzd(zzml zzmlVar) throws zziw {
        zzlm zzlmVar;
        zzlm zzd = zzmlVar.zzd();
        if (zzd == null || zzd == (zzlmVar = this.zzd)) {
            return;
        }
        if (zzlmVar != null) {
            throw zziw.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzd;
        this.zzc = zzmlVar;
        zzd.zzi(this.zza.zzj());
    }

    public final void zze(zzml zzmlVar) {
        if (zzmlVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final long zzf(boolean z) {
        zzml zzmlVar = this.zzc;
        if (zzmlVar == null || zzmlVar.zzZ() || ((z && this.zzc.zze() != 2) || (!this.zzc.zzY() && (z || this.zzc.zzcW())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zza();
            }
        } else {
            zzlm zzlmVar = this.zzd;
            zzlmVar.getClass();
            long zzg = zzlmVar.zzg();
            if (this.zze) {
                zzmw zzmwVar = this.zza;
                if (zzg < zzmwVar.zzg()) {
                    zzmwVar.zzb();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        zzmwVar.zza();
                    }
                }
            }
            zzmw zzmwVar2 = this.zza;
            zzmwVar2.zzc(zzg);
            zzav zzj = zzlmVar.zzj();
            if (!zzj.equals(zzmwVar2.zzj())) {
                zzmwVar2.zzi(zzj);
                this.zzb.zzc(zzj);
            }
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        zzlm zzlmVar = this.zzd;
        zzlmVar.getClass();
        return zzlmVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final void zzi(zzav zzavVar) {
        zzlm zzlmVar = this.zzd;
        if (zzlmVar != null) {
            zzlmVar.zzi(zzavVar);
            zzavVar = this.zzd.zzj();
        }
        this.zza.zzi(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final zzav zzj() {
        zzlm zzlmVar = this.zzd;
        return zzlmVar != null ? zzlmVar.zzj() : this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        zzlm zzlmVar = this.zzd;
        zzlmVar.getClass();
        return zzlmVar.zzh();
    }
}
