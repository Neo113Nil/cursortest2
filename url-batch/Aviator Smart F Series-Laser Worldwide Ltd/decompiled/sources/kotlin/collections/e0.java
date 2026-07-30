package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class e0 implements Iterator, g6.a {
    private int index;
    private final Iterator<Object> iterator;

    public e0(Iterator<Object> iterator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterator, "iterator");
        this.iterator = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final c0 next() {
        int i8 = this.index;
        this.index = i8 + 1;
        if (i8 < 0) {
            CollectionsKt__CollectionsKt.throwIndexOverflow();
        }
        return new c0(i8, this.iterator.next());
    }
}
