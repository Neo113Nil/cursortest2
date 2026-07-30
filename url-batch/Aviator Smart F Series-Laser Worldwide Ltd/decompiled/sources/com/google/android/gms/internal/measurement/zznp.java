package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes3.dex */
public final class zznp extends AbstractList implements RandomAccess, zzlq {
    private final zzlq zza;

    public zznp(zzlq zzlqVar) {
        this.zza = zzlqVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        return ((zzlp) this.zza).get(i8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzno(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i8) {
        return new zznn(this, i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final zzlq zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final Object zzf(int i8) {
        return this.zza.zzf(i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzlq
    public final void zzi(zzka zzkaVar) {
        throw new UnsupportedOperationException();
    }
}
