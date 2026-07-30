package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.u;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    @VisibleForTesting
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;

    @VisibleForTesting
    @CheckForNull
    transient Object[] elements;

    @CheckForNull
    private transient int[] entries;
    private transient int metadata;
    private transient int size;

    @CheckForNull
    private transient Object table;

    CompactHashSet() {
        init(3);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    private Set<E> createHashFloodingResistantDelegate(int i8) {
        return new LinkedHashSet(i8, 1.0f);
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i8) {
        return new CompactHashSet<>(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E element(int i8) {
        return (E) requireElements()[i8];
    }

    private int entry(int i8) {
        return requireEntries()[i8];
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(readInt);
            throw new InvalidObjectException(sb.toString());
        }
        init(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            add(objectInputStream.readObject());
        }
    }

    private Object[] requireElements() {
        Object[] objArr = this.elements;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] requireEntries() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object requireTable() {
        Object obj = this.table;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void resizeMeMaybe(int i8) {
        int min;
        int length = requireEntries().length;
        if (i8 <= length || (min = Math.min(u.MAX_CAPACITY_MASK, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(min);
    }

    @CanIgnoreReturnValue
    private int resizeTable(int i8, int i9, int i10, int i11) {
        Object createTable = CompactHashing.createTable(i9);
        int i12 = i9 - 1;
        if (i11 != 0) {
            CompactHashing.tableSet(createTable, i10 & i12, i11 + 1);
        }
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        for (int i13 = 0; i13 <= i8; i13++) {
            int tableGet = CompactHashing.tableGet(requireTable, i13);
            while (tableGet != 0) {
                int i14 = tableGet - 1;
                int i15 = requireEntries[i14];
                int hashPrefix = CompactHashing.getHashPrefix(i15, i8) | i13;
                int i16 = hashPrefix & i12;
                int tableGet2 = CompactHashing.tableGet(createTable, i16);
                CompactHashing.tableSet(createTable, i16, tableGet);
                requireEntries[i14] = CompactHashing.maskCombine(hashPrefix, tableGet2, i12);
                tableGet = CompactHashing.getNext(i15, i8);
            }
        }
        this.table = createTable;
        setHashTableMask(i12);
        return i12;
    }

    private void setElement(int i8, E e8) {
        requireElements()[i8] = e8;
    }

    private void setEntry(int i8, int i9) {
        requireEntries()[i8] = i9;
    }

    private void setHashTableMask(int i8) {
        this.metadata = CompactHashing.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i8), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e8) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.add(e8);
        }
        int[] requireEntries = requireEntries();
        Object[] requireElements = requireElements();
        int i8 = this.size;
        int i9 = i8 + 1;
        int smearedHash = Hashing.smearedHash(e8);
        int hashTableMask = hashTableMask();
        int i10 = smearedHash & hashTableMask;
        int tableGet = CompactHashing.tableGet(requireTable(), i10);
        if (tableGet != 0) {
            int hashPrefix = CompactHashing.getHashPrefix(smearedHash, hashTableMask);
            int i11 = 0;
            while (true) {
                int i12 = tableGet - 1;
                int i13 = requireEntries[i12];
                if (CompactHashing.getHashPrefix(i13, hashTableMask) == hashPrefix && com.google.common.base.Objects.equal(e8, requireElements[i12])) {
                    return false;
                }
                int next = CompactHashing.getNext(i13, hashTableMask);
                i11++;
                if (next != 0) {
                    tableGet = next;
                } else {
                    if (i11 >= 9) {
                        return convertToHashFloodingResistantImplementation().add(e8);
                    }
                    if (i9 > hashTableMask) {
                        hashTableMask = resizeTable(hashTableMask, CompactHashing.newCapacity(hashTableMask), smearedHash, i8);
                    } else {
                        requireEntries[i12] = CompactHashing.maskCombine(i13, i9, hashTableMask);
                    }
                }
            }
        } else if (i9 > hashTableMask) {
            hashTableMask = resizeTable(hashTableMask, CompactHashing.newCapacity(hashTableMask), smearedHash, i8);
        } else {
            CompactHashing.tableSet(requireTable(), i10, i9);
        }
        resizeMeMaybe(i9);
        insertEntry(i8, e8, smearedHash, hashTableMask);
        this.size = i9;
        incrementModCount();
        return true;
    }

    int adjustAfterRemove(int i8, int i9) {
        return i8 - 1;
    }

    @CanIgnoreReturnValue
    int allocArrays() {
        Preconditions.checkState(needsAllocArrays(), "Arrays already allocated");
        int i8 = this.metadata;
        int tableSize = CompactHashing.tableSize(i8);
        this.table = CompactHashing.createTable(tableSize);
        setHashTableMask(tableSize - 1);
        this.entries = new int[i8];
        this.elements = new Object[i8];
        return i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            this.metadata = Ints.constrainToRange(size(), 3, u.MAX_CAPACITY_MASK);
            delegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireElements(), 0, this.size, (Object) null);
        CompactHashing.tableClear(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.contains(obj);
        }
        int smearedHash = Hashing.smearedHash(obj);
        int hashTableMask = hashTableMask();
        int tableGet = CompactHashing.tableGet(requireTable(), smearedHash & hashTableMask);
        if (tableGet == 0) {
            return false;
        }
        int hashPrefix = CompactHashing.getHashPrefix(smearedHash, hashTableMask);
        do {
            int i8 = tableGet - 1;
            int entry = entry(i8);
            if (CompactHashing.getHashPrefix(entry, hashTableMask) == hashPrefix && com.google.common.base.Objects.equal(obj, element(i8))) {
                return true;
            }
            tableGet = CompactHashing.getNext(entry, hashTableMask);
        } while (tableGet != 0);
        return false;
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.add(element(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.table = createHashFloodingResistantDelegate;
        this.entries = null;
        this.elements = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    @VisibleForTesting
    @CheckForNull
    Set<E> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    int getSuccessor(int i8) {
        int i9 = i8 + 1;
        if (i9 < this.size) {
            return i9;
        }
        return -1;
    }

    void incrementModCount() {
        this.metadata += 32;
    }

    void init(int i8) {
        Preconditions.checkArgument(i8 >= 0, "Expected size must be >= 0");
        this.metadata = Ints.constrainToRange(i8, 1, u.MAX_CAPACITY_MASK);
    }

    void insertEntry(int i8, @ParametricNullness E e8, int i9, int i10) {
        setEntry(i8, CompactHashing.maskCombine(i9, 0, i10));
        setElement(i8, e8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @VisibleForTesting
    boolean isUsingHashFloodingResistance() {
        return delegateOrNull() != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.iterator() : new Iterator<E>() { // from class: com.google.common.collect.CompactHashSet.1
            int currentIndex;
            int expectedMetadata;
            int indexToRemove = -1;

            {
                this.expectedMetadata = CompactHashSet.this.metadata;
                this.currentIndex = CompactHashSet.this.firstEntryIndex();
            }

            private void checkForConcurrentModification() {
                if (CompactHashSet.this.metadata != this.expectedMetadata) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.currentIndex >= 0;
            }

            void incrementExpectedModCount() {
                this.expectedMetadata += 32;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public E next() {
                checkForConcurrentModification();
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i8 = this.currentIndex;
                this.indexToRemove = i8;
                E e8 = (E) CompactHashSet.this.element(i8);
                this.currentIndex = CompactHashSet.this.getSuccessor(this.currentIndex);
                return e8;
            }

            @Override // java.util.Iterator
            public void remove() {
                checkForConcurrentModification();
                CollectPreconditions.checkRemove(this.indexToRemove >= 0);
                incrementExpectedModCount();
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.remove(compactHashSet.element(this.indexToRemove));
                this.currentIndex = CompactHashSet.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
                this.indexToRemove = -1;
            }
        };
    }

    void moveLastEntry(int i8, int i9) {
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        Object[] requireElements = requireElements();
        int size = size();
        int i10 = size - 1;
        if (i8 >= i10) {
            requireElements[i8] = null;
            requireEntries[i8] = 0;
            return;
        }
        Object obj = requireElements[i10];
        requireElements[i8] = obj;
        requireElements[i10] = null;
        requireEntries[i8] = requireEntries[i10];
        requireEntries[i10] = 0;
        int smearedHash = Hashing.smearedHash(obj) & i9;
        int tableGet = CompactHashing.tableGet(requireTable, smearedHash);
        if (tableGet == size) {
            CompactHashing.tableSet(requireTable, smearedHash, i8 + 1);
            return;
        }
        while (true) {
            int i11 = tableGet - 1;
            int i12 = requireEntries[i11];
            int next = CompactHashing.getNext(i12, i9);
            if (next == size) {
                requireEntries[i11] = CompactHashing.maskCombine(i12, i8 + 1, i9);
                return;
            }
            tableGet = next;
        }
    }

    @VisibleForTesting
    boolean needsAllocArrays() {
        return this.table == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.remove(obj);
        }
        int hashTableMask = hashTableMask();
        int remove = CompactHashing.remove(obj, null, hashTableMask, requireTable(), requireEntries(), requireElements(), null);
        if (remove == -1) {
            return false;
        }
        moveLastEntry(remove, hashTableMask);
        this.size--;
        incrementModCount();
        return true;
    }

    void resizeEntries(int i8) {
        this.entries = Arrays.copyOf(requireEntries(), i8);
        this.elements = Arrays.copyOf(requireElements(), i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.size() : this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (needsAllocArrays()) {
            return new Object[0];
        }
        Set<E> delegateOrNull = delegateOrNull();
        return delegateOrNull != null ? delegateOrNull.toArray() : Arrays.copyOf(requireElements(), this.size);
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            Set<E> createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            createHashFloodingResistantDelegate.addAll(delegateOrNull);
            this.table = createHashFloodingResistantDelegate;
            return;
        }
        int i8 = this.size;
        if (i8 < requireEntries().length) {
            resizeEntries(i8);
        }
        int tableSize = CompactHashing.tableSize(i8);
        int hashTableMask = hashTableMask();
        if (tableSize < hashTableMask) {
            resizeTable(hashTableMask, tableSize, 0, 0);
        }
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(collection.size());
        createWithExpectedSize.addAll(collection);
        return createWithExpectedSize;
    }

    CompactHashSet(int i8) {
        init(i8);
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> create(E... eArr) {
        CompactHashSet<E> createWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(createWithExpectedSize, eArr);
        return createWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        if (needsAllocArrays()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return (T[]) delegateOrNull.toArray(tArr);
        }
        return (T[]) ObjectArrays.toArrayImpl(requireElements(), 0, this.size, tArr);
    }
}
