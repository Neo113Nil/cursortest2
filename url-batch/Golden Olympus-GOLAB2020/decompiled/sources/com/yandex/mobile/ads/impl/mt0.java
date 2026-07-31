package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC2029k;
import com.yandex.mobile.ads.impl.lx1;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class mt0<K, V> extends lx1.c<Map.Entry<K, V>> {
    mt0() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractC2029k.a.this.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return AbstractC2029k.a.this.isEmpty();
    }

    @Override // com.yandex.mobile.ads.impl.lx1.c, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator<?> it = collection.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                z4 |= ((AbstractC2029k.a.C0196a) this).remove(it.next());
            }
            return z4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.lx1.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        int i4;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                cq.a(size, "expectedSize");
                i4 = size + 1;
            } else {
                i4 = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i4);
            for (Object obj : collection) {
                Set<Map.Entry<K, Collection<V>>> entrySet = AbstractC2029k.a.this.f27913d.entrySet();
                entrySet.getClass();
                try {
                    if (entrySet.contains(obj) && (obj instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) obj).getKey());
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return AbstractC2029k.a.this.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return AbstractC2029k.a.this.f27913d.size();
    }
}
