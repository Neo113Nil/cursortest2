package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdpo {
    private final zzcyf zza;
    private final zzczo zzb;
    private final zzdab zzc;
    private final zzdan zzd;
    private final zzddb zze;
    private final zzdgc zzf;

    zzdpo(zzcyf zzcyfVar, zzczo zzczoVar, zzdab zzdabVar, zzdan zzdanVar, zzddb zzddbVar, zzdgc zzdgcVar) {
        this.zza = zzcyfVar;
        this.zzb = zzczoVar;
        this.zzc = zzdabVar;
        this.zzd = zzdanVar;
        this.zze = zzddbVar;
        this.zzf = zzdgcVar;
    }

    public final void zza(zzdpp zzdppVar) {
        zzdpm zzdpmVar;
        final zzczo zzczoVar = this.zzb;
        zzdpmVar = zzdppVar.zza;
        zzczoVar.getClass();
        zzdpmVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdpn
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzczo.this.zzb();
            }
        }, this.zzf);
    }
}
