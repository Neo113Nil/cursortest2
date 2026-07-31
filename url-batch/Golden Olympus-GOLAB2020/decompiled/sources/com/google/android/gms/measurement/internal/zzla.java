package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzla implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzlw zze;

    zzla(zzlw zzlwVar, String str, String str2, Object obj, long j4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j4;
        this.zze = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzan(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
