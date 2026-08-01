package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdta implements zzdbc, zzczv, zzcyk {
    private final zzdtk zza;
    private final zzdtu zzb;

    public zzdta(zzdtk zzdtkVar, zzdtu zzdtuVar) {
        this.zza = zzdtkVar;
        this.zzb = zzdtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyk
    public final void zzbG(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(zzeVar.zza));
        this.zza.zza().put("ed", zzeVar.zzc);
        this.zzb.zzf(this.zza.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbs(zzbwa zzbwaVar) {
        this.zza.zzc(zzbwaVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbt(zzfeh zzfehVar) {
        this.zza.zzb(zzfehVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzr() {
        this.zza.zza().put("action", "loaded");
        this.zzb.zzf(this.zza.zza());
    }
}
