package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC2029k;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2077m<K, V> implements g31<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private transient Set<K> f28815b;

    /* renamed from: c, reason: collision with root package name */
    private transient Collection<V> f28816c;

    /* renamed from: d, reason: collision with root package name */
    private transient Map<K, Collection<V>> f28817d;

    /* renamed from: com.yandex.mobile.ads.impl.m$a */
    class a extends AbstractCollection<V> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC2077m f28818b;

        a(AbstractC2029k abstractC2029k) {
            this.f28818b = abstractC2029k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((AbstractC2029k) this.f28818b).d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            Iterator<V> it = ((pt0) this.f28818b.a()).values().iterator();
            while (it.hasNext()) {
                if (((Collection) it.next()).contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            AbstractC2029k abstractC2029k = (AbstractC2029k) this.f28818b;
            abstractC2029k.getClass();
            return new C2005j(abstractC2029k);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((AbstractC2029k) this.f28818b).g();
        }
    }

    AbstractC2077m() {
    }

    @Override // com.yandex.mobile.ads.impl.g31
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f28817d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> e4 = ((k31) this).e();
        this.f28817d = e4;
        return e4;
    }

    public final Set<K> b() {
        Set<K> set = this.f28815b;
        if (set != null) {
            return set;
        }
        Set<K> f4 = ((k31) this).f();
        this.f28815b = f4;
        return f4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g31)) {
            return false;
        }
        return ((AbstractC2029k.a) ((AbstractC1982i) this).a()).equals(((g31) obj).a());
    }

    public final int hashCode() {
        return ((AbstractC2029k.a) a()).f27913d.hashCode();
    }

    public final String toString() {
        return ((AbstractC2029k.a) a()).f27913d.toString();
    }

    @Override // com.yandex.mobile.ads.impl.g31
    public Collection<V> values() {
        Collection<V> collection = this.f28816c;
        if (collection != null) {
            return collection;
        }
        a aVar = new a((AbstractC2029k) this);
        this.f28816c = aVar;
        return aVar;
    }
}
