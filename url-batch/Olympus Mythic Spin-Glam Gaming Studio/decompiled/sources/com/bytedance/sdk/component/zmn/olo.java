package com.bytedance.sdk.component.zmn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class olo<K, V> {
    private final Map<K, V> zmn = new HashMap();
    private final Map<V, Set<K>> fs = new HashMap();

    public void zmn(Set<K> set, V v) {
        for (K k : set) {
            if (this.zmn.containsKey(k)) {
                fs(k);
            }
        }
        Set<K> set2 = this.fs.get(v);
        if (set2 == null) {
            set2 = new HashSet<>();
            this.fs.put(v, set2);
        }
        set2.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.zmn.put(it.next(), v);
        }
    }

    public V zmn(K k) {
        return this.zmn.get(k);
    }

    public void fs(K k) {
        Set<K> set;
        V remove = this.zmn.remove(k);
        if (remove == null || (set = this.fs.get(remove)) == null) {
            return;
        }
        set.remove(k);
        if (set.isEmpty()) {
            this.fs.remove(remove);
        }
    }

    public void zmn() {
        this.zmn.clear();
        this.fs.clear();
    }
}
