package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Objects;

/* loaded from: classes.dex */
class RegularImmutableList<E> extends ImmutableList<E> {
    static final ImmutableList<Object> EMPTY = new RegularImmutableList(new Object[0], 0);
    final transient Object[] array;
    private final transient int size;

    RegularImmutableList(Object[] objArr, int i4) {
        this.array = objArr;
        this.size = i4;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    int copyIntoArray(Object[] objArr, int i4) {
        System.arraycopy(this.array, 0, objArr, i4, this.size);
        return i4 + this.size;
    }

    @Override // java.util.List
    public E get(int i4) {
        Preconditions.checkElementIndex(i4, this.size);
        E e4 = (E) this.array[i4];
        Objects.requireNonNull(e4);
        return e4;
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object[] internalArray() {
        return this.array;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayEnd() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayStart() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }
}
