package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbkq implements zzbkr {
    final /* synthetic */ zzccf zza;

    zzbkq(zzbks zzbksVar, zzccf zzccfVar) {
        this.zza = zzccfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    public final void zza(String str) {
        this.zza.zzd(new zzboj(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
