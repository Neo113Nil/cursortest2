package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import javax.annotation.CheckForNull;

@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {
    private static final int DEFAULT_CAPACITY = 11;
    private static final int EVEN_POWERS_OF_TWO = 1431655765;
    private static final int ODD_POWERS_OF_TWO = -1431655766;
    private final MinMaxPriorityQueue<E>.Heap maxHeap;

    @VisibleForTesting
    final int maximumSize;
    private final MinMaxPriorityQueue<E>.Heap minHeap;
    private int modCount;
    private Object[] queue;
    private int size;

    @Beta
    public static final class Builder<B> {
        private static final int UNSET_EXPECTED_SIZE = -1;
        private final Comparator<B> comparator;
        private int expectedSize;
        private int maximumSize;

        /* JADX INFO: Access modifiers changed from: private */
        public <T extends B> Ordering<T> ordering() {
            return Ordering.from(this.comparator);
        }

        public <T extends B> MinMaxPriorityQueue<T> create() {
            return create(Collections.emptySet());
        }

        @CanIgnoreReturnValue
        public Builder<B> expectedSize(int i8) {
            Preconditions.checkArgument(i8 >= 0);
            this.expectedSize = i8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<B> maximumSize(int i8) {
            Preconditions.checkArgument(i8 > 0);
            this.maximumSize = i8;
            return this;
        }

        private Builder(Comparator<B> comparator) {
            this.expectedSize = -1;
            this.maximumSize = Integer.MAX_VALUE;
            this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        }

        public <T extends B> MinMaxPriorityQueue<T> create(Iterable<? extends T> iterable) {
            MinMaxPriorityQueue<T> minMaxPriorityQueue = new MinMaxPriorityQueue<>(this, MinMaxPriorityQueue.initialQueueSize(this.expectedSize, this.maximumSize, iterable));
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                minMaxPriorityQueue.offer(it.next());
            }
            return minMaxPriorityQueue;
        }
    }

    private class Heap {
        final Ordering<E> ordering;

        @Weak
        MinMaxPriorityQueue<E>.Heap otherHeap;

        Heap(Ordering<E> ordering) {
            this.ordering = ordering;
        }

        private int getGrandparentIndex(int i8) {
            return getParentIndex(getParentIndex(i8));
        }

        private int getLeftChildIndex(int i8) {
            return (i8 * 2) + 1;
        }

        private int getParentIndex(int i8) {
            return (i8 - 1) / 2;
        }

        private int getRightChildIndex(int i8) {
            return (i8 * 2) + 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean verifyIndex(int i8) {
            if (getLeftChildIndex(i8) < MinMaxPriorityQueue.this.size && compareElements(i8, getLeftChildIndex(i8)) > 0) {
                return false;
            }
            if (getRightChildIndex(i8) < MinMaxPriorityQueue.this.size && compareElements(i8, getRightChildIndex(i8)) > 0) {
                return false;
            }
            if (i8 <= 0 || compareElements(i8, getParentIndex(i8)) <= 0) {
                return i8 <= 2 || compareElements(getGrandparentIndex(i8), i8) <= 0;
            }
            return false;
        }

        void bubbleUp(int i8, E e8) {
            Heap heap;
            int crossOverUp = crossOverUp(i8, e8);
            if (crossOverUp == i8) {
                crossOverUp = i8;
                heap = this;
            } else {
                heap = this.otherHeap;
            }
            heap.bubbleUpAlternatingLevels(crossOverUp, e8);
        }

        @CanIgnoreReturnValue
        int bubbleUpAlternatingLevels(int i8, E e8) {
            while (i8 > 2) {
                int grandparentIndex = getGrandparentIndex(i8);
                Object elementData = MinMaxPriorityQueue.this.elementData(grandparentIndex);
                if (this.ordering.compare(elementData, e8) <= 0) {
                    break;
                }
                MinMaxPriorityQueue.this.queue[i8] = elementData;
                i8 = grandparentIndex;
            }
            MinMaxPriorityQueue.this.queue[i8] = e8;
            return i8;
        }

        int compareElements(int i8, int i9) {
            return this.ordering.compare(MinMaxPriorityQueue.this.elementData(i8), MinMaxPriorityQueue.this.elementData(i9));
        }

        int crossOver(int i8, E e8) {
            int findMinChild = findMinChild(i8);
            if (findMinChild <= 0 || this.ordering.compare(MinMaxPriorityQueue.this.elementData(findMinChild), e8) >= 0) {
                return crossOverUp(i8, e8);
            }
            MinMaxPriorityQueue.this.queue[i8] = MinMaxPriorityQueue.this.elementData(findMinChild);
            MinMaxPriorityQueue.this.queue[findMinChild] = e8;
            return findMinChild;
        }

        int crossOverUp(int i8, E e8) {
            int rightChildIndex;
            if (i8 == 0) {
                MinMaxPriorityQueue.this.queue[0] = e8;
                return 0;
            }
            int parentIndex = getParentIndex(i8);
            Object elementData = MinMaxPriorityQueue.this.elementData(parentIndex);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= MinMaxPriorityQueue.this.size) {
                Object elementData2 = MinMaxPriorityQueue.this.elementData(rightChildIndex);
                if (this.ordering.compare(elementData2, elementData) < 0) {
                    parentIndex = rightChildIndex;
                    elementData = elementData2;
                }
            }
            if (this.ordering.compare(elementData, e8) >= 0) {
                MinMaxPriorityQueue.this.queue[i8] = e8;
                return i8;
            }
            MinMaxPriorityQueue.this.queue[i8] = elementData;
            MinMaxPriorityQueue.this.queue[parentIndex] = e8;
            return parentIndex;
        }

        int fillHoleAt(int i8) {
            while (true) {
                int findMinGrandChild = findMinGrandChild(i8);
                if (findMinGrandChild <= 0) {
                    return i8;
                }
                MinMaxPriorityQueue.this.queue[i8] = MinMaxPriorityQueue.this.elementData(findMinGrandChild);
                i8 = findMinGrandChild;
            }
        }

        int findMin(int i8, int i9) {
            if (i8 >= MinMaxPriorityQueue.this.size) {
                return -1;
            }
            Preconditions.checkState(i8 > 0);
            int min = Math.min(i8, MinMaxPriorityQueue.this.size - i9) + i9;
            for (int i10 = i8 + 1; i10 < min; i10++) {
                if (compareElements(i10, i8) < 0) {
                    i8 = i10;
                }
            }
            return i8;
        }

        int findMinChild(int i8) {
            return findMin(getLeftChildIndex(i8), 2);
        }

        int findMinGrandChild(int i8) {
            int leftChildIndex = getLeftChildIndex(i8);
            if (leftChildIndex < 0) {
                return -1;
            }
            return findMin(getLeftChildIndex(leftChildIndex), 4);
        }

        int swapWithConceptuallyLastElement(E e8) {
            int rightChildIndex;
            int parentIndex = getParentIndex(MinMaxPriorityQueue.this.size);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= MinMaxPriorityQueue.this.size) {
                Object elementData = MinMaxPriorityQueue.this.elementData(rightChildIndex);
                if (this.ordering.compare(elementData, e8) < 0) {
                    MinMaxPriorityQueue.this.queue[rightChildIndex] = e8;
                    MinMaxPriorityQueue.this.queue[MinMaxPriorityQueue.this.size] = elementData;
                    return rightChildIndex;
                }
            }
            return MinMaxPriorityQueue.this.size;
        }

        @CheckForNull
        MoveDesc<E> tryCrossOverAndBubbleUp(int i8, int i9, E e8) {
            int crossOver = crossOver(i9, e8);
            if (crossOver == i9) {
                return null;
            }
            Object elementData = crossOver < i8 ? MinMaxPriorityQueue.this.elementData(i8) : MinMaxPriorityQueue.this.elementData(getParentIndex(i8));
            if (this.otherHeap.bubbleUpAlternatingLevels(crossOver, e8) < i8) {
                return new MoveDesc<>(e8, elementData);
            }
            return null;
        }
    }

    static class MoveDesc<E> {
        final E replaced;
        final E toTrickle;

        MoveDesc(E e8, E e9) {
            this.toTrickle = e8;
            this.replaced = e9;
        }
    }

    private class QueueIterator implements Iterator<E> {
        private boolean canRemove;
        private int cursor;
        private int expectedModCount;

        @CheckForNull
        private Queue<E> forgetMeNot;

        @CheckForNull
        private E lastFromForgetMeNot;
        private int nextCursor;

        @CheckForNull
        private List<E> skipMe;

        private QueueIterator() {
            this.cursor = -1;
            this.nextCursor = -1;
            this.expectedModCount = MinMaxPriorityQueue.this.modCount;
        }

        private void checkModCount() {
            if (MinMaxPriorityQueue.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        private boolean foundAndRemovedExactReference(Iterable<E> iterable, E e8) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == e8) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void nextNotInSkipMe(int i8) {
            if (this.nextCursor < i8) {
                if (this.skipMe != null) {
                    while (i8 < MinMaxPriorityQueue.this.size() && foundAndRemovedExactReference(this.skipMe, MinMaxPriorityQueue.this.elementData(i8))) {
                        i8++;
                    }
                }
                this.nextCursor = i8;
            }
        }

        private boolean removeExact(Object obj) {
            for (int i8 = 0; i8 < MinMaxPriorityQueue.this.size; i8++) {
                if (MinMaxPriorityQueue.this.queue[i8] == obj) {
                    MinMaxPriorityQueue.this.removeAt(i8);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            if (this.nextCursor < MinMaxPriorityQueue.this.size()) {
                return true;
            }
            Queue<E> queue = this.forgetMeNot;
            return (queue == null || queue.isEmpty()) ? false : true;
        }

        @Override // java.util.Iterator
        public E next() {
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            if (this.nextCursor < MinMaxPriorityQueue.this.size()) {
                int i8 = this.nextCursor;
                this.cursor = i8;
                this.canRemove = true;
                return (E) MinMaxPriorityQueue.this.elementData(i8);
            }
            if (this.forgetMeNot != null) {
                this.cursor = MinMaxPriorityQueue.this.size();
                E poll = this.forgetMeNot.poll();
                this.lastFromForgetMeNot = poll;
                if (poll != null) {
                    this.canRemove = true;
                    return poll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(this.canRemove);
            checkModCount();
            this.canRemove = false;
            this.expectedModCount++;
            if (this.cursor >= MinMaxPriorityQueue.this.size()) {
                E e8 = this.lastFromForgetMeNot;
                Objects.requireNonNull(e8);
                Preconditions.checkState(removeExact(e8));
                this.lastFromForgetMeNot = null;
                return;
            }
            MoveDesc<E> removeAt = MinMaxPriorityQueue.this.removeAt(this.cursor);
            if (removeAt != null) {
                if (this.forgetMeNot == null || this.skipMe == null) {
                    this.forgetMeNot = new ArrayDeque();
                    this.skipMe = new ArrayList(3);
                }
                if (!foundAndRemovedExactReference(this.skipMe, removeAt.toTrickle)) {
                    this.forgetMeNot.add(removeAt.toTrickle);
                }
                if (!foundAndRemovedExactReference(this.forgetMeNot, removeAt.replaced)) {
                    this.skipMe.add(removeAt.replaced);
                }
            }
            this.cursor--;
            this.nextCursor--;
        }
    }

    private int calculateNewCapacity() {
        int length = this.queue.length;
        return capAtMaximumSize(length < 64 ? (length + 1) * 2 : IntMath.checkedMultiply(length / 2, 3), this.maximumSize);
    }

    private static int capAtMaximumSize(int i8, int i9) {
        return Math.min(i8 - 1, i9) + 1;
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create() {
        return new Builder(Ordering.natural()).create();
    }

    public static Builder<Comparable> expectedSize(int i8) {
        return new Builder(Ordering.natural()).expectedSize(i8);
    }

    @CheckForNull
    private MoveDesc<E> fillHole(int i8, E e8) {
        MinMaxPriorityQueue<E>.Heap heapForIndex = heapForIndex(i8);
        int fillHoleAt = heapForIndex.fillHoleAt(i8);
        int bubbleUpAlternatingLevels = heapForIndex.bubbleUpAlternatingLevels(fillHoleAt, e8);
        if (bubbleUpAlternatingLevels == fillHoleAt) {
            return heapForIndex.tryCrossOverAndBubbleUp(i8, fillHoleAt, e8);
        }
        if (bubbleUpAlternatingLevels < i8) {
            return new MoveDesc<>(e8, elementData(i8));
        }
        return null;
    }

    private int getMaxElementIndex() {
        int i8 = this.size;
        if (i8 != 1) {
            return (i8 == 2 || this.maxHeap.compareElements(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    private void growIfNeeded() {
        if (this.size > this.queue.length) {
            Object[] objArr = new Object[calculateNewCapacity()];
            Object[] objArr2 = this.queue;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.queue = objArr;
        }
    }

    private MinMaxPriorityQueue<E>.Heap heapForIndex(int i8) {
        return isEvenLevel(i8) ? this.minHeap : this.maxHeap;
    }

    @VisibleForTesting
    static int initialQueueSize(int i8, int i9, Iterable<?> iterable) {
        if (i8 == -1) {
            i8 = 11;
        }
        if (iterable instanceof Collection) {
            i8 = Math.max(i8, ((Collection) iterable).size());
        }
        return capAtMaximumSize(i8, i9);
    }

    @VisibleForTesting
    static boolean isEvenLevel(int i8) {
        int i9 = ~(~(i8 + 1));
        Preconditions.checkState(i9 > 0, "negative index");
        return (EVEN_POWERS_OF_TWO & i9) > (i9 & ODD_POWERS_OF_TWO);
    }

    public static Builder<Comparable> maximumSize(int i8) {
        return new Builder(Ordering.natural()).maximumSize(i8);
    }

    public static <B> Builder<B> orderedBy(Comparator<B> comparator) {
        return new Builder<>(comparator);
    }

    private E removeAndGet(int i8) {
        E elementData = elementData(i8);
        removeAt(i8);
        return elementData;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e8) {
        offer(e8);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            offer(it.next());
            z7 = true;
        }
        return z7;
    }

    @VisibleForTesting
    int capacity() {
        return this.queue.length;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i8 = 0; i8 < this.size; i8++) {
            this.queue[i8] = null;
        }
        this.size = 0;
    }

    public Comparator<? super E> comparator() {
        return this.minHeap.ordering;
    }

    E elementData(int i8) {
        E e8 = (E) this.queue[i8];
        Objects.requireNonNull(e8);
        return e8;
    }

    @VisibleForTesting
    boolean isIntact() {
        for (int i8 = 1; i8 < this.size; i8++) {
            if (!heapForIndex(i8).verifyIndex(i8)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e8) {
        Preconditions.checkNotNull(e8);
        this.modCount++;
        int i8 = this.size;
        this.size = i8 + 1;
        growIfNeeded();
        heapForIndex(i8).bubbleUp(i8, e8);
        return this.size <= this.maximumSize || pollLast() != e8;
    }

    @Override // java.util.Queue
    @CheckForNull
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return elementData(0);
    }

    @CheckForNull
    public E peekFirst() {
        return peek();
    }

    @CheckForNull
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return elementData(getMaxElementIndex());
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    @CheckForNull
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(0);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public E pollFirst() {
        return poll();
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(getMaxElementIndex());
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    @CheckForNull
    MoveDesc<E> removeAt(int i8) {
        Preconditions.checkPositionIndex(i8, this.size);
        this.modCount++;
        int i9 = this.size - 1;
        this.size = i9;
        if (i9 == i8) {
            this.queue[i9] = null;
            return null;
        }
        E elementData = elementData(i9);
        int swapWithConceptuallyLastElement = heapForIndex(this.size).swapWithConceptuallyLastElement(elementData);
        if (swapWithConceptuallyLastElement == i8) {
            this.queue[this.size] = null;
            return null;
        }
        E elementData2 = elementData(this.size);
        this.queue[this.size] = null;
        MoveDesc<E> fillHole = fillHole(i8, elementData2);
        return swapWithConceptuallyLastElement < i8 ? fillHole == null ? new MoveDesc<>(elementData, elementData2) : new MoveDesc<>(elementData, fillHole.replaced) : fillHole;
    }

    @CanIgnoreReturnValue
    public E removeFirst() {
        return remove();
    }

    @CanIgnoreReturnValue
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return removeAndGet(getMaxElementIndex());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        int i8 = this.size;
        Object[] objArr = new Object[i8];
        System.arraycopy(this.queue, 0, objArr, 0, i8);
        return objArr;
    }

    private MinMaxPriorityQueue(Builder<? super E> builder, int i8) {
        Ordering ordering = builder.ordering();
        MinMaxPriorityQueue<E>.Heap heap = new Heap(ordering);
        this.minHeap = heap;
        MinMaxPriorityQueue<E>.Heap heap2 = new Heap(ordering.reverse());
        this.maxHeap = heap2;
        heap.otherHeap = heap2;
        heap2.otherHeap = heap;
        this.maximumSize = ((Builder) builder).maximumSize;
        this.queue = new Object[i8];
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(Iterable<? extends E> iterable) {
        return new Builder(Ordering.natural()).create(iterable);
    }
}
