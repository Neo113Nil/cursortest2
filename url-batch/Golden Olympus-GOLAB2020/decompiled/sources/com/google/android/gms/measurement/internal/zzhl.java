package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzhl implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzhm zzb;

    zzhl(zzhm zzhmVar, boolean z4) {
        this.zza = z4;
        this.zzb = zzhmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpv zzpvVar;
        zzpvVar = this.zzb.zza;
        zzpvVar.zzX(this.zza);
    }
}
