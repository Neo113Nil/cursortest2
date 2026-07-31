package com.yandex.div.core.util;

import androidx.collection.h;
import i2.InterfaceC2471a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class SparseArrayIterator<T> implements Iterator<T>, InterfaceC2471a {

    @NotNull
    private final h array;
    private int index;

    public SparseArrayIterator(@NotNull h array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.array.o() > this.index;
    }

    @Override // java.util.Iterator
    public T next() {
        h hVar = this.array;
        int i4 = this.index;
        this.index = i4 + 1;
        return (T) hVar.p(i4);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
