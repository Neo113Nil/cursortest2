package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;

    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient BiMap<V, K> inverse;
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;
    private transient Set<V> valueSet;
    transient V[] values;

    final class EntryForKey extends AbstractMapEntry<K, V> {
        int index;

        @ParametricNullness
        final K key;

        EntryForKey(int i8) {
            this.key = (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i8]);
            this.index = i8;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            updateIndex();
            int i8 = this.index;
            return i8 == -1 ? (V) NullnessCasts.unsafeNull() : (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i8]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v7) {
            updateIndex();
            int i8 = this.index;
            if (i8 == -1) {
                HashBiMap.this.put(this.key, v7);
                return (V) NullnessCasts.unsafeNull();
            }
            V v8 = (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i8]);
            if (Objects.equal(v8, v7)) {
                return v7;
            }
            HashBiMap.this.replaceValueInEntry(this.index, v7, false);
            return v8;
        }

        void updateIndex() {
            int i8 = this.index;
            if (i8 != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i8 <= hashBiMap.size && Objects.equal(hashBiMap.keys[i8], this.key)) {
                    return;
                }
            }
            this.index = HashBiMap.this.findEntryByKey(this.key);
        }
    }

    static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        final HashBiMap<K, V> biMap;
        int index;

        @ParametricNullness
        final V value;

        EntryForValue(HashBiMap<K, V> hashBiMap, int i8) {
            this.biMap = hashBiMap;
            this.value = (V) NullnessCasts.uncheckedCastNullableTToT(hashBiMap.values[i8]);
            this.index = i8;
        }

        private void updateIndex() {
            int i8 = this.index;
            if (i8 != -1) {
                HashBiMap<K, V> hashBiMap = this.biMap;
                if (i8 <= hashBiMap.size && Objects.equal(this.value, hashBiMap.values[i8])) {
                    return;
                }
            }
            this.index = this.biMap.findEntryByValue(this.value);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getKey() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getValue() {
            updateIndex();
            int i8 = this.index;
            return i8 == -1 ? (K) NullnessCasts.unsafeNull() : (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[i8]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K setValue(@ParametricNullness K k8) {
            updateIndex();
            int i8 = this.index;
            if (i8 == -1) {
                this.biMap.putInverse(this.value, k8, false);
                return (K) NullnessCasts.unsafeNull();
            }
            K k9 = (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[i8]);
            if (Objects.equal(k9, k8)) {
                return k8;
            }
            this.biMap.replaceKeyInEntry(this.index, k8, false);
            return k9;
        }
    }

    final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        EntrySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByKey = HashBiMap.this.findEntryByKey(key);
            return findEntryByKey != -1 && Objects.equal(value, HashBiMap.this.values[findEntryByKey]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int smearedHash = Hashing.smearedHash(key);
            int findEntryByKey = HashBiMap.this.findEntryByKey(key, smearedHash);
            if (findEntryByKey == -1 || !Objects.equal(value, HashBiMap.this.values[findEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<K, V> forEntry(int i8) {
            return new EntryForKey(i8);
        }
    }

    static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private final HashBiMap<K, V> forward;
        private transient Set<Map.Entry<V, K>> inverseEntrySet;

        Inverse(HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        @GwtIncompatible("serialization")
        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.forward).inverse = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@CheckForNull Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.inverseEntrySet;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(this.forward);
            this.inverseEntrySet = inverseEntrySet;
            return inverseEntrySet;
        }

        @Override // com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @CheckForNull
        public K forcePut(@ParametricNullness V v7, @ParametricNullness K k8) {
            return this.forward.putInverse(v7, k8, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public K get(@CheckForNull Object obj) {
            return this.forward.getInverse(obj);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        @CheckForNull
        public K put(@ParametricNullness V v7, @ParametricNullness K k8) {
            return this.forward.putInverse(v7, k8, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        @CheckForNull
        public K remove(@CheckForNull Object obj) {
            return this.forward.removeInverse(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        InverseEntrySet(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int findEntryByValue = this.biMap.findEntryByValue(key);
            return findEntryByValue != -1 && Objects.equal(this.biMap.keys[findEntryByValue], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int smearedHash = Hashing.smearedHash(key);
            int findEntryByValue = this.biMap.findEntryByValue(key, smearedHash);
            if (findEntryByValue == -1 || !Objects.equal(this.biMap.keys[findEntryByValue], value)) {
                return false;
            }
            this.biMap.removeEntryValueHashKnown(findEntryByValue, smearedHash);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<V, K> forEntry(int i8) {
            return new EntryForValue(this.biMap, i8);
        }
    }

    final class KeySet extends View<K, V, K> {
        KeySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        K forEntry(int i8) {
            return (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i8]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int smearedHash = Hashing.smearedHash(obj);
            int findEntryByKey = HashBiMap.this.findEntryByKey(obj, smearedHash);
            if (findEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(findEntryByKey, smearedHash);
            return true;
        }
    }

    final class ValueSet extends View<K, V, V> {
        ValueSet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        V forEntry(int i8) {
            return (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i8]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int smearedHash = Hashing.smearedHash(obj);
            int findEntryByValue = HashBiMap.this.findEntryByValue(obj, smearedHash);
            if (findEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(findEntryByValue, smearedHash);
            return true;
        }
    }

    static abstract class View<K, V, T> extends AbstractSet<T> {
        final HashBiMap<K, V> biMap;

        View(HashBiMap<K, V> hashBiMap) {
            this.biMap = hashBiMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.biMap.clear();
        }

        @ParametricNullness
        abstract T forEntry(int i8);

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.1
                private int expectedModCount;
                private int index;
                private int indexToRemove = -1;
                private int remaining;

                {
                    this.index = ((HashBiMap) View.this.biMap).firstInInsertionOrder;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    this.expectedModCount = hashBiMap.modCount;
                    this.remaining = hashBiMap.size;
                }

                private void checkForComodification() {
                    if (View.this.biMap.modCount != this.expectedModCount) {
                        throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    checkForComodification();
                    return this.index != -2 && this.remaining > 0;
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    T t7 = (T) View.this.forEntry(this.index);
                    this.indexToRemove = this.index;
                    this.index = ((HashBiMap) View.this.biMap).nextInInsertionOrder[this.index];
                    this.remaining--;
                    return t7;
                }

                @Override // java.util.Iterator
                public void remove() {
                    checkForComodification();
                    CollectPreconditions.checkRemove(this.indexToRemove != -1);
                    View.this.biMap.removeEntry(this.indexToRemove);
                    int i8 = this.index;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    if (i8 == hashBiMap.size) {
                        this.index = this.indexToRemove;
                    }
                    this.indexToRemove = -1;
                    this.expectedModCount = hashBiMap.modCount;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.biMap.size;
        }
    }

    private HashBiMap(int i8) {
        init(i8);
    }

    private int bucket(int i8) {
        return i8 & (this.hashTableKToV.length - 1);
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    private static int[] createFilledWithAbsent(int i8) {
        int[] iArr = new int[i8];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void deleteFromTableKToV(int i8, int i9) {
        Preconditions.checkArgument(i8 != -1);
        int bucket = bucket(i9);
        int[] iArr = this.hashTableKToV;
        int i10 = iArr[bucket];
        if (i10 == i8) {
            int[] iArr2 = this.nextInBucketKToV;
            iArr[bucket] = iArr2[i8];
            iArr2[i8] = -1;
            return;
        }
        int i11 = this.nextInBucketKToV[i10];
        while (true) {
            int i12 = i10;
            i10 = i11;
            if (i10 == -1) {
                String valueOf = String.valueOf(this.keys[i8]);
                StringBuilder sb = new StringBuilder(valueOf.length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            }
            if (i10 == i8) {
                int[] iArr3 = this.nextInBucketKToV;
                iArr3[i12] = iArr3[i8];
                iArr3[i8] = -1;
                return;
            }
            i11 = this.nextInBucketKToV[i10];
        }
    }

    private void deleteFromTableVToK(int i8, int i9) {
        Preconditions.checkArgument(i8 != -1);
        int bucket = bucket(i9);
        int[] iArr = this.hashTableVToK;
        int i10 = iArr[bucket];
        if (i10 == i8) {
            int[] iArr2 = this.nextInBucketVToK;
            iArr[bucket] = iArr2[i8];
            iArr2[i8] = -1;
            return;
        }
        int i11 = this.nextInBucketVToK[i10];
        while (true) {
            int i12 = i10;
            i10 = i11;
            if (i10 == -1) {
                String valueOf = String.valueOf(this.values[i8]);
                StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            }
            if (i10 == i8) {
                int[] iArr3 = this.nextInBucketVToK;
                iArr3[i12] = iArr3[i8];
                iArr3[i8] = -1;
                return;
            }
            i11 = this.nextInBucketVToK[i10];
        }
    }

    private void ensureCapacity(int i8) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i8) {
            int expandedCapacity = ImmutableCollection.Builder.expandedCapacity(iArr.length, i8);
            this.keys = (K[]) Arrays.copyOf(this.keys, expandedCapacity);
            this.values = (V[]) Arrays.copyOf(this.values, expandedCapacity);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, expandedCapacity);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, expandedCapacity);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, expandedCapacity);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, expandedCapacity);
        }
        if (this.hashTableKToV.length < i8) {
            int closedTableSize = Hashing.closedTableSize(i8, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(closedTableSize);
            this.hashTableVToK = createFilledWithAbsent(closedTableSize);
            for (int i9 = 0; i9 < this.size; i9++) {
                int bucket = bucket(Hashing.smearedHash(this.keys[i9]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i9] = iArr3[bucket];
                iArr3[bucket] = i9;
                int bucket2 = bucket(Hashing.smearedHash(this.values[i9]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i9] = iArr5[bucket2];
                iArr5[bucket2] = i9;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i8) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i8);
        Arrays.fill(copyOf, length, i8, -1);
        return copyOf;
    }

    private void insertIntoTableKToV(int i8, int i9) {
        Preconditions.checkArgument(i8 != -1);
        int bucket = bucket(i9);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i8] = iArr2[bucket];
        iArr2[bucket] = i8;
    }

    private void insertIntoTableVToK(int i8, int i9) {
        Preconditions.checkArgument(i8 != -1);
        int bucket = bucket(i9);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i8] = iArr2[bucket];
        iArr2[bucket] = i8;
    }

    private void moveEntryToIndex(int i8, int i9) {
        int i10;
        int i11;
        if (i8 == i9) {
            return;
        }
        int i12 = this.prevInInsertionOrder[i8];
        int i13 = this.nextInInsertionOrder[i8];
        setSucceeds(i12, i9);
        setSucceeds(i9, i13);
        K[] kArr = this.keys;
        K k8 = kArr[i8];
        V[] vArr = this.values;
        V v7 = vArr[i8];
        kArr[i9] = k8;
        vArr[i9] = v7;
        int bucket = bucket(Hashing.smearedHash(k8));
        int[] iArr = this.hashTableKToV;
        int i14 = iArr[bucket];
        if (i14 == i8) {
            iArr[bucket] = i9;
        } else {
            int i15 = this.nextInBucketKToV[i14];
            while (true) {
                i10 = i14;
                i14 = i15;
                if (i14 == i8) {
                    break;
                } else {
                    i15 = this.nextInBucketKToV[i14];
                }
            }
            this.nextInBucketKToV[i10] = i9;
        }
        int[] iArr2 = this.nextInBucketKToV;
        iArr2[i9] = iArr2[i8];
        iArr2[i8] = -1;
        int bucket2 = bucket(Hashing.smearedHash(v7));
        int[] iArr3 = this.hashTableVToK;
        int i16 = iArr3[bucket2];
        if (i16 == i8) {
            iArr3[bucket2] = i9;
        } else {
            int i17 = this.nextInBucketVToK[i16];
            while (true) {
                i11 = i16;
                i16 = i17;
                if (i16 == i8) {
                    break;
                } else {
                    i17 = this.nextInBucketVToK[i16];
                }
            }
            this.nextInBucketVToK[i11] = i9;
        }
        int[] iArr4 = this.nextInBucketVToK;
        iArr4[i9] = iArr4[i8];
        iArr4[i8] = -1;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readCount = Serialization.readCount(objectInputStream);
        init(16);
        Serialization.populateMap(this, objectInputStream, readCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int i8, @ParametricNullness K k8, boolean z7) {
        int i9;
        Preconditions.checkArgument(i8 != -1);
        int smearedHash = Hashing.smearedHash(k8);
        int findEntryByKey = findEntryByKey(k8, smearedHash);
        int i10 = this.lastInInsertionOrder;
        if (findEntryByKey == -1) {
            i9 = -2;
        } else {
            if (!z7) {
                String valueOf = String.valueOf(k8);
                StringBuilder sb = new StringBuilder(valueOf.length() + 28);
                sb.append("Key already present in map: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            i10 = this.prevInInsertionOrder[findEntryByKey];
            i9 = this.nextInInsertionOrder[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, smearedHash);
            if (i8 == this.size) {
                i8 = findEntryByKey;
            }
        }
        if (i10 == i8) {
            i10 = this.prevInInsertionOrder[i8];
        } else if (i10 == this.size) {
            i10 = findEntryByKey;
        }
        if (i9 == i8) {
            findEntryByKey = this.nextInInsertionOrder[i8];
        } else if (i9 != this.size) {
            findEntryByKey = i9;
        }
        setSucceeds(this.prevInInsertionOrder[i8], this.nextInInsertionOrder[i8]);
        deleteFromTableKToV(i8, Hashing.smearedHash(this.keys[i8]));
        this.keys[i8] = k8;
        insertIntoTableKToV(i8, Hashing.smearedHash(k8));
        setSucceeds(i10, i8);
        setSucceeds(i8, findEntryByKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int i8, @ParametricNullness V v7, boolean z7) {
        Preconditions.checkArgument(i8 != -1);
        int smearedHash = Hashing.smearedHash(v7);
        int findEntryByValue = findEntryByValue(v7, smearedHash);
        if (findEntryByValue != -1) {
            if (!z7) {
                String valueOf = String.valueOf(v7);
                StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                sb.append("Value already present in map: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            removeEntryValueHashKnown(findEntryByValue, smearedHash);
            if (i8 == this.size) {
                i8 = findEntryByValue;
            }
        }
        deleteFromTableVToK(i8, Hashing.smearedHash(this.values[i8]));
        this.values[i8] = v7;
        insertIntoTableVToK(i8, smearedHash);
    }

    private void setSucceeds(int i8, int i9) {
        if (i8 == -2) {
            this.firstInInsertionOrder = i9;
        } else {
            this.nextInInsertionOrder[i8] = i9;
        }
        if (i9 == -2) {
            this.lastInInsertionOrder = i8;
        } else {
            this.prevInInsertionOrder[i9] = i8;
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMap(this, objectOutputStream);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return findEntryByKey(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return findEntryByValue(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    int findEntry(@CheckForNull Object obj, int i8, int[] iArr, int[] iArr2, Object[] objArr) {
        int i9 = iArr[bucket(i8)];
        while (i9 != -1) {
            if (Objects.equal(objArr[i9], obj)) {
                return i9;
            }
            i9 = iArr2[i9];
        }
        return -1;
    }

    int findEntryByKey(@CheckForNull Object obj) {
        return findEntryByKey(obj, Hashing.smearedHash(obj));
    }

    int findEntryByValue(@CheckForNull Object obj) {
        return findEntryByValue(obj, Hashing.smearedHash(obj));
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @CheckForNull
    public V forcePut(@ParametricNullness K k8, @ParametricNullness V v7) {
        return put(k8, v7, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        int findEntryByKey = findEntryByKey(obj);
        if (findEntryByKey == -1) {
            return null;
        }
        return this.values[findEntryByKey];
    }

    @CheckForNull
    K getInverse(@CheckForNull Object obj) {
        int findEntryByValue = findEntryByValue(obj);
        if (findEntryByValue == -1) {
            return null;
        }
        return this.keys[findEntryByValue];
    }

    void init(int i8) {
        CollectPreconditions.checkNonnegative(i8, "expectedSize");
        int closedTableSize = Hashing.closedTableSize(i8, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i8];
        this.values = (V[]) new Object[i8];
        this.hashTableKToV = createFilledWithAbsent(closedTableSize);
        this.hashTableVToK = createFilledWithAbsent(closedTableSize);
        this.nextInBucketKToV = createFilledWithAbsent(i8);
        this.nextInBucketVToK = createFilledWithAbsent(i8);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i8);
        this.nextInInsertionOrder = createFilledWithAbsent(i8);
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.inverse;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse = new Inverse(this);
        this.inverse = inverse;
        return inverse;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(@ParametricNullness K k8, @ParametricNullness V v7) {
        return put(k8, v7, false);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    K putInverse(@ParametricNullness V v7, @ParametricNullness K k8, boolean z7) {
        int smearedHash = Hashing.smearedHash(v7);
        int findEntryByValue = findEntryByValue(v7, smearedHash);
        if (findEntryByValue != -1) {
            K k9 = this.keys[findEntryByValue];
            if (Objects.equal(k9, k8)) {
                return k8;
            }
            replaceKeyInEntry(findEntryByValue, k8, z7);
            return k9;
        }
        int i8 = this.lastInInsertionOrder;
        int smearedHash2 = Hashing.smearedHash(k8);
        int findEntryByKey = findEntryByKey(k8, smearedHash2);
        if (!z7) {
            Preconditions.checkArgument(findEntryByKey == -1, "Key already present: %s", k8);
        } else if (findEntryByKey != -1) {
            i8 = this.prevInInsertionOrder[findEntryByKey];
            removeEntryKeyHashKnown(findEntryByKey, smearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i9 = this.size;
        kArr[i9] = k8;
        this.values[i9] = v7;
        insertIntoTableKToV(i9, smearedHash2);
        insertIntoTableVToK(this.size, smearedHash);
        int i10 = i8 == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i8];
        setSucceeds(i8, this.size);
        setSucceeds(this.size, i10);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        int smearedHash = Hashing.smearedHash(obj);
        int findEntryByKey = findEntryByKey(obj, smearedHash);
        if (findEntryByKey == -1) {
            return null;
        }
        V v7 = this.values[findEntryByKey];
        removeEntryKeyHashKnown(findEntryByKey, smearedHash);
        return v7;
    }

    void removeEntry(int i8) {
        removeEntryKeyHashKnown(i8, Hashing.smearedHash(this.keys[i8]));
    }

    void removeEntryKeyHashKnown(int i8, int i9) {
        removeEntry(i8, i9, Hashing.smearedHash(this.values[i8]));
    }

    void removeEntryValueHashKnown(int i8, int i9) {
        removeEntry(i8, Hashing.smearedHash(this.keys[i8]), i9);
    }

    @CheckForNull
    K removeInverse(@CheckForNull Object obj) {
        int smearedHash = Hashing.smearedHash(obj);
        int findEntryByValue = findEntryByValue(obj, smearedHash);
        if (findEntryByValue == -1) {
            return null;
        }
        K k8 = this.keys[findEntryByValue];
        removeEntryValueHashKnown(findEntryByValue, smearedHash);
        return k8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public static <K, V> HashBiMap<K, V> create(int i8) {
        return new HashBiMap<>(i8);
    }

    private void removeEntry(int i8, int i9, int i10) {
        Preconditions.checkArgument(i8 != -1);
        deleteFromTableKToV(i8, i9);
        deleteFromTableVToK(i8, i10);
        setSucceeds(this.prevInInsertionOrder[i8], this.nextInInsertionOrder[i8]);
        moveEntryToIndex(this.size - 1, i8);
        K[] kArr = this.keys;
        int i11 = this.size;
        kArr[i11 - 1] = null;
        this.values[i11 - 1] = null;
        this.size = i11 - 1;
        this.modCount++;
    }

    int findEntryByKey(@CheckForNull Object obj, int i8) {
        return findEntry(obj, i8, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    int findEntryByValue(@CheckForNull Object obj, int i8) {
        return findEntry(obj, i8, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    @CheckForNull
    V put(@ParametricNullness K k8, @ParametricNullness V v7, boolean z7) {
        int smearedHash = Hashing.smearedHash(k8);
        int findEntryByKey = findEntryByKey(k8, smearedHash);
        if (findEntryByKey != -1) {
            V v8 = this.values[findEntryByKey];
            if (Objects.equal(v8, v7)) {
                return v7;
            }
            replaceValueInEntry(findEntryByKey, v7, z7);
            return v8;
        }
        int smearedHash2 = Hashing.smearedHash(v7);
        int findEntryByValue = findEntryByValue(v7, smearedHash2);
        if (!z7) {
            Preconditions.checkArgument(findEntryByValue == -1, "Value already present: %s", v7);
        } else if (findEntryByValue != -1) {
            removeEntryValueHashKnown(findEntryByValue, smearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i8 = this.size;
        kArr[i8] = k8;
        this.values[i8] = v7;
        insertIntoTableKToV(i8, smearedHash);
        insertIntoTableVToK(this.size, smearedHash2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> create = create(map.size());
        create.putAll(map);
        return create;
    }
}
