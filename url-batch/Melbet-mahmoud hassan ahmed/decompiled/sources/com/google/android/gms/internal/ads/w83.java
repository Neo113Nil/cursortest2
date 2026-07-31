package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class w83<K> extends p73<K> {

    /* renamed from: h, reason: collision with root package name */
    private final transient i73<K, ?> f13764h;

    /* renamed from: i, reason: collision with root package name */
    private final transient e73<K> f13765i;

    w83(i73<K, ?> i73Var, e73<K> e73Var) {
        this.f13764h = i73Var;
        this.f13765i = e73Var;
    }

    @Override // com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f13764h.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.z63
    final int i(Object[] objArr, int i7) {
        return this.f13765i.i(objArr, i7);
    }

    @Override // com.google.android.gms.internal.ads.p73, com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return this.f13765i.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.p73, com.google.android.gms.internal.ads.z63
    public final e73<K> l() {
        return this.f13765i;
    }

    @Override // com.google.android.gms.internal.ads.p73, com.google.android.gms.internal.ads.z63
    /* renamed from: m */
    public final h93<K> iterator() {
        return this.f13765i.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13764h.size();
    }
}
