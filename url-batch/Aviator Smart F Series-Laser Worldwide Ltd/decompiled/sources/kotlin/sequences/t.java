package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class t implements m, e {
    private final int count;
    private final m sequence;

    public static final class a implements Iterator, g6.a {
        private final Iterator<Object> iterator;
        private int left;

        a(t tVar) {
            this.left = tVar.count;
            this.iterator = tVar.sequence.iterator();
        }

        public final Iterator<Object> getIterator() {
            return this.iterator;
        }

        public final int getLeft() {
            return this.left;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.left > 0 && this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i8 = this.left;
            if (i8 == 0) {
                throw new NoSuchElementException();
            }
            this.left = i8 - 1;
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setLeft(int i8) {
            this.left = i8;
        }
    }

    public t(m sequence, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
        this.count = i8;
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i8 + '.').toString());
    }

    @Override // kotlin.sequences.e
    public m drop(int i8) {
        int i9 = this.count;
        return i8 >= i9 ? SequencesKt__SequencesKt.emptySequence() : new s(this.sequence, i8, i9);
    }

    @Override // kotlin.sequences.m
    public Iterator<Object> iterator() {
        return new a(this);
    }

    @Override // kotlin.sequences.e
    public m take(int i8) {
        return i8 >= this.count ? this : new t(this.sequence, i8);
    }
}
