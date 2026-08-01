package com.google.android.gms.internal.ads;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzeyg implements zzeuy {
    public static final /* synthetic */ zzeyg zza = new zzeyg();

    private /* synthetic */ zzeyg() {
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return zzgbb.zzh(new zzeux() { // from class: com.google.android.gms.internal.ads.zzeyh
            @Override // com.google.android.gms.internal.ads.zzeux
            public final void zzj(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
