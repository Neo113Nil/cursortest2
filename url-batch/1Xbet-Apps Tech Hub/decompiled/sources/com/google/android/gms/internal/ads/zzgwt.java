package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgwt extends AbstractList {
    private final List zza;
    private final zzgws zzb;

    public zzgwt(List list, zzgws zzgwsVar) {
        this.zza = list;
        this.zzb = zzgwsVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzazn zzb = zzazn.zzb(((Integer) this.zza.get(i)).intValue());
        return zzb == null ? zzazn.AD_FORMAT_TYPE_UNSPECIFIED : zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
