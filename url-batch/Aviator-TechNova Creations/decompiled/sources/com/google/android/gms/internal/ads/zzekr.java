package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzekr implements zzekg {
    private final zzctl zza;
    private final zzduv zzb;
    private final zzfjk zzc;
    private final Executor zzd;
    private final VersionInfoParcel zze;
    private final zzbok zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkp)).booleanValue();
    private final zzejf zzh;
    private final zzdxt zzi;
    private final zzdxz zzj;

    public zzekr(zzctl zzctlVar, Context context, Executor executor, zzduv zzduvVar, zzfjk zzfjkVar, VersionInfoParcel versionInfoParcel, zzbok zzbokVar, zzejf zzejfVar, zzdxt zzdxtVar, zzdxz zzdxzVar) {
        this.zza = zzctlVar;
        this.zzd = executor;
        this.zzb = zzduvVar;
        this.zzc = zzfjkVar;
        this.zze = versionInfoParcel;
        this.zzf = zzbokVar;
        this.zzh = zzejfVar;
        this.zzi = zzdxtVar;
        this.zzj = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final ListenableFuture zzb(final zzfjc zzfjcVar, final zzfir zzfirVar) {
        final zzduz zzduzVar = new zzduz();
        ListenableFuture zza = zzgzo.zza(null);
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzekr.this.zzc(zzfirVar, zzfjcVar, zzduzVar, obj);
            }
        };
        Executor executor = this.zzd;
        ListenableFuture zzj = zzgzo.zzj(zza, zzgywVar, executor);
        Objects.requireNonNull(zzduzVar);
        zzj.addListener(new Runnable(zzduzVar) { // from class: com.google.android.gms.internal.ads.zzekq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return zzj;
    }

    final /* synthetic */ ListenableFuture zzc(final zzfir zzfirVar, zzfjc zzfjcVar, zzduz zzduzVar, Object obj) {
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzi.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzduv zzduvVar = this.zzb;
        zzfjk zzfjkVar = this.zzc;
        final zzcjl zza = zzduvVar.zza(zzfjkVar.zzf, zzfirVar, zzfjcVar.zzb.zzb);
        zza.zzaw(zzfirVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzi.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcen zzcenVar = new zzcen();
        zzctl zzctlVar = this.zza;
        zzcwv zzcwvVar = new zzcwv(zzfjcVar, zzfirVar, null);
        VersionInfoParcel versionInfoParcel = this.zze;
        boolean z = this.zzg;
        zzbok zzbokVar = this.zzf;
        final zzcti zzf = zzctlVar.zzf(zzcwvVar, new zzdkr(new zzekt(versionInfoParcel, zzcenVar, zzfirVar, zza, zzfjkVar, z, zzbokVar, this.zzh, this.zzj), zza), new zzctj(zzfirVar.zzaa));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzi.zze().putLong(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzduu zzi = zzf.zzi();
        zzbok zzbokVar2 = true == z ? zzbokVar : null;
        zzdxt zzdxtVar = this.zzi;
        zzi.zzi(zza, false, zzbokVar2, zzdxtVar.zze());
        zzcenVar.zzc(zzf);
        zzf.zzd().zzq(new zzdbz() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // com.google.android.gms.internal.ads.zzdbz
            public final /* synthetic */ void zzdr() {
                zzcjl zzcjlVar = zzcjl.this;
                if (zzcjlVar.zzP() != null) {
                    zzcjlVar.zzP().zzq();
                }
            }
        }, zzcei.zzg);
        zzfiw zzfiwVar = zzfirVar.zzs;
        String str = zzfiwVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && zzf.zzk().zza(true)) {
            str = zzclc.zza(str, zzclc.zzb(zzfirVar));
        }
        zzf.zzi();
        return zzgzo.zzk(zzduu.zzj(zza, zzfiwVar.zzb, str, zzdxtVar.zze(), zzctlVar.zzd()), new zzgqt(this) { // from class: com.google.android.gms.internal.ads.zzeko
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj2) {
                zzcjl zzcjlVar = zza;
                if (zzfirVar.zzM) {
                    zzcjlVar.zzav();
                }
                zzcti zzctiVar = zzf;
                zzcjlVar.zzJ();
                zzcjlVar.onPause();
                return zzctiVar.zzh();
            }
        }, this.zzd);
    }
}
