package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true, serializable = true)
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];

    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;

    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient ImmutableSet<K> keySet;

    @CheckForNull
    @LazyInit
    private transient ImmutableSetMultimap<K, V> multimapView;

    @RetainedWith
    @CheckForNull
    @LazyInit
    private transient ImmutableCollection<V> values;

    @DoNotMock
    public static class Builder<K, V> {
        Object[] alternatingKeysAndValues;
        DuplicateKey duplicateKey;
        boolean entriesUsed;
        int size;

        @CheckForNull
        Comparator<? super V> valueComparator;

        static final class DuplicateKey {
            private final Object key;
            private final Object value1;
            private final Object value2;

            DuplicateKey(Object obj, Object obj2, Object obj3) {
                this.key = obj;
                this.value1 = obj2;
                this.value2 = obj3;
            }

            IllegalArgumentException exception() {
                String valueOf = String.valueOf(this.key);
                String valueOf2 = String.valueOf(this.value1);
                String valueOf3 = String.valueOf(this.key);
                String valueOf4 = String.valueOf(this.value2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public Builder() {
            this(4);
        }

        private ImmutableMap<K, V> build(boolean z7) {
            Object[] objArr;
            DuplicateKey duplicateKey;
            DuplicateKey duplicateKey2;
            if (z7 && (duplicateKey2 = this.duplicateKey) != null) {
                throw duplicateKey2.exception();
            }
            int i8 = this.size;
            if (this.valueComparator == null) {
                objArr = this.alternatingKeysAndValues;
            } else {
                if (this.entriesUsed) {
                    this.alternatingKeysAndValues = Arrays.copyOf(this.alternatingKeysAndValues, i8 * 2);
                }
                objArr = this.alternatingKeysAndValues;
                if (!z7) {
                    objArr = lastEntryForEachKey(objArr, this.size);
                    if (objArr.length < this.alternatingKeysAndValues.length) {
                        i8 = objArr.length >>> 1;
                    }
                }
                sortEntries(objArr, i8, this.valueComparator);
            }
            this.entriesUsed = true;
            RegularImmutableMap create = RegularImmutableMap.create(i8, objArr, this);
            if (!z7 || (duplicateKey = this.duplicateKey) == null) {
                return create;
            }
            throw duplicateKey.exception();
        }

        private void ensureCapacity(int i8) {
            int i9 = i8 * 2;
            Object[] objArr = this.alternatingKeysAndValues;
            if (i9 > objArr.length) {
                this.alternatingKeysAndValues = Arrays.copyOf(objArr, ImmutableCollection.Builder.expandedCapacity(objArr.length, i9));
                this.entriesUsed = false;
            }
        }

        private Object[] lastEntryForEachKey(Object[] objArr, int i8) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i9 = i8 - 1; i9 >= 0; i9--) {
                Object obj = objArr[i9 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i9);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i8 - bitSet.cardinality()) * 2];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8 * 2) {
                if (bitSet.get(i10 >>> 1)) {
                    i10 += 2;
                } else {
                    int i12 = i11 + 1;
                    int i13 = i10 + 1;
                    Object obj2 = objArr[i10];
                    Objects.requireNonNull(obj2);
                    objArr2[i11] = obj2;
                    i11 += 2;
                    i10 += 2;
                    Object obj3 = objArr[i13];
                    Objects.requireNonNull(obj3);
                    objArr2[i12] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void sortEntries(Object[] objArr, int i8, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = i9 * 2;
                Object obj = objArr[i10];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i10 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i9] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i8, Ordering.from(comparator).onResultOf(Maps.valueFunction()));
            for (int i11 = 0; i11 < i8; i11++) {
                int i12 = i11 * 2;
                objArr[i12] = entryArr[i11].getKey();
                objArr[i12 + 1] = entryArr[i11].getValue();
            }
        }

        public ImmutableMap<K, V> buildKeepingLast() {
            return build(false);
        }

        public ImmutableMap<K, V> buildOrThrow() {
            return build(true);
        }

        @CanIgnoreReturnValue
        Builder<K, V> combine(Builder<K, V> builder) {
            Preconditions.checkNotNull(builder);
            ensureCapacity(this.size + builder.size);
            System.arraycopy(builder.alternatingKeysAndValues, 0, this.alternatingKeysAndValues, this.size * 2, builder.size * 2);
            this.size += builder.size;
            return this;
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            Preconditions.checkState(this.valueComparator == null, "valueComparator was already set");
            this.valueComparator = (Comparator) Preconditions.checkNotNull(comparator, "valueComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(K k8, V v7) {
            ensureCapacity(this.size + 1);
            CollectPreconditions.checkEntryNotNull(k8, v7);
            Object[] objArr = this.alternatingKeysAndValues;
            int i8 = this.size;
            objArr[i8 * 2] = k8;
            objArr[(i8 * 2) + 1] = v7;
            this.size = i8 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        Builder(int i8) {
            this.alternatingKeysAndValues = new Object[i8 * 2];
            this.size = 0;
            this.entriesUsed = false;
        }

        @CanIgnoreReturnValue
        @Beta
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                ensureCapacity(this.size + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        public ImmutableMap<K, V> build() {
            return buildOrThrow();
        }
    }

    static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        IteratorBasedImmutableMap() {
        }

        @Override // com.google.common.collect.ImmutableMap
        ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableMapEntrySet
                ImmutableMap<K, V> map() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
                public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.entryIterator();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        ImmutableSet<K> createKeySet() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        ImmutableCollection<V> createValues() {
            return new ImmutableMapValues(this);
        }

        abstract UnmodifiableIterator<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    private final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {
        private MapViewOfValuesAsSingletonSets() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
            final UnmodifiableIterator<Map.Entry<K, V>> it = ImmutableMap.this.entrySet().iterator();
            return new UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public Map.Entry<K, ImmutableSet<V>> next() {
                    final Map.Entry entry = (Map.Entry) it.next();
                    return new AbstractMapEntry<K, ImmutableSet<V>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1.1
                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public K getKey() {
                            return (K) entry.getKey();
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public ImmutableSet<V> getValue() {
                            return ImmutableSet.of(entry.getValue());
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @CheckForNull
        public ImmutableSet<V> get(@CheckForNull Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.of(obj2);
        }
    }

    static class SerializedForm<K, V> implements Serializable {
        private static final boolean USE_LEGACY_SERIALIZATION = true;
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            UnmodifiableIterator<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i8 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i8] = next.getKey();
                objArr2[i8] = next.getValue();
                i8++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object legacyReadResolve() {
            Object[] objArr = (Object[]) this.keys;
            Object[] objArr2 = (Object[]) this.values;
            Builder<K, V> makeBuilder = makeBuilder(objArr.length);
            for (int i8 = 0; i8 < objArr.length; i8++) {
                makeBuilder.put(objArr[i8], objArr2[i8]);
            }
            return makeBuilder.buildOrThrow();
        }

        Builder<K, V> makeBuilder(int i8) {
            return new Builder<>(i8);
        }

        final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                return legacyReadResolve();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
            Builder<K, V> makeBuilder = makeBuilder(immutableSet.size());
            UnmodifiableIterator it = immutableSet.iterator();
            UnmodifiableIterator it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                makeBuilder.put(it.next(), it2.next());
            }
            return makeBuilder.buildOrThrow();
        }
    }

    ImmutableMap() {
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    @Beta
    public static <K, V> Builder<K, V> builderWithExpectedSize(int i8) {
        CollectPreconditions.checkNonnegative(i8, "expectedSize");
        return new Builder<>(i8);
    }

    static void checkNoConflict(boolean z7, String str, Object obj, Object obj2) {
        if (!z7) {
            throw conflictException(str, obj, obj2);
        }
    }

    static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + valueOf.length() + valueOf2.length());
        sb.append("Multiple entries with same ");
        sb.append(str);
        sb.append(": ");
        sb.append(valueOf);
        sb.append(" and ");
        sb.append(valueOf2);
        return new IllegalArgumentException(sb.toString());
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    static <K, V> Map.Entry<K, V> entryOf(K k8, V v7) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        return new AbstractMap.SimpleImmutableEntry(k8, v7);
    }

    public static <K, V> ImmutableMap<K, V> of() {
        return (ImmutableMap<K, V>) RegularImmutableMap.EMPTY;
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.multimapView;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(), size(), null);
        this.multimapView = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    abstract ImmutableSet<K> createKeySet();

    abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        return Maps.equalsImpl(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v7) {
        V v8 = get(obj);
        return v8 != null ? v8 : v7;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    boolean isHashCodeFast() {
        return false;
    }

    abstract boolean isPartialView();

    UnmodifiableIterator<K> keyIterator() {
        final UnmodifiableIterator<Map.Entry<K, V>> it = entrySet().iterator();
        return new UnmodifiableIterator<K>(this) { // from class: com.google.common.collect.ImmutableMap.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return (K) ((Map.Entry) it.next()).getKey();
            }
        };
    }

    @Override // java.util.Map
    @CheckForNull
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final V put(K k8, V v7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.toStringImpl(this);
    }

    Object writeReplace() {
        return new SerializedForm(this);
    }

    public static <K, V> ImmutableMap<K, V> of(K k8, V v7) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        return RegularImmutableMap.create(1, new Object[]{k8, v7});
    }

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public static <K, V> ImmutableMap<K, V> of(K k8, V v7, K k9, V v8) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        return RegularImmutableMap.create(2, new Object[]{k8, v7, k9, v8});
    }

    @Beta
    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Builder builder = new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        builder.putAll(iterable);
        return builder.build();
    }

    public static <K, V> ImmutableMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        return RegularImmutableMap.create(3, new Object[]{k8, v7, k9, v8, k10, v9});
    }

    public static <K, V> ImmutableMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        return RegularImmutableMap.create(4, new Object[]{k8, v7, k9, v8, k10, v9, k11, v10});
    }

    public static <K, V> ImmutableMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        CollectPreconditions.checkEntryNotNull(k12, v11);
        return RegularImmutableMap.create(5, new Object[]{k8, v7, k9, v8, k10, v9, k11, v10, k12, v11});
    }

    public static <K, V> ImmutableMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11, K k13, V v12) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        CollectPreconditions.checkEntryNotNull(k12, v11);
        CollectPreconditions.checkEntryNotNull(k13, v12);
        return RegularImmutableMap.create(6, new Object[]{k8, v7, k9, v8, k10, v9, k11, v10, k12, v11, k13, v12});
    }

    public static <K, V> ImmutableMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11, K k13, V v12, K k14, V v13) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        CollectPreconditions.checkEntryNotNull(k12, v11);
        CollectPreconditions.checkEntryNotNull(k13, v12);
        CollectPreconditions.checkEntryNotNull(k14, v13);
        return RegularImmutableMap.create(7, new Object[]{k8, v7, k9, v8, k10, v9, k11, v10, k12, v11, k13, v12, k14, v13});
    }

    public static <K, V> ImmutableMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11, K k13, V v12, K k14, V v13, K k15, V v14) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        CollectPreconditions.checkEntryNotNull(k12, v11);
        CollectPreconditions.checkEntryNotNull(k13, v12);
        CollectPreconditions.checkEntryNotNull(k14, v13);
        CollectPreconditions.checkEntryNotNull(k15, v14);
        return RegularImmutableMap.create(8, new Object[]{k8, v7, k9, v8, k10, v9, k11, v10, k12, v11, k13, v12, k14, v13, k15, v14});
    }

    public static <K, V> ImmutableMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11, K k13, V v12, K k14, V v13, K k15, V v14, K k16, V v15) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        CollectPreconditions.checkEntryNotNull(k12, v11);
        CollectPreconditions.checkEntryNotNull(k13, v12);
        CollectPreconditions.checkEntryNotNull(k14, v13);
        CollectPreconditions.checkEntryNotNull(k15, v14);
        CollectPreconditions.checkEntryNotNull(k16, v15);
        return RegularImmutableMap.create(9, new Object[]{k8, v7, k9, v8, k10, v9, k11, v10, k12, v11, k13, v12, k14, v13, k15, v14, k16, v15});
    }

    public static <K, V> ImmutableMap<K, V> of(K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10, K k12, V v11, K k13, V v12, K k14, V v13, K k15, V v14, K k16, V v15, K k17, V v16) {
        CollectPreconditions.checkEntryNotNull(k8, v7);
        CollectPreconditions.checkEntryNotNull(k9, v8);
        CollectPreconditions.checkEntryNotNull(k10, v9);
        CollectPreconditions.checkEntryNotNull(k11, v10);
        CollectPreconditions.checkEntryNotNull(k12, v11);
        CollectPreconditions.checkEntryNotNull(k13, v12);
        CollectPreconditions.checkEntryNotNull(k14, v13);
        CollectPreconditions.checkEntryNotNull(k15, v14);
        CollectPreconditions.checkEntryNotNull(k16, v15);
        CollectPreconditions.checkEntryNotNull(k17, v16);
        return RegularImmutableMap.create(10, new Object[]{k8, v7, k9, v8, k10, v9, k11, v10, k12, v11, k13, v12, k14, v13, k15, v14, k16, v15, k17, v16});
    }
}
