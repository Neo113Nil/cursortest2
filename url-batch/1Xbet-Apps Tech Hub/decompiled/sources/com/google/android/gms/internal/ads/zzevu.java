package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzevu implements zzeux {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfqw zzc;

    public zzevu(AdvertisingIdClient.Info info, String str, zzfqw zzfqwVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbw.zzf((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    zzf.put("pdid", str);
                    zzf.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            zzf.put("rdid", this.zza.getId());
            zzf.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            zzf.put("idtype", "adid");
            zzfqw zzfqwVar = this.zzc;
            if (zzfqwVar.zzc()) {
                zzf.put("paidv1_id_android_3p", zzfqwVar.zzb());
                zzf.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
