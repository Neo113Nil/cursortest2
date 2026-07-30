package com.google.android.gms.measurement.internal;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes3.dex */
final class zzhg implements zzeo {
    final /* synthetic */ zzge zza;

    zzhg(zzhh zzhhVar, zzge zzgeVar) {
        this.zza = zzgeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final boolean zza() {
        return this.zza.zzL() && Log.isLoggable(this.zza.zzaA().zzr(), 3);
    }
}
