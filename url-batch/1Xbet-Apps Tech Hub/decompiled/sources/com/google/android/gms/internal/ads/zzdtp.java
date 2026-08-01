package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdtp {
    private final zzdtu zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdtp(zzdtu zzdtuVar, Executor executor) {
        this.zza = zzdtuVar;
        this.zzc = zzdtuVar.zza();
        this.zzb = executor;
    }

    public final zzdto zza() {
        zzdto zzdtoVar = new zzdto(this);
        zzdto.zza(zzdtoVar);
        return zzdtoVar;
    }

    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkN)).booleanValue()) {
            zzdto zza = zza();
            zza.zzb("action", "pecr");
            zza.zzg();
        }
    }
}
