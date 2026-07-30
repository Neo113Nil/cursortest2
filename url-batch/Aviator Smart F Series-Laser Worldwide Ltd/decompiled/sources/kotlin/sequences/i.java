package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class i implements m {
    private final f6.l iterator;
    private final m sequence;
    private final f6.l transformer;

    public static final class a implements Iterator, g6.a {
        private Iterator<Object> itemIterator;
        private final Iterator<Object> iterator;

        a() {
            this.iterator = i.this.sequence.iterator();
        }

        private final boolean ensureItemIterator() {
            Iterator<Object> it = this.itemIterator;
            if (it != null && !it.hasNext()) {
                this.itemIterator = null;
            }
            while (true) {
                if (this.itemIterator != null) {
                    break;
                }
                if (!this.iterator.hasNext()) {
                    return false;
                }
                Iterator<Object> it2 = (Iterator) i.this.iterator.invoke(i.this.transformer.invoke(this.iterator.next()));
                if (it2.hasNext()) {
                    this.itemIterator = it2;
                    break;
                }
            }
            return true;
        }

        public final Iterator<Object> getItemIterator() {
            return this.itemIterator;
        }

        public final Iterator<Object> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return ensureItemIterator();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!ensureItemIterator()) {
                throw new NoSuchElementException();
            }
            Iterator<Object> it = this.itemIterator;
            kotlin.jvm.internal.s.checkNotNull(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setItemIterator(Iterator<Object> it) {
            this.itemIterator = it;
        }
    }

    public i(m sequence, f6.l transformer, f6.l iterator) {
        kotlin.jvm.internal.s.checkNotNullParameter(sequence, "sequence");
        kotlin.jvm.internal.s.checkNotNullParameter(transformer, "transformer");
        kotlin.jvm.internal.s.checkNotNullParameter(iterator, "iterator");
        this.sequence = sequence;
        this.transformer = transformer;
        this.iterator = iterator;
    }

    @Override // kotlin.sequences.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
