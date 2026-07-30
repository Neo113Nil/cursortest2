package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
class zzgse extends zzgsv implements zzgva {
    protected zzgse(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    final Collection zza(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
