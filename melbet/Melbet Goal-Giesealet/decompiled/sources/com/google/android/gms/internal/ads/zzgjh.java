package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgjh extends AbstractSet {
    final /* synthetic */ zzgjk zza;

    /* synthetic */ zzgjh(zzgjk zzgjkVar, byte[] bArr) {
        Objects.requireNonNull(zzgjkVar);
        this.zza = zzgjkVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgjk zzgjkVar = this.zza;
        Map zzc = zzgjkVar.zzc();
        return zzc != null ? zzc.keySet().iterator() : new zzgjc(zzgjkVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        zzgjk zzgjkVar = this.zza;
        Map zzc = zzgjkVar.zzc();
        if (zzc != null) {
            return zzc.keySet().remove(obj);
        }
        Object zzj = zzgjkVar.zzj(obj);
        obj2 = zzgjk.zzd;
        return zzj != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
