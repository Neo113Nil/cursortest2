package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class zzon {
    protected long zza;
    protected long zzb;
    final /* synthetic */ zzop zzc;
    private final zzaz zzd;

    public zzon(zzop zzopVar) {
        this.zzc = zzopVar;
        this.zzd = new zzom(this, zzopVar.zzu);
        long elapsedRealtime = zzopVar.zzu.zzaU().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    final void zza() {
        this.zzd.zzb();
        zzio zzioVar = this.zzc.zzu;
        long elapsedRealtime = zzioVar.zzf().zzx(null, zzgi.zzbb) ? zzioVar.zzaU().elapsedRealtime() : 0L;
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    final void zzb(long j4) {
        this.zzd.zzb();
    }

    final void zzc(long j4) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j4;
        this.zzb = j4;
    }

    public final boolean zzd(boolean z4, boolean z5, long j4) {
        zzop zzopVar = this.zzc;
        zzopVar.zzg();
        zzopVar.zza();
        if (zzopVar.zzu.zzJ()) {
            zzio zzioVar = zzopVar.zzu;
            zzioVar.zzm().zzk.zzb(zzioVar.zzaU().currentTimeMillis());
        }
        long j5 = j4 - this.zza;
        if (!z4 && j5 < 1000) {
            zzopVar.zzu.zzaW().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j5));
            return false;
        }
        if (!z5) {
            j5 = j4 - this.zzb;
            this.zzb = j4;
        }
        zzio zzioVar2 = zzopVar.zzu;
        zzioVar2.zzaW().zzj().zzb("Recording user engagement, ms", Long.valueOf(j5));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j5);
        boolean z6 = !zzioVar2.zzf().zzz();
        zzio zzioVar3 = zzopVar.zzu;
        zzqf.zzN(zzioVar3.zzt().zzj(z6), bundle, true);
        if (!z5) {
            zzioVar3.zzq().zzR("auto", "_e", bundle);
        }
        this.zza = j4;
        zzaz zzazVar = this.zzd;
        zzazVar.zzb();
        zzazVar.zzd(((Long) zzgi.zzap.zza(null)).longValue());
        return true;
    }
}
