package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbka implements zzbkb {
    final /* synthetic */ zzbzm zza;

    zzbka(zzbkc zzbkcVar, zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
        Objects.requireNonNull(zzbkcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zzb(String str) {
        this.zza.zzd(new zzbns(str));
    }
}
