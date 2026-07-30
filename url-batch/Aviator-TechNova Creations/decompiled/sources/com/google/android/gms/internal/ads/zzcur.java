package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcur implements zzikg {
    private final zzikp zza;

    private zzcur(zzcue zzcueVar, zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzcur zza(zzcue zzcueVar, zzikp zzikpVar) {
        return new zzcur(zzcueVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdje((zzcvu) this.zza.zzb(), zzcei.zzg));
        zziko.zzb(singleton);
        return singleton;
    }
}
