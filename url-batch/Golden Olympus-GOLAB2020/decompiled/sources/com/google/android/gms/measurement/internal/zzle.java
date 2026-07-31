package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class zzle implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzlw zzb;

    zzle(zzlw zzlwVar, long j4) {
        this.zza = j4;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlw zzlwVar = this.zzb;
        zzlwVar.zzg();
        zzlwVar.zza();
        zzio zzioVar = zzlwVar.zzu;
        zzioVar.zzaW().zzd().zza("Resetting analytics data (FE)");
        zzio zzioVar2 = zzlwVar.zzu;
        zzop zzv = zzioVar2.zzv();
        zzv.zzg();
        zzv.zzb.zza();
        zzioVar2.zzh().zzq();
        boolean z4 = !zzlwVar.zzu.zzJ();
        zzht zzm = zzioVar.zzm();
        zzm.zzc.zzb(this.zza);
        zzio zzioVar3 = zzm.zzu;
        if (!TextUtils.isEmpty(zzioVar3.zzm().zzq.zza())) {
            zzm.zzq.zzb(null);
        }
        zzm.zzk.zzb(0L);
        zzm.zzl.zzb(0L);
        if (!zzioVar3.zzf().zzA()) {
            zzm.zzn(z4);
        }
        zzm.zzr.zzb(null);
        zzm.zzs.zzb(0L);
        zzm.zzt.zzb(null);
        zzioVar2.zzu().zzO();
        zzioVar2.zzv().zza.zza();
        zzlwVar.zzc = z4;
        zzioVar2.zzu().zzE(new AtomicReference());
    }
}
