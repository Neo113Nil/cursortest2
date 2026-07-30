package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class u implements m {
    private final f6.l predicate;
    private final m sequence;

    public static final class a implements Iterator, g6.a {
        private final Iterator<Object> iterator;
        private Object nextItem;
        private int nextState = -1;

        a() {
            this.iterator = u.this.sequence.iterator();
        }

        private final void calcNext() {
            if (this.iterator.hasNext()) {
                Object next = this.iterator.next();
                if (((Boolean) u.this.predicate.invoke(next)).booleanValue()) {
                    this.nextState = 1;
                    this.nextItem = next;
                    return;
                }
            }
            this.nextState = 0;
        }

        public final Iterator<Object> getIterator() {
            return this.iterator;
        }

        public final Object getNextItem() {
            return this.nextItem;
        }

        public final int getNextState() {
            return this.nextState;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                calcNext();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.nextState == -1) {
                calcNext();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.nextItem;
            this.nextItem = null;
            this.nextState = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNextItem(Object obj) {
            this.nextItem = obj;
        }

        public final void setNextState(int i8) {
            this.nextState = i8;
        }
    }

    public u(m sequence, f6.l predicate) {
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
