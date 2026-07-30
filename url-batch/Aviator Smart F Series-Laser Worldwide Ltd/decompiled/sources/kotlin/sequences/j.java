package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class j implements m {
    private final f6.a getInitialValue;
    private final f6.l getNextValue;

    public static final class a implements Iterator, g6.a {
        private Object nextItem;
        private int nextState = -2;

        a() {
        }

        private final void calcNext() {
            Object invoke;
            if (this.nextState == -2) {
                invoke = j.this.getInitialValue.invoke();
            } else {
                f6.l lVar = j.this.getNextValue;
                Object obj = this.nextItem;
                kotlin.jvm.internal.s.checkNotNull(obj);
                invoke = lVar.invoke(obj);
            }
            this.nextItem = invoke;
            this.nextState = invoke == null ? 0 : 1;
        }

        public final Object getNextItem() {
            return this.nextItem;
        }

        public final int getNextState() {
            return this.nextState;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState < 0) {
                calcNext();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.nextState < 0) {
                calcNext();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.nextItem;
            kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
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

    public j(f6.a getInitialValue, f6.l getNextValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.s.checkNotNullParameter(getNextValue, "getNextValue");
        this.getInitialValue = getInitialValue;
        this.getNextValue = getNextValue;
    }

    @Override // kotlin.sequences.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
