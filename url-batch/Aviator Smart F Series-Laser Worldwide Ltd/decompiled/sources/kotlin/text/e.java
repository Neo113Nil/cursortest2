package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* loaded from: classes3.dex */
final class e implements kotlin.sequences.m {
    private final f6.p getNextMatch;
    private final CharSequence input;
    private final int limit;
    private final int startIndex;

    public static final class a implements Iterator, g6.a {
        private int counter;
        private int currentStartIndex;
        private j6.m nextItem;
        private int nextSearchIndex;
        private int nextState = -1;

        a() {
            int coerceIn;
            coerceIn = j6.v.coerceIn(e.this.startIndex, 0, e.this.input.length());
            this.currentStartIndex = coerceIn;
            this.nextSearchIndex = coerceIn;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.this$0.limit) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void calcNext() {
            j6.m until;
            if (this.nextSearchIndex < 0) {
                this.nextState = 0;
                this.nextItem = null;
                return;
            }
            if (e.this.limit > 0) {
                int i8 = this.counter + 1;
                this.counter = i8;
            }
            if (this.nextSearchIndex <= e.this.input.length()) {
                Pair pair = (Pair) e.this.getNextMatch.invoke(e.this.input, Integer.valueOf(this.nextSearchIndex));
                if (pair == null) {
                    this.nextItem = new j6.m(this.currentStartIndex, StringsKt__StringsKt.getLastIndex(e.this.input));
                    this.nextSearchIndex = -1;
                } else {
                    int intValue = ((Number) pair.component1()).intValue();
                    int intValue2 = ((Number) pair.component2()).intValue();
                    until = j6.v.until(this.currentStartIndex, intValue);
                    this.nextItem = until;
                    int i9 = intValue + intValue2;
                    this.currentStartIndex = i9;
                    this.nextSearchIndex = i9 + (intValue2 == 0 ? 1 : 0);
                }
                this.nextState = 1;
            }
            this.nextItem = new j6.m(this.currentStartIndex, StringsKt__StringsKt.getLastIndex(e.this.input));
            this.nextSearchIndex = -1;
            this.nextState = 1;
        }

        public final int getCounter() {
            return this.counter;
        }

        public final int getCurrentStartIndex() {
            return this.currentStartIndex;
        }

        public final j6.m getNextItem() {
            return this.nextItem;
        }

        public final int getNextSearchIndex() {
            return this.nextSearchIndex;
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
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCounter(int i8) {
            this.counter = i8;
        }

        public final void setCurrentStartIndex(int i8) {
            this.currentStartIndex = i8;
        }

        public final void setNextItem(j6.m mVar) {
            this.nextItem = mVar;
        }

        public final void setNextSearchIndex(int i8) {
            this.nextSearchIndex = i8;
        }

        public final void setNextState(int i8) {
            this.nextState = i8;
        }

        @Override // java.util.Iterator
        public j6.m next() {
            if (this.nextState == -1) {
                calcNext();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            j6.m mVar = this.nextItem;
            kotlin.jvm.internal.s.checkNotNull(mVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.nextItem = null;
            this.nextState = -1;
            return mVar;
        }
    }

    public e(CharSequence input, int i8, int i9, f6.p getNextMatch) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.s.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.input = input;
        this.startIndex = i8;
        this.limit = i9;
        this.getNextMatch = getNextMatch;
    }

    @Override // kotlin.sequences.m
    public Iterator<j6.m> iterator() {
        return new a();
    }
}
