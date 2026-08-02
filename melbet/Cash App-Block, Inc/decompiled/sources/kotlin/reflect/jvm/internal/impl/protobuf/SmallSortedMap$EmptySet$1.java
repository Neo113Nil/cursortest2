package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
public final class SmallSortedMap$EmptySet$1 implements Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
