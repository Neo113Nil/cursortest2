package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfnl {
    final /* synthetic */ zzfnm zza;
    private final Object zzb;
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    private zzfnl(zzfnm zzfnmVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        Objects.requireNonNull(zzfnmVar);
        this.zza = zzfnmVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    /* synthetic */ zzfnl(zzfnm zzfnmVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2, byte[] bArr) {
        this(zzfnmVar, obj, null, listenableFuture, list, listenableFuture2);
    }

    public final zzfnl zza(String str) {
        return new zzfnl(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfnl zzb(final zzfmu zzfmuVar) {
        return zzc(new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfnk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgzo.zza(zzfmu.this.zza(obj));
            }
        });
    }

    public final zzfnl zzc(zzgyw zzgywVar) {
        return zzd(zzgywVar, this.zza.zze());
    }

    public final zzfnl zzd(zzgyw zzgywVar, Executor executor) {
        return new zzfnl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgzo.zzj(this.zzf, zzgywVar, executor));
    }

    public final zzfnl zze(final ListenableFuture listenableFuture) {
        return zzd(new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfnh
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return ListenableFuture.this;
            }
        }, zzcei.zzg);
    }

    public final zzfnl zzf(Class cls, final zzfmu zzfmuVar) {
        return zzg(cls, new zzgyw(zzfmuVar) { // from class: com.google.android.gms.internal.ads.zzfni
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgzo.zza("");
            }
        });
    }

    public final zzfnl zzg(Class cls, zzgyw zzgywVar) {
        zzfnm zzfnmVar = this.zza;
        zzgzy zze = zzfnmVar.zze();
        return new zzfnl(zzfnmVar, this.zzb, this.zzc, this.zzd, this.zze, zzgzo.zzh(this.zzf, cls, zzgywVar, zze));
    }

    public final zzfnl zzh(long j, TimeUnit timeUnit) {
        zzfnm zzfnmVar = this.zza;
        ScheduledExecutorService zzf = zzfnmVar.zzf();
        return new zzfnl(zzfnmVar, this.zzb, this.zzc, this.zzd, this.zze, zzgzo.zzi(this.zzf, j, timeUnit, zzf));
    }

    public final zzfnb zzi() {
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzc(obj);
        }
        final zzfnb zzfnbVar = new zzfnb(obj, str, this.zzf);
        this.zza.zzg().zza(zzfnbVar);
        ListenableFuture listenableFuture = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfnl.this.zza.zzg().zzb(zzfnbVar);
            }
        };
        zzgzy zzgzyVar = zzcei.zzg;
        listenableFuture.addListener(runnable, zzgzyVar);
        zzgzo.zzr(zzfnbVar, new zzfng(this, zzfnbVar), zzgzyVar);
        return zzfnbVar;
    }

    public final zzfnl zzj(Object obj) {
        return this.zza.zza(obj, zzi());
    }
}
