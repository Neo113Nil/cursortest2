package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
final class s0 extends d {
    private final List<Object> delegate;

    public static final class a implements ListIterator, g6.f {
        private final ListIterator<Object> delegateIterator;

        a(int i8) {
            int reversePositionIndex$CollectionsKt__ReversedViewsKt;
            List list = s0.this.delegate;
            reversePositionIndex$CollectionsKt__ReversedViewsKt = w.reversePositionIndex$CollectionsKt__ReversedViewsKt(s0.this, i8);
            this.delegateIterator = list.listIterator(reversePositionIndex$CollectionsKt__ReversedViewsKt);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.delegateIterator.add(obj);
            this.delegateIterator.previous();
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
            reverseIteratorIndex$CollectionsKt__ReversedViewsKt = w.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(s0.this, this.delegateIterator.previousIndex());
            return reverseIteratorIndex$CollectionsKt__ReversedViewsKt;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.delegateIterator.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int reverseIteratorIndex$CollectionsKt__ReversedViewsKt;
            reverseIteratorIndex$CollectionsKt__ReversedViewsKt = w.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(s0.this, this.delegateIterator.nextIndex());
            return reverseIteratorIndex$CollectionsKt__ReversedViewsKt;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.delegateIterator.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.delegateIterator.set(obj);
        }
    }

    public s0(List<Object> delegate) {
        kotlin.jvm.internal.s.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        int reversePositionIndex$CollectionsKt__ReversedViewsKt;
        List<Object> list = this.delegate;
        reversePositionIndex$CollectionsKt__ReversedViewsKt = w.reversePositionIndex$CollectionsKt__ReversedViewsKt(this, i8);
        list.add(reversePositionIndex$CollectionsKt__ReversedViewsKt, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        int reverseElementIndex$CollectionsKt__ReversedViewsKt;
        List<Object> list = this.delegate;
        reverseElementIndex$CollectionsKt__ReversedViewsKt = w.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i8);
        return list.get(reverseElementIndex$CollectionsKt__ReversedViewsKt);
    }

    @Override // kotlin.collections.d
    public int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.d
    public Object removeAt(int i8) {
        int reverseElementIndex$CollectionsKt__ReversedViewsKt;
        List<Object> list = this.delegate;
        reverseElementIndex$CollectionsKt__ReversedViewsKt = w.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i8);
        return list.remove(reverseElementIndex$CollectionsKt__ReversedViewsKt);
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        int reverseElementIndex$CollectionsKt__ReversedViewsKt;
        List<Object> list = this.delegate;
        reverseElementIndex$CollectionsKt__ReversedViewsKt = w.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i8);
        return list.set(reverseElementIndex$CollectionsKt__ReversedViewsKt, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator(int i8) {
        return new a(i8);
    }
}
