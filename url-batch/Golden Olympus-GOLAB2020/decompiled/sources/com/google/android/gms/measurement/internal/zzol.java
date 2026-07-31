package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* loaded from: classes.dex */
final class zzol {
    final /* synthetic */ zzop zza;
    private zzok zzb;

    zzol(zzop zzopVar) {
        this.zza = zzopVar;
    }

    final void zza(long j4) {
        Handler handler;
        zzop zzopVar = this.zza;
        this.zzb = new zzok(this, zzopVar.zzu.zzaU().currentTimeMillis(), j4);
        handler = zzopVar.zzd;
        handler.postDelayed(this.zzb, 2000L);
    }

    final void zzb() {
        Handler handler;
        zzop zzopVar = this.zza;
        zzopVar.zzg();
        zzok zzokVar = this.zzb;
        if (zzokVar != null) {
            handler = zzopVar.zzd;
            handler.removeCallbacks(zzokVar);
        }
        zzio zzioVar = zzopVar.zzu;
        zzioVar.zzm().zzn.zza(false);
        zzopVar.zzm(false);
        if (zzioVar.zzf().zzx(null, zzgi.zzaZ)) {
            zzio zzioVar2 = zzopVar.zzu;
            if (zzioVar2.zzq().zzap()) {
                zzioVar.zzaW().zzj().zza("Retrying trigger URI registration in foreground");
                zzioVar2.zzq().zzU();
            }
        }
    }
}
