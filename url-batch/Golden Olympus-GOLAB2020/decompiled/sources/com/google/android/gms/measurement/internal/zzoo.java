package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class zzoo {
    final /* synthetic */ zzop zza;

    zzoo(zzop zzopVar) {
        this.zza = zzopVar;
    }

    final void zza() {
        zzop zzopVar = this.zza;
        zzopVar.zzg();
        zzio zzioVar = zzopVar.zzu;
        if (zzioVar.zzm().zzp(zzioVar.zzaU().currentTimeMillis())) {
            zzioVar.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzioVar.zzaW().zzj().zza("Detected application was in foreground");
                zzc(zzioVar.zzaU().currentTimeMillis(), false);
            }
        }
    }

    final void zzb(long j4, boolean z4) {
        zzop zzopVar = this.zza;
        zzopVar.zzg();
        zzopVar.zzq();
        zzio zzioVar = zzopVar.zzu;
        if (zzioVar.zzm().zzp(j4)) {
            zzioVar.zzm().zzg.zza(true);
            zzopVar.zzu.zzh().zzq();
        }
        zzioVar.zzm().zzk.zzb(j4);
        if (zzioVar.zzm().zzg.zzb()) {
            zzc(j4, z4);
        }
    }

    final void zzc(long j4, boolean z4) {
        zzop zzopVar = this.zza;
        zzopVar.zzg();
        if (zzopVar.zzu.zzJ()) {
            zzio zzioVar = zzopVar.zzu;
            zzioVar.zzm().zzk.zzb(j4);
            zzioVar.zzaW().zzj().zzb("Session started, time", Long.valueOf(zzioVar.zzaU().elapsedRealtime()));
            long j5 = j4 / 1000;
            zzio zzioVar2 = zzopVar.zzu;
            zzioVar2.zzq().zzan("auto", "_sid", Long.valueOf(j5), j4);
            zzioVar.zzm().zzl.zzb(j5);
            zzioVar.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j5);
            zzioVar2.zzq().zzS("auto", "_s", j4, bundle);
            String zza = zzioVar.zzm().zzq.zza();
            if (TextUtils.isEmpty(zza)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", zza);
            zzioVar2.zzq().zzS("auto", "_ssr", j4, bundle2);
        }
    }
}
