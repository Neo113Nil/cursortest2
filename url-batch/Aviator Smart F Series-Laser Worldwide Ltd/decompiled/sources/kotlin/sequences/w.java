package kotlin.sequences;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class w implements m {
    private final m sequence;
    private final f6.l transformer;

    public static final class a implements Iterator, g6.a {
        private final Iterator<Object> iterator;

        a() {
            this.iterator = w.this.sequence.iterator();
        }

        public final Iterator<Object> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return w.this.transformer.invoke(this.iterator.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public w(m sequence, f6.l transformer) {
        kotlin.jvm.internal.s.checkNotNullParameter(sequence, "sequence");
        kotlin.jvm.internal.s.checkNotNullParameter(transformer, "transformer");
        this.sequence = sequence;
        this.transformer = transformer;
    }

    public final <E> m flatten$kotlin_stdlib(f6.l iterator) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterator, "iterator");
        return new i(this.sequence, this.transformer, iterator);
    }

    @Override // kotlin.sequences.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
