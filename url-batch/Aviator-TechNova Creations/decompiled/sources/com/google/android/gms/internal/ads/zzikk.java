package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzikk extends zzikc {
    static {
        zzikh.zza(Collections.emptyMap());
    }

    /* synthetic */ zzikk(Map map, zziki zzikiVar) {
        super(map);
    }

    public static zzikj zzc(int i) {
        return new zzikj(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzc = zzikd.zzc(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzc.put(entry.getKey(), ((zzikp) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzc);
    }
}
