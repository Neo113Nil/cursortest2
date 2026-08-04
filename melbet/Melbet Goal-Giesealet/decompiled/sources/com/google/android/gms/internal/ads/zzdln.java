package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdln {
    private final zzgpd zza;
    private final zzdmc zzb;
    private final zzdmh zzc;
    private final zzdsg zzd;

    zzdln(zzgpd zzgpdVar, zzdmc zzdmcVar, zzdmh zzdmhVar, zzdsg zzdsgVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdmcVar;
        this.zzc = zzdmhVar;
        this.zzd = zzdsgVar;
    }

    private final ListenableFuture zze(ListenableFuture listenableFuture, zzdru zzdruVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            zzgot.zzq(listenableFuture, new zzdlk(this, zzdruVar), this.zza);
        }
        return listenableFuture;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final ListenableFuture zza(final zzfcu zzfcuVar, final zzfcj zzfcjVar, final JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzbxf zzbxfVar) {
        ListenableFuture zza;
        JSONArray optJSONArray;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzct)).booleanValue()) {
            this.zzd.zze().putLong(zzdru.RENDERING_NATIVE_ASSETS_LOADING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture submit = this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzdln.this.zzb(zzfcuVar, zzfcjVar, jSONObject);
            }
        });
        zze(submit, zzdru.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdmc zzdmcVar = this.zzb;
        final ListenableFuture zzb = zzdmcVar.zzb(jSONObject, "images", zzdru.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(zzb, zzdru.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
        final ListenableFuture zzc = zzdmcVar.zzc(jSONObject, "images", zzfcjVar, zzfcmVar, zzbVar, zzbxfVar);
        zze(zzc, zzdru.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final ListenableFuture zza2 = zzdmcVar.zza(jSONObject, "secondary_image", zzdru.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(zza2, zzdru.NATIVE_ASSETS_LOADING_LOGO_END);
        final ListenableFuture zza3 = zzdmcVar.zza(jSONObject, "app_icon", zzdru.NATIVE_ASSETS_LOADING_ICON_START);
        zze(zza3, zzdru.NATIVE_ASSETS_LOADING_ICON_END);
        final ListenableFuture zzd = zzdmcVar.zzd(jSONObject, "attribution", zzdru.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(zzd, zzdru.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final ListenableFuture zzg = zzdmcVar.zzg(jSONObject, zzfcjVar, zzfcmVar, zzbVar, zzbxfVar);
        zze(zzg, zzdru.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznO)).booleanValue() && jSONObject.has("video")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject.has("flags") && (optJSONArray = optJSONObject.optJSONArray("flags")) != null) {
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    }
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 == null || !optJSONObject2.optString("key").equals("afma_video_player_type")) {
                        i++;
                    } else {
                        try {
                            if (Integer.parseInt(optJSONObject2.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE)) == 3) {
                                zza = this.zzb.zzf(zzg);
                                zze(zza, zzdru.NATIVE_ASSETS_LOADING_MEDIA_END);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        zza = zzgot.zza(new Bundle());
        final ListenableFuture zza4 = this.zzc.zza(jSONObject, "custom_assets");
        zze(zza4, zzdru.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final ListenableFuture zze = this.zzb.zze(jSONObject, zzbVar, zzbxfVar);
        zze(zze, zzdru.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList = new ArrayList();
        arrayList.add(submit);
        arrayList.add(zzb);
        arrayList.add(zzc);
        arrayList.add(zza2);
        arrayList.add(zza3);
        arrayList.add(zzd);
        arrayList.add(zzg);
        arrayList.add(zza);
        arrayList.add(zza4);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfQ)).booleanValue() || zzf(jSONObject)) {
            arrayList.add(zze);
        }
        final ListenableFuture listenableFuture = zza;
        return zzgot.zzm(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdll
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzdln.this.zzc(submit, zzb, zza3, zza2, zzd, jSONObject, zzg, listenableFuture, zzc, zze, zza4);
            }
        }, this.zza);
    }

    final /* synthetic */ zzdiu zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzd.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_BASIC_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdiu zzdiuVar = new zzdiu();
        zzdiuVar.zza(jSONObject.optInt("template_id", -1));
        zzdiuVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdiuVar.zzv(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        if (!zzfdcVar.zzh.contains(Integer.toString(zzdiuVar.zzx()))) {
            int zzx = zzdiuVar.zzx();
            StringBuilder sb = new StringBuilder(String.valueOf(zzx).length() + 21);
            sb.append("Invalid template ID: ");
            sb.append(zzx);
            throw new zzeho(1, sb.toString());
        }
        if (zzdiuVar.zzx() == 3) {
            if (zzdiuVar.zzS() == null) {
                throw new zzeho(1, "No custom template id for custom template ad response.");
            }
            if (!zzfdcVar.zzi.contains(zzdiuVar.zzS())) {
                throw new zzeho(1, "Unexpected custom template id in the response.");
            }
        }
        zzdiuVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String optString = jSONObject.optString("headline", null);
        if (zzfcjVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String zzC = com.google.android.gms.ads.internal.util.zzs.zzC();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzC).length() + 3 + String.valueOf(optString).length());
            sb2.append(zzC);
            sb2.append(" : ");
            sb2.append(optString);
            optString = sb2.toString();
        }
        zzdiuVar.zzs("headline", optString);
        zzdiuVar.zzs("body", jSONObject.optString("body", null));
        zzdiuVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdiuVar.zzs("store", jSONObject.optString("store", null));
        zzdiuVar.zzs("price", jSONObject.optString("price", null));
        zzdiuVar.zzs("advertiser", jSONObject.optString("advertiser", null));
        return zzdiuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdiu zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9, ListenableFuture listenableFuture10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzct)).booleanValue()) {
            this.zzd.zze().putLong(zzdru.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdiu zzdiuVar = (zzdiu) listenableFuture.get();
        zzdiuVar.zzd((List) listenableFuture2.get());
        zzdiuVar.zzj((zzbfw) listenableFuture3.get());
        zzdiuVar.zzk((zzbfw) listenableFuture4.get());
        zzdiuVar.zzc((zzbfp) listenableFuture5.get());
        zzdiuVar.zze(zzdmc.zzl(jSONObject));
        zzdiuVar.zzf(zzdmc.zzk(jSONObject));
        zzcek zzcekVar = (zzcek) listenableFuture6.get();
        if (zzcekVar != null) {
            zzdiuVar.zzm(zzcekVar);
            zzdiuVar.zzg(zzcekVar.zzE());
            zzdiuVar.zzb(zzcekVar.zzh());
        }
        zzdiuVar.zzH().putAll((Bundle) listenableFuture7.get());
        zzcek zzcekVar2 = (zzcek) listenableFuture8.get();
        if (zzcekVar2 != null) {
            zzdiuVar.zzn(zzcekVar2);
            zzdiuVar.zzh(zzcekVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfQ)).booleanValue() || zzf(jSONObject)) {
            zzcek zzcekVar3 = (zzcek) listenableFuture9.get();
            if (zzcekVar3 != null) {
                zzdiuVar.zzo(zzcekVar3);
            }
        } else {
            zzdiuVar.zzp(listenableFuture9);
            zzdiuVar.zzr(new zzbzm());
        }
        for (zzdme zzdmeVar : (List) listenableFuture10.get()) {
            if (zzdmeVar.zza != 1) {
                zzdiuVar.zzt(zzdmeVar.zzb, zzdmeVar.zzd);
            } else {
                zzdiuVar.zzs(zzdmeVar.zzb, zzdmeVar.zzc);
            }
        }
        return zzdiuVar;
    }

    final /* synthetic */ zzdsg zzd() {
        return this.zzd;
    }
}
