package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdhc implements zzhdp {
    private final zzdhb zza;
    private final zzhec zzb;

    public zzdhc(zzdhb zzdhbVar, zzhec zzhecVar) {
        this.zza = zzdhbVar;
        this.zzb = zzhecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdfw((zzcxe) this.zzb.zzb(), zzcca.zzf));
        zzhdx.zzb(singleton);
        return singleton;
    }
}
