package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzecs implements zzdbc, zzczv, zzcyk {
    private final zzfjd zza;
    private final zzfje zzb;
    private final zzcba zzc;

    public zzecs(zzfjd zzfjdVar, zzfje zzfjeVar, zzcba zzcbaVar) {
        this.zza = zzfjdVar;
        this.zzb = zzfjeVar;
        this.zzc = zzcbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyk
    public final void zzbG(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfjd zzfjdVar = this.zza;
        zzfjdVar.zza("action", "ftl");
        zzfjdVar.zza("ftl", String.valueOf(zzeVar.zza));
        zzfjdVar.zza("ed", zzeVar.zzc);
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbs(zzbwa zzbwaVar) {
        this.zza.zzi(zzbwaVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbt(zzfeh zzfehVar) {
        this.zza.zzh(zzfehVar, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzczv
    public final void zzr() {
        zzfjd zzfjdVar = this.zza;
        zzfjdVar.zza("action", "loaded");
        this.zzb.zzb(zzfjdVar);
    }
}
