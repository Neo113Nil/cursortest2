package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfbx implements zzfav {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzgah zzc;

    public zzfbx(AdvertisingIdClient.Info info, String str, zzgah zzgahVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzgahVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
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
            zzgah zzgahVar = this.zzc;
            if (zzgahVar.zzc()) {
                zzh.put("paidv1_id_android_3p", zzgahVar.zza());
                zzh.put("paidv1_creation_time_android_3p", zzgahVar.zzb());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
