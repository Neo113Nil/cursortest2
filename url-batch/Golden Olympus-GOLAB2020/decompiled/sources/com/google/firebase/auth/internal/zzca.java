package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* loaded from: classes.dex */
final class zzca implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ zzcb zza;

    zzca(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z4) {
        boolean zzb;
        zzaq zzaqVar;
        if (z4) {
            this.zza.zzc = true;
            this.zza.zza();
            return;
        }
        this.zza.zzc = false;
        zzb = this.zza.zzb();
        if (zzb) {
            zzaqVar = this.zza.zzb;
            zzaqVar.zzc();
        }
    }
}
