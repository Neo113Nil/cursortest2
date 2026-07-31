package com.huawei.hms.framework.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class LimitQueue<E> extends ConcurrentLinkedQueue<E> {

    /* renamed from: b, reason: collision with root package name */
    private int f14135b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14136c;

    public LimitQueue(int i4) {
        this.f14136c = false;
        this.f14135b = i4;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e4) {
        if (this.f14136c) {
            super.remove(e4);
        }
        if (super.size() >= this.f14135b) {
            super.poll();
        }
        return super.add(e4);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.size() > this.f14135b) {
            return false;
        }
        if (this.f14136c) {
            super.removeAll(collection);
        }
        for (int size = (collection.size() + super.size()) - this.f14135b; size > 0; size--) {
            super.poll();
        }
        return super.addAll(collection);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        super.clear();
    }

    public E get(int i4) {
        Iterator<E> it = iterator();
        E e4 = null;
        for (int i5 = 0; i5 <= i4 && it.hasNext(); i5++) {
            e4 = it.next();
        }
        return e4;
    }

    public int getLimit() {
        return this.f14135b;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public boolean offer(E e4) {
        if (this.f14136c) {
            super.remove(e4);
        }
        if (super.size() >= this.f14135b) {
            super.poll();
        }
        return super.offer(e4);
    }

    public E peekLast() {
        Iterator<E> it = iterator();
        E e4 = null;
        while (it.hasNext()) {
            e4 = it.next();
        }
        return e4;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public E poll() {
        return (E) super.poll();
    }

    @Override // java.util.AbstractQueue, java.util.Queue
    public E remove() {
        try {
            return (E) super.remove();
        } catch (NoSuchElementException unused) {
            Logger.w("LimitQueue", "remove failed, limitQueue is empty");
            return null;
        }
    }

    public LimitQueue(int i4, boolean z4) {
        this.f14135b = i4;
        this.f14136c = z4;
    }

    public LimitQueue(Collection<? extends E> collection, boolean z4) {
        this(collection.size(), z4);
        addAll(collection);
    }
}
