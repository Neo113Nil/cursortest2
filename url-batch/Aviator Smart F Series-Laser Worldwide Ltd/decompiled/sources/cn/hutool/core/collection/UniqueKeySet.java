package cn.hutool.core.collection;

import cn.hutool.core.map.MapBuilder;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public class UniqueKeySet<K, V> extends AbstractSet<V> implements Serializable {
    private static final long serialVersionUID = 1;
    private Map<K, V> map;
    private final Function<V, K> uniqueGenerator;

    public UniqueKeySet(Function<V, K> function) {
        this(false, (Function) function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(V v7) {
        Object apply;
        Map<K, V> map = this.map;
        apply = this.uniqueGenerator.apply(v7);
        return map.put(apply, v7) == null;
    }

    public boolean addAllIfAbsent(Collection<? extends V> collection) {
        Iterator<? extends V> it = collection.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (addIfAbsent(it.next())) {
                z7 = true;
            }
        }
        return z7;
    }

    public boolean addIfAbsent(V v7) {
        Object apply;
        Object putIfAbsent;
        Map<K, V> map = this.map;
        apply = this.uniqueGenerator.apply(v7);
        putIfAbsent = map.putIfAbsent(apply, v7);
        return putIfAbsent == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.map.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object apply;
        Map<K, V> map = this.map;
        apply = this.uniqueGenerator.apply(obj);
        return map.containsKey(apply);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<V> iterator() {
        return this.map.values().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object apply;
        Map<K, V> map = this.map;
        apply = this.uniqueGenerator.apply(obj);
        return map.remove(apply) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.map.size();
    }

    public UniqueKeySet(Function<V, K> function, Collection<? extends V> collection) {
        this(false, (Function) function, (Collection) collection);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public UniqueKeySet<K, V> m86clone() {
        try {
            UniqueKeySet<K, V> uniqueKeySet = (UniqueKeySet) super.clone();
            uniqueKeySet.map = (Map) cn.hutool.core.util.e0.clone(this.map);
            return uniqueKeySet;
        } catch (CloneNotSupportedException e8) {
            throw new InternalError(e8);
        }
    }

    public UniqueKeySet(boolean z7, Function<V, K> function) {
        this(MapBuilder.create(z7), function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UniqueKeySet(boolean z7, Function<V, K> function, Collection<? extends V> collection) {
        this(z7, function);
        addAll(collection);
    }

    public UniqueKeySet(int i8, float f8, Function<V, K> function) {
        this(MapBuilder.create(new HashMap(i8, f8)), function);
    }

    public UniqueKeySet(MapBuilder<K, V> mapBuilder, Function<V, K> function) {
        this.map = mapBuilder.build();
        this.uniqueGenerator = function;
    }
}
