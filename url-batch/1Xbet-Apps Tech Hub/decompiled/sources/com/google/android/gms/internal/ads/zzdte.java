package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdte implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzdte(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzczv zzczvVar = (zzdta) this.zza.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        zzczv zzczvVar2 = (zzecs) this.zzc.zzb();
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziv)).booleanValue()) {
            zzczvVar = zzczvVar2;
        }
        return new zzdfw(zzczvVar, zzgblVar);
    }
}
