package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdut {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    /* synthetic */ zzdut(String str, zzdus zzdusVar) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ String zza(zzdut zzdutVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjy);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdutVar.zza);
            jSONObject.put("eventCategory", zzdutVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdutVar.zzc);
            jSONObject.putOpt("errorCode", zzdutVar.zzd);
            jSONObject.putOpt("rewardType", zzdutVar.zze);
            jSONObject.putOpt("rewardAmount", zzdutVar.zzf);
        } catch (JSONException unused) {
            zzcbn.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
