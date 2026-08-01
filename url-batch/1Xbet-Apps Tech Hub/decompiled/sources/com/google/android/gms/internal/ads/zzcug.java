package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcug {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcug(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    static /* bridge */ /* synthetic */ void zzb(final zzcug zzcugVar, List list, final zzgax zzgaxVar) {
        if (list == null || list.isEmpty()) {
            zzcugVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcub
                @Override // java.lang.Runnable
                public final void run() {
                    zzgax.this.zza(new zzdxn(3));
                }
            });
            return;
        }
        ListenableFuture zzh = zzgbb.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it.next();
            zzh = zzgbb.zzn(zzgbb.zzf(zzh, Throwable.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzcuc
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    zzgax.this.zza((Throwable) obj);
                    return zzgbb.zzh(null);
                }
            }, zzcugVar.zza), new zzgai() { // from class: com.google.android.gms.internal.ads.zzcud
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    return zzcug.this.zza(zzgaxVar, listenableFuture, (zzctr) obj);
                }
            }, zzcugVar.zza);
        }
        zzgbb.zzr(zzh, new zzcuf(zzcugVar, zzgaxVar), zzcugVar.zza);
    }

    final /* synthetic */ ListenableFuture zza(zzgax zzgaxVar, ListenableFuture listenableFuture, zzctr zzctrVar) throws Exception {
        if (zzctrVar != null) {
            zzgaxVar.zzb(zzctrVar);
        }
        return zzgbb.zzo(listenableFuture, ((Long) zzbfi.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgax zzgaxVar) {
        zzgbb.zzr(this.zzc, new zzcue(this, zzgaxVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
