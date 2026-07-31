package com.yandex.div.internal.viewpool;

import W1.f;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class BatchBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E> {

    @NotNull
    private final ReentrantLock lock;
    private final Condition notEmpty;

    @NotNull
    private final Queue<E> queue;

    public BatchBlockingQueue(@NotNull Queue<E> backingQueue) {
        Intrinsics.checkNotNullParameter(backingQueue, "backingQueue");
        this.queue = backingQueue;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.notEmpty = reentrantLock.newCondition();
    }

    private final Void notSupported() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean add(E e4) {
        return offer(e4);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(@Nullable Collection<? super E> collection) {
        notSupported();
        throw new f();
    }

    public int getSize() {
        this.lock.lock();
        try {
            return this.queue.size();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        notSupported();
        throw new f();
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e4, long j4, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return offer(e4);
    }

    @Override // java.util.Queue
    public E peek() {
        this.lock.lock();
        try {
            return this.queue.peek();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.Queue
    @Nullable
    public E poll() {
        this.lock.lock();
        try {
            return this.queue.poll();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e4) {
        offer(e4);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        this.lock.lock();
        try {
            return this.queue.remove(obj);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Spliterator<E> spliterator() {
        notSupported();
        throw new f();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() {
        this.lock.lockInterruptibly();
        while (this.queue.isEmpty()) {
            try {
                this.notEmpty.await();
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        E poll = this.queue.poll();
        this.lock.unlock();
        return poll;
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(@Nullable Collection<? super E> collection, int i4) {
        notSupported();
        throw new f();
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E e4) {
        this.lock.lock();
        try {
            this.queue.offer(e4);
            this.notEmpty.signal();
            Unit unit = Unit.f41027a;
            this.lock.unlock();
            return true;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    @Nullable
    public E poll(long j4, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.lock.lockInterruptibly();
        try {
            long nanos = unit.toNanos(j4);
            while (this.queue.isEmpty() && nanos > 0) {
                nanos = this.notEmpty.awaitNanos(nanos);
            }
            E poll = this.queue.poll();
            this.lock.unlock();
            return poll;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }
}
