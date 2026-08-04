package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzevp implements zzeun {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfti zzc;

    public zzevp(AdvertisingIdClient.Info info, String str, zzfti zzftiVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzftiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject zzh = com.google.android.gms.ads.internal.util.zzbp.zzh((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    zzh.put("pdid", str);
                    zzh.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzh.put("rdid", info.getId());
            zzh.put("is_lat", info.isLimitAdTrackingEnabled());
            zzh.put("idtype", "adid");
            zzfti zzftiVar = this.zzc;
            if (zzftiVar.zzc()) {
                zzh.put("paidv1_id_android_3p", zzftiVar.zza());
                zzh.put("paidv1_creation_time_android_3p", zzftiVar.zzb());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
