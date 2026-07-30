package kotlin.sequences;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class l implements m {
    private final m sequence1;
    private final m sequence2;
    private final f6.p transform;

    public static final class a implements Iterator, g6.a {
        private final Iterator<Object> iterator1;
        private final Iterator<Object> iterator2;

        a() {
            this.iterator1 = l.this.sequence1.iterator();
            this.iterator2 = l.this.sequence2.iterator();
        }

        public final Iterator<Object> getIterator1() {
            return this.iterator1;
        }

        public final Iterator<Object> getIterator2() {
            return this.iterator2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator1.hasNext() && this.iterator2.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return l.this.transform.invoke(this.iterator1.next(), this.iterator2.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(m sequence1, m sequence2, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(sequence1, "sequence1");
        kotlin.jvm.internal.s.checkNotNullParameter(sequence2, "sequence2");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        this.sequence1 = sequence1;
        this.sequence2 = sequence2;
        this.transform = transform;
    }

    @Override // kotlin.sequences.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
