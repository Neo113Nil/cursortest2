package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.math.IntMath;
import com.google.common.util.concurrent.Striped;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class Striped<L> {
    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;

    private static class CompactStriped<L> extends PowerOfTwoStriped<L> {
        private final Object[] array;

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i8) {
            return (L) this.array[i8];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.array.length;
        }

        private CompactStriped(int i8, Supplier<L> supplier) {
            super(i8);
            int i9 = 0;
            Preconditions.checkArgument(i8 <= 1073741824, "Stripes must be <= 2^30)");
            this.array = new Object[this.mask + 1];
            while (true) {
                Object[] objArr = this.array;
                if (i9 >= objArr.length) {
                    return;
                }
                objArr[i9] = supplier.get();
                i9++;
            }
        }
    }

    @VisibleForTesting
    static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
        final ConcurrentMap<Integer, L> locks;
        final int size;
        final Supplier<L> supplier;

        LargeLazyStriped(int i8, Supplier<L> supplier) {
            super(i8);
            int i9 = this.mask;
            this.size = i9 == -1 ? Integer.MAX_VALUE : i9 + 1;
            this.supplier = supplier;
            this.locks = new MapMaker().weakValues().makeMap();
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i8) {
            if (this.size != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i8, size());
            }
            L l8 = this.locks.get(Integer.valueOf(i8));
            if (l8 != null) {
                return l8;
            }
            L l9 = this.supplier.get();
            return (L) MoreObjects.firstNonNull(this.locks.putIfAbsent(Integer.valueOf(i8), l9), l9);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PaddedLock extends ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        PaddedLock() {
            super(false);
        }
    }

    private static class PaddedSemaphore extends Semaphore {
        long unused1;
        long unused2;
        long unused3;

        PaddedSemaphore(int i8) {
            super(i8, false);
        }
    }

    private static abstract class PowerOfTwoStriped<L> extends Striped<L> {
        final int mask;

        PowerOfTwoStriped(int i8) {
            super();
            Preconditions.checkArgument(i8 > 0, "Stripes must be positive");
            this.mask = i8 > 1073741824 ? -1 : Striped.ceilToPowerOfTwo(i8) - 1;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object obj) {
            return getAt(indexFor(obj));
        }

        @Override // com.google.common.util.concurrent.Striped
        final int indexFor(Object obj) {
            return Striped.smear(obj.hashCode()) & this.mask;
        }
    }

    @VisibleForTesting
    static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {
        final AtomicReferenceArray<ArrayReference<? extends L>> locks;
        final ReferenceQueue<L> queue;
        final int size;
        final Supplier<L> supplier;

        private static final class ArrayReference<L> extends WeakReference<L> {
            final int index;

            ArrayReference(L l8, int i8, ReferenceQueue<L> referenceQueue) {
                super(l8, referenceQueue);
                this.index = i8;
            }
        }

        SmallLazyStriped(int i8, Supplier<L> supplier) {
            super(i8);
            this.queue = new ReferenceQueue<>();
            int i9 = this.mask;
            int i10 = i9 == -1 ? Integer.MAX_VALUE : i9 + 1;
            this.size = i10;
            this.locks = new AtomicReferenceArray<>(i10);
            this.supplier = supplier;
        }

        private void drainQueue() {
            while (true) {
                Reference<? extends L> poll = this.queue.poll();
                if (poll == null) {
                    return;
                }
                ArrayReference arrayReference = (ArrayReference) poll;
                s.a(this.locks, arrayReference.index, arrayReference, null);
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i8) {
            if (this.size != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i8, size());
            }
            ArrayReference<? extends L> arrayReference = this.locks.get(i8);
            L l8 = arrayReference == null ? null : arrayReference.get();
            if (l8 != null) {
                return l8;
            }
            L l9 = this.supplier.get();
            ArrayReference arrayReference2 = new ArrayReference(l9, i8, this.queue);
            while (!s.a(this.locks, i8, arrayReference, arrayReference2)) {
                arrayReference = this.locks.get(i8);
                L l10 = arrayReference == null ? null : arrayReference.get();
                if (l10 != null) {
                    return l10;
                }
            }
            drainQueue();
            return l9;
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }
    }

    private static final class WeakSafeCondition extends ForwardingCondition {
        private final Condition delegate;
        private final WeakSafeReadWriteLock strongReference;

        WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = condition;
            this.strongReference = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        Condition delegate() {
            return this.delegate;
        }
    }

    private static final class WeakSafeLock extends ForwardingLock {
        private final Lock delegate;
        private final WeakSafeReadWriteLock strongReference;

        WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = lock;
            this.strongReference = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        Lock delegate() {
            return this.delegate;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new WeakSafeCondition(this.delegate.newCondition(), this.strongReference);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class WeakSafeReadWriteLock implements ReadWriteLock {
        private final ReadWriteLock delegate = new ReentrantReadWriteLock();

        WeakSafeReadWriteLock() {
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new WeakSafeLock(this.delegate.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new WeakSafeLock(this.delegate.writeLock(), this);
        }
    }

    private Striped() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ceilToPowerOfTwo(int i8) {
        return 1 << IntMath.log2(i8, RoundingMode.CEILING);
    }

    static <L> Striped<L> custom(int i8, Supplier<L> supplier) {
        return new CompactStriped(i8, supplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Lock lambda$lazyWeakLock$0() {
        return new ReentrantLock(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore lambda$lazyWeakSemaphore$2(int i8) {
        return new Semaphore(i8, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore lambda$semaphore$1(int i8) {
        return new PaddedSemaphore(i8);
    }

    private static <L> Striped<L> lazy(int i8, Supplier<L> supplier) {
        return i8 < 1024 ? new SmallLazyStriped(i8, supplier) : new LargeLazyStriped(i8, supplier);
    }

    public static Striped<Lock> lazyWeakLock(int i8) {
        return lazy(i8, new Supplier() { // from class: com.google.common.util.concurrent.q
            @Override // com.google.common.base.Supplier
            public final Object get() {
                Lock lambda$lazyWeakLock$0;
                lambda$lazyWeakLock$0 = Striped.lambda$lazyWeakLock$0();
                return lambda$lazyWeakLock$0;
            }
        });
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i8) {
        return lazy(i8, new Supplier() { // from class: com.google.common.util.concurrent.o
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.WeakSafeReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i8, final int i9) {
        return lazy(i8, new Supplier() { // from class: com.google.common.util.concurrent.n
            @Override // com.google.common.base.Supplier
            public final Object get() {
                Semaphore lambda$lazyWeakSemaphore$2;
                lambda$lazyWeakSemaphore$2 = Striped.lambda$lazyWeakSemaphore$2(i9);
                return lambda$lazyWeakSemaphore$2;
            }
        });
    }

    public static Striped<Lock> lock(int i8) {
        return custom(i8, new Supplier() { // from class: com.google.common.util.concurrent.r
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.PaddedLock();
            }
        });
    }

    public static Striped<ReadWriteLock> readWriteLock(int i8) {
        return custom(i8, new Supplier() { // from class: com.google.common.util.concurrent.p
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> semaphore(int i8, final int i9) {
        return custom(i8, new Supplier() { // from class: com.google.common.util.concurrent.m
            @Override // com.google.common.base.Supplier
            public final Object get() {
                Semaphore lambda$semaphore$1;
                lambda$semaphore$1 = Striped.lambda$semaphore$1(i9);
                return lambda$semaphore$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int smear(int i8) {
        int i9 = i8 ^ ((i8 >>> 20) ^ (i8 >>> 12));
        return (i9 >>> 4) ^ ((i9 >>> 7) ^ i9);
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> iterable) {
        ArrayList newArrayList = Lists.newArrayList(iterable);
        if (newArrayList.isEmpty()) {
            return ImmutableList.of();
        }
        int[] iArr = new int[newArrayList.size()];
        for (int i8 = 0; i8 < newArrayList.size(); i8++) {
            iArr[i8] = indexFor(newArrayList.get(i8));
        }
        Arrays.sort(iArr);
        int i9 = iArr[0];
        newArrayList.set(0, getAt(i9));
        for (int i10 = 1; i10 < newArrayList.size(); i10++) {
            int i11 = iArr[i10];
            if (i11 == i9) {
                newArrayList.set(i10, newArrayList.get(i10 - 1));
            } else {
                newArrayList.set(i10, getAt(i11));
                i9 = i11;
            }
        }
        return Collections.unmodifiableList(newArrayList);
    }

    public abstract L get(Object obj);

    public abstract L getAt(int i8);

    abstract int indexFor(Object obj);

    public abstract int size();
}
