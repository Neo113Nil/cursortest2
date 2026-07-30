package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcod implements zzdzk {
    private final Long zza;
    private final String zzb;
    private final zzcnp zzc;
    private final zzcof zzd;

    zzcod(zzcnp zzcnpVar, zzcof zzcofVar, Long l, String str) {
        this.zzc = zzcnpVar;
        this.zzd = zzcofVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdzk
    public final zzdzt zza() {
        long longValue = this.zza.longValue();
        zzcof zzcofVar = this.zzd;
        return zzdzu.zza(longValue, zzcofVar.zzd(), zzcofVar.zza(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdzk
    public final zzdzx zzb() {
        long longValue = this.zza.longValue();
        zzcof zzcofVar = this.zzd;
        return zzdzy.zza(longValue, zzcofVar.zzd(), zzcofVar.zza(), this.zzc, this.zzb);
    }
}
