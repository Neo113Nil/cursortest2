package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzctj {
    private final zzdaw zza;
    private final zzddd zzb;

    public zzctj(zzdaw zzdawVar, zzddd zzdddVar) {
        this.zza = zzdawVar;
        this.zzb = zzdddVar;
    }

    public final zzdaw zza() {
        return this.zza;
    }

    final zzddd zzb() {
        return this.zzb;
    }

    final zzdfw zzc() {
        zzddd zzdddVar = this.zzb;
        return zzdddVar != null ? new zzdfw(zzdddVar, zzcca.zzf) : new zzdfw(new zzcti(this), zzcca.zzf);
    }
}
