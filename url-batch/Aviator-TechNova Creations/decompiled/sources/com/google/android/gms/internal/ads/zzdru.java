package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdru {
    private final Executor zza;
    private final zzdrp zzb;
    private final zzdxt zzc;

    zzdru(Executor executor, zzdrp zzdrpVar, zzdxt zzdxtVar) {
        this.zza = executor;
        this.zzb = zzdrpVar;
        this.zzc = zzdxtVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture zza;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgzo.zza(Collections.emptyList());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzc.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_CUSTOM_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zza = zzgzo.zza(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zza = zzgzo.zza(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    zza = TypedValues.Custom.S_STRING.equals(optString2) ? zzgzo.zza(new zzdrr(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? zzgzo.zzk(this.zzb.zza(optJSONObject, "image_value", null), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzdrs
                        @Override // com.google.android.gms.internal.ads.zzgqt
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzdrr(optString, (zzbkd) obj);
                        }
                    }, this.zza) : zzgzo.zza(null);
                }
            }
            arrayList.add(zza);
        }
        return zzgzo.zzk(zzgzo.zzm(arrayList), zzdrt.zza, this.zza);
    }
}
