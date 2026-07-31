package io.opentelemetry.sdk.metrics.internal.state;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class PooledHashMap<K, V> implements Map<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;
    private final ObjectPool<Entry<K, V>> entryPool;
    private int size;
    private ArrayList<Entry<K, V>>[] table;

    public PooledHashMap(int i) {
        this.table = new ArrayList[i];
        this.entryPool = new ObjectPool<>(new Supplier() { // from class: io.opentelemetry.sdk.metrics.internal.state.PooledHashMap$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return PooledHashMap.lambda$new$0();
            }
        });
        this.size = 0;
    }

    static /* synthetic */ Entry lambda$new$0() {
        return new Entry();
    }

    public PooledHashMap() {
        this(16);
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k, V v) {
        Objects.requireNonNull(k, "This map does not support null keys");
        Objects.requireNonNull(v, "This map does not support null values");
        if (this.size > this.table.length * 0.75f) {
            rehash();
        }
        int bucket = getBucket(k);
        ArrayList<Entry<K, V>> arrayList = this.table[bucket];
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.table[bucket] = arrayList;
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                Entry<K, V> entry = arrayList.get(i);
                if (Objects.equals(entry.key, k)) {
                    V v2 = entry.value;
                    entry.value = v;
                    return v2;
                }
            }
        }
        Entry<K, V> borrowObject = this.entryPool.borrowObject();
        borrowObject.key = k;
        borrowObject.value = v;
        arrayList.add(borrowObject);
        this.size++;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void rehash() {
        ArrayList<Entry<K, V>>[] arrayListArr = this.table;
        this.table = new ArrayList[arrayListArr.length * 2];
        this.size = 0;
        for (ArrayList<Entry<K, V>> arrayList : arrayListArr) {
            if (arrayList != null) {
                Iterator<Entry<K, V>> it = arrayList.iterator();
                while (it.hasNext()) {
                    Entry<K, V> next = it.next();
                    put(Objects.requireNonNull(next.key), Objects.requireNonNull(next.value));
                    this.entryPool.returnObject(next);
                }
                arrayList.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        Objects.requireNonNull(obj, "This map does not support null keys");
        ArrayList<Entry<K, V>> arrayList = this.table[getBucket(obj)];
        if (arrayList == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Entry<K, V> entry = arrayList.get(i);
            if (Objects.equals(entry.key, obj)) {
                return entry.value;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        Objects.requireNonNull(obj, "This map does not support null keys");
        ArrayList<Entry<K, V>> arrayList = this.table[getBucket(obj)];
        if (arrayList == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Entry<K, V> entry = arrayList.get(i);
            if (Objects.equals(entry.key, obj)) {
                V v = entry.value;
                arrayList.remove(i);
                this.entryPool.returnObject(entry);
                this.size--;
                return v;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        Objects.requireNonNull(obj, "This map does not support null keys");
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public void clear() {
        int i = 0;
        while (true) {
            ArrayList<Entry<K, V>>[] arrayListArr = this.table;
            if (i < arrayListArr.length) {
                ArrayList<Entry<K, V>> arrayList = arrayListArr[i];
                if (arrayList != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        this.entryPool.returnObject(arrayList.get(i2));
                    }
                    arrayList.clear();
                }
                i++;
            } else {
                this.size = 0;
                return;
            }
        }
    }

    @Override // java.util.Map
    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        int i = 0;
        while (true) {
            ArrayList<Entry<K, V>>[] arrayListArr = this.table;
            if (i >= arrayListArr.length) {
                return;
            }
            ArrayList<Entry<K, V>> arrayList = arrayListArr[i];
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Entry<K, V> entry = arrayList.get(i2);
                    biConsumer.accept(entry.key, entry.value);
                }
            }
            i++;
        }
    }

    private int getBucket(K k) {
        return Math.abs(k.hashCode() % this.table.length);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Entry<K, V> {

        @Nullable
        K key;

        @Nullable
        V value;

        private Entry() {
        }
    }
}
