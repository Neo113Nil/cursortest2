package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzebu implements zzbon {
    zzebu() {
    }

    @Override // com.google.android.gms.internal.ads.zzbon
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzebv zzebvVar = (zzebv) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjc)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzebvVar.zzd.zze());
            jSONObject2.put("ad_request_post_body", zzebvVar.zzd.zzd());
        }
        jSONObject2.put("base_url", zzebvVar.zzd.zzb());
        jSONObject2.put("signals", zzebvVar.zzc);
        jSONObject3.put("body", zzebvVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzay.zzb().zzi(zzebvVar.zzb.zzb));
        jSONObject3.put("response_code", zzebvVar.zzb.zza);
        jSONObject3.put("latency", zzebvVar.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzebvVar.zzd.zzg());
        return jSONObject;
    }
}
