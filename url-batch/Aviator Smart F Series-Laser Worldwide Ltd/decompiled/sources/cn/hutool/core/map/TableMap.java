package cn.hutool.core.map;

import cn.hutool.core.collection.CollUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public class TableMap<K, V> implements Map<K, V>, Iterable<Map.Entry<K, V>>, Serializable {
    private static final int DEFAULT_CAPACITY = 10;
    private static final long serialVersionUID = 1;
    private final List<K> keys;
    private final List<V> values;

    class a implements Iterator {
        private final Iterator<K> keysIter;
        private final Iterator<V> valuesIter;

        a() {
            this.keysIter = TableMap.this.keys.iterator();
            this.valuesIter = TableMap.this.values.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.keysIter.hasNext() && this.valuesIter.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.keysIter.remove();
            this.valuesIter.remove();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            return h1.entry(this.keysIter.next(), this.valuesIter.next());
        }
    }

    public TableMap() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getKeys$1(Object obj, Object obj2) {
        return cn.hutool.core.util.e0.equal(obj2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getValues$0(Object obj, Object obj2) {
        return cn.hutool.core.util.e0.equal(obj2, obj);
    }

    @Override // java.util.Map
    public void clear() {
        this.keys.clear();
        this.values.clear();
    }

    @Override // java.util.Map
    public V computeIfPresent(K k8, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        Object apply;
        V v7 = null;
        if (biFunction == null) {
            return null;
        }
        int i8 = 0;
        while (i8 < size()) {
            if (cn.hutool.core.util.e0.equals(k8, this.keys.get(i8))) {
                apply = biFunction.apply(k8, this.values.get(i8));
                if (apply != null) {
                    v7 = (V) this.values.set(i8, apply);
                } else {
                    removeByIndex(i8);
                    i8--;
                }
            }
            i8++;
        }
        return v7;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.keys.contains(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.values.contains(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i8 = 0; i8 < size(); i8++) {
            linkedHashSet.add(h1.entry(this.keys.get(i8), this.values.get(i8)));
        }
        return linkedHashSet;
    }

    @Override // java.util.Map
    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        for (int i8 = 0; i8 < size(); i8++) {
            biConsumer.accept(this.keys.get(i8), this.values.get(i8));
        }
    }

    @Override // java.util.Map
    public V get(Object obj) {
        int indexOf = this.keys.indexOf(obj);
        if (indexOf > -1) {
            return this.values.get(indexOf);
        }
        return null;
    }

    public K getKey(V v7) {
        int indexOf = this.values.indexOf(v7);
        if (indexOf > -1) {
            return this.keys.get(indexOf);
        }
        return null;
    }

    public List<K> getKeys(final V v7) {
        return CollUtil.getAny(this.keys, cn.hutool.core.collection.n0.indexOfAll(this.values, new cn.hutool.core.lang.d0() { // from class: cn.hutool.core.map.d2
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                boolean lambda$getKeys$1;
                lambda$getKeys$1 = TableMap.lambda$getKeys$1(v7, obj);
                return lambda$getKeys$1;
            }
        }));
    }

    public List<V> getValues(final K k8) {
        return CollUtil.getAny(this.values, cn.hutool.core.collection.n0.indexOfAll(this.keys, new cn.hutool.core.lang.d0() { // from class: cn.hutool.core.map.e2
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                boolean lambda$getValues$0;
                lambda$getValues$0 = TableMap.lambda$getValues$0(k8, obj);
                return lambda$getValues$0;
            }
        }));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return CollUtil.isEmpty((Collection<?>) this.keys);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new a();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return new HashSet(this.keys);
    }

    public List<K> keys() {
        return Collections.unmodifiableList(this.keys);
    }

    @Override // java.util.Map
    public V put(K k8, V v7) {
        this.keys.add(k8);
        this.values.add(v7);
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        V v7 = null;
        while (true) {
            int indexOf = this.keys.indexOf(obj);
            if (indexOf <= -1) {
                return v7;
            }
            v7 = removeByIndex(indexOf);
        }
    }

    public V removeByIndex(int i8) {
        this.keys.remove(i8);
        return this.values.remove(i8);
    }

    @Override // java.util.Map
    public boolean replace(K k8, V v7, V v8) {
        for (int i8 = 0; i8 < size(); i8++) {
            if (cn.hutool.core.util.e0.equals(k8, this.keys.get(i8)) && cn.hutool.core.util.e0.equals(v7, this.values.get(i8))) {
                this.values.set(i8, v8);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        Object apply;
        for (int i8 = 0; i8 < size(); i8++) {
            apply = biFunction.apply(this.keys.get(i8), this.values.get(i8));
            this.values.set(i8, apply);
        }
    }

    @Override // java.util.Map
    public int size() {
        return this.keys.size();
    }

    public String toString() {
        return "TableMap{keys=" + this.keys + ", values=" + this.values + '}';
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return Collections.unmodifiableList(this.values);
    }

    public TableMap(int i8) {
        this.keys = new ArrayList(i8);
        this.values = new ArrayList(i8);
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        int i8 = 0;
        boolean z7 = false;
        while (i8 < size()) {
            if (cn.hutool.core.util.e0.equals(obj, this.keys.get(i8)) && cn.hutool.core.util.e0.equals(obj2, this.values.get(i8))) {
                removeByIndex(i8);
                i8--;
                z7 = true;
            }
            i8++;
        }
        return z7;
    }

    @Override // java.util.Map
    public V replace(K k8, V v7) {
        V v8 = null;
        for (int i8 = 0; i8 < size(); i8++) {
            if (cn.hutool.core.util.e0.equals(k8, this.keys.get(i8))) {
                v8 = this.values.set(i8, v7);
            }
        }
        return v8;
    }

    public TableMap(K[] kArr, V[] vArr) {
        this.keys = CollUtil.toList(kArr);
        this.values = CollUtil.toList(vArr);
    }
}
