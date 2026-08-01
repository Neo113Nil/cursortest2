package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzduh implements zzhdp {
    private final zzdud zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzduh(zzdud zzdudVar, zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzdudVar;
        this.zzb = zzhecVar;
        this.zzc = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdun zzdunVar = (zzdun) this.zzb.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        Set zzd = zzdud.zzd(zzdunVar, zzgblVar);
        zzhdx.zzb(zzd);
        return zzd;
    }
}
