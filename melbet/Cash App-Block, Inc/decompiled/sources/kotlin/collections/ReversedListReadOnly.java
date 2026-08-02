package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes9.dex */
public final class ReversedListReadOnly extends AbstractList {
    public final List delegate;

    public ReversedListReadOnly(List list) {
        list.getClass();
        this.delegate = list;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.delegate.get(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(i, this));
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.delegate.size();
    }

    @Override // kotlin.collections.AbstractList, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ReversedList$listIterator$1(this, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new ReversedList$listIterator$1(this, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new ReversedList$listIterator$1(this, i);
    }
}
