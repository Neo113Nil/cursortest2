package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzir implements zzlb {
    private final zzmg zza;
    private final zziq zzb;
    private zzlz zzc;
    private zzlb zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzir(zziq zziqVar, zzeg zzegVar) {
        this.zzb = zziqVar;
        this.zza = new zzmg(zzegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z) {
        zzlz zzlzVar = this.zzc;
        if (zzlzVar == null || zzlzVar.zzU() || (!this.zzc.zzV() && (z || this.zzc.zzO()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzlb zzlbVar = this.zzd;
            zzlbVar.getClass();
            long zza = zzlbVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzcj zzc = zzlbVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzlb zzlbVar2 = this.zzd;
        zzlbVar2.getClass();
        return zzlbVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final zzcj zzc() {
        zzlb zzlbVar = this.zzd;
        return zzlbVar != null ? zzlbVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzlz zzlzVar) {
        if (zzlzVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzlz zzlzVar) throws zzit {
        zzlb zzlbVar;
        zzlb zzk = zzlzVar.zzk();
        if (zzk == null || zzk == (zzlbVar = this.zzd)) {
            return;
        }
        if (zzlbVar != null) {
            throw zzit.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzk;
        this.zzc = zzlzVar;
        zzk.zzg(this.zza.zzc());
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzg(zzcj zzcjVar) {
        zzlb zzlbVar = this.zzd;
        if (zzlbVar != null) {
            zzlbVar.zzg(zzcjVar);
            zzcjVar = this.zzd.zzc();
        }
        this.zza.zzg(zzcjVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
