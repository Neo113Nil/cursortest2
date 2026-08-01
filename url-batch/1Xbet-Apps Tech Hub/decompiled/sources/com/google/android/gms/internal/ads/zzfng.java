package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzfng extends zzfnh {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfng(zzfmz zzfmzVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfmzVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
