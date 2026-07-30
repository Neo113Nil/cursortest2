package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzfus extends zzfut {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfus(zzful zzfulVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfulVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
