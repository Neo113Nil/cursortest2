package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes4.dex */
public final class v implements m {
    private final m sequence;
    private final f6.p transformer;

    public static final class a implements Iterator, g6.a {
        private int index;
        private final Iterator<Object> iterator;

        a() {
            this.iterator = v.this.sequence.iterator();
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
        public Object next() {
            f6.p pVar = v.this.transformer;
            int i8 = this.index;
            this.index = i8 + 1;
            if (i8 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            return pVar.invoke(Integer.valueOf(i8), this.iterator.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i8) {
            this.index = i8;
        }
    }

    public v(m sequence, f6.p transformer) {
        kotlin.jvm.internal.s.checkNotNullParameter(sequence, "sequence");
        kotlin.jvm.internal.s.checkNotNullParameter(transformer, "transformer");
        this.sequence = sequence;
        this.transformer = transformer;
    }

    @Override // kotlin.sequences.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
