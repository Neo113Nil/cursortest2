package com.google.android.gms.measurement.internal;

import android.os.Handler;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.ExoPlayer;

/* loaded from: classes3.dex */
final class zzkk {
    final /* synthetic */ zzko zza;
    private zzkj zzb;

    zzkk(zzko zzkoVar) {
        this.zza = zzkoVar;
    }

    @WorkerThread
    final void zza(long j8) {
        Handler handler;
        this.zzb = new zzkj(this, this.zza.zzt.zzax().currentTimeMillis(), j8);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    @WorkerThread
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
