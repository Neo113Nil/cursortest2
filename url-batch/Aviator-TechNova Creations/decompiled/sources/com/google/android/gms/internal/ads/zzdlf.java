package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdlf implements zzikg {
    private final zzdkr zza;
    private final zzikp zzb;

    private zzdlf(zzdkr zzdkrVar, zzikp zzikpVar) {
        this.zza = zzdkrVar;
        this.zzb = zzikpVar;
    }

    public static zzdlf zza(zzdkr zzdkrVar, zzikp zzikpVar) {
        return new zzdlf(zzdkrVar, zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zze = this.zza.zze((zzczw) this.zzb.zzb());
        zziko.zzb(zze);
        return zze;
    }
}
