package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzems implements zzemm {
    private final zzdmq zza;
    private final zzgzy zzb;
    private final zzdra zzc;
    private final zzfkj zzd;
    private final zzdtq zze;
    private final zzdxt zzf;
    private final VersionInfoParcel zzg;
    private final Context zzh;
    private final zzcca zzi;

    public zzems(zzdmq zzdmqVar, zzgzy zzgzyVar, zzdra zzdraVar, zzfkj zzfkjVar, zzdtq zzdtqVar, zzdxt zzdxtVar, VersionInfoParcel versionInfoParcel, Context context, zzcca zzccaVar) {
        this.zzg = versionInfoParcel;
        this.zzh = context;
        this.zzi = zzccaVar;
        this.zza = zzdmqVar;
        this.zzb = zzgzyVar;
        this.zzc = zzdraVar;
        this.zzd = zzfkjVar;
        this.zze = zzdtqVar;
        this.zzf = zzdxtVar;
    }

    private final ListenableFuture zzg(final zzfjc zzfjcVar, final zzfir zzfirVar, final JSONObject jSONObject) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        zzcce zzcceVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcN)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture zzb = this.zzd.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpf)).booleanValue()) {
            Context context = this.zzh;
            zzcce zza = zzdba.zza(context, this.zzg, zzfirVar, this.zzi);
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, zza, null);
            zzcceVar = zza;
        } else {
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzh, null, null);
            zzcceVar = null;
        }
        final com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar;
        final zzcce zzcceVar2 = zzcceVar;
        final ListenableFuture zza2 = this.zzc.zza(zzfjcVar, zzfirVar, jSONObject, zzbVar2, zzcceVar2);
        return zzgzo.zzo(zzb, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzemq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzems.this.zzf(zza2, zzb, zzfjcVar, zzfirVar, jSONObject, zzbVar2, zzcceVar2);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zzc == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final ListenableFuture zzb(final zzfjc zzfjcVar, final zzfir zzfirVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture zzb = this.zzd.zzb();
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzemr
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzems.this.zzc(zzfirVar, (zzdtk) obj);
            }
        };
        zzgzy zzgzyVar = this.zzb;
        return zzgzo.zzj(zzgzo.zzj(zzb, zzgywVar, zzgzyVar), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzemn
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzems.this.zzd(zzfjcVar, zzfirVar, (JSONArray) obj);
            }
        }, zzgzyVar);
    }

    final /* synthetic */ ListenableFuture zzc(zzfir zzfirVar, final zzdtk zzdtkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjX)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfirVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgzo.zzj(zzdtkVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzemo
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzems.this.zze(zzdtkVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzd(zzfjc zzfjcVar, zzfir zzfirVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgzo.zzc(new zzecr(3));
        }
        int i = zzfjcVar.zza.zza.zzl;
        if (i <= 1) {
            return zzgzo.zzk(zzg(zzfjcVar, zzfirVar, jSONArray.getJSONObject(0)), zzemp.zza, this.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcO)).booleanValue()) {
            this.zzf.zzd("nsl", String.valueOf(length));
        }
        this.zzd.zza(Math.min(length, i));
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < length) {
                arrayList.add(zzg(zzfjcVar, zzfirVar, jSONArray.getJSONObject(i2)));
            } else {
                arrayList.add(zzgzo.zzc(new zzecr(3)));
            }
        }
        return zzgzo.zza(arrayList);
    }

    final /* synthetic */ ListenableFuture zze(zzdtk zzdtkVar, JSONObject jSONObject) {
        this.zzd.zzc(zzgzo.zza(zzdtkVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzbso("process json failed");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzgzo.zza(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdoc zzf(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar) {
        zzdoh zzdohVar = (zzdoh) listenableFuture.get();
        zzdtk zzdtkVar = (zzdtk) listenableFuture2.get();
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdoi zzd = this.zza.zzd(new zzcwv(zzfjcVar, zzfirVar, null), new zzdos(zzdohVar), new zzdnd(jSONObject, zzdtkVar, zzbVar, zzcceVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdxt zzdxtVar = this.zzf;
            zzdxtVar.zze().putLong(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), currentTimeMillis);
            zzdxtVar.zze().putLong(zzdxh.RENDERING_CONFIGURE_WEBVIEW_START.zza(), currentTimeMillis);
        }
        zzd.zzi().zzb();
        zzd.zzj().zza(zzdtkVar);
        zzd.zzk().zza(zzdohVar.zzT());
        zzd.zzl().zza(this.zze, zzdohVar.zzU());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzd.zzh();
    }
}
