package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes3.dex */
final class zzkk {
    final /* synthetic */ zzko zza;
    private zzkj zzb;

    zzkk(zzko zzkoVar) {
        this.zza = zzkoVar;
    }

    final void zza(long j) {
        Handler handler;
        this.zzb = new zzkj(this, this.zza.zzt.zzax().currentTimeMillis(), j);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, 2000L);
    }

    final void zzb() {
        Handler handler;
        this.zza.zzg();
        zzkj zzkjVar = this.zzb;
        if (zzkjVar != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(zzkjVar);
        }
        this.zza.zzt.zzm().zzm.zza(false);
    }
}
