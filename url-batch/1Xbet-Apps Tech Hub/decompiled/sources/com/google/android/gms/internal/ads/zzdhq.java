package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdhq implements zzhdp {
    private final zzhec zza;

    public zzdhq(zzhec zzhecVar) {
        this.zza = zzhecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdfw((zzdij) this.zza.zzb(), zzcca.zzf));
        zzhdx.zzb(singleton);
        return singleton;
    }
}
