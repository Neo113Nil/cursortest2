package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdpf {
    private final zzcyf zza;
    private final zzczo zzb;
    private final zzdab zzc;
    private final zzdan zzd;
    private final zzddb zze;
    private final zzfdu zzf;
    private final zzfdy zzg;

    public zzdpf(zzcyf zzcyfVar, zzczo zzczoVar, zzdab zzdabVar, zzdan zzdanVar, zzddb zzddbVar, zzfdu zzfduVar, zzfdy zzfdyVar) {
        this.zza = zzcyfVar;
        this.zzb = zzczoVar;
        this.zzc = zzdabVar;
        this.zzd = zzdanVar;
        this.zze = zzddbVar;
        this.zzf = zzfduVar;
        this.zzg = zzfdyVar;
    }

    public final void zza(zzdpj zzdpjVar) {
        zzdow zzdowVar;
        final zzczo zzczoVar = this.zzb;
        zzdowVar = zzdpjVar.zza;
        zzczoVar.getClass();
        zzdowVar.zzh(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdpe
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzczo.this.zzb();
            }
        });
        zzdpjVar.zze(this.zzf, this.zzg);
    }
}
