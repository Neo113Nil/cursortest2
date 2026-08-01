package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcod {
    private final Map zza;
    private final Map zzb;

    zzcod(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfeh zzfehVar) throws Exception {
        for (zzfef zzfefVar : zzfehVar.zzb.zzc) {
            if (this.zza.containsKey(zzfefVar.zza)) {
                ((zzcog) this.zza.get(zzfefVar.zza)).zza(zzfefVar.zzb);
            } else if (this.zzb.containsKey(zzfefVar.zza)) {
                zzcof zzcofVar = (zzcof) this.zzb.get(zzfefVar.zza);
                JSONObject jSONObject = zzfefVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcofVar.zza(hashMap);
            }
        }
    }
}
