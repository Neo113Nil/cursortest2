package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
class t0 extends b {
    private final List<Object> delegate;

    public static final class a implements ListIterator, g6.a {
        private final ListIterator<Object> delegateIterator;

        a(int i8) {
            int reversePositionIndex$CollectionsKt__ReversedViewsKt;
            List list = t0.this.delegate;
            reversePositionIndex$CollectionsKt__ReversedViewsKt = w.reversePositionIndex$CollectionsKt__ReversedViewsKt(t0.this, i8);
            this.delegateIterator = list.listIterator(reversePositionIndex$CollectionsKt__ReversedViewsKt);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final ListIterator<Object> getDelegateIterator() {
            return this.delegateIterator;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.delegateIterator.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.delegateIterator.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.delegateIterator.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int reverseIteratorIndex$CollectionsKt__ReversedViewsKt;
            reverseIteratorIndex$CollectionsKt__ReversedViewsKt = w.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(t0.this, this.delegateIterator.previousIndex());
            return reverseIteratorIndex$CollectionsKt__ReversedViewsKt;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.delegateIterator.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int reverseIteratorIndex$CollectionsKt__ReversedViewsKt;
            reverseIteratorIndex$CollectionsKt__ReversedViewsKt = w.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(t0.this, this.delegateIterator.nextIndex());
            return reverseIteratorIndex$CollectionsKt__ReversedViewsKt;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t0(List<Object> delegate) {
        kotlin.jvm.internal.s.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kotlin.collections.b, java.util.List
    public Object get(int i8) {
        int reverseElementIndex$CollectionsKt__ReversedViewsKt;
        List<Object> list = this.delegate;
        reverseElementIndex$CollectionsKt__ReversedViewsKt = w.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i8);
        return list.get(reverseElementIndex$CollectionsKt__ReversedViewsKt);
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.delegate.size();
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.b, java.util.List
    public ListIterator<Object> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.b, java.util.List
    public ListIterator<Object> listIterator(int i8) {
        return new a(i8);
    }
}
