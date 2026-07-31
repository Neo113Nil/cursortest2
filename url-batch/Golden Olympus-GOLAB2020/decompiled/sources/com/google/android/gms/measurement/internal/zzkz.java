package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class zzkz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ String zzh;
    final /* synthetic */ zzlw zzi;

    zzkz(zzlw zzlwVar, String str, String str2, long j4, Bundle bundle, boolean z4, boolean z5, boolean z6, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j4;
        this.zzd = bundle;
        this.zze = z4;
        this.zzf = z5;
        this.zzg = z6;
        this.zzh = str3;
        this.zzi = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzi.zzT(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
