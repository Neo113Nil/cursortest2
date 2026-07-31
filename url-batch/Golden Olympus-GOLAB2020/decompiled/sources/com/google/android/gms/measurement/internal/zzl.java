package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzl implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ AppMeasurementDynamiteService zze;

    zzl(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcy zzcyVar, String str, String str2, boolean z4) {
        this.zza = zzcyVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = z4;
        this.zze = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza.zzu().zzK(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
