package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.measurement.zzql;

/* loaded from: classes3.dex */
final class zzkj implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzkk zzc;

    zzkj(zzkk zzkkVar, long j8, long j9) {
        this.zzc = zzkkVar;
        this.zza = j8;
        this.zzb = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzki
            @Override // java.lang.Runnable
            public final void run() {
                zzkj zzkjVar = zzkj.this;
                zzkk zzkkVar = zzkjVar.zzc;
                long j8 = zzkjVar.zza;
                long j9 = zzkjVar.zzb;
                zzkkVar.zza.zzg();
                zzkkVar.zza.zzt.zzaA().zzc().zza("Application going to the background");
                zzkkVar.zza.zzt.zzm().zzm.zza(true);
                if (!zzkkVar.zza.zzt.zzf().zzu()) {
                    zzkkVar.zza.zzb.zzb(j9);
                    zzkkVar.zza.zzb.zzd(false, false, j9);
                }
                zzql.zzc();
                if (zzkkVar.zza.zzt.zzf().zzs(null, zzeh.zzaB)) {
                    zzkkVar.zza.zzt.zzaA().zzi().zzb("Application backgrounded at: timestamp_millis", Long.valueOf(j8));
                } else {
                    zzkkVar.zza.zzt.zzq().zzH(TtmlNode.TEXT_EMPHASIS_AUTO, "_ab", j8, new Bundle());
                }
            }
        });
    }
}
