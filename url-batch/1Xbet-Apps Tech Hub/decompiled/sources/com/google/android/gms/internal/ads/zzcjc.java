package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcjc implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzcjc(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdvu zzdvuVar = (zzdvu) this.zza.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbB)).booleanValue() ? Collections.singleton(new zzdfw(zzdvuVar, zzgblVar)) : Collections.emptySet();
        zzhdx.zzb(singleton);
        return singleton;
    }
}
