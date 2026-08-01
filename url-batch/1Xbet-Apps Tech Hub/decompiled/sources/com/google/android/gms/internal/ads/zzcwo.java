package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcwo implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzcwo(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcvu zzcvuVar = (zzcvu) this.zza.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        zzfwz zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfB)).booleanValue() ? zzfwz.zzn(new zzdfw(zzcvuVar, zzgblVar)) : zzfwz.zzm();
        zzhdx.zzb(zzn);
        return zzn;
    }
}
