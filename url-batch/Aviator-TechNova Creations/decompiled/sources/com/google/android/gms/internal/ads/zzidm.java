package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzidm {
    private static final zzidm zza = new zzidm();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzidv zzb = new zzict();

    private zzidm() {
    }

    static zzidm zza() {
        return zza;
    }

    final zzidu zzb(Class cls) {
        zzice.zza(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzc;
        zzidu zziduVar = (zzidu) concurrentMap.get(cls);
        if (zziduVar == null) {
            zziduVar = this.zzb.zza(cls);
            zzidu zziduVar2 = (zzidu) concurrentMap.putIfAbsent(cls, zziduVar);
            if (zziduVar2 != null) {
                return zziduVar2;
            }
        }
        return zziduVar;
    }
}
