package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcwu {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcwu(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    public final void zza(zzgzl zzgzlVar) {
        zzgzo.zzr(this.zzc, new zzcwo(this, zzgzlVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    final /* synthetic */ ListenableFuture zzc(zzgzl zzgzlVar, ListenableFuture listenableFuture, zzcwf zzcwfVar) {
        if (zzcwfVar != null) {
            zzgzlVar.zzb(zzcwfVar);
        }
        return zzgzo.zzi(listenableFuture, ((Long) zzbjs.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    final /* synthetic */ void zze(List list, final zzgzl zzgzlVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcwt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgzl.this.zza(new zzecr(3));
                }
            });
            return;
        }
        ListenableFuture zza = zzgzo.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it.next();
            zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcwq
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    zzgzl.this.zza((Throwable) obj);
                    return zzgzo.zza(null);
                }
            };
            Executor executor = this.zza;
            zza = zzgzo.zzj(zzgzo.zzh(zza, Throwable.class, zzgywVar, executor), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcwr
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzcwu.this.zzc(zzgzlVar, listenableFuture, (zzcwf) obj);
                }
            }, executor);
        }
        zzgzo.zzr(zza, new zzcwp(this, zzgzlVar), this.zza);
    }

    final /* synthetic */ void zzf() {
        zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcws
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcwu.this.zzd();
            }
        });
    }
}
