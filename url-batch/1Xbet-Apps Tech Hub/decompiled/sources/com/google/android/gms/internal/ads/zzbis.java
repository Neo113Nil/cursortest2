package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbis implements zzbkd {
    private final zzbit zza;

    public zzbis(zzbit zzbitVar) {
        this.zza = zzbitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            zzcbn.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbw.zza(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                zzcbn.zzh("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle == null) {
            zzcbn.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundle);
        }
    }
}
