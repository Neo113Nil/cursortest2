package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
final class zzib implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhn zzb;

    zzib(zzhn zzhnVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznc zzncVar;
        zznc zzncVar2;
        zzncVar = this.zzb.zza;
        zzncVar.zzr();
        zzncVar2 = this.zzb.zza;
        zzo zzoVar = this.zza;
        zzncVar2.zzl().zzt();
        zzncVar2.zzs();
        Preconditions.checkNotEmpty(zzoVar.zza);
        zzncVar2.zzf(zzoVar);
        zzncVar2.zze(zzoVar);
    }
}
