package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzexj implements zzeuy {
    private final JSONObject zza;

    zzexj(Context context) {
        this.zza = zzbwk.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzla)).booleanValue() ? zzgbb.zzh(new zzeux() { // from class: com.google.android.gms.internal.ads.zzexh
            @Override // com.google.android.gms.internal.ads.zzeux
            public final void zzj(Object obj) {
            }
        }) : zzgbb.zzh(new zzeux() { // from class: com.google.android.gms.internal.ads.zzexi
            @Override // com.google.android.gms.internal.ads.zzeux
            public final void zzj(Object obj) {
                zzexj.this.zzc((JSONObject) obj);
            }
        });
    }

    final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
