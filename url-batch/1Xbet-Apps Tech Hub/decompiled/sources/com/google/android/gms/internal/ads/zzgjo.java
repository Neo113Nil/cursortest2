package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgjo {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzgjo() {
    }

    public final zzgjo zza(Enum r2, Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final zzgjq zzb() {
        return new zzgjq(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    /* synthetic */ zzgjo(zzgjn zzgjnVar) {
    }
}
