package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzlp implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzlw zzb;

    zzlp(zzlw zzlwVar, Boolean bool) {
        this.zza = bool;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzas(this.zza, true);
    }
}
