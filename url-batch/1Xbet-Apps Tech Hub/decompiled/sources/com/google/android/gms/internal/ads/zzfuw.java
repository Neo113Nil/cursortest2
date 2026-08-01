package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
class zzfuw extends zzfvn implements zzfxf {
    protected zzfuw(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    /* bridge */ /* synthetic */ Collection zza() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfvn
    final Collection zzb(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    final Collection zzc(Object obj, Collection collection) {
        return zzh(obj, (List) collection, null);
    }
}
