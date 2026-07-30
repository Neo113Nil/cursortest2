package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
class ObjectCountHashMap<K> {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    static final int UNSET = -1;

    @VisibleForTesting
    transient long[] entries;
    transient Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    class MapEntry extends Multisets.AbstractEntry<K> {

        @ParametricNullness
        final K key;
        int lastKnownIndex;

        MapEntry(int i8) {
            this.key = (K) ObjectCountHashMap.this.keys[i8];
            this.lastKnownIndex = i8;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            updateLastKnownIndex();
            int i8 = this.lastKnownIndex;
            if (i8 == -1) {
                return 0;
            }
            return ObjectCountHashMap.this.values[i8];
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public K getElement() {
            return this.key;
        }

        @CanIgnoreReturnValue
        public int setCount(int i8) {
            updateLastKnownIndex();
            int i9 = this.lastKnownIndex;
            if (i9 == -1) {
                ObjectCountHashMap.this.put(this.key, i8);
                return 0;
            }
            int[] iArr = ObjectCountHashMap.this.values;
            int i10 = iArr[i9];
            iArr[i9] = i8;
            return i10;
        }

        void updateLastKnownIndex() {
            int i8 = this.lastKnownIndex;
            if (i8 == -1 || i8 >= ObjectCountHashMap.this.size() || !Objects.equal(this.key, ObjectCountHashMap.this.keys[this.lastKnownIndex])) {
                this.lastKnownIndex = ObjectCountHashMap.this.indexOf(this.key);
            }
        }
    }

    ObjectCountHashMap() {
        init(3, 1.0f);
    }

    static <K> ObjectCountHashMap<K> create() {
        return new ObjectCountHashMap<>();
    }

    static <K> ObjectCountHashMap<K> createWithExpectedSize(int i8) {
        return new ObjectCountHashMap<>(i8);
    }

    private static int getHash(long j8) {
        return (int) (j8 >>> 32);
    }

    private static int getNext(long j8) {
        return (int) j8;
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    private static long[] newEntries(int i8) {
        long[] jArr = new long[i8];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] newTable(int i8) {
        int[] iArr = new int[i8];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void resizeMeMaybe(int i8) {
        int length = this.entries.length;
        if (i8 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                resizeEntries(max);
            }
        }
    }

    private void resizeTable(int i8) {
        if (this.table.length >= 1073741824) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i9 = ((int) (i8 * this.loadFactor)) + 1;
        int[] newTable = newTable(i8);
        long[] jArr = this.entries;
        int length = newTable.length - 1;
        for (int i10 = 0; i10 < this.size; i10++) {
            int hash = getHash(jArr[i10]);
            int i11 = hash & length;
            int i12 = newTable[i11];
            newTable[i11] = i10;
            jArr[i10] = (hash << 32) | (i12 & 4294967295L);
        }
        this.threshold = i9;
        this.table = newTable;
    }

    private static long swapNext(long j8, int i8) {
        return (j8 & HASH_MASK) | (4294967295L & i8);
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, 0);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1L);
        this.size = 0;
    }

    public boolean containsKey(@CheckForNull Object obj) {
        return indexOf(obj) != -1;
    }

    void ensureCapacity(int i8) {
        if (i8 > this.entries.length) {
            resizeEntries(i8);
        }
        if (i8 >= this.threshold) {
            resizeTable(Math.max(2, Integer.highestOneBit(i8 - 1) << 1));
        }
    }

    int firstIndex() {
        return this.size == 0 ? -1 : 0;
    }

