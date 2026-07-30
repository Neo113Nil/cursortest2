package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zziu implements Runnable {
    final /* synthetic */ zziy zza;

    zziu(zziy zziyVar) {
        this.zza = zziyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziq zziqVar;
        zziy zziyVar = this.zza;
        zziqVar = zziyVar.zzh;
        zziyVar.zza = zziqVar;
    }
}
