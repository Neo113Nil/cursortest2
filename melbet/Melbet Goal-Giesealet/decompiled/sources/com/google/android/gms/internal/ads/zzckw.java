package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzckw {
    private final Map zza;
    private final Map zzb;

    zzckw(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfcu zzfcuVar) throws Exception {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (zzfcs zzfcsVar : zzfcuVar.zzb.zzc) {
            Map map = this.zza;
            String str = zzfcsVar.zza;
            if (!map.containsKey(str) || (jSONObject2 = zzfcsVar.zzb) == null) {
                Map map2 = this.zzb;
                if (map2.containsKey(str) && (jSONObject = zzfcsVar.zzb) != null) {
                    zzcky zzckyVar = (zzcky) map2.get(str);
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = jSONObject.optString(next);
                        if (optString != null) {
                            hashMap.put(next, optString);
                        }
                    }
                    zzckyVar.zza(hashMap);
                }
            } else {
                ((zzckz) map.get(str)).zza(jSONObject2);
            }
        }
    }
}
