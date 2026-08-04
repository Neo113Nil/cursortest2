package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeek implements zzedz {
    private final zzcny zza;
    private final Context zzb;
    private final zzdpi zzc;
    private final zzfdc zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjo zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjH)).booleanValue();
    private final zzecy zzi;
    private final zzdsg zzj;
    private final zzdsm zzk;

    public zzeek(zzcny zzcnyVar, Context context, Executor executor, zzdpi zzdpiVar, zzfdc zzfdcVar, VersionInfoParcel versionInfoParcel, zzbjo zzbjoVar, zzecy zzecyVar, zzdsg zzdsgVar, zzdsm zzdsmVar) {
        this.zzb = context;
        this.zza = zzcnyVar;
        this.zze = executor;
        this.zzc = zzdpiVar;
        this.zzd = zzfdcVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzbjoVar;
        this.zzi = zzecyVar;
        this.zzj = zzdsgVar;
        this.zzk = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzfco zzfcoVar = zzfcjVar.zzs;
        return (zzfcoVar == null || zzfcoVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final ListenableFuture zzb(final zzfcu zzfcuVar, final zzfcj zzfcjVar) {
        final zzdpm zzdpmVar = new zzdpm();
        ListenableFuture zza = zzgot.zza(null);
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzeek.this.zzc(zzfcjVar, zzfcuVar, zzdpmVar, obj);
            }
        };
        Executor executor = this.zze;
        ListenableFuture zzj = zzgot.zzj(zza, zzgobVar, executor);
        Objects.requireNonNull(zzdpmVar);
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdpm.this.zzb();
            }
        }, executor);
        return zzj;
    }

    final /* synthetic */ ListenableFuture zzc(final zzfcj zzfcjVar, zzfcu zzfcuVar, zzdpm zzdpmVar, Object obj) {
        zzbbz zzbbzVar = zzbci.zzcu;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdpi zzdpiVar = this.zzc;
        zzfdc zzfdcVar = this.zzd;
        final zzcek zza = zzdpiVar.zza(zzfdcVar.zzf, zzfcjVar, zzfcuVar.zzb.zzb);
        zza.zzaw(zzfcjVar.zzW);
        zzdpmVar.zza(this.zzb, zza.zzE());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzbzm zzbzmVar = new zzbzm();
        zzcny zzcnyVar = this.zza;
        zzcri zzcriVar = new zzcri(zzfcuVar, zzfcjVar, null);
        VersionInfoParcel versionInfoParcel = this.zzf;
        boolean z = this.zzh;
        zzbjo zzbjoVar = this.zzg;
        final zzcnv zzf = zzcnyVar.zzf(zzcriVar, new zzdfe(new zzeem(versionInfoParcel, zzbzmVar, zzfcjVar, zza, zzfdcVar, z, zzbjoVar, this.zzi, this.zzk), zza), new zzcnw(zzfcjVar.zzaa));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdru.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdph zzi = zzf.zzi();
        zzbjo zzbjoVar2 = true == z ? zzbjoVar : null;
        zzdsg zzdsgVar = this.zzj;
        zzi.zzi(zza, false, zzbjoVar2, zzdsgVar.zze());
        zzbzmVar.zzc(zzf);
        zzf.zzd().zzq(new zzcwm() { // from class: com.google.android.gms.internal.ads.zzeeg
            @Override // com.google.android.gms.internal.ads.zzcwm
            public final /* synthetic */ void zzdw() {
                zzcek zzcekVar = zzcek.this;
                if (zzcekVar.zzP() != null) {
                    zzcekVar.zzP().zzq();
                }
            }
        }, zzbzh.zzg);
        zzfco zzfcoVar = zzfcjVar.zzs;
        String str = zzfcoVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && zzf.zzk().zza(true)) {
            str = zzcgb.zza(str, zzcgb.zzb(zzfcjVar));
        }
        zzf.zzi();
        return zzgot.zzk(zzdph.zzj(zza, zzfcoVar.zzb, str, zzdsgVar.zze(), zzcnyVar.zzd()), new zzggr(this) { // from class: com.google.android.gms.internal.ads.zzeeh
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj2) {
                zzcek zzcekVar = zza;
                if (zzfcjVar.zzM) {
                    zzcekVar.zzav();
                }
                zzcnv zzcnvVar = zzf;
                zzcekVar.zzJ();
                zzcekVar.onPause();
                return zzcnvVar.zzh();
            }
        }, this.zze);
    }
}
