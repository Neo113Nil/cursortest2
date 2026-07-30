package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;
    transient ObjectCountHashMap<E> backingMap;
    transient long size;

    abstract class Itr<T> implements Iterator<T> {
        int entryIndex;
        int expectedModCount;
        int toRemove = -1;

        Itr() {
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.firstIndex();
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.modCount;
        }

        private void checkForConcurrentModification() {
            if (AbstractMapBasedMultiset.this.backingMap.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            return this.entryIndex >= 0;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T result = result(this.entryIndex);
            int i8 = this.entryIndex;
            this.toRemove = i8;
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.nextIndex(i8);
            return result;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.toRemove != -1);
            AbstractMapBasedMultiset.this.size -= r0.backingMap.removeEntry(this.toRemove);
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.nextIndexAfterRemove(this.entryIndex, this.toRemove);
            this.toRemove = -1;
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.modCount;
        }

        @ParametricNullness
        abstract T result(int i8);
    }

    AbstractMapBasedMultiset(int i8) {
        this.backingMap = newBackingMap(i8);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readCount = Serialization.readCount(objectInputStream);
        this.backingMap = newBackingMap(3);
        Serialization.populateMultiset(this, objectInputStream, readCount);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultiset(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int add(@ParametricNullness E e8, int i8) {
        if (i8 == 0) {
            return count(e8);
        }
        Preconditions.checkArgument(i8 > 0, "occurrences cannot be negative: %s", i8);
        int indexOf = this.backingMap.indexOf(e8);
        if (indexOf == -1) {
            this.backingMap.put(e8, i8);
            this.size += i8;
            return 0;
        }
        int value = this.backingMap.getValue(indexOf);
        long j8 = i8;
        long j9 = value + j8;
        Preconditions.checkArgument(j9 <= 2147483647L, "too many occurrences: %s", j9);
        this.backingMap.setValue(indexOf, (int) j9);
        this.size += j8;
        return value;
    }

    void addTo(Multiset<? super E> multiset) {
        Preconditions.checkNotNull(multiset);
        int firstIndex = this.backingMap.firstIndex();
        while (firstIndex >= 0) {
            multiset.add(this.backingMap.getKey(firstIndex), this.backingMap.getValue(firstIndex));
            firstIndex = this.backingMap.nextIndex(firstIndex);
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.clear();
        this.size = 0L;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(@CheckForNull Object obj) {
        return this.backingMap.get(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset
    final int distinctElements() {
        return this.backingMap.size();
    }

    @Override // com.google.common.collect.AbstractMultiset
    final Iterator<E> elementIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<E>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            @ParametricNullness
            E result(int i8) {
                return AbstractMapBasedMultiset.this.backingMap.getKey(i8);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    final Iterator<Multiset.Entry<E>> entryIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public Multiset.Entry<E> result(int i8) {
                return AbstractMapBasedMultiset.this.backingMap.getEntry(i8);
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    abstract ObjectCountHashMap<E> newBackingMap(int i8);

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int remove(@CheckForNull Object obj, int i8) {
        if (i8 == 0) {
            return count(obj);
        }
        Preconditions.checkArgument(i8 > 0, "occurrences cannot be negative: %s", i8);
        int indexOf = this.backingMap.indexOf(obj);
        if (indexOf == -1) {
            return 0;
        }
        int value = this.backingMap.getValue(indexOf);
        if (value > i8) {
            this.backingMap.setValue(indexOf, value - i8);
        } else {
            this.backingMap.removeEntry(indexOf);
            i8 = value;
        }
        this.size -= i8;
        return value;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int setCount(@ParametricNullness E e8, int i8) {
        CollectPreconditions.checkNonnegative(i8, "count");
        ObjectCountHashMap<E> objectCountHashMap = this.backingMap;
        int remove = i8 == 0 ? objectCountHashMap.remove(e8) : objectCountHashMap.put(e8, i8);
        this.size += i8 - remove;
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return Ints.saturatedCast(this.size);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(@ParametricNullness E e8, int i8, int i9) {
        CollectPreconditions.checkNonnegative(i8, "oldCount");
        CollectPreconditions.checkNonnegative(i9, "newCount");
        int indexOf = this.backingMap.indexOf(e8);
        if (indexOf == -1) {
            if (i8 != 0) {
                return false;
            }
            if (i9 > 0) {
                this.backingMap.put(e8, i9);
                this.size += i9;
            }
            return true;
        }
        if (this.backingMap.getValue(indexOf) != i8) {
            return false;
        }
        if (i9 == 0) {
            this.backingMap.removeEntry(indexOf);
            this.size -= i8;
        } else {
            this.backingMap.setValue(indexOf, i9);
            this.size += i9 - i8;
        }
        return true;
    }
}
