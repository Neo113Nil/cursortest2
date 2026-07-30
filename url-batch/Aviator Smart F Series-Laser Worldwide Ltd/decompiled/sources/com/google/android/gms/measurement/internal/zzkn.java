package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzqr;

/* loaded from: classes3.dex */
final class zzkn {
    final /* synthetic */ zzko zza;

    zzkn(zzko zzkoVar) {
        this.zza = zzkoVar;
    }

    @WorkerThread
    final void zza() {
        this.zza.zzg();
        if (this.zza.zzt.zzm().zzk(this.zza.zzt.zzax().currentTimeMillis())) {
            this.zza.zzt.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.zza.zzt.zzaA().zzj().zza("Detected application was in foreground");
                zzc(this.zza.zzt.zzax().currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    final void zzb(long j8, boolean z7) {
        this.zza.zzg();
        this.zza.zzm();
        if (this.zza.zzt.zzm().zzk(j8)) {
            this.zza.zzt.zzm().zzg.zza(true);
            zzqr.zzc();
            if (this.zza.zzt.zzf().zzs(null, zzeh.zzan)) {
                this.zza.zzt.zzh().zzo();
            }
        }
        this.zza.zzt.zzm().zzj.zzb(j8);
        if (this.zza.zzt.zzm().zzg.zzb()) {
            zzc(j8, z7);
        }
    }

    @VisibleForTesting
    @WorkerThread
    final void zzc(long j8, boolean z7) {
        this.zza.zzg();
        if (this.zza.zzt.zzJ()) {
            this.zza.zzt.zzm().zzj.zzb(j8);
            this.zza.zzt.zzaA().zzj().zzb("Session started, time", Long.valueOf(this.zza.zzt.zzax().elapsedRealtime()));
            Long valueOf = Long.valueOf(j8 / 1000);
            this.zza.zzt.zzq().zzY(TtmlNode.TEXT_EMPHASIS_AUTO, "_sid", valueOf, j8);
            this.zza.zzt.zzm().zzk.zzb(valueOf.longValue());
            this.zza.zzt.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.zza.zzt.zzf().zzs(null, zzeh.zzab) && z7) {
                bundle.putLong("_aib", 1L);
            }
            this.zza.zzt.zzq().zzH(TtmlNode.TEXT_EMPHASIS_AUTO, "_s", j8, bundle);
            zzos.zzc();
            if (this.zza.zzt.zzf().zzs(null, zzeh.zzae)) {
                String zza = this.zza.zzt.zzm().zzp.zza();
                if (TextUtils.isEmpty(zza)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", zza);
                this.zza.zzt.zzq().zzH(TtmlNode.TEXT_EMPHASIS_AUTO, "_ssr", j8, bundle2);
            }
        }
    }
}
