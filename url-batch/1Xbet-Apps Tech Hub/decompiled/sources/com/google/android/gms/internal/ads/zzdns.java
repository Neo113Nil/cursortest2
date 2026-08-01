package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.util.concurrent.ListenableFuture;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdns {
    private final Executor zza;
    private final zzdnn zzb;

    public zzdns(Executor executor, zzdnn zzdnnVar) {
        this.zza = executor;
        this.zzb = zzdnnVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture zzh;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgbb.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zzh = zzgbb.zzh(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zzh = zzgbb.zzh(null);
                } else {
                    String optString2 = optJSONObject.optString(LinkHeader.Parameters.Type);
                    zzh = TypedValues.Custom.S_STRING.equals(optString2) ? zzgbb.zzh(new zzdnr(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? zzgbb.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzftn() { // from class: com.google.android.gms.internal.ads.zzdnp
                        @Override // com.google.android.gms.internal.ads.zzftn
                        public final Object apply(Object obj) {
                            return new zzdnr(optString, (zzbfu) obj);
                        }
                    }, this.zza) : zzgbb.zzh(null);
                }
            }
            arrayList.add(zzh);
        }
        return zzgbb.zzm(zzgbb.zzd(arrayList), new zzftn() { // from class: com.google.android.gms.internal.ads.zzdnq
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdnr zzdnrVar : (List) obj) {
                    if (zzdnrVar != null) {
                        arrayList2.add(zzdnrVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
