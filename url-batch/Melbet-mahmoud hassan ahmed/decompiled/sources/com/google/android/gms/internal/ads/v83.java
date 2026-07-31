package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class v83<K, V> extends p73<Map.Entry<K, V>> {

    /* renamed from: h, reason: collision with root package name */
    private final transient i73<K, V> f13159h;

    /* renamed from: i, reason: collision with root package name */
    private final transient Object[] f13160i;

    /* renamed from: j, reason: collision with root package name */
    private final transient int f13161j;

    v83(i73<K, V> i73Var, Object[] objArr, int i7, int i8) {
        this.f13159h = i73Var;
        this.f13160i = objArr;
        this.f13161j = i8;
    }

    @Override // com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f13159h.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z63
    final int i(Object[] objArr, int i7) {
        return l().i(objArr, i7);
    }

    @Override // com.google.android.gms.internal.ads.p73, com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.p73, com.google.android.gms.internal.ads.z63
    /* renamed from: m */
    public final h93<Map.Entry<K, V>> iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.p73
    final e73<Map.Entry<K, V>> q() {
        return new u83(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13161j;
    }
}
