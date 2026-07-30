package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.c0;

/* loaded from: classes4.dex */
public final class k implements m {
    private final m sequence;

    public static final class a implements Iterator, g6.a {
        private int index;
        private final Iterator<Object> iterator;

        a(k kVar) {
            this.iterator = kVar.sequence.iterator();
        }

        public final int getIndex() {
            return this.index;
        }

        public final Iterator<Object> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i8) {
            this.index = i8;
        }

        @Override // java.util.Iterator
        public c0 next() {
            int i8 = this.index;
            this.index = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            return new c0(i8, this.iterator.next());
        }
    }

    public k(m sequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
    }

    @Override // kotlin.sequences.m
    public Iterator<c0> iterator() {
        return new a(this);
    }
}
