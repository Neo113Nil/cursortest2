package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfmz {
    private JSONObject zza;
    private final zzfni zzb;

    public zzfmz(zzfni zzfniVar) {
        this.zzb = zzfniVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfnj(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfnk(this, hashSet, jSONObject, j));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfnl(this, hashSet, jSONObject, j));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
