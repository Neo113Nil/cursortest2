package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfil {
    final /* synthetic */ zzfim zza;
    private final Object zzb;
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    private zzfil(zzfim zzfimVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        this.zza = zzfimVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    public final zzfhz zza() {
        zzfin zzfinVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfhz zzfhzVar = new zzfhz(obj, str, this.zzf);
        zzfinVar = this.zza.zzd;
        zzfinVar.zza(zzfhzVar);
        this.zzd.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfii
            @Override // java.lang.Runnable
            public final void run() {
                zzfin zzfinVar2;
                zzfinVar2 = zzfil.this.zza.zzd;
                zzfinVar2.zzc(zzfhzVar);
            }
        }, zzcca.zzf);
        zzgbb.zzr(zzfhzVar, new zzfij(this, zzfhzVar), zzcca.zzf);
        return zzfhzVar;
    }

    public final zzfil zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfil zzc(Class cls, zzgai zzgaiVar) {
        zzgbl zzgblVar;
        zzgblVar = this.zza.zzb;
        return new zzfil(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgbb.zzf(this.zzf, cls, zzgaiVar, zzgblVar));
    }

    public final zzfil zzd(final ListenableFuture listenableFuture) {
        return zzg(new zzgai() { // from class: com.google.android.gms.internal.ads.zzfih
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return ListenableFuture.this;
            }
        }, zzcca.zzf);
    }

    public final zzfil zze(final zzfhx zzfhxVar) {
        return zzf(new zzgai() { // from class: com.google.android.gms.internal.ads.zzfig
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzgbb.zzh(zzfhx.this.zza(obj));
            }
        });
    }

    public final zzfil zzf(zzgai zzgaiVar) {
        zzgbl zzgblVar;
        zzgblVar = this.zza.zzb;
        return zzg(zzgaiVar, zzgblVar);
    }

    public final zzfil zzg(zzgai zzgaiVar, Executor executor) {
        return new zzfil(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgbb.zzn(this.zzf, zzgaiVar, executor));
    }

    public final zzfil zzh(String str) {
        return new zzfil(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfil zzi(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zza.zzc;
        return new zzfil(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgbb.zzo(this.zzf, j, timeUnit, scheduledExecutorService));
    }
}
