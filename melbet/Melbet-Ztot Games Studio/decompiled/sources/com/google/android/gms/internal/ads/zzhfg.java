package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzhfg extends zzhey {
    static {
        zzhfd.zza(Collections.emptyMap());
    }

    /* synthetic */ zzhfg(Map map, zzhfe zzhfeVar) {
        super(map);
    }

    public static zzhff zzc(int i) {
        return new zzhff(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzb = zzhez.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhfl) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
