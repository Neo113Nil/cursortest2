package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbmy {
    public static void zza(zzbmz zzbmzVar, String str, Map map) {
        try {
            zzbmzVar.zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzcbn.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbmz zzbmzVar, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        zzcbn.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzbmzVar.zza(sb.toString());
    }

    public static void zzc(zzbmz zzbmzVar, String str, String str2) {
        zzbmzVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbmz zzbmzVar, String str, JSONObject jSONObject) {
        zzbmzVar.zzb(str, jSONObject.toString());
    }
}
