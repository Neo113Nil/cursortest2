package cn.hutool.core.collection;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class ArrayIter<E> implements m0, s0, Serializable {
    private static final long serialVersionUID = 1;
    private final Object array;
    private int endIndex;
    private int index;
    private int startIndex;

    public ArrayIter(E[] eArr) {
        this((Object) eArr);
    }

    public Object getArray() {
        return this.array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.endIndex;
    }

    @Override // cn.hutool.core.collection.m0, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return l0.a(this);
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.array;
        int i8 = this.index;
        this.index = i8 + 1;
        return (E) Array.get(obj, i8);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() method is not supported");
    }

    @Override // cn.hutool.core.collection.s0
    public void reset() {
        this.index = this.startIndex;
    }

    public ArrayIter(Object obj) {
        this(obj, 0);
    }

    public ArrayIter(Object obj, int i8) {
        this(obj, i8, -1);
    }

    public ArrayIter(Object obj, int i8, int i9) {
        int length = Array.getLength(obj);
        this.endIndex = length;
        if (i9 > 0 && i9 < length) {
            this.endIndex = i9;
        }
        if (i8 >= 0 && i8 < this.endIndex) {
            this.startIndex = i8;
        }
        this.array = obj;
        this.index = this.startIndex;
    }
}
