package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzq implements zzkc {
    public final com.google.android.gms.internal.measurement.zzde zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    zzq(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzde zzdeVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzdeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkc
    public final void onEvent(String str, String str2, Bundle bundle, long j4) {
        try {
            this.zza.zzf(str, str2, bundle, j4);
        } catch (RemoteException e4) {
            zzio zzioVar = this.zzb.zza;
            if (zzioVar != null) {
                zzioVar.zzaW().zzk().zzb("Event listener threw exception", e4);
            }
        }
    }
}
