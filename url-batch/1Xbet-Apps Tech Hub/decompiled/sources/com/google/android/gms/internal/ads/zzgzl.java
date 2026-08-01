package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzgzl extends AbstractList implements RandomAccess, zzgxe {
    private final zzgxe zza;

    public zzgzl(zzgxe zzgxeVar) {
        this.zza = zzgxeVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzgxd) this.zza).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzgzk(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzgzj(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final zzgxe zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final Object zzf(int i) {
        return this.zza.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgxe
    public final void zzi(zzgve zzgveVar) {
        throw new UnsupportedOperationException();
    }
}
