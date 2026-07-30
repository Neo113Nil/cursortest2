package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes3.dex */
public final class zzko extends zzf {
    protected final zzkn zza;
    protected final zzkm zzb;
    protected final zzkk zzc;
    private Handler zzd;

    zzko(zzge zzgeVar) {
        super(zzgeVar);
        this.zza = new zzkn(this);
        this.zzb = new zzkm(this);
        this.zzc = new zzkk(this);
    }

    static /* bridge */ /* synthetic */ void zzj(zzko zzkoVar, long j) {
        zzkoVar.zzg();
        zzkoVar.zzm();
        zzkoVar.zzt.zzaA().zzj().zzb("Activity paused, time", Long.valueOf(j));
        zzkoVar.zzc.zza(j);
        if (zzkoVar.zzt.zzf().zzu()) {
            zzkoVar.zzb.zzb(j);
        }
    }

    static /* bridge */ /* synthetic */ void zzl(zzko zzkoVar, long j) {
        zzkoVar.zzg();
        zzkoVar.zzm();
        zzkoVar.zzt.zzaA().zzj().zzb("Activity resumed, time", Long.valueOf(j));
        if (zzkoVar.zzt.zzf().zzu() || zzkoVar.zzt.zzm().zzm.zzb()) {
            zzkoVar.zzb.zzc(j);
        }
        zzkoVar.zzc.zzb();
        zzkn zzknVar = zzkoVar.zza;
        zzknVar.zza.zzg();
        if (zzknVar.zza.zzt.zzJ()) {
            zzknVar.zzb(zzknVar.zza.zzt.zzax().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }
}
