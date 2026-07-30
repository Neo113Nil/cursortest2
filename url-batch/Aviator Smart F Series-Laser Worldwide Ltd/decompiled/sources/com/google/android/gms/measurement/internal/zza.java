package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zza implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzd zzc;

    zza(zzd zzdVar, String str, long j8) {
        this.zzc = zzdVar;
        this.zza = str;
        this.zzb = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.zza(this.zzc, this.zza, this.zzb);
    }
}
