package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdnd {
    private final JSONObject zza;
    private final zzdtk zzb;
    private final com.google.android.gms.ads.internal.zzb zzc;
    private final zzcce zzd;

    public zzdnd(JSONObject jSONObject, zzdtk zzdtkVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar) {
        this.zza = jSONObject;
        this.zzb = zzdtkVar;
        this.zzc = zzbVar;
        this.zzd = zzcceVar;
    }

    final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    final zzcce zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdtk zzd() {
        return this.zzb;
    }
}
