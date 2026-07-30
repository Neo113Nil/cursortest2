package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzql;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes3.dex */
final class zzkj implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzkk zzc;

    zzkj(zzkk zzkkVar, long j, long j2) {
        this.zzc = zzkkVar;
        this.zza = j;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzki
            @Override // java.lang.Runnable
            public final void run() {
                zzkj zzkjVar = zzkj.this;
                zzkk zzkkVar = zzkjVar.zzc;
                long j = zzkjVar.zza;
                long j2 = zzkjVar.zzb;
                zzkkVar.zza.zzg();
                zzkkVar.zza.zzt.zzaA().zzc().zza("Application going to the background");
                zzkkVar.zza.zzt.zzm().zzm.zza(true);
                if (!zzkkVar.zza.zzt.zzf().zzu()) {
                    zzkkVar.zza.zzb.zzb(j2);
                    zzkkVar.zza.zzb.zzd(false, false, j2);
                }
                zzql.zzc();
                if (zzkkVar.zza.zzt.zzf().zzs(null, zzeh.zzaB)) {
                    zzkkVar.zza.zzt.zzaA().zzi().zzb("Application backgrounded at: timestamp_millis", Long.valueOf(j));
                } else {
                    zzkkVar.zza.zzt.zzq().zzH(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", j, new Bundle());
                }
            }
        });
    }
}
