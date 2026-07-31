package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
final class zznt implements Runnable {
    final /* synthetic */ zznx zza;

    zznt(zznx zznxVar) {
        this.zza = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.zza.zza;
        zzio zzioVar = zznyVar.zzu;
        Context zzaT = zzioVar.zzaT();
        zzioVar.zzaV();
        zzny.zzx(zznyVar, new ComponentName(zzaT, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
