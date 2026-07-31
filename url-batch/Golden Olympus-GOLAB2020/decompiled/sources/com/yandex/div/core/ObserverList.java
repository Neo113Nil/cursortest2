package com.yandex.div.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class ObserverList<E> implements Iterable<E> {
    private int mCount;
    private int mIterationDepth;
    private boolean mNeedsCompact;
    private final List<E> mObservers = new ArrayList();

    private class ObserverListIterator implements Iterator {
        private int mIndex;
        private boolean mIsExhausted;
        private int mListEndMarker;

        private void compactListIfNeeded() {
            if (this.mIsExhausted) {
                return;
            }
            this.mIsExhausted = true;
            ObserverList.this.decrementIterationDepthAndCompactIfNeeded();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i4 = this.mIndex;
            while (i4 < this.mListEndMarker && ObserverList.this.getObserverAt(i4) == null) {
                i4++;
            }
            if (i4 < this.mListEndMarker) {
                return true;
            }
            compactListIfNeeded();
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            while (true) {
                int i4 = this.mIndex;
                if (i4 >= this.mListEndMarker || ObserverList.this.getObserverAt(i4) != null) {
                    break;
                }
                this.mIndex++;
            }
            int i5 = this.mIndex;
            if (i5 >= this.mListEndMarker) {
                compactListIfNeeded();
                throw new NoSuchElementException();
            }
            ObserverList observerList = ObserverList.this;
            this.mIndex = i5 + 1;
            return (E) observerList.getObserverAt(i5);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private ObserverListIterator() {
            ObserverList.this.incrementIterationDepth();
            this.mListEndMarker = ObserverList.this.capacity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int capacity() {
        return this.mObservers.size();
    }

    private void compact() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            if (this.mObservers.get(size) == null) {
                this.mObservers.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementIterationDepthAndCompactIfNeeded() {
        int i4 = this.mIterationDepth - 1;
        this.mIterationDepth = i4;
        if (i4 <= 0 && this.mNeedsCompact) {
            this.mNeedsCompact = false;
            compact();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E getObserverAt(int i4) {
        return this.mObservers.get(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementIterationDepth() {
        this.mIterationDepth++;
    }

    public boolean addObserver(E e4) {
        if (e4 == null || this.mObservers.contains(e4)) {
            return false;
        }
        this.mObservers.add(e4);
        this.mCount++;
        return true;
    }

    public void clear() {
        this.mCount = 0;
        if (this.mIterationDepth == 0) {
            this.mObservers.clear();
            return;
        }
        int size = this.mObservers.size();
        this.mNeedsCompact |= size != 0;
        for (int i4 = 0; i4 < size; i4++) {
            this.mObservers.set(i4, null);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return new ObserverListIterator();
    }

    public boolean removeObserver(E e4) {
        int indexOf;
        if (e4 == null || (indexOf = this.mObservers.indexOf(e4)) == -1) {
            return false;
        }
        if (this.mIterationDepth == 0) {
            this.mObservers.remove(indexOf);
        } else {
            this.mNeedsCompact = true;
            this.mObservers.set(indexOf, null);
        }
        this.mCount--;
        return true;
    }
}
