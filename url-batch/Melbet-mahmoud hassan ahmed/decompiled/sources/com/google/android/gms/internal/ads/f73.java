package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f73<K, V> extends k73<K, V> {
    public final f73<K, V> a(K k7, V... vArr) {
        List asList = Arrays.asList(vArr);
        Collection collection = this.f7409a.get(k7);
        Iterator it = asList.iterator();
        if (collection != null) {
            while (it.hasNext()) {
                Object next = it.next();
                c63.b(k7, next);
                collection.add(next);
            }
        } else if (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                Object next2 = it.next();
                c63.b(k7, next2);
                arrayList.add(next2);
            }
            this.f7409a.put(k7, arrayList);
        }
        return this;
    }

    public final g73<K, V> b() {
        Set<Map.Entry<K, Collection<V>>> entrySet = this.f7409a.entrySet();
        if (entrySet.isEmpty()) {
            return u63.f12668k;
        }
        h73 h73Var = new h73(entrySet.size());
        int i7 = 0;
        for (Map.Entry<K, Collection<V>> entry : entrySet) {
            K key = entry.getKey();
            e73 u6 = e73.u(entry.getValue());
            if (!u6.isEmpty()) {
                h73Var.a(key, u6);
                i7 += u6.size();
            }
        }
        return new g73<>(h73Var.c(), i7);
    }
}
