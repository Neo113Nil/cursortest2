package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcrh {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcrh(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    public final void zza(zzgoq zzgoqVar) {
        zzgot.zzq(this.zzc, new zzcrb(this, zzgoqVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    final /* synthetic */ ListenableFuture zzc(zzgoq zzgoqVar, ListenableFuture listenableFuture, zzcqs zzcqsVar) {
        if (zzcqsVar != null) {
            zzgoqVar.zzb(zzcqsVar);
        }
        return zzgot.zzi(listenableFuture, ((Long) zzbew.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    final /* synthetic */ void zze(List list, final zzgoq zzgoqVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgoq.this.zza(new zzdwz(3));
                }
            });
            return;
        }
        ListenableFuture zza = zzgot.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it.next();
            zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzcrd
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    zzgoq.this.zza((Throwable) obj);
                    return zzgot.zza(null);
                }
            };
            Executor executor = this.zza;
            zza = zzgot.zzj(zzgot.zzh(zza, Throwable.class, zzgobVar, executor), new zzgob() { // from class: com.google.android.gms.internal.ads.zzcre
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzcrh.this.zzc(zzgoqVar, listenableFuture, (zzcqs) obj);
                }
            }, executor);
        }
        zzgot.zzq(zza, new zzcrc(this, zzgoqVar), this.zza);
    }

    final /* synthetic */ void zzf() {
        zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcrh.this.zzd();
            }
        });
    }
}
