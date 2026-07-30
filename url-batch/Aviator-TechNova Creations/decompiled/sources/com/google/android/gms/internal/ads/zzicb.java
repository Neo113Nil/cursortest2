package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzicb extends AbstractList {
    private final zzibz zza;
    private final zzica zzb;

    public zzicb(zzibz zzibzVar, zzica zzicaVar) {
        this.zza = zzibzVar;
        this.zzb = zzicaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.zzb.zzb(this.zza.zzf(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
