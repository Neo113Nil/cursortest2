package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzchb implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzcgv zza;
    private final com.google.android.gms.ads.internal.overlay.zzo zzb;

    public zzchb(zzcgv zzcgvVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zza = zzcgvVar;
        this.zzb = zzoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzbv();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbw() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzbw();
        }
        this.zza.zzX();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzby();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbz(int i) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzb;
        if (zzoVar != null) {
            zzoVar.zzbz(i);
        }
        this.zza.zzV();
    }
}
