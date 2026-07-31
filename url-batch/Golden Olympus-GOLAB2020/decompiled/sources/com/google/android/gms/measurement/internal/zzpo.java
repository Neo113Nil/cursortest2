package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzpo implements Callable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zzpv zzb;

    zzpo(zzpv zzpvVar, zzr zzrVar) {
        this.zza = zzrVar;
        this.zzb = zzpvVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzr zzrVar = this.zza;
        String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        zzpv zzpvVar = this.zzb;
        zzjx zzu = zzpvVar.zzu(str);
        zzjw zzjwVar = zzjw.ANALYTICS_STORAGE;
        if (zzu.zzr(zzjwVar) && zzjx.zzk(zzrVar.zzu, 100).zzr(zzjwVar)) {
            return zzpvVar.zzg(zzrVar).zzD();
        }
        zzpvVar.zzaW().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
