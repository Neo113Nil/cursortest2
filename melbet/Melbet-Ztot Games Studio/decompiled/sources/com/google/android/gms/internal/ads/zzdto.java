package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzdto {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    /* synthetic */ zzdto(String str, zzdtn zzdtnVar) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ String zza(zzdto zzdtoVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjd);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdtoVar.zza);
            jSONObject.put("eventCategory", zzdtoVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdtoVar.zzc);
            jSONObject.putOpt("errorCode", zzdtoVar.zzd);
            jSONObject.putOpt("rewardType", zzdtoVar.zze);
            jSONObject.putOpt("rewardAmount", zzdtoVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
