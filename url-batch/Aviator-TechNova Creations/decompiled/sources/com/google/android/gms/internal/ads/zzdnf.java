package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdnf implements zzikg {
    private final zzdnd zza;

    private zzdnf(zzdnd zzdndVar) {
        this.zza = zzdndVar;
    }

    public static zzdnf zzc(zzdnd zzdndVar) {
        return new zzdnf(zzdndVar);
    }

    public static JSONObject zzd(zzdnd zzdndVar) {
        JSONObject zzc = zzdndVar.zzc();
        zziko.zzb(zzc);
        return zzc;
    }

    public final JSONObject zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
