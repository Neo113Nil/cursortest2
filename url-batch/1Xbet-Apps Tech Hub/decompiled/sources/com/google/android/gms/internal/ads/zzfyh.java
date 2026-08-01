package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfyh extends zzfwz {
    private final transient zzfwx zza;
    private final transient zzfwu zzb;

    zzfyh(zzfwx zzfwxVar, zzfwu zzfwuVar) {
        this.zza = zzfwxVar;
        this.zzb = zzfwuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwz, com.google.android.gms.internal.ads.zzfwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfwz, com.google.android.gms.internal.ads.zzfwp
    public final zzfwu zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwz, com.google.android.gms.internal.ads.zzfwp
    /* renamed from: zze */
    public final zzfyu iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    final boolean zzf() {
        throw null;
    }
}
