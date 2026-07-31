package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class l73<K, V> extends z63<V> {

    /* renamed from: g, reason: collision with root package name */
    private final transient n73<K, V> f7858g;

    l73(n73<K, V> n73Var) {
        this.f7858g = n73Var;
    }

    @Override // com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f7858g.h(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.z63
    final int i(Object[] objArr, int i7) {
        i93 listIterator = ((e73) this.f7858g.f8970i.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i7 = ((z63) listIterator.next()).i(objArr, i7);
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return new j73(this.f7858g);
    }

    @Override // com.google.android.gms.internal.ads.z63
    /* renamed from: m */
    public final h93<V> iterator() {
        return new j73(this.f7858g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f7858g.f8971j;
    }
}
