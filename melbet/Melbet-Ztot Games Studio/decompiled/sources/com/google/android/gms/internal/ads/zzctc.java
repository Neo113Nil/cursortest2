package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzctc {
    private final zzdxu zza;
    private final zzffg zzb;
    private final zzfjl zzc;
    private final zzclw zzd;
    private final zzeiu zze;
    private final zzdby zzf;
    private zzfex zzg;
    private final zzdzc zzh;
    private final zzcvu zzi;
    private final Executor zzj;
    private final zzdym zzk;
    private final zzeey zzl;
    private final zzdzs zzm;
    private final zzdzz zzn;

    zzctc(zzdxu zzdxuVar, zzffg zzffgVar, zzfjl zzfjlVar, zzclw zzclwVar, zzeiu zzeiuVar, zzdby zzdbyVar, zzfex zzfexVar, zzdzc zzdzcVar, zzcvu zzcvuVar, Executor executor, zzdym zzdymVar, zzeey zzeeyVar, zzdzs zzdzsVar, zzdzz zzdzzVar) {
        this.zza = zzdxuVar;
        this.zzb = zzffgVar;
        this.zzc = zzfjlVar;
        this.zzd = zzclwVar;
        this.zze = zzeiuVar;
        this.zzf = zzdbyVar;
        this.zzg = zzfexVar;
        this.zzh = zzdzcVar;
        this.zzi = zzcvuVar;
        this.zzj = executor;
        this.zzk = zzdymVar;
        this.zzl = zzeeyVar;
        this.zzm = zzdzsVar;
        this.zzn = zzdzzVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfgi.zzb(th, this.zzl);
    }

    public final zzdby zzc() {
        return this.zzf;
    }

    final /* synthetic */ zzfex zzd(zzfex zzfexVar) throws Exception {
        this.zzd.zza(zzfexVar);
        return zzfexVar;
    }

    public final ListenableFuture zze(final zzfhb zzfhbVar) {
        zzfiq zza = this.zzc.zzb(zzfjf.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsy
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzctc.this.zzf(zzfhbVar, (zzbvb) obj);
            }
        }).zza();
        zzgcj.zzr(zza, new zzcta(this), this.zzj);
        return zza;
    }

    final /* synthetic */ ListenableFuture zzf(zzfhb zzfhbVar, zzbvb zzbvbVar) throws Exception {
        zzbvbVar.zzi = zzfhbVar;
        return this.zzh.zza(zzbvbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ListenableFuture zzg(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3) throws Exception {
        return this.zzn.zzc((zzbvb) listenableFuture.get(), (JSONObject) listenableFuture2.get(), (zzbvd) listenableFuture3.get());
    }

    public final ListenableFuture zzh(zzbvb zzbvbVar) {
        zzfiq zza = this.zzc.zzb(zzfjf.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbvbVar)).zza();
        zzgcj.zzr(zza, new zzctb(this), this.zzj);
        return zza;
    }

    public final ListenableFuture zzi(ListenableFuture listenableFuture) {
        zzfjc zzf = this.zzc.zzb(zzfjf.RENDERER, listenableFuture).zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzcst
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                zzfex zzfexVar = (zzfex) obj;
                zzctc.this.zzd(zzfexVar);
                return zzfexVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeT)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeU)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final ListenableFuture zzj() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzfjl zzfjlVar = this.zzc;
        zzdxu zzdxuVar = this.zza;
        return zzfiv.zzc(zzdxuVar.zza(), zzfjf.PRELOADED_LOADER, zzfjlVar).zza();
    }

    public final ListenableFuture zzk(final ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            return zzfiv.zzc(zzgcj.zzh(this.zzg), zzfjf.SERVER_TRANSACTION, this.zzc).zza();
        }
        com.google.android.gms.ads.internal.zzu.zzc().zzj();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkF)).booleanValue() || ((Boolean) zzbdy.zzc.zze()).booleanValue()) {
            zzfjc zzb = this.zzc.zzb(zzfjf.SERVER_TRANSACTION, listenableFuture);
            final zzdym zzdymVar = this.zzk;
            Objects.requireNonNull(zzdymVar);
            return zzb.zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsz
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final ListenableFuture zza(Object obj) {
                    return zzdym.this.zzb((zzbvb) obj);
                }
            }).zza();
        }
        final zzdzs zzdzsVar = this.zzm;
        Objects.requireNonNull(zzdzsVar);
        final ListenableFuture zzn = zzgcj.zzn(listenableFuture, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsu
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzdzs.this.zza((zzbvb) obj);
            }
        }, this.zzj);
        zzfjc zzb2 = this.zzc.zzb(zzfjf.BUILD_URL, zzn);
        final zzdzc zzdzcVar = this.zzh;
        Objects.requireNonNull(zzdzcVar);
        final zzfiq zza = zzb2.zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsv
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzdzc.this.zzb((JSONObject) obj);
            }
        }).zza();
        return this.zzc.zza(zzfjf.SERVER_TRANSACTION, listenableFuture, zzn, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcsw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzctc.this.zzg(listenableFuture, zzn, zza);
            }
        }).zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsx
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return (ListenableFuture) obj;
            }
        }).zza();
    }

    public final void zzl(zzfex zzfexVar) {
        this.zzg = zzfexVar;
    }
}
