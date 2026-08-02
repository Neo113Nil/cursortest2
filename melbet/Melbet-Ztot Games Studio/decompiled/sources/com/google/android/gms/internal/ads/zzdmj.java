package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzdmj {
    private final Executor zza;
    private final zzdme zzb;

    public zzdmj(Executor executor, zzdme zzdmeVar) {
        this.zza = executor;
        this.zzb = zzdmeVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture zzh;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgcj.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zzh = zzgcj.zzh(null);
            } else {
                final String optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (optString == null) {
                    zzh = zzgcj.zzh(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    zzh = TypedValues.Custom.S_STRING.equals(optString2) ? zzgcj.zzh(new zzdmi(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? zzgcj.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzful() { // from class: com.google.android.gms.internal.ads.zzdmg
                        @Override // com.google.android.gms.internal.ads.zzful
                        public final Object apply(Object obj) {
                            return new zzdmi(optString, (zzbeq) obj);
                        }
                    }, this.zza) : zzgcj.zzh(null);
                }
            }
            arrayList.add(zzh);
        }
        return zzgcj.zzm(zzgcj.zzd(arrayList), new zzful() { // from class: com.google.android.gms.internal.ads.zzdmh
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdmi zzdmiVar : (List) obj) {
                    if (zzdmiVar != null) {
                        arrayList2.add(zzdmiVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
