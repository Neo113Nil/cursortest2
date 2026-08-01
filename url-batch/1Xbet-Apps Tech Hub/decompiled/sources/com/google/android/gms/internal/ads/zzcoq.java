package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcoq implements zzcog {
    private final zzdwn zza;

    zzcoq(zzdwn zzdwnVar) {
        this.zza = zzdwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcog
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziZ)).booleanValue()) {
                this.zza.zzm(jSONObject);
            }
        }
    }
}
