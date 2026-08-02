package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbjn implements zzbix {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzbjm zzbjmVar = (zzbjm) this.zzb.remove(str);
            if (zzbjmVar == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzbjmVar.zza(str3 + concat);
                return;
            }
            if (str5 == null) {
                zzbjmVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzbjmVar.zzb(jSONObject);
            } catch (JSONException e) {
                zzbjmVar.zza(e.getMessage());
            }
        }
    }

    public final ListenableFuture zzb(zzbme zzbmeVar, String str, JSONObject jSONObject) {
        zzbzt zzbztVar = new zzbzt();
        com.google.android.gms.ads.internal.zzu.zzp();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbjl(this, zzbztVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbmeVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzbztVar.zzd(e);
        }
        return zzbztVar;
    }

    public final void zzc(String str, zzbjm zzbjmVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbjmVar);
        }
    }
}
