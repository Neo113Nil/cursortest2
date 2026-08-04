package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzeae implements zzfgm {
    static final /* synthetic */ zzeae zza = new zzeae();

    private /* synthetic */ zzeae() {
    }

    @Override // com.google.android.gms.internal.ads.zzfgm
    public final /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
        com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
        return jSONObject;
    }
}
