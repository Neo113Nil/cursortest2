package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
import y5.u;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    private static final byte ABSENT = -1;
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 128;
    static final ImmutableMap<Object, Object> EMPTY = new RegularImmutableMap(null, new Object[0], 0);
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 32768;
    private static final long serialVersionUID = 0;

    @VisibleForTesting
    final transient Object[] alternatingKeysAndValues;

    @CheckForNull
    private final transient Object hashTable;
    private final transient int size;

    static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient ImmutableMap<K, V> map;
        private final transient int size;

        EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i8, int i9) {
            this.map = immutableMap;
            this.alternatingKeysAndValues = objArr;
            this.keyOffset = i8;
            this.size = i9;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.map.get(key));
        }

        @Override // com.google.common.collect.ImmutableCollection
        int copyIntoArray(Object[] objArr, int i8) {
            return asList().copyIntoArray(objArr, i8);
        }

        @Override // com.google.common.collect.ImmutableSet
        ImmutableList<Map.Entry<K, V>> createAsList() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.size;
                }

                @Override // java.util.List
                public Map.Entry<K, V> get(int i8) {
                    Preconditions.checkElementIndex(i8, EntrySet.this.size);
                    int i9 = i8 * 2;
                    Object obj = EntrySet.this.alternatingKeysAndValues[EntrySet.this.keyOffset + i9];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.alternatingKeysAndValues[i9 + (EntrySet.this.keyOffset ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    static final class KeySet<K> extends ImmutableSet<K> {
        private final transient ImmutableList<K> list;
        private final transient ImmutableMap<K, ?> map;

        KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.map = immutableMap;
            this.list = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> asList() {
            return this.list;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.map.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        int copyIntoArray(Object[] objArr, int i8) {
            return asList().copyIntoArray(objArr, i8);
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<K> iterator() {
            return asList().iterator();
        }
    }

    static final class KeysOrValuesAsList extends ImmutableList<Object> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        KeysOrValuesAsList(Object[] objArr, int i8, int i9) {
            this.alternatingKeysAndValues = objArr;
            this.offset = i8;
            this.size = i9;
        }

        @Override // java.util.List
        public Object get(int i8) {
            Preconditions.checkElementIndex(i8, this.size);
            Object obj = this.alternatingKeysAndValues[(i8 * 2) + this.offset];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }
    }

    private RegularImmutableMap(@CheckForNull Object obj, Object[] objArr, int i8) {
        this.hashTable = obj;
        this.alternatingKeysAndValues = objArr;
        this.size = i8;
    }

    static <K, V> RegularImmutableMap<K, V> create(int i8, Object[] objArr) {
        return create(i8, objArr, null);
    }

    @CheckForNull
    private static Object createHashTable(Object[] objArr, int i8, int i9, int i10) {
        ImmutableMap.Builder.DuplicateKey duplicateKey = null;
        if (i8 == 1) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i10 ^ 1];
            Objects.requireNonNull(obj2);
            CollectPreconditions.checkEntryNotNull(obj, obj2);
            return null;
        }
        int i11 = i9 - 1;
        int i12 = -1;
        if (i9 <= 128) {
            byte[] bArr = new byte[i9];
            Arrays.fill(bArr, (byte) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i8; i14++) {
                int i15 = (i14 * 2) + i10;
                int i16 = (i13 * 2) + i10;
                Object obj3 = objArr[i15];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj4);
                CollectPreconditions.checkEntryNotNull(obj3, obj4);
                int smear = Hashing.smear(obj3.hashCode());
                while (true) {
                    int i17 = smear & i11;
                    int i18 = bArr[i17] & 255;
                    if (i18 == 255) {
                        bArr[i17] = (byte) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj3;
                            objArr[i16 ^ 1] = obj4;
                        }
                        i13++;
                    } else {
                        if (obj3.equals(objArr[i18])) {
                            int i19 = i18 ^ 1;
                            Object obj5 = objArr[i19];
                            Objects.requireNonNull(obj5);
                            duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj3, obj4, obj5);
                            objArr[i19] = obj4;
                            break;
                        }
                        smear = i17 + 1;
                    }
                }
            }
            return i13 == i8 ? bArr : new Object[]{bArr, Integer.valueOf(i13), duplicateKey};
        }
        if (i9 <= 32768) {
            short[] sArr = new short[i9];
            Arrays.fill(sArr, (short) -1);
            int i20 = 0;
            for (int i21 = 0; i21 < i8; i21++) {
                int i22 = (i21 * 2) + i10;
                int i23 = (i20 * 2) + i10;
                Object obj6 = objArr[i22];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i22 ^ 1];
                Objects.requireNonNull(obj7);
                CollectPreconditions.checkEntryNotNull(obj6, obj7);
                int smear2 = Hashing.smear(obj6.hashCode());
                while (true) {
                    int i24 = smear2 & i11;
                    int i25 = sArr[i24] & u.MAX_VALUE;
                    if (i25 == 65535) {
                        sArr[i24] = (short) i23;
                        if (i20 < i21) {
                            objArr[i23] = obj6;
                            objArr[i23 ^ 1] = obj7;
                        }
                        i20++;
                    } else {
                        if (obj6.equals(objArr[i25])) {
                            int i26 = i25 ^ 1;
                            Object obj8 = objArr[i26];
                            Objects.requireNonNull(obj8);
                            duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj6, obj7, obj8);
                            objArr[i26] = obj7;
                            break;
                        }
                        smear2 = i24 + 1;
                    }
                }
            }
            return i20 == i8 ? sArr : new Object[]{sArr, Integer.valueOf(i20), duplicateKey};
        }
        int[] iArr = new int[i9];
        Arrays.fill(iArr, -1);
        int i27 = 0;
        int i28 = 0;
        while (i27 < i8) {
            int i29 = (i27 * 2) + i10;
            int i30 = (i28 * 2) + i10;
            Object obj9 = objArr[i29];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i29 ^ 1];
            Objects.requireNonNull(obj10);
            CollectPreconditions.checkEntryNotNull(obj9, obj10);
            int smear3 = Hashing.smear(obj9.hashCode());
            while (true) {
                int i31 = smear3 & i11;
                int i32 = iArr[i31];
                if (i32 == i12) {
                    iArr[i31] = i30;
                    if (i28 < i27) {
                        objArr[i30] = obj9;
                        objArr[i30 ^ 1] = obj10;
                    }
                    i28++;
                } else {
                    if (obj9.equals(objArr[i32])) {
                        int i33 = i32 ^ 1;
                        Object obj11 = objArr[i33];
                        Objects.requireNonNull(obj11);
                        duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj9, obj10, obj11);
                        objArr[i33] = obj10;
                        break;
                    }
                    smear3 = i31 + 1;
                    i12 = -1;
                }
            }
            i27++;
            i12 = -1;
        }
        return i28 == i8 ? iArr : new Object[]{iArr, Integer.valueOf(i28), duplicateKey};
    }

    @CheckForNull
    static Object createHashTableOrThrow(Object[] objArr, int i8, int i9, int i10) {
        Object createHashTable = createHashTable(objArr, i8, i9, i10);
        if (createHashTable instanceof Object[]) {
            throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) createHashTable)[2]).exception();
        }
        return createHashTable;
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new EntrySet(this, this.alternatingKeysAndValues, 0, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet<K> createKeySet() {
        return new KeySet(this, new KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.size));
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableCollection<V> createValues() {
        return new KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        V v7 = (V) get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj);
        if (v7 == null) {
            return null;
        }
        return v7;
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.size;
    }

    static <K, V> RegularImmutableMap<K, V> create(int i8, Object[] objArr, ImmutableMap.Builder<K, V> builder) {
        if (i8 == 0) {
            return (RegularImmutableMap) EMPTY;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            CollectPreconditions.checkEntryNotNull(obj, obj2);
            return new RegularImmutableMap<>(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i8, objArr.length >> 1);
        Object createHashTable = createHashTable(objArr, i8, ImmutableSet.chooseTableSize(i8), 0);
        if (createHashTable instanceof Object[]) {
            Object[] objArr2 = (Object[]) createHashTable;
            ImmutableMap.Builder.DuplicateKey duplicateKey = (ImmutableMap.Builder.DuplicateKey) objArr2[2];
            if (builder == null) {
                throw duplicateKey.exception();
            }
            builder.duplicateKey = duplicateKey;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            createHashTable = obj3;
            i8 = intValue;
        }
        return new RegularImmutableMap<>(createHashTable, objArr, i8);
    }

    @CheckForNull
    static Object get(@CheckForNull Object obj, Object[] objArr, int i8, int i9, @CheckForNull Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i8 == 1) {
            Object obj3 = objArr[i9];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int smear = Hashing.smear(obj2.hashCode());
            while (true) {
                int i10 = smear & length;
                int i11 = bArr[i10] & 255;
                if (i11 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i11])) {
                    return objArr[i11 ^ 1];
                }
                smear = i10 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int smear2 = Hashing.smear(obj2.hashCode());
            while (true) {
                int i12 = smear2 & length2;
                int i13 = sArr[i12] & u.MAX_VALUE;
                if (i13 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                smear2 = i12 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int smear3 = Hashing.smear(obj2.hashCode());
            while (true) {
                int i14 = smear3 & length3;
                int i15 = iArr[i14];
                if (i15 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                smear3 = i14 + 1;
            }
        }
    }
}
