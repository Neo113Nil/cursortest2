package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class zzis implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zziq zzb;
    final /* synthetic */ zziq zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zziy zze;

    zzis(zziy zziyVar, Bundle bundle, zziq zziqVar, zziq zziqVar2, long j8) {
        this.zze = zziyVar;
        this.zza = bundle;
        this.zzb = zziqVar;
        this.zzc = zziqVar2;
        this.zzd = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziy.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
