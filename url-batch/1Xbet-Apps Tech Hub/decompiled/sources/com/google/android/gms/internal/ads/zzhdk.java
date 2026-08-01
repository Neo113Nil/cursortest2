package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzhdk {
    final LinkedHashMap zza;

    zzhdk(int i) {
        this.zza = zzhdm.zzb(i);
    }

    final zzhdk zza(Object obj, zzhec zzhecVar) {
        zzhdx.zza(obj, "key");
        zzhdx.zza(zzhecVar, "provider");
        this.zza.put(obj, zzhecVar);
        return this;
    }
}
