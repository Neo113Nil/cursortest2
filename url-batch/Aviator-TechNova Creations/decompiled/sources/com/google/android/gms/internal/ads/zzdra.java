package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdra {
    private final zzgzy zza;
    private final zzdrp zzb;
    private final zzdru zzc;
    private final zzdxt zzd;

    zzdra(zzgzy zzgzyVar, zzdrp zzdrpVar, zzdru zzdruVar, zzdxt zzdxtVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdrpVar;
        this.zzc = zzdruVar;
        this.zzd = zzdxtVar;
    }

    private final ListenableFuture zze(ListenableFuture listenableFuture, zzdxh zzdxhVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            zzgzo.zzr(listenableFuture, new zzdqx(this, zzdxhVar), this.zza);
        }
        return listenableFuture;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final ListenableFuture zza(final zzfjc zzfjcVar, final zzfir zzfirVar, final JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar) {
        ListenableFuture zza;
        JSONArray optJSONArray;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.RENDERING_NATIVE_ASSETS_LOADING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture submit = this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzdra.this.zzb(zzfjcVar, zzfirVar, jSONObject);
            }
        });
        zze(submit, zzdxh.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdrp zzdrpVar = this.zzb;
        final ListenableFuture zzb = zzdrpVar.zzb(jSONObject, "images", zzdxh.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(zzb, zzdxh.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        final ListenableFuture zzc = zzdrpVar.zzc(jSONObject, "images", zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        zze(zzc, zzdxh.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final ListenableFuture zza2 = zzdrpVar.zza(jSONObject, "secondary_image", zzdxh.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(zza2, zzdxh.NATIVE_ASSETS_LOADING_LOGO_END);
        final ListenableFuture zza3 = zzdrpVar.zza(jSONObject, "app_icon", zzdxh.NATIVE_ASSETS_LOADING_ICON_START);
        zze(zza3, zzdxh.NATIVE_ASSETS_LOADING_ICON_END);
        final ListenableFuture zzd = zzdrpVar.zzd(jSONObject, "attribution", zzdxh.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(zzd, zzdxh.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final ListenableFuture zzg = zzdrpVar.zzg(jSONObject, zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        zze(zzg, zzdxh.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzow)).booleanValue() && jSONObject.has(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO)) {
            JSONObject optJSONObject = jSONObject.optJSONObject(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
            if (optJSONObject.has("flags") && (optJSONArray = optJSONObject.optJSONArray("flags")) != null) {
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    }
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 == null || !optJSONObject2.optString(SDKConstants.PARAM_KEY).equals("afma_video_player_type")) {
                        i++;
                    } else {
                        try {
                            if (Integer.parseInt(optJSONObject2.optString("value")) == 3) {
                                zza = this.zzb.zzf(zzg);
                                zze(zza, zzdxh.NATIVE_ASSETS_LOADING_MEDIA_END);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        zza = zzgzo.zza(new Bundle());
        final ListenableFuture zza4 = this.zzc.zza(jSONObject, "custom_assets");
        zze(zza4, zzdxh.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final ListenableFuture zze = this.zzb.zze(jSONObject, zzbVar, zzcceVar);
        zze(zze, zzdxh.NATIVE_ASSETS_LOADING_OMID_END);
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
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue() || zzf(jSONObject)) {
            arrayList.add(zze);
        }
        final ListenableFuture listenableFuture = zza;
        return zzgzo.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdqy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzdra.this.zzc(submit, zzb, zza3, zza2, zzd, jSONObject, zzg, listenableFuture, zzc, zze, zza4);
            }
        }, this.zza);
    }

    final /* synthetic */ zzdoh zzb(zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_BASIC_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdoh zzdohVar = new zzdoh();
        zzdohVar.zza(jSONObject.optInt("template_id", -1));
        zzdohVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdohVar.zzv(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        if (!zzfjkVar.zzh.contains(Integer.toString(zzdohVar.zzx()))) {
            int zzx = zzdohVar.zzx();
            StringBuilder sb = new StringBuilder(String.valueOf(zzx).length() + 21);
            sb.append("Invalid template ID: ");
            sb.append(zzx);
            throw new zzenv(1, sb.toString());
        }
        if (zzdohVar.zzx() == 3) {
            if (zzdohVar.zzS() == null) {
                throw new zzenv(1, "No custom template id for custom template ad response.");
            }
            if (!zzfjkVar.zzi.contains(zzdohVar.zzS())) {
                throw new zzenv(1, "Unexpected custom template id in the response.");
            }
        }
        zzdohVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String optString = jSONObject.optString("headline", null);
        if (zzfirVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String zzD = com.google.android.gms.ads.internal.util.zzs.zzD();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzD).length() + 3 + String.valueOf(optString).length());
            sb2.append(zzD);
            sb2.append(" : ");
            sb2.append(optString);
            optString = sb2.toString();
        }
        zzdohVar.zzs("headline", optString);
        zzdohVar.zzs(SDKConstants.PARAM_A2U_BODY, jSONObject.optString(SDKConstants.PARAM_A2U_BODY, null));
        zzdohVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdohVar.zzs("store", jSONObject.optString("store", null));
        zzdohVar.zzs(FirebaseAnalytics.Param.PRICE, jSONObject.optString(FirebaseAnalytics.Param.PRICE, null));
        zzdohVar.zzs("advertiser", jSONObject.optString("advertiser", null));
        return zzdohVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdoh zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9, ListenableFuture listenableFuture10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdoh zzdohVar = (zzdoh) listenableFuture.get();
        zzdohVar.zzd((List) listenableFuture2.get());
        zzdohVar.zzj((zzbks) listenableFuture3.get());
        zzdohVar.zzk((zzbks) listenableFuture4.get());
        zzdohVar.zzc((zzbkl) listenableFuture5.get());
        zzdohVar.zze(zzdrp.zzl(jSONObject));
        zzdohVar.zzf(zzdrp.zzk(jSONObject));
        zzcjl zzcjlVar = (zzcjl) listenableFuture6.get();
        if (zzcjlVar != null) {
            zzdohVar.zzm(zzcjlVar);
            zzdohVar.zzg(zzcjlVar.zzE());
            zzdohVar.zzb(zzcjlVar.zzh());
        }
        zzdohVar.zzH().putAll((Bundle) listenableFuture7.get());
        zzcjl zzcjlVar2 = (zzcjl) listenableFuture8.get();
        if (zzcjlVar2 != null) {
            zzdohVar.zzn(zzcjlVar2);
            zzdohVar.zzh(zzcjlVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue() || zzf(jSONObject)) {
            zzcjl zzcjlVar3 = (zzcjl) listenableFuture9.get();
            if (zzcjlVar3 != null) {
                zzdohVar.zzo(zzcjlVar3);
            }
        } else {
            zzdohVar.zzp(listenableFuture9);
            zzdohVar.zzr(new zzcen());
        }
        for (zzdrr zzdrrVar : (List) listenableFuture10.get()) {
            if (zzdrrVar.zza != 1) {
                zzdohVar.zzt(zzdrrVar.zzb, zzdrrVar.zzd);
            } else {
                zzdohVar.zzs(zzdrrVar.zzb, zzdrrVar.zzc);
            }
        }
        return zzdohVar;
    }

    final /* synthetic */ zzdxt zzd() {
        return this.zzd;
    }
}
