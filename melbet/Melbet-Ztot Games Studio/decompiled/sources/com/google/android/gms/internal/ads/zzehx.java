package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzehx {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcrx zzc;
    private final zzein zzd;
    private final zzflh zze;
    private final zzgdc zzf = zzgdc.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzehy zzh;
    private zzfex zzi;

    zzehx(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcrx zzcrxVar, zzein zzeinVar, zzflh zzflhVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcrxVar;
        this.zzd = zzeinVar;
        this.zze = zzflhVar;
    }

    private final synchronized ListenableFuture zzd(zzfel zzfelVar) {
        Iterator it = zzfelVar.zza.iterator();
        while (it.hasNext()) {
            zzeet zza = this.zzc.zza(zzfelVar.zzb, (String) it.next());
            if (zza != null && zza.zzb(this.zzi, zzfelVar)) {
                return zzgcj.zzo(zza.zza(this.zzi, zzfelVar), zzfelVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgcj.zzg(new zzdwl(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(zzfel zzfelVar) {
        ListenableFuture zzd = zzd(zzfelVar);
        this.zzd.zzf(this.zzi, zzfelVar, zzd, this.zze);
        zzgcj.zzr(zzd, new zzehw(this, zzfelVar), this.zza);
    }

    public final synchronized ListenableFuture zzb(zzfex zzfexVar) {
        if (!this.zzg.getAndSet(true)) {
            if (zzfexVar.zzb.zza.isEmpty()) {
                this.zzf.zzd(new zzeir(3, zzeiu.zzc(zzfexVar)));
            } else {
                this.zzi = zzfexVar;
                this.zzh = new zzehy(zzfexVar, this.zzd, this.zzf);
                this.zzd.zzk(zzfexVar.zzb.zza);
                zzfel zza = this.zzh.zza();
                while (zza != null) {
                    zze(zza);
                    zza = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }
}
