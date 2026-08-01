package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeyo implements zzeux {
    private final String zza;

    public zzeyo(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (TextUtils.isEmpty(this.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zzbw.zzf(jSONObject, "pii").put("adsid", this.zza);
        } catch (JSONException e) {
            zzcbn.zzk("Failed putting trustless token.", e);
        }
    }
}
