package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcwp implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzcwp(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcyl zzcylVar = (zzdsy) this.zza.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        zzcyl zzcylVar2 = (zzecq) this.zzc.zzb();
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziv)).booleanValue()) {
            zzcylVar = zzcylVar2;
        }
        return new zzdfw(zzcylVar, zzgblVar);
    }
}
