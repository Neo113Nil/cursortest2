package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzji implements Callable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zzjp zzb;

    zzji(zzjp zzjpVar, zzr zzrVar) {
        this.zza = zzrVar;
        this.zzb = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzpv zzpvVar;
        zzpv zzpvVar2;
        zzjp zzjpVar = this.zzb;
        zzpvVar = zzjpVar.zza;
        zzpvVar.zzL();
        zzr zzrVar = this.zza;
        zzpvVar2 = zzjpVar.zza;
        return new zzap(zzpvVar2.zzd(zzrVar.zza));
    }
}
