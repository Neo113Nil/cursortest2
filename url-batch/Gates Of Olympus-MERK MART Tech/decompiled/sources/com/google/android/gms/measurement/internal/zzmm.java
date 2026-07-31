package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes3.dex */
final class zzmm {
    final /* synthetic */ zzmh zza;
    private zzml zzb;

    zzmm(zzmh zzmhVar) {
        this.zza = zzmhVar;
    }

    final void zza(long j) {
        Handler handler;
        this.zzb = new zzml(this, this.zza.zzb().currentTimeMillis(), j);
        handler = this.zza.zzc;
        handler.postDelayed(this.zzb, 2000L);
    }

    final void zza() {
        Handler handler;
        this.zza.zzt();
        if (this.zzb != null) {
            handler = this.zza.zzc;
            handler.removeCallbacks(this.zzb);
        }
        this.zza.zzk().zzn.zza(false);
        this.zza.zza(false);
    }
}
