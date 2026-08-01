package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
abstract class zzhdl implements zzhdp {
    private final Map zza;

    zzhdl(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    final Map zza() {
        return this.zza;
    }
}
