package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class zzhi {
    private static final zzhi zza = new zzhi();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzhm zzb = new zzgs();

    private zzhi() {
    }

    static zzhi zza() {
        return zza;
    }

    final zzhl zzb(Class cls) {
        byte[] bArr = zzga.zzb;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentMap concurrentMap = this.zzc;
        zzhl zzhlVar = (zzhl) concurrentMap.get(cls);
        if (zzhlVar == null) {
            zzhlVar = this.zzb.zza(cls);
            zzhl zzhlVar2 = (zzhl) concurrentMap.putIfAbsent(cls, zzhlVar);
            if (zzhlVar2 != null) {
                return zzhlVar2;
            }
        }
        return zzhlVar;
    }
}
