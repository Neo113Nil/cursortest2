package kotlin.sequences;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class d implements m, e {
    private final int count;
    private final m sequence;

    public static final class a implements Iterator, g6.a {
        private final Iterator<Object> iterator;
        private int left;

        a(d dVar) {
            this.iterator = dVar.sequence.iterator();
            this.left = dVar.count;
        }

        private final void drop() {
            while (this.left > 0 && this.iterator.hasNext()) {
                this.iterator.next();
                this.left--;
            }
        }

        public final Iterator<Object> getIterator() {
            return this.iterator;
        }

        public final int getLeft() {
            return this.left;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            drop();
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            drop();
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

    public d(m sequence, int i8) {
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
        int i9 = this.count + i8;
        return i9 < 0 ? new d(this, i8) : new d(this.sequence, i9);
    }

    @Override // kotlin.sequences.m
    public Iterator<Object> iterator() {
        return new a(this);
    }

    @Override // kotlin.sequences.e
    public m take(int i8) {
        int i9 = this.count;
        int i10 = i9 + i8;
        return i10 < 0 ? new t(this, i8) : new s(this.sequence, i9, i10);
    }
}
