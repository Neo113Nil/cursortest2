package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzenb {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcwi zzc;
    private final zzenr zzd;
    private final zzfqg zze;
    private final zzhah zzf = zzhah.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzenc zzh;
    private zzfjc zzi;

    zzenb(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcwi zzcwiVar, zzenr zzenrVar, zzfqg zzfqgVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcwiVar;
        this.zzd = zzenrVar;
        this.zze = zzfqgVar;
    }

    private final synchronized ListenableFuture zzd(zzfir zzfirVar) {
        Iterator it = zzfirVar.zza.iterator();
        while (it.hasNext()) {
            zzekg zza = this.zzc.zza(zzfirVar.zzb, (String) it.next());
            if (zza != null && zza.zza(this.zzi, zzfirVar)) {
                return zzgzo.zzi(zza.zzb(this.zzi, zzfirVar), zzfirVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgzo.zzc(new zzecr(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzb(zzfir zzfirVar) {
        ListenableFuture zzd = zzd(zzfirVar);
        this.zzd.zze(this.zzi, zzfirVar, zzd, this.zze);
        zzgzo.zzr(zzd, new zzena(this, zzfirVar), this.zza);
    }

    public final synchronized ListenableFuture zza(zzfjc zzfjcVar) {
        if (!this.zzg.getAndSet(true)) {
            List list = zzfjcVar.zzb.zza;
            if (list.isEmpty()) {
                this.zzf.zzb(new zzenv(3, zzeny.zzb(zzfjcVar)));
            } else {
                this.zzi = zzfjcVar;
                zzenr zzenrVar = this.zzd;
                this.zzh = new zzenc(zzfjcVar, zzenrVar, this.zzf);
                zzenrVar.zzc(list);
                zzfir zza = this.zzh.zza();
                while (zza != null) {
                    zzb(zza);
                    zza = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }

    final /* synthetic */ zzenc zzc() {
        return this.zzh;
    }
}
