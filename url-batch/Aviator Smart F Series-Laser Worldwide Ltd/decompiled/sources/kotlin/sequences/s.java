package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class s implements m, e {
    private final int endIndex;
    private final m sequence;
    private final int startIndex;

    public static final class a implements Iterator, g6.a {
        private final Iterator<Object> iterator;
        private int position;

        a() {
            this.iterator = s.this.sequence.iterator();
        }

        private final void drop() {
            while (this.position < s.this.startIndex && this.iterator.hasNext()) {
                this.iterator.next();
                this.position++;
            }
        }

        public final Iterator<Object> getIterator() {
            return this.iterator;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            drop();
            return this.position < s.this.endIndex && this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            drop();
            if (this.position >= s.this.endIndex) {
                throw new NoSuchElementException();
            }
            this.position++;
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setPosition(int i8) {
            this.position = i8;
        }
    }

    public s(m sequence, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
        this.startIndex = i8;
        this.endIndex = i9;
        if (i8 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i8).toString());
        }
        if (i9 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i9).toString());
        }
        if (i9 >= i8) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i9 + " < " + i8).toString());
    }

    private final int getCount() {
        return this.endIndex - this.startIndex;
    }

    @Override // kotlin.sequences.e
    public m drop(int i8) {
        return i8 >= getCount() ? SequencesKt__SequencesKt.emptySequence() : new s(this.sequence, this.startIndex + i8, this.endIndex);
    }

    @Override // kotlin.sequences.m
    public Iterator<Object> iterator() {
        return new a();
    }

    @Override // kotlin.sequences.e
    public m take(int i8) {
        if (i8 >= getCount()) {
            return this;
        }
        m mVar = this.sequence;
        int i9 = this.startIndex;
        return new s(mVar, i9, i8 + i9);
    }
}
