package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcqj {
    private final Map zza;
    private final Map zzb;

    zzcqj(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfjc zzfjcVar) throws Exception {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (zzfja zzfjaVar : zzfjcVar.zzb.zzc) {
            Map map = this.zza;
            String str = zzfjaVar.zza;
            if (!map.containsKey(str) || (jSONObject2 = zzfjaVar.zzb) == null) {
                Map map2 = this.zzb;
                if (map2.containsKey(str) && (jSONObject = zzfjaVar.zzb) != null) {
                    zzcql zzcqlVar = (zzcql) map2.get(str);
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = jSONObject.optString(next);
                        if (optString != null) {
                            hashMap.put(next, optString);
                        }
                    }
                    zzcqlVar.zza(hashMap);
                }
            } else {
                ((zzcqm) map.get(str)).zza(jSONObject2);
            }
        }
    }
}
