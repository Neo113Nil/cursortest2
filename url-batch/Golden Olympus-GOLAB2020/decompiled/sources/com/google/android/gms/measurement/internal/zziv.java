package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zziv implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzjp zzb;

    zziv(zzjp zzjpVar, String str) {
        this.zza = str;
        this.zzb = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzpv zzpvVar;
        zzpv zzpvVar2;
        zzjp zzjpVar = this.zzb;
        zzpvVar = zzjpVar.zza;
        zzpvVar.zzL();
        zzpvVar2 = zzjpVar.zza;
        return zzpvVar2.zzj().zzE(this.zza);
    }
}
