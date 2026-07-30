package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
final class zzp implements zzhf {
    public final com.google.android.gms.internal.measurement.zzci zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    zzp(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzci zzciVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final void onEvent(String str, String str2, Bundle bundle, long j8) {
        try {
            this.zza.zze(str, str2, bundle, j8);
        } catch (RemoteException e8) {
            zzge zzgeVar = this.zzb.zza;
            if (zzgeVar != null) {
                zzgeVar.zzaA().zzk().zzb("Event listener threw exception", e8);
            }
        }
    }
}
