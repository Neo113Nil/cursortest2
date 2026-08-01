package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcjb implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzcjb(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzecu zzecuVar = (zzecu) this.zza.zzb();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbX)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziv)).booleanValue()) {
                emptySet = Collections.singleton(new zzdfw(zzecuVar, zzgblVar));
                zzhdx.zzb(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        zzhdx.zzb(emptySet);
        return emptySet;
    }
}
