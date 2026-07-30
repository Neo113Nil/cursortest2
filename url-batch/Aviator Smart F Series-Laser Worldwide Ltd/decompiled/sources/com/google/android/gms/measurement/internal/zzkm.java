package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzpe;

/* loaded from: classes3.dex */
final class zzkm {

    @VisibleForTesting
    protected long zza;

    @VisibleForTesting
    protected long zzb;
    final /* synthetic */ zzko zzc;
    private final zzap zzd;

    public zzkm(zzko zzkoVar) {
        this.zzc = zzkoVar;
        this.zzd = new zzkl(this, zzkoVar.zzt);
        long elapsedRealtime = zzkoVar.zzt.zzax().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    @WorkerThread
    final void zzb(long j8) {
        this.zzd.zzb();
    }

    @WorkerThread
    final void zzc(long j8) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j8;
        this.zzb = j8;
    }

    @WorkerThread
    public final boolean zzd(boolean z7, boolean z8, long j8) {
        this.zzc.zzg();
        this.zzc.zza();
        zzpe.zzc();
        if (!this.zzc.zzt.zzf().zzs(null, zzeh.zzaf)) {
            this.zzc.zzt.zzm().zzj.zzb(this.zzc.zzt.zzax().currentTimeMillis());
        } else if (this.zzc.zzt.zzJ()) {
            this.zzc.zzt.zzm().zzj.zzb(this.zzc.zzt.zzax().currentTimeMillis());
        }
        long j9 = j8 - this.zza;
        if (!z7 && j9 < 1000) {
            this.zzc.zzt.zzaA().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j9));
            return false;
        }
        if (!z8) {
            j9 = j8 - this.zzb;
            this.zzb = j8;
        }
        this.zzc.zzt.zzaA().zzj().zzb("Recording user engagement, ms", Long.valueOf(j9));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j9);
        zzlo.zzK(this.zzc.zzt.zzs().zzj(!this.zzc.zzt.zzf().zzu()), bundle, true);
        if (!z8) {
            this.zzc.zzt.zzq().zzG(TtmlNode.TEXT_EMPHASIS_AUTO, "_e", bundle);
        }
        this.zza = j8;
        this.zzd.zzb();
        this.zzd.zzd(3600000L);
        return true;
    }
}
