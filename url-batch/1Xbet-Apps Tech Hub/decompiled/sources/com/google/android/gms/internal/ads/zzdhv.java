package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdhv implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzdan zza;
    private final zzdfq zzb;

    public zzdhv(zzdan zzdanVar, zzdfq zzdfqVar) {
        this.zza = zzdanVar;
        this.zzb = zzdfqVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
        this.zza.zzbM();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbp() {
        this.zza.zzbp();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        this.zza.zzbv();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbw() {
        this.zza.zzbw();
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        this.zza.zzby();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbz(int i) {
        this.zza.zzbz(i);
        this.zzb.zza();
    }
}
