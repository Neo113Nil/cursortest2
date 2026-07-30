package kotlin.sequences;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class f implements m {
    private final f6.l predicate;
    private final m sequence;

    public static final class a implements Iterator, g6.a {
        private int dropState = -1;
        private final Iterator<Object> iterator;
        private Object nextItem;

        a() {
            this.iterator = f.this.sequence.iterator();
        }

        private final void drop() {
            while (this.iterator.hasNext()) {
                Object next = this.iterator.next();
                if (!((Boolean) f.this.predicate.invoke(next)).booleanValue()) {
                    this.nextItem = next;
                    this.dropState = 1;
                    return;
                }
            }
            this.dropState = 0;
        }

        public final int getDropState() {
            return this.dropState;
        }

        public final Iterator<Object> getIterator() {
            return this.iterator;
        }

        public final Object getNextItem() {
            return this.nextItem;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.dropState == -1) {
                drop();
            }
            return this.dropState == 1 || this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.dropState == -1) {
                drop();
            }
            if (this.dropState != 1) {
                return this.iterator.next();
            }
            Object obj = this.nextItem;
            this.nextItem = null;
            this.dropState = 0;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setDropState(int i8) {
            this.dropState = i8;
        }

        public final void setNextItem(Object obj) {
            this.nextItem = obj;
        }
    }

    public f(m sequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(sequence, "sequence");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        this.sequence = sequence;
        this.predicate = predicate;
    }

    @Override // kotlin.sequences.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
