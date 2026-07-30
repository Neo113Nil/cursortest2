package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzeml implements zzeki {
    private final zzdvp zza;

    public zzeml(zzdvp zzdvpVar) {
        this.zza = zzdvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeki
    public final zzekj zza(String str, JSONObject jSONObject) throws zzfjr {
        return new zzekj(this.zza.zza(str, jSONObject), new zzelv(), str);
    }
}
