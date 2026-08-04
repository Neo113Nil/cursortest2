package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
abstract class zzhpt implements zzhpx {
    private final Map zza;

    zzhpt(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    final Map zza() {
        return this.zza;
    }
}
