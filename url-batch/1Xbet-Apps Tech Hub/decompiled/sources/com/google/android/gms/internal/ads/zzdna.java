package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdna {
    private final zzgbl zza;
    private final zzdnn zzb;
    private final zzdns zzc;

    public zzdna(zzgbl zzgblVar, zzdnn zzdnnVar, zzdns zzdnsVar) {
        this.zza = zzgblVar;
        this.zzb = zzdnnVar;
        this.zzc = zzdnsVar;
    }

    public final ListenableFuture zza(final zzfeh zzfehVar, final zzfdu zzfduVar, final JSONObject jSONObject) {
        ListenableFuture zzn;
        final ListenableFuture zzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdmy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdkk zzdkkVar = new zzdkk();
                JSONObject jSONObject2 = jSONObject;
                zzdkkVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdkkVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                String optString = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                zzfeh zzfehVar2 = zzfehVar;
                zzdkkVar.zzV(optString);
                zzfeq zzfeqVar = zzfehVar2.zza.zza;
                if (!zzfeqVar.zzg.contains(Integer.toString(zzdkkVar.zzc()))) {
                    throw new zzejt(1, "Invalid template ID: " + zzdkkVar.zzc());
                }
                if (zzdkkVar.zzc() == 3) {
                    if (zzdkkVar.zzA() == null) {
                        throw new zzejt(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfeqVar.zzh.contains(zzdkkVar.zzA())) {
                        throw new zzejt(1, "Unexpected custom template id in the response.");
                    }
                }
                zzfdu zzfduVar2 = zzfduVar;
                zzdkkVar.zzY(jSONObject2.optDouble("rating", -1.0d));
                String optString2 = jSONObject2.optString("headline", null);
                if (zzfduVar2.zzN) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    optString2 = com.google.android.gms.ads.internal.util.zzt.zzx() + " : " + optString2;
                }
                zzdkkVar.zzZ("headline", optString2);
                zzdkkVar.zzZ("body", jSONObject2.optString("body", null));
                zzdkkVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdkkVar.zzZ("store", jSONObject2.optString("store", null));
                zzdkkVar.zzZ(FirebaseAnalytics.Param.PRICE, jSONObject2.optString(FirebaseAnalytics.Param.PRICE, null));
                zzdkkVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                return zzdkkVar;
            }
        });
        final ListenableFuture zzf = this.zzb.zzf(jSONObject, "images");
        zzfdy zzfdyVar = zzfehVar.zzb.zzb;
        zzdnn zzdnnVar = this.zzb;
        final ListenableFuture zzg = zzdnnVar.zzg(jSONObject, "images", zzfduVar, zzfdyVar);
        final ListenableFuture zze = zzdnnVar.zze(jSONObject, "secondary_image");
        final ListenableFuture zze2 = zzdnnVar.zze(jSONObject, "app_icon");
        final ListenableFuture zzd = zzdnnVar.zzd(jSONObject, "attribution");
        final ListenableFuture zzh = this.zzb.zzh(jSONObject, zzfduVar, zzfehVar.zzb.zzb);
        final ListenableFuture zza = this.zzc.zza(jSONObject, "custom_assets");
        if (jSONObject.optBoolean("enable_omid")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzgbb.zzh(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzgbb.zzh(null);
                } else {
                    final zzdnn zzdnnVar2 = this.zzb;
                    zzn = zzgbb.zzn(zzgbb.zzh(null), new zzgai() { // from class: com.google.android.gms.internal.ads.zzdnc
                        @Override // com.google.android.gms.internal.ads.zzgai
                        public final ListenableFuture zza(Object obj) {
                            return zzdnn.this.zzc(optString, obj);
                        }
                    }, zzcca.zze);
                }
            }
        } else {
            zzn = zzgbb.zzh(null);
        }
        final ListenableFuture listenableFuture = zzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzb);
        arrayList.add(zzf);
        arrayList.add(zzg);
        arrayList.add(zze);
        arrayList.add(zze2);
        arrayList.add(zzd);
        arrayList.add(zzh);
        arrayList.add(zza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeZ)).booleanValue()) {
            arrayList.add(listenableFuture);
        }
        return zzgbb.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdmz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdkk zzdkkVar = (zzdkk) zzb.get();
                zzdkkVar.zzP((List) zzf.get());
                zzdkkVar.zzM((zzbgi) zze2.get());
                zzdkkVar.zzQ((zzbgi) zze.get());
                zzdkkVar.zzJ((zzbga) zzd.get());
                JSONObject jSONObject2 = jSONObject;
                zzdkkVar.zzS(zzdnn.zzj(jSONObject2));
                zzdkkVar.zzL(zzdnn.zzi(jSONObject2));
                zzcgv zzcgvVar = (zzcgv) zzh.get();
                if (zzcgvVar != null) {
                    zzdkkVar.zzad(zzcgvVar);
                    zzdkkVar.zzac(zzcgvVar.zzF());
                    zzdkkVar.zzab(zzcgvVar.zzq());
                }
                zzcgv zzcgvVar2 = (zzcgv) zzg.get();
                if (zzcgvVar2 != null) {
                    zzdkkVar.zzO(zzcgvVar2);
                    zzdkkVar.zzae(zzcgvVar2.zzF());
                }
                ListenableFuture listenableFuture2 = listenableFuture;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeZ)).booleanValue()) {
                    zzdkkVar.zzU(listenableFuture2);
                    zzdkkVar.zzX(new zzccf());
                } else {
                    zzcgv zzcgvVar3 = (zzcgv) listenableFuture2.get();
                    if (zzcgvVar3 != null) {
                        zzdkkVar.zzT(zzcgvVar3);
                    }
                }
                for (zzdnr zzdnrVar : (List) zza.get()) {
                    if (zzdnrVar.zza != 1) {
                        zzdkkVar.zzN(zzdnrVar.zzb, zzdnrVar.zzd);
                    } else {
                        zzdkkVar.zzZ(zzdnrVar.zzb, zzdnrVar.zzc);
                    }
                }
                return zzdkkVar;
            }
        }, this.zza);
    }
}
