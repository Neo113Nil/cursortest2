package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzelg implements zzekg {
    private final zzcvc zza;
    private final Context zzb;
    private final zzduv zzc;
    private final zzfjk zzd;
    private final Executor zze;
    private final zzgqt zzf;
    private final zzdxt zzg;

    public zzelg(zzcvc zzcvcVar, Context context, Executor executor, zzduv zzduvVar, zzfjk zzfjkVar, zzgqt zzgqtVar, zzdxt zzdxtVar) {
        this.zzb = context;
        this.zza = zzcvcVar;
        this.zze = executor;
        this.zzc = zzduvVar;
        this.zzd = zzfjkVar;
        this.zzf = zzgqtVar;
        this.zzg = zzdxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final ListenableFuture zzb(final zzfjc zzfjcVar, final zzfir zzfirVar) {
        return zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzelf
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzelg.this.zzc(zzfjcVar, zzfirVar, obj);
            }
        }, this.zze);
    }

    final /* synthetic */ ListenableFuture zzc(zzfjc zzfjcVar, zzfir zzfirVar, Object obj) {
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zza = zzfjq.zza(context, zzfirVar.zzu);
        final zzcjl zza2 = this.zzc.zza(zza, zzfirVar, zzfjcVar.zzb.zzb);
        zza2.zzaw(zzfirVar.zzW);
        View zza3 = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) ? zzcvr.zza(context, zza2.zzE(), zzfirVar) : new zzduy(context, zza2.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfirVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcvc zzcvcVar = this.zza;
        zzcwv zzcwvVar = new zzcwv(zzfjcVar, zzfirVar, null);
        Objects.requireNonNull(zza2);
        final zzcty zzf = zzcvcVar.zzf(zzcwvVar, new zzcue(zza3, zza2, new zzcwd() { // from class: com.google.android.gms.internal.ads.zzelb
            @Override // com.google.android.gms.internal.ads.zzcwd
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() {
                return zzcjl.this.zzh();
            }
        }, zzfjq.zzb(zza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzduu zzj = zzf.zzj();
        zzdxt zzdxtVar = this.zzg;
        zzj.zzi(zza2, false, null, zzdxtVar.zze());
        zzdbx zzd = zzf.zzd();
        zzdbz zzdbzVar = new zzdbz() { // from class: com.google.android.gms.internal.ads.zzelc
            @Override // com.google.android.gms.internal.ads.zzdbz
            public final /* synthetic */ void zzdr() {
                zzcjl zzcjlVar = zzcjl.this;
                if (zzcjlVar.zzP() != null) {
                    zzcjlVar.zzP().zzq();
                }
            }
        };
        zzgzy zzgzyVar = zzcei.zzg;
        zzd.zzq(zzdbzVar, zzgzyVar);
        zzfiw zzfiwVar = zzfirVar.zzs;
        String str = zzfiwVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && zzf.zzm().zza(true)) {
            str = zzclc.zza(str, zzclc.zzb(zzfirVar));
        }
        zzf.zzj();
        ListenableFuture zzj2 = zzduu.zzj(zza2, zzfiwVar.zzb, str, zzdxtVar.zze(), zzcvcVar.zze());
        if (zzfirVar.zzM) {
            Objects.requireNonNull(zza2);
            zzj2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzela
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcjl.this.zzav();
                }
            }, this.zze);
        }
        zzj2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeld
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzelg.this.zzd(zza2);
            }
        }, this.zze);
        return zzgzo.zzk(zzj2, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzele
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj2) {
                return zzcty.this.zzi();
            }
        }, zzgzyVar);
    }

    final /* synthetic */ void zzd(zzcjl zzcjlVar) {
        zzcjlVar.zzJ();
        zzfjk zzfjkVar = this.zzd;
        zzckr zzh = zzcjlVar.zzh();
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzfjkVar.zza;
        if (zzgaVar != null && zzh != null) {
            zzh.zzc(zzgaVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbP)).booleanValue() || zzcjlVar.isAttachedToWindow()) {
            return;
        }
        zzcjlVar.onPause();
        zzcjlVar.zzaG(true);
    }
}
