package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzege implements zzeeb {
    private final zzdqc zza;

    public zzege(zzdqc zzdqcVar) {
        this.zza = zzdqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    public final zzeec zza(String str, JSONObject jSONObject) throws zzfdj {
        return new zzeec(this.zza.zza(str, jSONObject), new zzefo(), str);
    }
}
