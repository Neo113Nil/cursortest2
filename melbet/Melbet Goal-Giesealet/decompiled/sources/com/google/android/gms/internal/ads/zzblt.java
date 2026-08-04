package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzblt implements InitializationStatus {
    private final Map zza;

    public zzblt(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map<String, AdapterStatus> getAdapterStatusMap() {
        return this.zza;
    }
}
