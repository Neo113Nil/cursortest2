package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeii implements zzefx {
    private final zzdrk zza;

    public zzeii(zzdrk zzdrkVar) {
        this.zza = zzdrkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefx
    public final zzefy zza(String str, JSONObject jSONObject) throws zzfev {
        return new zzefy(this.zza.zzc(str, jSONObject), new zzehr(), str);
    }
}
