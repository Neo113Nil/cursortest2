package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgye {
    private static final zzgye zza = new zzgye();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgyq zzb = new zzgxo();

    private zzgye() {
    }

    public static zzgye zza() {
        return zza;
    }

    public final zzgyp zzb(Class cls) {
        zzgww.zzc(cls, "messageType");
        zzgyp zzgypVar = (zzgyp) this.zzc.get(cls);
        if (zzgypVar == null) {
            zzgypVar = this.zzb.zza(cls);
            zzgww.zzc(cls, "messageType");
            zzgyp zzgypVar2 = (zzgyp) this.zzc.putIfAbsent(cls, zzgypVar);
            if (zzgypVar2 != null) {
                return zzgypVar2;
            }
        }
        return zzgypVar;
    }
}
