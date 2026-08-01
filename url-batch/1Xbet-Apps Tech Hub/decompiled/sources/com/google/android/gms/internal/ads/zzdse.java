package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdse implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzdse(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeN)).booleanValue() ? Collections.singleton(new zzdfw(((zzdsx) this.zzb).zzb(), zzgblVar)) : Collections.emptySet();
        zzhdx.zzb(singleton);
        return singleton;
    }
}
