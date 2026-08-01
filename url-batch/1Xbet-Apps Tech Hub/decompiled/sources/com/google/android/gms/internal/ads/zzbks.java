package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbks implements zzbkd {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(FacebookMediationAdapter.KEY_ID);
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzbkr zzbkrVar = (zzbkr) this.zzb.remove(str);
            if (zzbkrVar == null) {
                zzcbn.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzbkrVar.zza(str3 + concat);
                return;
            }
            if (str5 == null) {
                zzbkrVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzbkrVar.zzb(jSONObject);
            } catch (JSONException e) {
                zzbkrVar.zza(e.getMessage());
            }
        }
    }

    public final ListenableFuture zzb(zzbnk zzbnkVar, String str, JSONObject jSONObject) {
        zzccf zzccfVar = new zzccf();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbkq(this, zzccfVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FacebookMediationAdapter.KEY_ID, uuid);
            jSONObject2.put("args", jSONObject);
            zzbnkVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzccfVar.zzd(e);
        }
        return zzccfVar;
    }

    public final void zzc(String str, zzbkr zzbkrVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbkrVar);
        }
    }
}
