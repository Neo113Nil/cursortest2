package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzhdt extends zzhdl {
    private static final zzhec zza = zzhdq.zza(Collections.emptyMap());

    /* synthetic */ zzhdt(Map map, zzhdr zzhdrVar) {
        super(map);
    }

    public static zzhds zzc(int i) {
        return new zzhds(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzb = zzhdm.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhec) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
