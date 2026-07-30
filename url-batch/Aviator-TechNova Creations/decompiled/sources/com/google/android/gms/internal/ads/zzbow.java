package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbow implements zzbox {
    final /* synthetic */ zzcen zza;

    zzbow(zzboy zzboyVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzboyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzb(String str) {
        this.zza.zzd(new zzbso(str));
    }
}
