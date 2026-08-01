package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcuz {
    private final zzdyv zza;
    private final zzfeq zzb;
    private final zzfiu zzc;
    private final zzcod zzd;
    private final zzejw zze;
    private final zzddm zzf;
    private zzfeh zzg;
    private final zzeaa zzh;
    private final zzcxl zzi;
    private final Executor zzj;
    private final zzdzm zzk;
    private final zzega zzl;
    private final zzeaq zzm;
    private final zzeax zzn;

    zzcuz(zzdyv zzdyvVar, zzfeq zzfeqVar, zzfiu zzfiuVar, zzcod zzcodVar, zzejw zzejwVar, zzddm zzddmVar, zzfeh zzfehVar, zzeaa zzeaaVar, zzcxl zzcxlVar, Executor executor, zzdzm zzdzmVar, zzega zzegaVar, zzeaq zzeaqVar, zzeax zzeaxVar) {
        this.zza = zzdyvVar;
        this.zzb = zzfeqVar;
        this.zzc = zzfiuVar;
        this.zzd = zzcodVar;
        this.zze = zzejwVar;
        this.zzf = zzddmVar;
        this.zzg = zzfehVar;
        this.zzh = zzeaaVar;
        this.zzi = zzcxlVar;
        this.zzj = executor;
        this.zzk = zzdzmVar;
        this.zzl = zzegaVar;
        this.zzm = zzeaqVar;
        this.zzn = zzeaxVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzffr.zzb(th, this.zzl);
    }

    public final zzddm zzc() {
        return this.zzf;
    }

    final /* synthetic */ zzfeh zzd(zzfeh zzfehVar) throws Exception {
        this.zzd.zza(zzfehVar);
        return zzfehVar;
    }

    public final ListenableFuture zze(final zzfgk zzfgkVar) {
        zzfhz zza = this.zzc.zzb(zzfio.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgai() { // from class: com.google.android.gms.internal.ads.zzcuv
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzcuz.this.zzf(zzfgkVar, (zzbwa) obj);
            }
        }).zza();
        zzgbb.zzr(zza, new zzcux(this), this.zzj);
        return zza;
    }

    final /* synthetic */ ListenableFuture zzf(zzfgk zzfgkVar, zzbwa zzbwaVar) throws Exception {
        zzbwaVar.zzi = zzfgkVar;
        return this.zzh.zza(zzbwaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ListenableFuture zzg(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3) throws Exception {
        return this.zzn.zzc((zzbwa) listenableFuture.get(), (JSONObject) listenableFuture2.get(), (zzbwd) listenableFuture3.get());
    }

    public final ListenableFuture zzh(zzbwa zzbwaVar) {
        zzfhz zza = this.zzc.zzb(zzfio.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbwaVar)).zza();
        zzgbb.zzr(zza, new zzcuy(this), this.zzj);
        return zza;
    }

    public final ListenableFuture zzi(ListenableFuture listenableFuture) {
        zzfil zzf = this.zzc.zzb(zzfio.RENDERER, listenableFuture).zze(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzcuq
            @Override // com.google.android.gms.internal.ads.zzfhx
            public final Object zza(Object obj) {
                zzfeh zzfehVar = (zzfeh) obj;
                zzcuz.this.zzd(zzfehVar);
                return zzfehVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfu)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfw)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final ListenableFuture zzj() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzfiu zzfiuVar = this.zzc;
        zzdyv zzdyvVar = this.zza;
        return zzfie.zzc(zzdyvVar.zza(), zzfio.PRELOADED_LOADER, zzfiuVar).zza();
    }

    public final ListenableFuture zzk(final ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            return zzfie.zzc(zzgbb.zzh(this.zzg), zzfio.SERVER_TRANSACTION, this.zzc).zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc().zzj();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkH)).booleanValue() || ((Boolean) zzbfb.zzc.zze()).booleanValue()) {
            zzfil zzb = this.zzc.zzb(zzfio.SERVER_TRANSACTION, listenableFuture);
            final zzdzm zzdzmVar = this.zzk;
            return zzb.zzf(new zzgai() { // from class: com.google.android.gms.internal.ads.zzcuw
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    return zzdzm.this.zzb((zzbwa) obj);
                }
            }).zza();
        }
        final zzeaq zzeaqVar = this.zzm;
        final ListenableFuture zzn = zzgbb.zzn(listenableFuture, new zzgai() { // from class: com.google.android.gms.internal.ads.zzcur
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzeaq.this.zza((zzbwa) obj);
            }
        }, this.zzj);
        zzfil zzb2 = this.zzc.zzb(zzfio.BUILD_URL, zzn);
        final zzeaa zzeaaVar = this.zzh;
        final zzfhz zza = zzb2.zzf(new zzgai() { // from class: com.google.android.gms.internal.ads.zzcus
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzeaa.this.zzb((JSONObject) obj);
            }
        }).zza();
        return this.zzc.zza(zzfio.SERVER_TRANSACTION, listenableFuture, zzn, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcut
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcuz.this.zzg(listenableFuture, zzn, zza);
            }
        }).zzf(new zzgai() { // from class: com.google.android.gms.internal.ads.zzcuu
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return (ListenableFuture) obj;
            }
        }).zza();
    }

    public final void zzl(zzfeh zzfehVar) {
        this.zzg = zzfehVar;
    }
}
