package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzhqb extends zzhpt {
    static {
        zzhpy.zza(Collections.emptyMap());
    }

    /* synthetic */ zzhqb(Map map, zzhpz zzhpzVar) {
        super(map);
    }

    public static zzhqa zzc(int i) {
        return new zzhqa(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzc = zzhpu.zzc(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzc.put(entry.getKey(), ((zzhqg) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzc);
    }
}