    public int get(@CheckForNull Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return 0;
        }
        return this.values[indexOf];
    }

    Multiset.Entry<K> getEntry(int i8) {
        Preconditions.checkElementIndex(i8, this.size);
        return new MapEntry(i8);
    }

    @ParametricNullness
    K getKey(int i8) {
        Preconditions.checkElementIndex(i8, this.size);
        return (K) this.keys[i8];
    }

    int getValue(int i8) {
        Preconditions.checkElementIndex(i8, this.size);
        return this.values[i8];
    }

    int indexOf(@CheckForNull Object obj) {
        int smearedHash = Hashing.smearedHash(obj);
        int i8 = this.table[hashTableMask() & smearedHash];
        while (i8 != -1) {
            long j8 = this.entries[i8];
            if (getHash(j8) == smearedHash && Objects.equal(obj, this.keys[i8])) {
                return i8;
            }
            i8 = getNext(j8);
        }
        return -1;
    }

    void init(int i8, float f8) {
        Preconditions.checkArgument(i8 >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f8 > 0.0f, "Illegal load factor");
        int closedTableSize = Hashing.closedTableSize(i8, f8);
        this.table = newTable(closedTableSize);
        this.loadFactor = f8;
        this.keys = new Object[i8];
        this.values = new int[i8];
        this.entries = newEntries(i8);
        this.threshold = Math.max(1, (int) (closedTableSize * f8));
    }

    void insertEntry(int i8, @ParametricNullness K k8, int i9, int i10) {
        this.entries[i8] = (i10 << 32) | 4294967295L;
        this.keys[i8] = k8;
        this.values[i8] = i9;
    }

    void moveLastEntry(int i8) {
        int size = size() - 1;
        if (i8 >= size) {
            this.keys[i8] = null;
            this.values[i8] = 0;
            this.entries[i8] = -1;
            return;
        }
        Object[] objArr = this.keys;
        objArr[i8] = objArr[size];
        int[] iArr = this.values;
        iArr[i8] = iArr[size];
        objArr[size] = null;
        iArr[size] = 0;
        long[] jArr = this.entries;
        long j8 = jArr[size];
        jArr[i8] = j8;
        jArr[size] = -1;
        int hash = getHash(j8) & hashTableMask();
        int[] iArr2 = this.table;
        int i9 = iArr2[hash];
        if (i9 == size) {
            iArr2[hash] = i8;
            return;
        }
        while (true) {
            long j9 = this.entries[i9];
            int next = getNext(j9);
            if (next == size) {
                this.entries[i9] = swapNext(j9, i8);
                return;
            }
            i9 = next;
        }
    }

    int nextIndex(int i8) {
        int i9 = i8 + 1;
        if (i9 < this.size) {
            return i9;
        }
        return -1;
    }

    int nextIndexAfterRemove(int i8, int i9) {
        return i8 - 1;
    }

    @CanIgnoreReturnValue
    public int put(@ParametricNullness K k8, int i8) {
        CollectPreconditions.checkPositive(i8, "count");
        long[] jArr = this.entries;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int smearedHash = Hashing.smearedHash(k8);
        int hashTableMask = hashTableMask() & smearedHash;
        int i9 = this.size;
        int[] iArr2 = this.table;
        int i10 = iArr2[hashTableMask];
        if (i10 == -1) {
            iArr2[hashTableMask] = i9;
        } else {
            while (true) {
                long j8 = jArr[i10];
                if (getHash(j8) == smearedHash && Objects.equal(k8, objArr[i10])) {
                    int i11 = iArr[i10];
                    iArr[i10] = i8;
                    return i11;
                }
                int next = getNext(j8);
                if (next == -1) {
                    jArr[i10] = swapNext(j8, i9);
                    break;
                }
                i10 = next;
            }
        }
        if (i9 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i12 = i9 + 1;
        resizeMeMaybe(i12);
        insertEntry(i9, k8, i8, smearedHash);
        this.size = i12;
        if (i9 >= this.threshold) {
            resizeTable(this.table.length * 2);
        }
        this.modCount++;
        return 0;
    }

    @CanIgnoreReturnValue
    public int remove(@CheckForNull Object obj) {
        return remove(obj, Hashing.smearedHash(obj));
    }

    @CanIgnoreReturnValue
    int removeEntry(int i8) {
        return remove(this.keys[i8], getHash(this.entries[i8]));
    }

    void resizeEntries(int i8) {
        this.keys = Arrays.copyOf(this.keys, i8);
        this.values = Arrays.copyOf(this.values, i8);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i8);
        if (i8 > length) {
            Arrays.fill(copyOf, length, i8, -1L);
        }
        this.entries = copyOf;
    }

    void setValue(int i8, int i9) {
        Preconditions.checkElementIndex(i8, this.size);
        this.values[i8] = i9;
    }

    int size() {
        return this.size;
    }

    private int remove(@CheckForNull Object obj, int i8) {
        int hashTableMask = hashTableMask() & i8;
        int i9 = this.table[hashTableMask];
        if (i9 == -1) {
            return 0;
        }
        int i10 = -1;
        while (true) {
            if (getHash(this.entries[i9]) == i8 && Objects.equal(obj, this.keys[i9])) {
                int i11 = this.values[i9];
                if (i10 == -1) {
                    this.table[hashTableMask] = getNext(this.entries[i9]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i10] = swapNext(jArr[i10], getNext(jArr[i9]));
                }
                moveLastEntry(i9);
                this.size--;
                this.modCount++;
                return i11;
            }
            int next = getNext(this.entries[i9]);
            if (next == -1) {
                return 0;
            }
            i10 = i9;
            i9 = next;
        }
    }

    ObjectCountHashMap(ObjectCountHashMap<? extends K> objectCountHashMap) {
        init(objectCountHashMap.size(), 1.0f);
        int firstIndex = objectCountHashMap.firstIndex();
        while (firstIndex != -1) {
            put(objectCountHashMap.getKey(firstIndex), objectCountHashMap.getValue(firstIndex));
            firstIndex = objectCountHashMap.nextIndex(firstIndex);
        }
    }

    ObjectCountHashMap(int i8) {
        this(i8, 1.0f);
    }

    ObjectCountHashMap(int i8, float f8) {
        init(i8, f8);
    }
}
