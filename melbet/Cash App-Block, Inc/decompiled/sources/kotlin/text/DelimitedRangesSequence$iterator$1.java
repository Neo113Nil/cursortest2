package kotlin.text;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes9.dex */
public final class DelimitedRangesSequence$iterator$1 implements Iterator, KMappedMarker {
    public int counter;
    public int currentStartIndex;
    public IntRange nextItem;
    public int nextSearchIndex;
    public int nextState = -1;
    public final /* synthetic */ DelimitedRangesSequence this$0;

    public DelimitedRangesSequence$iterator$1(DelimitedRangesSequence delimitedRangesSequence) {
        this.this$0 = delimitedRangesSequence;
        int coerceIn = RangesKt___RangesKt.coerceIn(0, 0, delimitedRangesSequence.input.length());
        this.currentStartIndex = coerceIn;
        this.nextSearchIndex = coerceIn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r4) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void calcNext$3() {
        DelimitedRangesSequence delimitedRangesSequence = this.this$0;
        CharSequence charSequence = delimitedRangesSequence.input;
        int i = this.nextSearchIndex;
        if (i < 0) {
            this.nextState = 0;
            this.nextItem = null;
            return;
        }
        int i2 = delimitedRangesSequence.limit;
        if (i2 > 0) {
            int i3 = this.counter + 1;
            this.counter = i3;
        }
        if (i <= charSequence.length()) {
            Pair pair = (Pair) delimitedRangesSequence.getNextMatch.invoke(charSequence, Integer.valueOf(this.nextSearchIndex));
            if (pair == null) {
                this.nextItem = new IntRange(this.currentStartIndex, StringsKt.getLastIndex(charSequence), 1);
                this.nextSearchIndex = -1;
            } else {
                int intValue = ((Number) pair.first).intValue();
                int intValue2 = ((Number) pair.second).intValue();
                this.nextItem = RangesKt___RangesKt.until(this.currentStartIndex, intValue);
                int i4 = intValue + intValue2;
                this.currentStartIndex = i4;
                this.nextSearchIndex = i4 + (intValue2 == 0 ? 1 : 0);
            }
            this.nextState = 1;
        }
        this.nextItem = new IntRange(this.currentStartIndex, StringsKt.getLastIndex(charSequence), 1);
        this.nextSearchIndex = -1;
        this.nextState = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.nextState == -1) {
            calcNext$3();
        }
        return this.nextState == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.nextState == -1) {
            calcNext$3();
        }
        if (this.nextState == 0) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        IntRange intRange = this.nextItem;
        intRange.getClass();
        this.nextItem = null;
        this.nextState = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
