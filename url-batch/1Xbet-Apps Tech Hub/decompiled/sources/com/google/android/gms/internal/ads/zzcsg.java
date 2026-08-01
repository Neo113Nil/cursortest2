package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcsg implements zzhdp {
    private final zzcrw zza;
    private final zzhec zzb;

    public zzcsg(zzcrw zzcrwVar, zzhec zzhecVar) {
        this.zza = zzcrwVar;
        this.zzb = zzhecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdfw((zzctg) this.zzb.zzb(), zzcca.zzf));
        zzhdx.zzb(singleton);
        return singleton;
    }
}
