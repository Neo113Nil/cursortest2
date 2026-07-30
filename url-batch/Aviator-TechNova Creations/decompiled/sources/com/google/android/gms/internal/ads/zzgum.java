package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgum extends zzgub {
    private final transient zzgun zza;

    zzgum(zzgun zzgunVar) {
        this.zza = zzgunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzguk(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    /* renamed from: zza */
    public final zzgwt iterator() {
        return new zzguk(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgub
    final int zzg(Object[] objArr, int i) {
        zzgwu listIterator = ((zzguf) this.zza.map.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i = ((zzgub) listIterator.next()).zzg(objArr, i);
        }
        return i;
    }
}
