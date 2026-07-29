package com.tapjoy.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class av implements ax {

    /* renamed from: a, reason: collision with root package name */
    private final List f7840a;

    public av(List list) {
        this.f7840a = list;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        return this.f7840a.add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f7840a.addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f7840a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7840a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f7840a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this.f7840a.equals(obj);
    }

    @Override // com.tapjoy.internal.ax
    public final Object a(int i) {
        return this.f7840a.get(i);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f7840a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f7840a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f7840a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f7840a.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f7840a.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f7840a.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f7840a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f7840a.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f7840a.toArray(objArr);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return this.f7840a.add(obj);
    }

    @Override // java.util.Queue
    public final Object remove() {
        Object poll = poll();
        if (poll != null) {
            return poll;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (this.f7840a.isEmpty()) {
            return null;
        }
        return this.f7840a.remove(0);
    }

    @Override // java.util.Queue
    public final Object element() {
        Object peek = peek();
        if (peek != null) {
            return peek;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (this.f7840a.isEmpty()) {
            return null;
        }
        return this.f7840a.get(0);
    }

    @Override // com.tapjoy.internal.ax
    public final void b(int i) {
        aw.a(this.f7840a, i);
    }
}
